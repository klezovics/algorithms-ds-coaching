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
            copyElements(arr, newArray, arr.length-1);
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

        nextFreeElementPos--;

        //Half of array is empty - make smaller
        if((arr.length/2) >= nextFreeElementPos) {
            var newArr = getNewArray((arr.length)/2);
            copyElements(arr, newArr, nextFreeElementPos-1);
            arr = newArr;
            nextFreeElementPos=(arr.length/2);
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

    //For testing
    int getInnerArrayLength() {
        return arr.length;
    }

    private Integer[] getNewArray(int size) {
        return new Integer[size];
    }

    private void copyElements(Integer[] origArr, Integer[] newArr, int maxIdxToCopy) {
        for(int ii=0; ii<=maxIdxToCopy; ii++) {
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
