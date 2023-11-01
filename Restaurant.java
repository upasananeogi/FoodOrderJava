package Assignment;

public class Restaurant {
	final String Restaurant=" Foodie";
	String email;
	Address address;
	String phone_no;
	
	
void GetData() {
	 email = " foodie@gmail.com";
    address = new Address(" Kolkata","South");
	phone_no= " 9910533328";
		
}
void Display() {
	System.out.println("Restaurant name:" + Restaurant);
	System.out.println("Restaurant email:" + email);
	System.out.println("Restaurant address:" + address.city+" "+ address.district);
	System.out.println("Restaurant phone no:" + phone_no);
}

}
