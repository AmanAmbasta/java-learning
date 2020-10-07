package com.codewars;

/**
 * Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.
 *
 * Examples input/output:
 * - XO("ooxx") => true
 * - XO("xooxx") => false
 * - XO("ooxXm") => true
 * - XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
 * - XO("zzoo") => false
 */
public class XsAndOs {
    public static boolean getXO (String str) {
        int Xs = 0,Os = 0;
        int i = 0;
        str = str.toLowerCase();
        for (;i<str.length();i++){
            if (str.charAt(i) == 'x'){
                Xs++;
                continue;
            }
            else if (str.charAt(i) == 'o'){
                Os++;
                continue;
            }
        }
            return Xs==Os;
    }
    public static  boolean getXOUsingReplace(String str){
        str = str.toLowerCase();
        return str.replace("x","").length() == str.replace("o","").length();
    }
    public static void main(String[] arg){
        System.out.println(getXO("xoKAKAKo"));
        System.out.println(getXOUsingReplace("xoKAKAKo"));
    }
}
