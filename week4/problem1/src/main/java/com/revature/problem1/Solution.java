package com.revature.problem1;

public class Solution {
    public int elementNotInArray(int[] arr, int k) {
        //throw new RuntimeException("TODO! Needs implementation...");

        int[] sortedArr = sort(arr);
        int index = -1;

        for(int i = 0; i < sortedArr.length; i++)
            if(sortedArr[i] >= k) {
                index = i;
                break;
            }

        int j = 1;

        for(int i = index; i < sortedArr.length; i++) {
            if(sortedArr[index] == k)
            if (sortedArr[i] != sortedArr[index] + j)
                return sortedArr[index] + j;
            else
                j++;
        }

        return -1;
    }

    public int[] sort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++)
            if(arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }

        return arr;
    }
}
