package Assignment;

public class RegularCustomer extends Customer {

	int r_id;
	RegularCustomer rcustomer[] = new RegularCustomer[10];
	RegularCustomer(){
		RegularCustomer customer1= new RegularCustomer (4,new Name("U","Neogi"),new Address("kol","west"),991053338,"@gmail.com");
		RegularCustomer customer2= new RegularCustomer (5,new Name("P","Neogi"),new Address("kol","north"),991053328,"@gmail1.com");
		RegularCustomer customer3= new RegularCustomer (6,new Name("A","Neogi"),new Address("kol","south"),991053318,"@gmail2.com");
		rcustomer= new RegularCustomer[] {customer1, customer2, customer3};
		}
		
	RegularCustomer(int r_id, Name name,Address address, long phone_number,String email_address){
		this.r_id = r_id;
		this.name=name;
		this.address=address;
		this.phone_number=phone_number;
		this.email_address= email_address;
	}
	void display() {
		for(int i=0;i<3;i++) {
			System.out.println(rcustomer[i].r_id+rcustomer[i].name.fName);
		}
			
	}

		float CustomerType(int id,float bill) {
		for(int i=0;i<3;i++) {
		if(id == rcustomer[i].r_id) {
		System.out.println("Thank you for being our Regular Customer");
		 bill= (bill*90)/100;
		 System.out.println("Your bill after discount is: "+ bill);
		 break;
			}
		}
		
		return bill;
		}
}