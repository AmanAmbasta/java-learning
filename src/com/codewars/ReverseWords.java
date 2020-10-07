package com.codewars;

/**
 *
 * Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.
 * Examples
 *
 * "This is an example!" ==> "sihT si na !elpmaxe"
 * "double  spaces"      ==> "elbuod  secaps"
 */
public class ReverseWords {
    public static String reverseWords(final String original)
    {
        StringBuilder tempStr = new StringBuilder();
        tempStr.append(original);
//        tempStr.s
//        tempStr.reverse().toString().split(' ');
        return "";

    }
    static void rvereseArray(int arr[], int start, int end)
    {
        int temp;
        if (start >= end)
            return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        rvereseArray(arr, start+1, end-1);
    }
}
