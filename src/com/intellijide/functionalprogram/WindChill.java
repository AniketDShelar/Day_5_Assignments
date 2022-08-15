package com.intellijide.functionalprogram;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Temperature in fahrenheit : ");
        double temperature = scan.nextDouble();
        System.out.println("Enter the wind in miles per hour : " );
        double windSpeed = scan.nextDouble();
        if(temperature <= 50 && windSpeed >= 2 && windSpeed <=120){
            double windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed,0.16) +
                                0.4275 * temperature * Math.pow(windSpeed, 0.16);
            System.out.print("Wind chill index is : " +windChill);
        }else{
            System.out.println("Enter valid temperature or windspeed");
        }
    }
}
