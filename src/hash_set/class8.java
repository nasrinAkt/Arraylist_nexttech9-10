package hash_set;

import java.util.HashSet;

public class class8 {

	public static void main(String[] args) {
		 
		 // Create a HashSet object called numbers
	    HashSet<Integer> numbers = new HashSet<Integer>();

	    // Add values to the set
	    numbers.add(4);
	    numbers.add(7);
	    numbers.add(8);
       /* numbers.remove(8);
        System.out.println(numbers);*/
	    // Show which numbers between 1 and 10 are in the set
	    
	    for(int i = 0; i<=10; i++) {
	    if(numbers.contains(i)) {
	    System.out.println(i+" was found in the set");	
	    	
	    }else {
	    System.out.println(i+" was not found in the set");	
	    	
	    	
	    }
	    	
	    	
	    }
	    
	    
	    
	    }	
		
		
		
		
		

	}


