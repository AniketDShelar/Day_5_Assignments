package com.intellijide.functionalprogram;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int row;
        int column;
        System.out.println("Enter numbers of rows : ");
        Scanner scan = new Scanner(System.in);
        row = scan.nextInt();
        System.out.println("Enter numbers of columns : ");
        column = scan.nextInt();
        int[][] array = new int[row][column];
        System.out.println("Enter the elements of array : ");
        for(int i = 0; i < row; i++)
        for(int j = 0; j < column; j++)
        array[i][j] = scan.nextInt();
        System.out.println("Elements of the array are : ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                System.out.print(array[i][j] +" ");
            }
            System.out.println();
        }
    }
}
