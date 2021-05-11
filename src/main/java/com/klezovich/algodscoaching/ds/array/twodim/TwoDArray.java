package com.klezovich.algodscoaching.ds.array.twodim;

import com.klezovich.algodscoaching.ds.array.Student;

import java.util.Arrays;

public class TwoDArray {

    public static void main(String[] args) {
        var chessboard = new char[8][8];
        chessboard[0][0]='q';
        chessboard[0][1]='k';

        System.out.println(Arrays.deepToString(chessboard));
        System.out.println(chessboard[2][2]);
        System.out.println(chessboard[2][2] == '\u0000');
    }
}
