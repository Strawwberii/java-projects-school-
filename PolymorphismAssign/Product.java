
/* Rupok Ghosh Adin T00716058
 * COMP 1231 Assignment 2
 * This application keeps records of different products of different categories
 * and requires password access for any kind of change to the products. It
 * is also capable of getting the product with the lowest price. 
 */
interface Category{
    
    int Unclassified = 0;
    int Meat = 1;
    int Dairy = 2; 
    int Vegetables = 3;

    // methods

    void setCategory(int category);
    int getCategory();
}

interface PasswordLockable{

    //methods

    void setPassword(String password);
    void lock(String password);
    void unlock(String password);
    boolean isLocked();
}

class Product implements Category, PasswordLockable, Comparable<Product>{

    // attributes

    private String code;
    private String description;
    private double price;
    private int category;
    private String password;
    private boolean productIsLocked;

    // constructor

    public Product(String code, String description, double price, int category){
        this.code = code;
        this.description = description;
        this.price = price;
        this.category = category;
    }
    // accessor methods

    public String getCode(){
        return code;
    }

    public String getDescription(){
        return description;
    }

    public double getPrice(){
        return price;
    }

    @Override
    public int getCategory() {
        return category;
    }

    // mutator methods

    public void setCode(String code){
        if(!productIsLocked){
            this.code = code;
        }
        else{
            System.out.println("The product is locked!");
        }
    }
    
    public void setDescription(String description){
        if (!productIsLocked) {
            this.description = description;
        }
        else {
            System.out.println("The product is locked!");
        }
    }
    
    public void setPrice(double price){
        if(!productIsLocked){
            this.price = price;
        }
        else {
            System.out.println("The product is locked!");
        }
    }

    // overriden mutator methods

    @Override
    public void setCategory( int category) {
        
        this.category = category;
    }
    
    @Override
    public void setPassword(String password) {
        this.password = password;
        System.out.println("Password has been set.");
    }

    // method to convert the category

    public String getCategoryDescription(){
        switch(category){
            case Unclassified:
                return "Unclassified";
            case Meat:
                return "Meat";
            case Dairy:
                return "Dairy";
            case Vegetables:
                return "Vegetables";
            default:
                return "Does not fall under any category";

        }
    }

    // implemented methods from PasswordLockable

    @Override
    public void lock(String password) {
        if(password.equals(this.password)){
            productIsLocked = true;
        }
        System.out.println("The product record is now locked.");
    }
    
    @Override
    public void unlock(String password) {
        if(password.equals(this.password)){
            productIsLocked  = false;
        }
        System.out.println("The product record is now unlocked!");

    }

    @Override
    public boolean isLocked() {
        return productIsLocked;
    }
    
    // compareTo method

    public int compareTo(Product Product2){
        return Double.compare(this.price, Product2.price);
    }

    // toString method

    public String toString(){

        return "Product Code: " + code + "\tDescription: " 
                + description + "\tPrice: " + price + "\tCategory: "
                + category;
    }

}