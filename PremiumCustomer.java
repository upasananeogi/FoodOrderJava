package Assignment;

public class PremiumCustomer extends Customer {
	int p_id;
PremiumCustomer pcustomer[] = new PremiumCustomer[10];
PremiumCustomer(){
	PremiumCustomer customer1= new PremiumCustomer (1,new Name("Upasana","Neogi"),new Address("kol","west"),991053338,"@gmail.com");
	PremiumCustomer customer2= new PremiumCustomer (2,new Name("Mihir","Neogi"),new Address("kol","north"),991053328,"@gmail1.com");
	PremiumCustomer customer3= new PremiumCustomer (3,new Name("Shaira","Ahluwalia"),new Address("kol","south"),991053318,"@gmail2.com");
	pcustomer= new PremiumCustomer[] {customer1, customer2, customer3};
	}
	
PremiumCustomer(int p_id, Name name,Address address, long phone_number,String email_address){
	this.p_id = p_id;
	this.name=name;
	this.address=address;
	this.phone_number=phone_number;
	this.email_address= email_address;
}
void display() {
	for(int i=0;i<3;i++) {
		System.out.println(pcustomer[i].p_id+pcustomer[i].name.fName);
	}
		
}


	

float CustomerType(int id,float bill) {
	for(int i=0;i<3;i++) {
	if(id == pcustomer[i].p_id) {
	System.out.println("Thank you for being our Premium Customer");
	 bill= (bill*80)/100;
	 System.out.println("Your bill after discount is: "+ bill);
	 break;
		}
	}
	
	return bill;
	}
//	System.out.println("ID: "+id);
//	System.out.println("P_ID "+p_id);
//	if(id == p_id) {
//	 System.out.println("Thank you for being our Premium Customer");
//	 bill= (bill*80)/100;
	 
			 
//	}return bill;
//	
//	
//	
//	
//}
		
}

	




