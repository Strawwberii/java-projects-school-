import java.util.*;

public class Group<T>{

    //attributes
    private ArrayList<T> aList;

    //constructor
    public Group(){
        aList = new ArrayList<>();
    }

    // methods

    public ArrayList<T> getList(){
        return aList;
    }
    public void addToGroup(T member){
        aList.add(member);
    }

    public void removeFromGroup(){
        aList.remove(aList.size() - 1);
    }

    public void removeFromGroup(T member){
        aList.remove(member);
    }

    public int getNumberOfMembers(){
        return aList.size();
    }

    public boolean hasNoMember(){
        return aList.isEmpty();
    }

    public String toString(){
        String result = "";
        for(int i=0; i<aList.size(); i++){
            result = result + aList.get(i).toString() + "\n";
        }
        return result;
    }
}