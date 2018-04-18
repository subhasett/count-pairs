package com.subha.test;

/**
 * Created by subhanjan on 16/04/2018.
 */
public class Main {
    public static void main(String[] args){
        Solution sol = new Solution();
        Long[] arr = {1L, 9L, 1L, 35L, 30L, 20L};
        Long sum = 36L;
        System.out.println(sol.countPairs(arr, sum));
    }
}
