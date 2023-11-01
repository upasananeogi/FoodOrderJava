package Assignment;

public class NewCustomer extends Customer {
PremiumCustomer p = new PremiumCustomer();
RegularCustomer r = new RegularCustomer();

float CustomerType(int id,float bill) {
	boolean check = true;
		for(int i=0;i<3;i++) {
//		System.out.println("ID= "+id +" p-id= "+p.pcustomer[i].p_id +" r-id="+r.rcustomer[i].r_id);
//		if(id !=p.pcustomer[i].p_id && id != r.rcustomer[i].r_id) {
//		System.out.println("Thank you for ordering with us");
//		System.out.println("Your bill is: "+ bill);
//		 break;
//			}
		if(id==p.pcustomer[i].p_id ||id==r.rcustomer[i].r_id)check=false;
		}
	    if(check==true) {
	    	System.out.println("Thank you for ordering with us");
			System.out.println("Your bill is: "+ bill);	
	    }
		return bill;
}

}
