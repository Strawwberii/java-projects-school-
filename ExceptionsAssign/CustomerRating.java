import java.util.*;
import java.io.*;

class CustomerRating{

    private Customer[] records;
    private int noOfRecords;

    public CustomerRating(){

        records = new Customer[5];
    }

    // main method

    public static void main(String[] args){

    }
    // Reading from the file

    public void readRecords() throws IOException{

        File file = new File("rating.txt");
        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()){
            
            int age = Integer.parseInt(scanner.next());
            double rating = Double.parseDouble(scanner.next());
            addRecord(age, rating);
        }
       }


    // Displaying the records 

    public void displayRecord(){
        

    }

    // add records to the array

    public void addRecord(int age, double rating) throws ArrayIndexOutOfBoundsException{
        if(noOfRecords >= 5) {
            System.out.println("Array is out of bounds!");
        }
        else{
            records[noOfRecords] = new Customer(age, rating);
        }
    }

    // write the records to the text file

    public void writeRecords(){

        
    }

    // get content from user and run the other methods

    public void mainMethod(){

        
    }

}