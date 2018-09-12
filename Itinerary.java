package lab4_itinerary;

import java.util.ArrayList;
import java.util.Scanner;

public class Itinerary {
	static ArrayList<String> itinerary = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your destinations or type 'done': ");
		System.out.print("Destination: ");
		String city = input.nextLine();
		String cityValidation = city.toLowerCase();
		
		while(!cityValidation.equals("done")) {
			itinerary.add(city);
			System.out.print("Destination: ");
			city = input.nextLine();
			cityValidation = city.toLowerCase();
		}
		System.out.println("itinerary completed");
		StringBuilder sb = new StringBuilder("travel route: ");
		
		int i = 0;
		for(String it : itinerary ) {
			it = it.toUpperCase();
			if(i < itinerary.size() - 1) {
				sb.append(it + " to ");
				i++;
			} else {
				sb.append(it);
			}
		}
		System.out.println(sb);
	}
	
}
