package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);

        System.out.println("Enter a radius:");
        Double radius= input.nextDouble();

        if (radius.isNaN() || radius<0){
            System.out.println("Please enter a positive number");
        } else {
            System.out.println("The radius of your circle is: "+ Circle.getArea(radius));
        }

    }


}
