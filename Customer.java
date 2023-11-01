package Assignment;
import java.util.*;
	public class Customer {

	   
		Name name;
		int customer_id;
		Address address;
		long phone_number;
		String email_address;
		int n;
		String food[]= new String[3];
		private Scanner sc;
		Customer() {
			
		}
		
		
		public Customer(Name name,int customer_id,Address address,long phone_number,String email_address)
	{ 
		    this.name=name;
			this.customer_id=customer_id;
			this.address=address;
			this.phone_number=phone_number;
			this.email_address= email_address;
		}
		
		
		


		public void getcustomerdetails(){
			
			sc = new Scanner (System.in);
			{System.out.println("Please enter your details:-");
			System.out.println("Please enter your id:");
			 customer_id= sc.nextInt();
			 System.out.println("Please enter your first name:");
			 String fName=sc.next();
			 System.out.println("Please enter your last name:");
			 String Lname=sc.next();
			 name= new Name (fName,Lname);
			 System.out.println("Please enter your city:");
			 String city = sc.next();
			 System.out.println("Please enter your district:");
			 String district = sc.next();
			 address = new Address (city,district);
			 System.out.println("Please enter your phone no:");
			 phone_number=sc.nextLong();
			 System.out.println("Please enter your email:");
			 email_address=sc.next();}
			
			 }
	
void display() {
	System.out.println("Name: "+ name);
	System.out.println("Id: "+ customer_id);
	System.out.println("Address: "+ address);
	System.out.println("Phone Number: "+ phone_number);
	System.out.println("Email: "+ email_address);
	
			
		}
//void choosemenu() {
//	Scanner s = new Scanner (System.in);
//	System.out.println("\nPlease enter no of food item you want to order out of 3:");
//	n = s.nextInt();
//	for(int i =0;i<n;i++) {
//		System.out.println("\nPlease enter your food item:");
//		 food[i]= s.next();
		 
//	for(int i =0;i<n;i++) {
//	 System.out.print(food[i]+" ");
//	
//}
 
	  
	  
  }



