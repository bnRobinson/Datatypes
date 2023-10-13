package org.launchcode;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[]args){
Scanner input= new Scanner(System.in);

        System.out.println("Enter rectangle height:");
        Integer height= input.nextInt();

        System.out.println("Enter rectangle width:");
        Integer width= input.nextInt();

        Integer area= height*width;

        System.out.println("The area is: "+ area);


    }
}
