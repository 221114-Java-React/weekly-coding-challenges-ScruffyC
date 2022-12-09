package com.revature.week3;

import java.util.*;

public class Solution {
    public int validWordsCount(String sentence) {
        //throw new RuntimeException("Todo! Needs implementation...");

        String token = "";
        int count = 0;

        for(int i = 0; i < sentence.length(); i++) {
            int j = 0;

            while(sentence.charAt(j) != ' ') {
                token += sentence.charAt(j);
                j++;
            }

            if(isValidWord(token))
                count++;

            token = "";
        }

        return count;
    }

    public boolean isValidWord(String token) {
        // contains lowercase letters, hyphens, and/or punctuation (no digits).
        // at most one hyphen '-'. If present, it must be surrounded by lowercase characters ("a-b" is valid, but "-ab" and "ab-" are not valid).
        // at most one punctuation mark. If present, it must be at the end of the token ("ab,", "cd!", and " ." are valid, but "a!b" and "c.," are not valid).

        char[] arr = token.toCharArray();

        if(Character.isUpperCase(arr[0]) || Character.isUpperCase(arr[arr.length - 1]))
            return false;
        else if(Character.isDigit(arr[0]) || Character.isDigit(arr[arr.length - 1]))
            return false;
        else if(arr[0] == '-' || arr[arr.length - 1] == '-')
            return false;

        for(int i = 1; i < arr.length - 1; i++) {
            int count = 0;

            if(Character.isUpperCase(arr[i]))
                return false;
            else if(Character.isDigit(arr[i]))
                return false;
            else if(arr[i] == '-') {
                count++;

                if(count > 1)
                    return false;
                else if(!Character.isLowerCase(arr[i - 1]) && !Character.isLowerCase(arr[i + 1]))
                    return false;
            } else {
                count++;
                if(count > 1)
                    return false;
                else if (!Character.isLowerCase(arr[i - 1]) && !Character.isLowerCase(arr[i + 1]))
                    return false;
            }
        }

        return true;
    }
}
