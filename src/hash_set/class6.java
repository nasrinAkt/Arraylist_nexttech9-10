package hash_set;

import java.util.HashSet;

public class class6 {

	public static void main(String[] args) {
	HashSet<String>	h_set = new HashSet<String>();
	h_set.add("Red");
	h_set.add("Green");
	h_set.add("Black");
	h_set.add("White");
	h_set.add("Pink");
	h_set.add("Yellow");
	
	System.out.println("Original Hash set: "+h_set);	
	System.out.println("Checking the above arraylist is empty or not!"+h_set.isEmpty());	
	System.out.println("Remove all the elements from a Hash Set: "+h_set.removeAll(h_set));	
	System.out.println("Hash set after removing all the elements"+h_set);
	}

}
