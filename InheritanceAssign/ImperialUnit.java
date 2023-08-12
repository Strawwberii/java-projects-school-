import java.text.*;

/* ImperialUnit.java

   Rupok Ghosh Adin T00716058
   COMP 1231 Assignment 1
   This is a children class of Product.java that takes mass in pounds
   and ounces and volume in cm3 to check the density of the products.
 */
class ImperialUnit extends Product{

    private double massPounds;
    private double massOunces;

    // accessor methods

    public double getPounds(){
        return massPounds;
    }
    
    public double getOUnces(){
        return massOunces;
    }

    //mutator methods

    public double getMassInGrams(){
        double mass = (massPounds * 16) + massOunces;
        double Totalmass = mass * 28.35;    //1oz = 28.35 grams
        return Totalmass;
    }

    // method that gets density

    public double getDensity(){
        return getMassInGrams()/getVolume();
    }

    //method that checks density

    public String densityCheck(){

        double density = getMassInGrams()/getVolume(); // density = mass/volume
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
    
    public ImperialUnit(){
        massPounds = 0;
        massOunces = 0;
    }
    // parameterized constructor
    
    public ImperialUnit(String newProductID, double newMassPounds, double newMassOunces, double newVolume ){
            super(newProductID, newVolume);
            massPounds = newMassPounds;
            massOunces = newMassOunces;
    }
    // formatting

    public String toString(){
		
		DecimalFormat df = new DecimalFormat("0.00"); // format numbers to 2 decimal places
		
        String result = "Product ID: " + getProductID() + "\tMass: " + df.format(getPounds())
                        + "lb " + df.format(getOUnces()) + " oz" + "\tVolume: " + df.format(getVolume()) + "cm3" 
                        + "\tDensity: " + df.format(getDensity()) + "\tDensity Check: " + densityCheck() + "\n";

        return result;
    }
}
