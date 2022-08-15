package com.intellijide.basiccoreprograms;
import java.util.Scanner;
public class HarmonicNumber {
    int n;
    float harmonic = 1;
    HarmonicNumber(int n){
        this.n = n;
    }
    void calculateHarmonicnum() {
        for (int i = 2; i <= n; i++) {
            harmonic += (float)1 / i;
        }
    }
    void display() {
        System.out.println("nth Harmonic number = " +harmonic);
    }
    public static void main(String[] args) {
        System.out.print("Enter the value of n = ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        HarmonicNumber number = new HarmonicNumber(n);
        number.calculateHarmonicnum();
        number.display();

    }
}
