package com.intellijide.functionalprogram;

import java.util.Scanner;
public class Distance {
    static double x,y;
    void calculateDistance(){
       double calculation = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        System.out.print("Euclidean distance from point x and y is :" +calculation);
    }
    public static void main(String[] args) {
        System.out.println("Enter x and y : ");
        Scanner scan = new Scanner(System.in);
        x = scan.nextDouble();
        y = scan.nextDouble();;
        Distance distance = new Distance();
        distance.calculateDistance();
    }
}
