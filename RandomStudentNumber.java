import java.util.Random;

// generates a random TRU student number

public class RandomStudentNumber{
    
    public static void main (String [] args){
        
        Random random = new Random();
        
        // set variables
        
        int AA = random.nextInt(75-10+1) + 10;
        int B = random.nextInt (8-3+1) + 3;
        int CCCCC = random.nextInt (69999-30001+1) + 30001;
        
        // generate the student number 
        
        System.out.print("Student Number: ");
        System.out.println ("" + 'T' + AA + B + CCCCC);
        
    }
}
