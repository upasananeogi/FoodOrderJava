package Assignment;

import java.util.Scanner;

public class Order {
	int n;
	String food[]= new String[3];
	Menu m= new Menu();
	
	void choosemenu() {
		Scanner s = new Scanner (System.in);
		System.out.println("\nPlease enter no of food item you want to order out of 3:");
		n = s.nextInt();
		for(int i =0;i<2;i++) {
			System.out.println("\nPlease enter your food item:");
			 food[i]= s.next();}
			 }
	int getDataFrommenu(String name) {
		for(int i=0;i<2;i++) {
			if (name.equals(m.menu[i].name)) {
				return( m.menu[i].price);
			}
		}
		return -1;
	}
	int getbill(String food[]) {
		int bill=0;
		for(int i=0;i<food.length;i++) {
			 if(food[i] != null)bill=bill+ getDataFrommenu(food[i]);
		
		}return bill;
		
		
	}
	void display() {
		
	}

}
