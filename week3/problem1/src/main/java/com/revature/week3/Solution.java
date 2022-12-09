package com.revature.week3;

import java.util.*;

public class Solution {
    public boolean isAnagram(String s1, String s2) {
        //throw new RuntimeException("Todo! Needs implementation...");
        char[] arr1 = s1.toLowerCase().toCharArray();
        char[] arr2 = s2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        List<Character> arrList1 = new ArrayList<>();
        List<Character> arrList2 = new ArrayList<>();

        for(char c : arr1)
            if(c != ' ' && c != '.')
                arrList1.add(c);

        for(char c : arr2)
            if(c != ' ' && c != '.')
                arrList2.add(c);

        if(arrList1.equals(arrList2))
            return true;

        return false;
    }
}
