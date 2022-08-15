package com.intellijide;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        double a,b,c;
        double root1,root2;
        System.out.println("Enter the values of a,b & c : ");
        Scanner scan = new Scanner(System.in);
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        double delta = b * b - 4 * a * c;
        if(delta > 0){
            root1= (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("Root 1 of quadratic equation : " +root1);
            root2= (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Root 2 of quadratic equation : " +root2);
        }else if(delta == 0){
            root1 = root2 = -b / 2 * a;
            System.out.println("Roots of Quadratic equation is : " +root1);
        }else{
            System.out.println("Roots are not real");
        }
    }
}
