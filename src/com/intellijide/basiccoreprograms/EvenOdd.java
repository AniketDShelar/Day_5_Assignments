package com.intellijide.basiccoreprograms;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to check even or odd -> ");
        int number = scan.nextInt();
        if(number % 2 == 0){
            System.out.println(number + " is a Even Number");
        }else{
            System.out.println(number + " is a Odd Number");
        }
    }
}
