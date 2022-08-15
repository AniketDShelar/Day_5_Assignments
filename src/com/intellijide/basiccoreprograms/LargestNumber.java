package com.intellijide.basiccoreprograms;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n1,n2 & n2 -> ");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        if(n1 > n2 && n1 > n3){
            System.out.println(n1 + " is greater than " +n2+ " & " +n3);
        }else if(n2 > n1 && n2 > n3){
            System.out.println(n2 + " is greater than " +n1+ " & " +n3);
        }else{
            System.out.println(n3 + " is greater than " +n1+ " & " +n2);
        }
    }
}
