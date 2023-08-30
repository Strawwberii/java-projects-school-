
public class Applicant implements Comparable{

    // attributes

    private String name;
    private int typingSpeed;
    
    // constructor

    public Applicant(String name, int typingSpeed){

        this.name = name;
        this.typingSpeed = typingSpeed;
    }

    //methods

    public String getName(){
        return this.name;
    }

    public int typingSpeed(){
        return this.typingSpeed;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setTypingSpeed(int typingSpeed){
        this.typingSpeed = typingSpeed;
    }
    
    @Override
    public int compareTo(Object o) {

        return typingSpeed;
       
    } 
}