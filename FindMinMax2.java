import java.util.Scanner;

// Find min and max with if else statements

public class FindMinMax2 {
    
    public static void main (String [] args){
        
        Scanner scan = new Scanner (System.in);
        
        // storage for input and output
        
        double num1 = 0.0;
        double num2 = 0.0;
        double num3 = 0.0;
        
        double min = 0.0;
        double max = 0.0;
        
        // get input 
        
        System.out.println ("Enter your three stewpid numbers: ");
        num1 = scan.nextDouble();
        num2 = scan.nextDouble();
        num3 = scan.nextDouble();
        
        // get min and max from input values
        
        if ( num1 > num2 && num1 > num3) 
            max = num1;
            
            else if (num2 > num1 && num2 > num3)
            max = num2;
            
            else 
            max = num3;
            
        
        if( num1 < num2 && num1 < num3)
            min = num1;
            
            else if( num2 < num1 && num2 < num3) 
            min = num2;
            
            else 
            min = num3;
            
            //display results
            
            System.out.println ("Max value: " + max + "\t\t" + "Min value: " + min);
        
    }
}
