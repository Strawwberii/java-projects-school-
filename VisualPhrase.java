/* VisualPhrase- displays user's input in 
 diagonal and staggered form. 
  Rupok Ghosh Adin (T00716058)
*/

import java.util.*;

public class VisualPhrase{
    
    public static void main (String [] args){
        
        Scanner scan = new Scanner (System.in);
        
        //variables
        
        String inputStr = "";
        int inputLength = 0;
        
        // input from user
        
        System.out.println("Please enter your phrase: ");
        inputStr= scan.nextLine();
        
        /* create diagonal form by looping each index char
           of the string */
        
        inputLength = inputStr.length();
        
        for (int i=0; i<inputLength; i++){
            
            System.out.println( " ".repeat(i) + inputStr.charAt(i));
        }
        
        // create the staggered form
        
        // looping for even indexed char
        
        for(int i=0; i<inputLength; i++){
            
            if (i % 2 == 0){
                System.out.print(inputStr.charAt(i) + " ");
            }
        }
        
        // looping for odd indexed char
        
        System.out.println();
        
        for(int j=0; j<inputLength; j++){
            
            if (j % 2 != 0){
                System.out.print( " " + inputStr.charAt(j) );
            }
        }
        
    }
    
   
}
    
    

