
public class Applicant implements Comparable<Applicant>{

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

    public int getTypingSpeed(){
        return this.typingSpeed;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setTypingSpeed(int typingSpeed){
        this.typingSpeed = typingSpeed;
    }
    
    @Override
    public int compareTo(Applicant other) {

        return Integer.compare(other.typingSpeed, this.typingSpeed);
       
    } 
    @Override
    public String toString(){
        return "Name=" + name + "; " + "Typing Speed(words/min)= " + typingSpeed;where
    }
}