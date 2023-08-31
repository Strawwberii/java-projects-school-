import java.util.*;

/* Main.java
 * Rupok Ghosh Adin T00716058
 * COMP 1231 Assignment 4
 * Main class of the application where all the methods are called
 * and the results are displayed. 
 */
public class Main{

    public static void main(String[]args){

        Group<Applicant> applicantList = new Group<>();
        Applicant standard = new Applicant("Standard Applicant", 60);

        // applicant list
        
        applicantList.addToGroup(new Applicant("Tom", 59));
        applicantList.addToGroup(new Applicant("Mary", 73));
        applicantList.addToGroup(new Applicant("John", 52));
        applicantList.addToGroup(new Applicant("David", 66));
        applicantList.addToGroup(new Applicant("Tracy", 50));
        applicantList.addToGroup(new Applicant("Barry", 85));
        applicantList.addToGroup(new Applicant("April", 135));
        applicantList.addToGroup(new Applicant("Sandy", 32));

        // applicants who meet the requirement

        Group<Applicant> passList = new Group<>();
        ArrayList<Applicant> applicants = applicantList.getList();
        for (Applicant applicant : applicants){
            if (applicant.getTypingSpeed() >= standard.getTypingSpeed()){
                passList.addToGroup(applicant);
            }
        }

        // applicant who do not meet the requirement

        Group<Applicant> failList = new Group<>();
        for (Applicant applicant : applicants){
            if (applicant.getTypingSpeed() < standard.getTypingSpeed()){
                failList.addToGroup(applicant);
            }
        }

        /*--displaying results--*/

        if(!applicantList.hasNoMember()){       // results are only displayed if there are members in the applicantList
            System.out.println("The following applicants are applying for the job:\n");
            System.out.println(applicantList + "\n");

            System.out.println("Total number of applicants: " + applicantList.getNumberOfMembers() + "\n");

            System.out.println("Applicant who do not fulfill typing speed requirement");
            System.out.println(failList);
            System.out.println();

            if(!passList.hasNoMember()){
                System.out.println("Candidates who have fulfilled typing speed test requirement: \n");
                System.out.println(passList);
                System.out.println();
            }
            else{
                System.out.println("No candidate in the list!");
            }
            
            System.out.println("The following candidate who submitted the application last has been removed from the list:\n");
            
            Applicant removedCandidate = applicantList.getList().remove(applicantList.getNumberOfMembers() -1 );
            System.out.println("Remove: " + removedCandidate);
            System.out.println();

            System.out.println("The candidates are sorted in a descending order based on their typing speed: \n");
            Collections.sort(passList.getList());
            System.out.println(passList);
            System.out.println();
        }
        else{
            System.out.println("No candidate in the list!");
        }
    }
}