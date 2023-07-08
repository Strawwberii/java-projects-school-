import java.util.Scanner;

// Calculates the distance between two points

public class Coordinates {
    
    public static void main (String [] args){
        
        Scanner scan = new Scanner (System.in);
        
        //storage for coordinates
        
        double x1 = 0.0;
        double x2 = 0.0;
        double y1 = 0.0;
        double y2 = 0.0;
        double distance = 0.0;
        
        // get input
        
        System.out.println("Enter the first coordinates: ");
        x1 = scan.nextDouble();
        y1 = scan.nextDouble();
        
        System.out.println("Enter the second coordinates: ");
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();
        
        //calculations
        
        distance = Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));
        
        //display results
        
        System.out.printf ("The distance is: " + "%.3f", distance);
        
    }
    
}
