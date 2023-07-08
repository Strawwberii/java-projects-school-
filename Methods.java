import java.util.*;
import java.io.*;


/* Methods- application with all the four methods
 * (Description of each method given inside code)
 * Rupok Ghosh Adin (T00716058)
 */
 
 public class Methods
 {
     
     // main method
     
     public static void main (String[] args)
     {
       
       // display printHellos() results
       
       System.out.println("printHellos() results \n");  
       printHellos(4);         
       
       System.out.println();       
       System.out.println(); 
       
       // display reverse() results
       
       System.out.println("reverse() results \n");
       
       String src = "Chocolate icecream!";
       String rev;
       
       rev = reverse(src);
       System.out.println( rev );
       System.out.println();
       
       System.out.println ( reverse("Bob Smith").toUpperCase() ); 
       System.out.println ( reverse("") ); 
       System.out.println ( reverse("radar") ); 
       
       System.out.println();
       System.out.println();
       
       // display inputDouble() results
       
       System.out.println("inputDouble() results \n");
       
       double cost = 0.0, grade = 0.0;
       
       cost = inputDouble ("What is the item cost $"); 
       System.out.printf ("Cost is $%.2f\n", cost ); 
       
       grade = inputDouble ("Student grade: "); 
       System.out.println ("Grade: " + grade );
       
       System.out.println();
       System.out.println();
       
       // display caclPi() results
       
       System.out.println("calcPi() results \n");
       
       double res = 0.0;
       
       res = calcPi (1);  
       System.out.println ( res); 
       
       System.out.println ( Math.PI ); 
       
       System.out.println ( calcPi(0) ); 
       System.out.println ( calcPi(4) ); 
       System.out.println ( calcPi(9) ); 
       System.out.println ( calcPi(10) ); 

       
         
     }
     
     
    /* printHellos method - prints hello world 
     * as many times the input(n) is*/
     
     
     public static void printHellos(int n)
     {
         
         String helloWorld = "Hello World";
         
         for (int i=1;i<=n;i++)
         {
             
             System.out.println(helloWorld + " "+ i);
         }
     }
     
     
     // reverse method - reverses the content of a string
     
     
     public static String reverse(String originalStr)
     {
         
         int length = originalStr.length();
         String reversedString = "";
         
         // attach every character of the string from backwards
         
         for(int i = length-1; i>=0;i--)
         {
          
          reversedString = reversedString + originalStr.charAt(i);   
        
         }
         return reversedString;
         
     }
     
     
    // inputDouble - display prompt and return the double input from the console
    
    
    public static double inputDouble(String prompt)
    {
         
         double ret = 0.0;
         String inputString = "";
         
         Scanner scan = new Scanner (System.in);
         
         System.out.println(prompt);
         inputString = scan.nextLine();       // get input from user
         
         ret = Double.parseDouble(inputString);        // convert input to Double
         
         return ret;
         
    }
    
    
    // calcPi - calculation of pi
    
    
    public static double calcPi(int noOfReturns)
    {
         
         double pi = 0.0;
         
         // looping the formula of PI 
         
         for (int k=0;k<=noOfReturns;k++)
         {
              
              pi = pi + (1/Math.pow(16,k))*((4.0/(8*k+1))-(2.0/(8*k+4))-(1.0/(8*k+5))-(1.0/(8*k+6)));

         }
         return pi;
    }
         
         
        
 }
 
 
