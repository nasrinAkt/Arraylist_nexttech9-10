package generic_arraylist;

import java.util.ArrayList;

public class class1 {

	public static void main(String[] args) {
		
		ArrayList<String> happy = new ArrayList<String>();
		
		happy.add("java");
		happy.add("java");
		happy.add("java");
		happy.add("cucumber");
		happy.add("maven");
		happy.add("selenium");
	/*boolean h = happy.contains("QTP");//contains method
	System.out.println(h);*/
	/*boolean t =	happy.contains("selenium");
	System.out.println(t);*/
	/*happy.remove(3);
	 System.out.println(happy);*/
	/*int i =happy.size();
	System.out.println(i);*/
	//System.out.println(happy);
	//System.out.println(happy.get(5));
	//advanced for loop only applicable for generic arraylist*/
		for(String a:happy) {
			System.out.println(a);	
			
		}
ArrayList<String> fun = new ArrayList<String>();
		fun.add("java");
		fun.add("java");
		fun.add("java");
		fun.add("cucumber");
		fun.add("maven");
		fun.add("selenium");
		//System.out.println(fun);//before the clear	
		fun.clear();	//after the clear
		System.out.println(fun);	
		}
	}


