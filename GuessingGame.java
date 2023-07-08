import java.util.Scanner;
import java.util.Random;

// GuessingGame- getting the letter from a phrase the user has given

public class GuessingGame {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        Random random = new Random();
        
        // storage for variables
        
        String phrase = "";
        char guess;
        
        //input from user 
        
        System.out.println("Enter your phrase: ");
        phrase = scan.nextLine();
        
        // remove spaces and punctuations
        
        phrase = phrase.replace(" ","").replace(",","").replace(".","").replace("!","");
        
        // mutations to pick random char
        
        int length = phrase.length();
        int randomNum = random.nextInt(length);
        char randomChar = phrase.charAt(randomNum);
        
        // input for guess
        
        System.out.println("Guess the letter: ");
        guess = scan.next().charAt(0);
        
        //display results 
        
        if (guess == randomChar){
            System.out.println("Yay you guessed right!");
        }
        else {
            System.out.println("Nay! That's not the right guess smh!");
        }
        
    }
}
