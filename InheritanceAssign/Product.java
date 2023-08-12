/* Product.java
   
   Rupok Ghosh Adin T00716058
   COMP 1231 Assignment 1
   This is the parent class of the application which checks the density 
   of certain products and determines if its too thin, too thick or acceptable.
 */
abstract class Product{

    private String productID;
    private double volume;

    // accessor methods

    public String getProductID(){
        return productID;
    }

    public double getVolume(){
        return volume;
    }

    // mutator method

     public abstract double getMassInGrams();

    //method that checks density

    public abstract String densityCheck();
    
    // default constructor
    
    public Product(){
		this.productID = "";
		this.volume = 0;
		}
    
    // parameterized constructor
    
    public Product(String newProductID, double newVolume){
		productID = newProductID;
		volume = newVolume;
	}
}
