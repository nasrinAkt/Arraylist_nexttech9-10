package generic_arraylist;

import java.util.ArrayList;


public class MyClass {

	public static void main(String[] args) {
		
	ArrayList<String> Sportscars = new ArrayList<String>();	
	Sportscars.add("Nissan");
	Sportscars.add("Camero");	
	Sportscars.add("Mustang");	
	Sportscars.add("BMW");
	
	//System.out.println(Sportscars);
	
	//System.out.println(Sportscars.get(3));
	
	/*Sportscars.set(0, "Bentley");
	System.out.println(Sportscars);*/
		
	/*Sportscars.remove(2);
	System.out.println(Sportscars);*/
	
	/*Sportscars.clear();
	System.out.println(Sportscars);*/
	
	//System.out.println(Sportscars.size());
		
	/*for(int i =0; i<Sportscars.size();i++) {	
	System.out.println(Sportscars.get(i));	*/
	
	for(String a:Sportscars) {	
	System.out.println(a);	
		
	}
		
		
		
		
		
		
		
		
	}
}
