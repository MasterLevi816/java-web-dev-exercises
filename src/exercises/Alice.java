package exercises;

import java.util.Scanner;
public class Alice {

    public static void main(String[] args){

        //... print out word index and length. Then remove the word from the string and print the sentence
        //... strings are immutable, you will need to reassign the old sentence variable to a new one for the updated phase

        String firstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: " +
                "once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, " +
                "'and what is the user of a book,' thought Alice 'without pictures or conversation?'";

       Scanner input = new Scanner(System.in);

       System.out.println("enter a word:");
       String searchTerm = input.nextLine();

        Integer index = firstSentence.indexOf(searchTerm);
        Integer length = searchTerm.length();

        System.out.println("Your word first appears at index: " + index + "Your term is " + length + "characters long" );
        String newSentence = firstSentence.replace(searchTerm, "");
        System.out.println(newSentence);



    }
}
