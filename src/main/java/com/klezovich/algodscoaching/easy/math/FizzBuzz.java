package com.klezovich.algodscoaching.easy.math;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public List<String> fizzBuzz(int n) {
        var list = new ArrayList<String>();
        for(int i=1;i<=n;i++) {
            list.add(analyzeInt(i));
        }

        return list;
    }

    private String analyzeInt(int i) {
        var sb = new StringBuilder();

        if(i % 3 == 0) {
            sb.append("Fizz");
        }

        if(i%5 == 0) {
            sb.append("Buzz");
        }

        if(sb.length() == 0) {
            sb.append(i);
        }

        return sb.toString();
    }
}
