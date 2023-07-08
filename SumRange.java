import java.util.Scanner;

// SumRange 

public class SumRange {
    
    public static void main (String [] args){
        
        Scanner scan = new Scanner (System.in);
        
        // input from user
        
         int n = 0;
         System.out.println("Summation of 1 to n? Enter n: ");
         n = scan.nextInt();
         
         // for loop to generate summation
          
          int total = 0;
          
          for (int count=0; count <= n; count++){
              total = total + count;
          }
          System.out.println("Sum: " + total);
    }
}
