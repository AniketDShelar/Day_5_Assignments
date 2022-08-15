package com.intellijide.basiccoreprograms;

import java.util.Scanner;

public class VowelConsonent {
    public static void main(String[] args) {
        char ch;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter alphabet to check it's vowel or consonent -> ");
        ch = scan.next().charAt(0);
        if(ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A'|| ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("It's a Vowel");
        }else {
            System.out.println("It's a Consonent");
        }
    }
}
