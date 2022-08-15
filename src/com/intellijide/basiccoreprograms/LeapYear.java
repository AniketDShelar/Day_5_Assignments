package com.intellijide.basiccoreprograms;
import java.util.Scanner;

public class LeapYear {
    int year;
    public static void main(String[] args) {
        System.out.print("Enter year = ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 2 == 0) {
            System.out.println(year+ " is a Leap Year");
        }else {
            System.out.println(year+ " is not Leap Year");
        }
    }
}