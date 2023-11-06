package normal_arraylist;

import java.util.ArrayList;

public class class1 {

	public static void main(String[] args) {//Arraylist is a class , we just create object of the
	ArrayList jahan = new ArrayList();             //class
	jahan.add("Selenium");
	jahan.add("2131");
	jahan.add("Selenium");
	jahan.add("Selenium");
	jahan.add("Selenium");    //normal arraylist
	jahan.add("testng");      //if we work with multiple datatype , that time we need to use normal
	jahan.add("java");             //arraylist
	jahan.add(10.77);
	/*System.out.println(jahan);
	System.out.println(jahan.get(5));
	int a = jahan.size();
	System.out.println(a);*/
	
	for(int i = 0;i<jahan.size();i++) {
	System.out.println(jahan.get(i));	
		
	}
	ArrayList nasrin = new ArrayList();
	nasrin.add(100);
	nasrin.add("mango");
	nasrin.add(10.55);
	nasrin.add("banana");
	nasrin.add(111);
	nasrin.add(200.99);
	nasrin.add("apple");
	nasrin.add(500);
	nasrin.add("orange");
	//nasrin.remove(1);
	//System.out.println(nasrin);
	//System.out.println(nasrin.get(3));
	/*nasrin.clear();
    System.out.println(nasrin);*/
	int a = nasrin.size();
	System.out.println(a);
	for(int i =0; i<nasrin.size();i++) {
	System.out.println(nasrin.get(i));	
		
		
	}
	
	}
}

	
	
	
	
//any time we work with java given class, we must need to create object of the class
//any time we work with user non static method,we must need to create object of the class 
