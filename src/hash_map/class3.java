package hash_map;

import java.util.HashMap;

public class class3 {

	public static void main(String[] args) {
		
		 HashMap<String, String> capitalCities = new HashMap<String, String>();
		    capitalCities.put("England", "London");
		    capitalCities.put("Germany", "Berlin");
		    capitalCities.put("Norway", "Oslo");
		    capitalCities.put("USA", "Washington DC");
		    
		    System.out.println(capitalCities);
		    
		    System.out.println(capitalCities.get("USA"));
		    
		    System.out.println(capitalCities.get("England"));
		    
		   /* capitalCities.remove("USA");
		    System.out.println(capitalCities);*/
		    
		   /* capitalCities.clear();
		    System.out.println(capitalCities);*/
		    
		    System.out.println(capitalCities.size());
		
		
		
		
	}

}
