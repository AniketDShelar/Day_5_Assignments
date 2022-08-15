package com.intellijide.basiccoreprograms;

public class SwapNumbers {
    public static void main(String[] args) {
        int firstNumber = 22;
        int secondNumber = 44;
        System.out.println("-----Before Swapping-----");
        System.out.println("First number -> " +firstNumber);
        System.out.println("Second number -> " +secondNumber);

        int temporaryNumber = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temporaryNumber;
        System.out.println("-----After Swapping-----");
        System.out.println("First number -> " +firstNumber);
        System.out.println("Second number -> " +secondNumber);
    }
}
