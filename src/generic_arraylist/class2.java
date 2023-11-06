package generic_arraylist;

import java.util.ArrayList;

public class class2 {

	public static void main(String[] args) {
	ArrayList<Integer> lucky = new ArrayList<Integer>();	
	lucky.add(100);	
	lucky.add(200);	
	lucky.add(300);	
	lucky.add(400);	
	lucky.add(500);	
	lucky.add(600);	
	lucky.add(700);	
	lucky.add(800);	
	lucky.add(900);	
	lucky.add(1000);	
	lucky.add(1100);
	/*lucky.remove(7);
	 System.out.println(lucky);*/
	 
	//System.out.println(lucky);
	//System.out.println(lucky.get(4));
	//lucky.clear();
	/*boolean t =lucky.contains(800);
    System.out.println(t);*/
	/*int a = lucky.size();
	System.out.println(a);*/
	
	/*for(int i = 1; i<lucky.size();i++) {	//for loop
	System.out.println(lucky.get(i));*/
	//lucky.clear();
		
		
	
	/*for(int i = 10; i>=0; i=i-2) {
	System.out.println(lucky.get(i));*/	
		
	for(int i:lucky) {   //advanced for loop
		System.out.println(i);	
	}
	}
}

