package collectionFarmework;
import java.util.*;

public class hashSet {
	  
	 
	 public static void main(String args[]){  
	    
	   Set<String> set=new HashSet();  
	           set.add("One");    
	           set.add("Two");    
	           set.add("Three");   
	           set.add("Four");  
	           set.add("Five");  
	           Iterator<String> i=set.iterator();  
	           while(i.hasNext())  
	           {  
	           System.out.println(i.next());  
	           }  
	 }  
	  

}
