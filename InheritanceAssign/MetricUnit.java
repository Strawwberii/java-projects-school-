import java.text.*;

/* MetricUnit.java

   Rupok Ghosh Adin T00716058
   COMP 1231 Assignment 1
   This is a children class of Product.java which uses mass in grams
   and volume in cm3 to check the density of the products.
 */
class MetricUnit extends Product {
    
    private double massKG;

    //accessor methods

    public double getmassKG(){
        return massKG;
    }

    //mutator methods

    public double getMassInGrams(){
        double mass = massKG * 1000;    // 1kg = 1000g;
        return mass;
    }

    // method that gets density

    public double getDensity(){
        return getMassInGrams()/getVolume();
    }

    // method that checks density

    public String densityCheck(){

        double density = getMassInGrams()/getVolume();  // density = mass/volume;
        String result = "";

        if(density < 1.25){
            result = "Too thin";
            return result;
        }
        else if(density > 1.55){
            result = "Too thick";
            return result;
        }
        else{
            result = "Acceptable";
            return result;
        }
    }

    // default constructor 

    public MetricUnit(){

        massKG = 0;
    }

    // parameterized constructor

    public MetricUnit( String newProductID, double newMassKG, double newVolume){
        super(newProductID, newVolume);
        massKG = newMassKG;
    }

    // formatting

    public String toString(){
		
		DecimalFormat df = new DecimalFormat("0.00"); // format numbers to 2 decimal places
		
        String result = "Product ID: " + getProductID() + "\tMass: " + df.format(getmassKG()) 
                        + " kg" + "\t\tVolume: " + df.format(getVolume()) + "cm3" 
                        + "\tDensity: " + df.format(getDensity()) + "\tDensity Check: " + densityCheck() + "\n";

        return result;
    }
}
