/* Customer.java
 * Rupok Ghosh Adin T00716058
 * Storage for the customer attributes. 
 */
class Customer{

    //attributes
    private int age = 0;
    private double rating = 0.0;

    // constructor
    public Customer(int age, double rating){

        this.age = age;
        this.rating = rating;
    }

    // accessor methods

    public int getAge(){
        return age;
    }
    
    public double getRating(){
        return rating;
    }

    //toString method

    public String toString(){
        return String.format("%-10d%-10.2f", age, rating);
    }
}

