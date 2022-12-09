package com.revature.problem1;

public class Solution {
    public String reverseString(String s) {
        // feel free to comment this line out or delete it
        //throw new RuntimeException("Todo! Needs implementation...");

        char[] arr = s.toCharArray();

        for(int i = 0; i < arr.length / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        return new String(arr);
    }
}
