package org.launchcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchString {
    public static void main(String[] args) {
        String aliceInWonderland = "Alice was beginning to " +
                "get very tired of sitting by her " +
                "sister on the bank, and of having " +
                "nothing to do: once or twice she had " +
                "peeped into the book her sister was " +
                "reading, but it had no pictures or " +
                "conversations in it, ‘and what is the " +
                "use of a book,’ thought Alice ‘without " +
                "pictures or conversation?’";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter search term:");
        String searchTerm = input.nextLine();
        Integer length= searchTerm.length();

        if(aliceInWonderland.toUpperCase().contains(searchTerm.toUpperCase())){
            System.out.println("Term found at index: "+ aliceInWonderland.indexOf(searchTerm)+ "Term length: "+ length);

            String newAlice= aliceInWonderland.replace(searchTerm, "");

            System.out.println("New Sentence: "+ newAlice);
        } else {
            System.out.println("Term Not Found");
        }
    }
}
