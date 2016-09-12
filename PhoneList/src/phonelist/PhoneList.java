package phonelist;
import java.util.Scanner;
import java.util.ArrayList;
public class PhoneList {

    public static void main(String[] args) {
        String userc;
        Scanner keyboard=new Scanner(System.in);
        //making array
      String[] name={"Bob","Luke","John"};
      String[]phone={"490-478-4792","948-947-2946","102-274-0045"};
      
      
        
        //%s for string
        System.out.printf("%s ,%s ,%s\nType in the name you want to see the phone number of\n",name[0],name[1],name[2]);
      userc=keyboard.nextLine().toUpperCase();
      //turn userc to upper case so case does not matter
        
      //for loop to keep checking the names
        for(int i=0;i<name.length;i++)
        {
        	// turn name to upper case
       	if(name[i].toUpperCase().contains(userc))
        	{
        		System.out.println(name[i]+"\t"+phone[i]);
        	}
        	
          // if i = 0 then the userc did not meet the for loop criteria
       	else if(i==0)
		{
		System.out.println("There is no one with that name,Bye.");
		}
		
        
           }	
        
    	
        		
        		
        		
        		
        		
        		
        		
        		
        		
   
        
    }
    
}
