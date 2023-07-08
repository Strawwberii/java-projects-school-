public class Lucas{
    
    public static void main (String[] args){
        
        int n = 1;
        int count = 0;
        int count2 = 0;
        int count3 = 0;
        
        for(int i=1; i<=1000; i++){
          
          if(i % 3 == 0){
            count = count + 1;
        }  
        else if( i % 7 == 0){
            count2 = count2 + 1;
        }
        else if (i % 21 == 0){
            count3 = count3 + 1;
        }
        
        
        

        }
        int total = 0;
        total = count + count2 - count3;
                System.out.println(total);
    }
}
