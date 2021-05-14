package com.klezovich.algodscoaching.patterns.slidingwindow;

import java.util.HashMap;

public class FruitsIntoBaskets {

    private static int maxDiffChar=2;

    public static int findLength(char[] arr) {
        return findLength(new String(arr));
    }

    public static int findLength(String str) {

        int windowStart=0;
        int windowEnd=0;
        int maxLen=0;

        HashMap<Character, Integer> charCountMap = new HashMap<>();

        while (windowEnd < str.length()) {

            char nextChar = str.charAt(windowEnd);
            if(canAddNewCharToExistingWindow(nextChar,charCountMap)) {


                //Updating the char count map
                if(charCountMap.containsKey(nextChar)) {
                    int charCount = charCountMap.get(nextChar);
                    charCount++;
                    charCountMap.put(nextChar, charCount);
                } else {
                    charCountMap.put(nextChar,1);
                }

                windowEnd++;
            }else {
                //See if the currently constructed window is bigger than previous
                maxLen = Math.max(maxLen, windowEnd - windowStart);

                //Go to the next window
                char charAtStartOfWindow = str.charAt(windowStart);
                int charCount = charCountMap.get(charAtStartOfWindow);
                charCount--;
                if(charCount == 0 ) {
                    charCountMap.remove(charAtStartOfWindow);
                } else {
                    charCountMap.put(charAtStartOfWindow, charCount);
                }

                windowStart++;
            }

            //if we can include the next char into the window - let's do it
            //otherwise ... let's move the windowStart pos to the next pos and remove the previous
            //char
        }

        maxLen = Math.max(maxLen, windowEnd - windowStart );

        return maxLen;
    }

    private static boolean canAddNewCharToExistingWindow(char newChar, HashMap<Character, Integer> charCountMap) {
        if(charCountMap.containsKey(newChar)) {
            return true;
        }

        if(charCountMap.keySet().size() < maxDiffChar ) {
            return true;
        }

        return false;
    }
}
