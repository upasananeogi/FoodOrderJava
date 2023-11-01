package Assignment;

public class Menu{
//	String food_name[];
//	int price_item[];

//	 Menu(){
//		 food_name= new String[]{"burger","patsa","pizza"};
//		 price_item= new int[] {100,200,300} ;
//		 }
	

	public class Food_item{

	String name;
	int price;
	String description;
	int quantity;
	public Food_item(String name,int price,String description,int quantity){ 
		this.name= name;
		this.price=price;
		this.description=description;
		this.quantity=quantity;
		}
	}

	Food_item menu[]= new Food_item[3];
	
	public Menu() {
		Food_item food0 = new Food_item("pizza",500,"Italian",5);
		Food_item food1 = new Food_item("pasta",400,"Italian",4);
		Food_item food2 = new Food_item("lasagna",500,"Italian",6);
	    menu= new Food_item[]{food0,food1,food2};
	}

	void display() {
		for(int i=0;i<3;i++) {
			System.out.println(menu[i].name+" "+ menu[i].price+" "+ menu[i].description+" "+ menu[i].quantity);
			}
		}
	
//	int getData(String name){
//		for(int i=0;i<3;i++) {
//			if (name.equals(menu[i].name)) {
//				return( menu[i].price);
//			}
//		}
//		return -1;
//	}
//	int getbill(String food[]) {
//		int bill=0;
//		for(int i=0;i<food.length;i++) {
//			 if(food[i] != null)bill=bill+ getData(food[i]);
//		
//		}return bill;
//		
//		
//	}
}


