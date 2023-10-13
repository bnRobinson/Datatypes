package org.launchcode;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);

        System.out.println("Enter your miles driven this week:");

        Integer miles= input.nextInt();

        System.out.println("Enter your gallons used this week:");
        Integer gallons= input.nextInt();

        Integer milesPerGallon= miles/gallons;

        System.out.println("Your miles per gallon this week is: "+milesPerGallon+" miles per gallon");
    }
}
