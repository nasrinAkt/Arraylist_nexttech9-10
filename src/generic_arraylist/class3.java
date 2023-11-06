package generic_arraylist;

import java.util.ArrayList;

public class class3 {

	public static void main(String[] args) {
		
		 ArrayList<String> cars = new ArrayList<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
		    System.out.println(cars);
		    for (int i = 0; i < cars.size(); i++) {
		      System.out.println(cars.get(i));
		    }	
		    ArrayList<String> car = new ArrayList<String>();
		    car.add("Volvo");
		    car.add("BMW");
		    car.add("Ford");
		    car.add("Mazda");
		    System.out.println("All together "+car);
		    for (String i : car) {
		      System.out.println(i);
		    }
		
		
	}

}
