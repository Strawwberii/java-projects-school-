//Random Generator?

import java.util.Random;

public class RandGen {
     public static void main (String[] args){
       
       Random gen = new Random();
       int val = 0;
       

       val = gen.nextInt(20);
       System.out.println(val); 
       val = gen.nextInt(100) -50; 
       System.out.println(val);
          
     }
}


