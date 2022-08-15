package com.intellijide.basiccoreprograms;

import java.util.Scanner;

public class CoinFLip {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int heads = 0;
        int tails = 0;
        if(number > 0){
            double[] result = new double[number];
            for(int i = 0; i < number; i++){
                result[i] = Math.random();
                if(result[i] > 0.5){
                    heads++;
                }else{
                    tails++;
                }
            }
            double percentageOfHeads = (heads * 100) / number;
            System.out.println("Percentage of heads : " +percentageOfHeads);
            double percentageOfTails = (tails * 100) / number;
            System.out.println("Percentage of tails : " +percentageOfTails);
        }else{
        System.out.println("Please enter valid number");
        }
    }
}
