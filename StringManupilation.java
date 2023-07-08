import java.util.Scanner;

// Add honorifics to the name

public class StringManupilation{
     
     public static void main (String[] args){
          
          //variables
          Scanner scan = new Scanner(System.in);
          
          System.out.print("Enter your name: ");
          String name = scan.nextLine().toUpperCase();
          
          //manupilations
          int pos = name.indexOf(" ");
          
          String first = name.substring(0, pos);
          String last = name.substring(pos);
          
          char initial = first.charAt(0);
          
          //display results
          
          System.out.print("Honorific: ");
          System.out.print(last + ", " + initial + "., "+ "DR.");
          
          
          
          
     
          
     }
}
