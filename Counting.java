// Counts from 0 to 100


public class Counting{
    public static void main (String [] args){
        

        
        for (int i=0; i<100;i++){
            System.out.print(i);
            String string = "";
            
            if (i % 2 == 0){
                string = "even";
                }
                else {
                  string = "odd";  
                } 
               System.out.println( " " + string); 
               
               if (i % 10 == 0){
                    System.out.println ("- - - - -");
               }
        }
        
        
    }
}
