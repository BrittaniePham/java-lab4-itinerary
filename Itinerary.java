package lab4_itinerary;

import java.util.ArrayList;
import java.util.Scanner;

public class Itinerary {
	static ArrayList<String> itinerary = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your destinations or type 'done': ");
		String city = input.nextLine();
		String cityValidation = city.toLowerCase();
		
		while(!cityValidation.equals("done")) {
			itinerary.add(city);
			System.out.println("you added " + city + " to the itinerary");
			city = input.nextLine();
			cityValidation = city.toLowerCase();
		}
		System.out.println("itinerary completed");
	}
	
}
