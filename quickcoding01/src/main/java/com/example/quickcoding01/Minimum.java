package com.example.quickcoding01;

/**
 * Created by seungeonlee on 2016. 11. 24..
 */


public class Minimum extends Result {
    public int getresult(int[] arr){
        int min = arr[0];
        for(int i = 0;i<arr.length-1; i++) {
            if (min > arr[i + 1]) {
                min = arr[i + 1];
            }
        }
        return min;
    }
}