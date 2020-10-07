package com.codewars;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HowManyAreSmallerThanMe {
    public static int[] smaller(int[] unsorted) {
        for (int i = 0; i < unsorted.length; i++) {
            int count = 0;
            for (int j = i + 1; j < unsorted.length; j++) {
                if(unsorted[i]>unsorted[j])
                    count++;
            }
            unsorted[i]=count;
        }
        return unsorted;
    }

    public static void main(String[] arg){
        int[] arr = {5, 4, 3, 2, 1};
       a = smaller(arr);
        for (int i = 0; i <arr.length ; i++) {

            System.out.println("a:"+a[i]);System.out.println("b:"+b[i]);
        }
    }
}
