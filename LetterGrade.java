import java.util.Scanner;

// Calculates the grade point and letter grade from grade %

public class LetterGrade {
    
    public static void main (String [] args){
        
        Scanner scan = new Scanner(System.in);
        
        // storage for variables
        
        double grade = 0.0;
        double GP = 0.0;
        String LG = " ";
        
        // get input
        
        System.out.print("Enter your grade percentage: ");
        grade = Math.round(scan.nextDouble());
        
        // get GP with if else
        
        if ( grade > 90.0) {
            GP = 4.0;
            LG = "A+";
        
        }
        else if ( (85.0>= grade) && (grade<90.0)) {
            GP = 3.67;
            LG = "A";
        }
        else if (( 80 > grade ) && (grade < 85)) {
            GP = 3.33;
            LG = "B";
        }
        else 
        GP = 2.67;
        LG = "F";
     
        
       
        //display results
        
        System.out.printf("Grade Percentage: " + grade + "\t\t");
        System.out.print("LG: " + LG + "\t\t");
        System.out.printf("GP: " + GP);
        

        
    }
}
