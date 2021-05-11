package com.klezovich.algodscoaching.ds.array.dynamic;

public class DynamicArraySimple {

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

    public void delete(int element) {

    }

    public int find(int element) {
        int position =0;
        return position;
    }



    //package level visibility for testing
    Integer[] getArray() {
        return arr;
    }

    private Integer[] getNewArray(int size) {
        return new Integer[size];
    }

    private void copyElements(Integer[] origArr, Integer[] newArr) {
        for(int ii=0; ii<origArr.length; ii++) {
            newArr[ii]=origArr[ii];
        }
    }
}
