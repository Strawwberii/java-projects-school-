

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

class Product implements Category, PasswordLockable{

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
            System.out.println("Locked!");
        }
    }
    
    public void setDescription(String description){
        if (!productIsLocked) {
            this.description = description;
        }
        else {
            System.out.println("Locked!");
        }
    }
    
    public void setPrice(double price){
        if(!productIsLocked){
            this.price = price;
        }
        else {
            System.out.println("Locked!");
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
    }
    
    @Override
    public void unlock(String password) {
        if(password.equals(this.password)){
            productIsLocked  = false;
        }
    }

    @Override
    public boolean isLocked() {
        return productIsLocked;
    }
    
    // compareTo method

    public int compareTo(Product otherProduct){
        return Double.compare(this.price, otherProduct.price);
    }

}