import java.util.Scanner;

public class MenuTester {
     
     public static void main (String [] args){
          
          Scanner scan = new Scanner (System.in);
          
          // variables
          
          String option = "";
          char optionChar;
          
          // menu string
          
          String menu = "Menu: \n\n A) display \"Hello World\"\n B) display your name, one character per line \n C) calculate summation 1..n \n D) calculate an approximation to PI \n X) Exit \n\n Select Option:  ";
          System.out.println(menu);
          
          // get input 
          
          
          
          
          while (optionChar != 'X' ){
               
               option = scan.nextLine();
               opt
               optionChar = option.toUpperCase().charAt(0);
               
               
               System.out.println(menu);
          }
     }
}
