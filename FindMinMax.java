import java.util.Scanner; 

//Find min and max between numbers

public class FindMinMax {
     
     public static void main (String[] args){
          
          Scanner scan = new Scanner(System.in);
          
          // variables
          double val1;
          double val2;
          double val3;
          double min;
          double max;
          
          //input
          
          System.out.print("Enter the numbers: ");
          val1 = scan.nextDouble();
          val2 = scan.nextDouble();
          val3 = scan.nextDouble();
          
          //calc
          
          min = Math.min(val1, val2);
          min = Math.min(min,val3);
          max = Math.max( val1, val2);
          max = Math.max (max, val3);
          
          //display
          
          System.out.println("Hi user, your three numbers are: " + val1 + " , " + val2 + ", " + val3);
          System.out.println("The min value is " + min + " and the max value is " + max);
     }
}
