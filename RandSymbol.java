import java.util.Scanner;
import java.util.Random;
//Random symbol from a string

public class RandSymbol{
     
     public static void main (String [] args){
          
          Scanner scan = new Scanner(System.in);
          Random gen = new Random();
          
          //input 
          System.out.println("Enter any word: ");
          String word = scan.nextLine();
          int randomNumber;
          
          //manupilations
          
          String wordWithoutSpace = word.replace(" ","");
          
          int length = wordWithoutSpace.length();      // get the length of the string
          
          randomNumber = gen.nextInt(length);          // get the random index from length
          
          char randomChar = wordWithoutSpace.charAt(randomNumber);
          
          //display results
          
          System.out.println ("The index is: " + randomNumber + " and the random char is: " + randomChar);
     }
}
