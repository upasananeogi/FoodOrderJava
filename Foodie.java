package Assignment;
import java.util.*;

public class Foodie {

	public static void main(String[] args) {
		
        Customer c = new  Customer();
		Order o= new Order();
		Menu m = new Menu();
		PremiumCustomer p = new PremiumCustomer();
		RegularCustomer r= new RegularCustomer();
		NewCustomer n= new NewCustomer();
		Restaurant rt = new Restaurant();
	    rt.GetData();
	    rt.Display();
        c.getcustomerdetails();
//      c.display();
        System.out.print("\nPlease choose from the menu : ");
        System.out.println("");
        m.display(); 
        o.choosemenu();
	    System.out.println("Price : ");
		o.getbill(o.food);
		System.out.println( o.getbill(o.food));
		n.CustomerType(c.customer_id,o.getbill(o.food));
		p.CustomerType(c.customer_id,o.getbill(o.food));
		r.CustomerType(c.customer_id,o.getbill(o.food));

	}	

}
