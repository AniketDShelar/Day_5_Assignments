package com.intellijide.basiccoreprograms;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class QuotientRemainder {
    int dividend,divisor,remainder;
    float quotient;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Dividend : ");
        int dividend = scan.nextInt();
        System.out.println("Enter Divisor : ");
        int divisor = scan.nextInt();
        float quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println("Quotient : " +quotient);
        System.out.println("Remainder : " +remainder);
    }
}
