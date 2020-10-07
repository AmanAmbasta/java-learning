package com.codewars;

import java.util.Arrays;

/**
 -  Given an array of integers, find the one that appears an odd number of times.
 - There will always be only one integer that appears an odd number of times.
*/
public class FindOdds {
    public static int findItWithoutXor(int[] a) {
        if (a.length==1)
            return a[0];
        else{

            boolean visited[] =new boolean[a.length];
            Arrays.fill(visited,false);
            for(int i = 0;i < a.length; i++){
                if (visited[i] == true)
                    continue;
                int count = 1;
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        visited[j] = true;
                        count++;
                    }
                }
                 if(count % 2 != 0)
                     return a[i];
            }

        }
        return 0;
    }
    public  static int findItXOR(int[] a){
        int xor =  0;
        for (int i = 0;i<a.length;i++){
            xor = xor^a[i];
        }
        return xor;
    }

    public static void  main(String[] args){
    int a[] = {20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5};
    int b[] = {20,-1,-1,5,20};
        System.out.println(findItWithoutXor(a));
        System.out.println(findItXOR(b));


    }
}