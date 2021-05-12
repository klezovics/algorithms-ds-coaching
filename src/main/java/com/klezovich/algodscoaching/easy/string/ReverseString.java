package com.klezovich.algodscoaching.easy.string;

public class ReverseString {

    public void reverseString(char[] s) {
        if(s.length == 1) {
            return;
        }

        var sNew = new char[s.length];

        var posOld=0;
        var posNew=s.length-1;

        while (posOld<=s.length-1) {
            sNew[posNew]=s[posOld];
            posOld++;
            posNew--;
        }

        for(int pos=0;pos<s.length;pos++) {
            s[pos]=sNew[pos];
        }
    }
}
