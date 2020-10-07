package com.codewars;

import java.util.Arrays;

public class AnagramDetection {
    public static boolean isAnagram(String test, String original) {
        if(test.length()!=original.length())
            return false;
        char[] testArray = test.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] originalArray = original.replaceAll("\\s","").toLowerCase().toCharArray();
        Arrays.sort(testArray);
        Arrays.sort(originalArray);
        return Arrays.equals(testArray,originalArray);

    }
    public static void main(String arg[]){
        System.out.println("\"foefet\", \"toffee\""+isAnagram("foefet", "toffee"));
    }
}
