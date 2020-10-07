package com.codewars;
import java.util.*;
/**
 *
 *  Given a string, capitalize the letters that occupy even indexes and odd indexes separately, and return as shown below. Index 0 will be considered even.
 *
 * For example, capitalize("abcdef") = ['AbCdEf', 'aBcDeF']. See test cases for more examples.
 *
 * The input will be a lowercase string with no spaces.
 */

public class AlternateCapitalization {
    public static String[] capitalize(String s){
        String upperCaseString = s.toUpperCase();
        StringBuilder oddUpperCase = new StringBuilder();
        StringBuilder evenUpperCase = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(i % 2 ==0){
                oddUpperCase.append(s.charAt(i));
                evenUpperCase.append(upperCaseString.charAt(i));
            }
            else{
                evenUpperCase.append(s.charAt(i));
                oddUpperCase.append(upperCaseString.charAt(i));
            }
        }
        String[] output = new String[2];
        output[0] = oddUpperCase.toString();
        output[1] = evenUpperCase.toString();
        return output;
    }
    public static void main(String arg[]){
        String[] response = capitalize("alight");
        System.out.println(response[0]);
        System.out.println(response[1]);
        }
}
