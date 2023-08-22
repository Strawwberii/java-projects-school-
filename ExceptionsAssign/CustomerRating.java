
import java.util.*;
import java.io.*;


class CustomerRating{

    private Customer[] records;
    private int noOfRecords;

    public CustomerRating(){

        records = new Customer[5];
    }

    // Reading from the file

    public void readRecords(String file) throws IOException{

        try(FileReader input = new FileReader(file)){
        Scanner scanner = new Scanner(input);

        while(scanner.hasNextLine()){
            
            String info = scanner.nextLine();
            String[] splitInfo = info.split("\t");
            
            int age = Integer.parseInt(splitInfo[0]);
            double rating = Double.parseDouble(splitInfo[1]);
            addRecord(age, rating);
            noOfRecords++;
        }    
        scanner.close();
    }   


       }


    // Displaying the records 

    public void displayRecord(){
        System.out.println("    Most updated list of customer ratings   ");
        System.out.println("----------------------------------------------------------\n");
        System.out.printf("%-10s %$-10s\n", "Age", "Rating");
        System.out.println("----------------------------------------------------------\n");

        for( int i=0;i<noOfRecords;i++){
            Customer customer = records[i];
            System.out.printf(" %-10d %-10.2f", customer.getAge(), customer.getRating());

        }

    }

    // add records to the array

    public void addRecord(int age, double rating){
        if(noOfRecords >= 5) {
            ;
            throw new ArrayIndexOutOfBoundsException("Array out of bounds!");
        }
        else{
            records[noOfRecords++] = new Customer(age, rating);
        }
    }

    // get input from user and add new records

    public void mainMethod(){

        Scanner scan = new Scanner(System.in);

        // read records from the existing file
        try {
            readRecords("rating.txt");
        }
        catch(IOException e){
            System.out.println("Can't read file!");
        }

        //displays existing records
        displayRecord();

        // ask user to enter new records (plus letting them quit the app if they want)
        while(noOfRecords<=5){
            System.out.println("Enter age[integer], followed by ONE [tab] key, then rating[decimal number] (or type ! to exit)");
            String input = scan.nextLine();
            if(input == "!"){
                break;
            }

            // add user input to arrays after splitting it up
    
            String[] splitInput = input.split("\t");
            if(splitInput.length <2 || splitInput.length > 2){
                System.out.println("Error. Input both age and rating only.");
            }

            try{
                int age = Integer.parseInt(splitInput[0]);
                double rating = Double.parseDouble(splitInput[1]);
                addRecord(age, rating);
            }
            catch(NumberFormatException e){
                System.out.println("Invalid number format.");
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(" Array out of bounds.");
            }
        }

        //displays updated record
        displayRecord();

        //Calculate and display average age and raiting

        double totalAge = 0;
        double totalRating = 0;
        for (int i = 0; i < noOfRecords; i++) {
            Customer customer = records[i];
            totalAge += customer.getAge();
            totalRating += customer.getRating();
        }

        double averageAge = totalAge / noOfRecords;
        double averageRating = totalRating / noOfRecords;

        System.out.printf("Average(Age)= %.2f\n", averageAge);
        System.out.printf("Average(Rating)= %.2f\n", averageRating);

        // Update the text file with new records 

        try (FileWriter output = new FileWriter("rating.txt")) {
            for(int i = noOfRecords; i<5; i++){
                    
               Customer customer = records[i];
                output.write(customer.getAge() + "\t" + customer.getRating());
            }
        }
        catch (IOException e) {
            System.out.println("Unable to write to file!");
        }

        scan.close();
    }
}


