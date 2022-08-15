package com.intellijide.functionalprogram;

import java.util.Scanner;

public class DistinctTriplets {
    static void findTriplets(int n, int[] arr){
        boolean gotTriplets = false;
        for(int i = 0; i < n - 2; i++){
            for(int j = i + 1; j < n - 1; j++){
                for(int k = j + 1; k < n; k++){
                    if(arr[i] + arr[j] + arr[k] == 0){
                        System.out.println(arr[i] +" "+ arr[j] +" "+ arr[k]);
                        gotTriplets = true;
                        }
                    }
                }
            }
        if(gotTriplets == false){
            System.out.println("not Exist");
        }
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, -2, -3, 1};
        int n = arr.length;
        findTriplets(n,arr);
    }
}
