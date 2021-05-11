package com.klezovich.algodscoaching.ds.array.onedim;

import com.klezovich.algodscoaching.ds.array.Student;

import java.util.Arrays;

public class OneDArray {

    public static void main(String[] args) {
        var a = new int[5];

        a[0] = 1;
        a[1] = 2;

        System.out.println(Arrays.toString(a));

        var students = new Student[3];
        students[0] = new Student("AK", 31);
        students[1] = new Student("Tarasik", 25);

        System.out.println(Arrays.toString(students));
    }
}
