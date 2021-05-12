package com.klezovich.algodscoaching.ds.array.dynamic;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.stream.Collectors;

@Slf4j
public class DynamicArray<T> implements Iterable<T> {

    private Object[] array;

    //Number of elements in the array
    private int size;

    public DynamicArray() {
        this.array = new Object[1];
        this.size=0;
    }

    public T get(int pos) {
        return (T) array[pos];
    }

    public void put(T elem) {
        ensureCapacity(size+1);
        array[size]=elem;
        size++;
    }

    public void delete(T elem) {
        int idx = find(elem);
        if(idx == -1) {
            return;
        }

        array[idx] = null;
        size--;

        //Shifting elements to the left
        for (int ii=idx; ii<=size-1; ii++ ) {
            array[ii] = array[ii+1];
        }

        if(shouldShrinkArray(size, array.length)) {
            array = Arrays.copyOf(array, size);
        }
    }

    private boolean shouldShrinkArray(int size, int capacity) {

        //Do not shrink array below one
        if(capacity == 1) {
            return false;
        }

        //If it is half empty - remove the unused half
        if( size <= capacity/2 ) {
            return true;
        }

        return false;
    }

    public int find(T elem) {
        for(int ii=0; ii<array.length; ii++) {
            if(Objects.equals(elem,array[ii])) {
                return ii;
            }
        }

        return -1;
    }

    private void ensureCapacity(int requiredElementNumber) {
        //Enough capacity no need to resize
        if(requiredElementNumber <= array.length) {
            return;
        }

        //Increase the size by 2 and copy the elements.
        int newCapacity = 2*(array.length);
        array = Arrays.copyOf(array,newCapacity);
    }

    int getSize() {
        return size;
    }

    int getCapacity() {
        return array.length;
    }


    @Override
    public Iterator<T> iterator() {
        return (Iterator<T>) Arrays.stream(array)
                .filter(Objects::nonNull)
                .collect(Collectors.toList())
                .iterator();
    }
}
