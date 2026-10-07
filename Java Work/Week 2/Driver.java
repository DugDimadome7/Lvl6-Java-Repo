import java.util.Scanner;

public class Driver {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence: ");

        String sentence = input.nextLine();

         wordProcessor userSentence = new wordProcessor();

         System.out.println(userSentence.countWords(sentence));
         System.out.println(userSentence.countLetters(sentence));
         System.out.println(userSentence.getLength(sentence));
    }
}
