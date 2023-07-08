import java.util.Scanner;
import java.util.Random;

// GuessingGame- guesses a letter from a phrase

public class GuessingGameNew {
    
    public static void main (String[] args){
        
        Scanner scan = new Scanner(System.in);
        Random gen = new Random();
        
        // variables
        
        String phrase = " ";
        char guessChar;
        
        //input 
        
        System.out.println("Enter your phrase dummy!");
        phrase  = scan.nextLine();
        
        // modify string to uppercase & remove non-letter chars
        
        phrase = phrase.toUpperCase();
        phrase = phrase.replace(" ","");
        phrase = phrase.replace(".","");
        phrase = phrase.replace(",","");
        phrase = phrase.replace("!","");
        
        // get random char
        
        int length = phrase.length();
        int randomNum = gen.nextInt(length);
        char pickChar = phrase.charAt(randomNum);
        
        // ask user to guess letter
        
        System.out.println (" Guess the letter what I picked: ");
        guessChar = scan.next().toUpperCase().charAt(0);
        
        //display results 
        
        if ( !phrase.contains(""+ guessChar)){
            System.out.println("Your guess is not in the phrase.");
        }
        else if (guessChar == pickChar){
            System.out.println("Yes, you guessed right!");
        }
        else if (pickChar<guessChar){
            System.out.println("The letter comes before your guess, in the alphabet.");
        }
        else if (pickChar>guessChar){
            System.out.println("The letter comes afte our guess, in the alphabet.");
        }
        else {
            System.out.println("That's not the right guess!");
        }
        
        // display result when user wrong
        
        if ( pickChar != guessChar){
            System.out.println("The letter was " + pickChar);
        }
        
        
        
        
    }
}
