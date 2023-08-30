
public class Applicant implements Comparable{

    // attributes

    private String name;
    private int typingSpeed;
    
    // constructor

    public Applicant(String name, int typingSpeed){

        this.name = name;
        this.typingSpeed = typingSpeed;
    }
    @Override
    public int compareTo(Object o) {

        return typingSpeed;
       
    } 
}