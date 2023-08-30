import java.util.ArrayList;

public class Group<T>{

    //attributes
    private ArrayList<T> aList;

    //constructor
    public Group(){
        aList = new ArrayList<>();
    }

    // methods
    public void addToGroup(T member){
        aList.add(member);
    }

    public void removeFromGroup(){
        aList.remove(aList.size() - 1);
    }

    public void removeFromGroup(T member){
        aList.remove(member);
    }

    public int getNUmberOfMembers(){
        return aList.size();
    }

    public boolean hasNoMember(){
        return aList.isEmpty();
    }

    public String toString(){


    }
}