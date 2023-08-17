
/* Rupok Ghosh Adin T00716058
 * COMP 1231 Assignment 2
 * Driver class of the application to display the results of the program
 */
public class ProductApp {

    public static void main(String[] args){

        Product[] productList = new Product[4];

        productList[0] = new Product("X001","Unknown",0.0, 0);
        productList[1] = new Product("A001", "Chicken", 72.45, 1);
        productList[2] = new Product("Lettuce","Greens", 6.99, 3);
        productList[3] = new Product("C003", "Ice Cream", 20.0, 2);

        // display food product records
        System.out.println("Food product records: \n");
        System.out.println(productList[0]);
        System.out.println(productList[1]);
        System.out.println(productList[2]);
        System.out.println(productList[3]);
        System.out.println();

        // setting password & locking a product

        System.out.println("Setting a password and locking the product: \n");
        productList[0].setPassword("strawberry");
        System.out.println("First product: " + productList[0]);
        productList[0].lock("strawberry");

        System.out.println();
        
        // demonstration that the lock works
        System.out.println("Change description without unlocking:");
        productList[0].setDescription("Potato");  // doesn't work because product locked
        System.out.println();

        // updating product
        System.out.println("Updating product after unlocking with password:");
        productList[0].unlock("strawberry");        //unlocking product with password
        productList[0].setDescription("Potato");   // works since product unlocked
        productList[0].setPrice(6.99);
        productList[0].setCategory(3);
        System.out.println(productList[0]);
        System.out.println();

        // food with lowest price
        System.out.println("List of food products that have lowest price:\n");
        Product lowestProductPrice = productList[0];

        for(int i = 0;i<4;i++){     // looping through all the products to find the lowest with compareTO   
            if(productList[i].compareTo(lowestProductPrice)<0 || productList[i].compareTo(lowestProductPrice) == 0){
                lowestProductPrice = productList[i];
                System.out.println(lowestProductPrice);
            }
           
        }
    }
}
