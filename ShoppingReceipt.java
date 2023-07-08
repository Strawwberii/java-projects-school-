/* ShoppingReceipt- read records from a data file
 and report it to a formatted receipt
 Rupok Ghosh Adin (T00716058)
 */
 
 import java.io.*;
 import java.util.*;
 
 public class ShoppingReceipt{
     
     public static void main (String[] args) throws IOException{
         
         //input and output files
         
         String inputFile = "C:/Users/T00716058/OneDrive/javaprogs/purchases.txt";
         String outputFile = "C:/Users/T00716058/OneDrive/javaprogs/formattedreceipt.txt";
         Scanner dataFile = new Scanner ( new File(inputFile));
         PrintWriter outputFile1 = new PrintWriter(outputFile);
         
         // variables
         
         int price = 0;
         String item = "";
         String outputStr = "";
         double subTotal = 0.0;
         double tax = 0.0;
         double total = 0.0;
         String maxCostItem = "";
         double maxCostPrice = 0.0;
        
         // construct receipt
        
         outputStr = outputStr + " Java SupeStore \n";
         outputStr = outputStr + new Date() + "\n";
         
         // looping to read all data and add prices to sum up subTotal
         
         while (dataFile.hasNext()){
            
            item = dataFile.next();
            item = item.toUpperCase();
            price = dataFile.nextInt();
            
            subTotal = (subTotal + price)/100.0;
            
            outputStr = outputStr + String.format(" %-15s %6.2f \n ", item, price/100.0);
            
            // get item with max price
            
            if ( maxCostPrice < price){
                
                maxCostItem = item;
                maxCostPrice = price;
            }
        }
        
        outputStr = outputStr + "---------------------\n";
        
        // calculate tax and total cost 
        
        tax = subTotal * 0.14;
        total = subTotal + tax;
        
        //display output
        
        outputStr = outputStr + String.format(" %-15s %6.2f \n ","Sub Total", subTotal);
        outputStr = outputStr + String.format(" %-15s %6.2f \n", "Tax", tax);
        outputStr = outputStr + String.format(" %-15s %6.2f \n ", "Total", total);
        outputStr = outputStr + "\n Most expensive \n"; 
        outputStr = outputStr + String.format(" %-15s %6.2f \n ", maxCostItem, maxCostPrice/100.0);
        
        dataFile.close();
        outputFile1.print(outputStr);
        outputFile1.close();
        
     }
 }
