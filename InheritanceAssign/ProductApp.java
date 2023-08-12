
/* ProductApp.java

   Rupok Ghosh Adin T00716058
   COMP 1231 Assignment 1
   This contains the main method of the application in order to loop 
   through the products and display the results
 */

public class ProductApp{

    public static void main(String[] args){
        
        // Array for the products;
        
        Product[] productList = new Product[6];

        productList[0] = new ImperialUnit("A1122", 1, 4, 603.33);
        productList[1] = new ImperialUnit("B2468", 2, 0.000538, 400);
        productList[2] = new ImperialUnit("C1234", 1, 3.0003, 398.89);
        productList[3] = new MetricUnit("X2345",0.55, 411);
        productList[4] = new MetricUnit("Y6213", 0.900, 498);
        productList[5] = new MetricUnit("Z1098", 0.250, 234.50);
        
        //Display results
        
        for (int i=0; i<6; i++){
			System.out.println(productList[i]);
		}
	}
}
