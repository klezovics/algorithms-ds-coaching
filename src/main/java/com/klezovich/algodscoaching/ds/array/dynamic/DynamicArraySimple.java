package com.klezovich.algodscoaching.ds.array.dynamic;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

import static java.util.stream.Collectors.toList;

public class DynamicArraySimple implements Iterable<Integer> {

    private Integer[] arr = new Integer[1];
    private int nextFreeElementPos =0;

    public void add(int element) {
        //Not enough free space to fit in existing
        if(nextFreeElementPos >= arr.length) {
            var newArray = getNewArray(2*arr.length);
            copyElements(arr, newArray);
            arr = newArray;
        }

        arr[nextFreeElementPos]=element;
        nextFreeElementPos++;
    }

    public Integer get(int idx) {
        return arr[idx];
    }

    public long length() {
        return arr.length;
    }

    public void delete(int element) {
        int pos = find(element);
        if(pos == -1) {
            return;
        }

        arr[pos] = null;
        for(int ii=pos; ii<nextFreeElementPos-1; ii++ ) {
            arr[ii]=arr[ii+1];
        }
    }

    public int find(int element) {
        int position =0;
        for(int ii=0; ii<nextFreeElementPos; ii++) {
            if(arr[ii] == element) {
                return ii;
            }
        }

        return -1;
    }

    private Integer[] getNewArray(int size) {
        return new Integer[size];
    }

    private void copyElements(Integer[] origArr, Integer[] newArr) {
        for(int ii=0; ii<origArr.length; ii++) {
            newArr[ii]=origArr[ii];
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return Arrays.stream(arr)
                .filter(Objects::nonNull)
                .collect(toList()).iterator();
    }
}
