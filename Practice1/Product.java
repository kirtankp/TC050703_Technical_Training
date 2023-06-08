/*
 * Create a class called Product with the following attributes and methods:

Attributes:
name (String)
price (double)
quantity (int)
totalSold (static int)
Methods:
void sell(int quantity): This method should decrease the quantity of the product by the given quantity and update the totalSold static variable accordingly.
static int getTotalSold(): This method should return the total quantity of products sold so far.
In the Main class, test the Product class by doing the following:
Create multiple instances of Product and set their name, price, and quantity.
Call the sell() method for some of the product instances to simulate selling them.
Print the total quantity of products sold using the getTotalSold() method.
Write the code to solve the problem.*/

public class Product {
	String name;
	double price;
	int quantity;
	static int totalSold = 0;
	
	Product(String n,double p,int q) {
		this.name = n;
		this.price = p;
		this.quantity = q;
	}
	
	void sell(int quantity) {
		this.quantity -= quantity ;
		totalSold += quantity;
	}
		
	static int getTotalSold() {
		return totalSold;
	}
	
	
	public static void main(String[] args) {
		Product p1 = new Product("pen",5,10);
		p1.sell(5);
		System.out.println(p1.quantity+" "+p1.name+" are remaining");

		Product p2 = new Product("pencil",2.5,15);
		p2.sell(2);		
		System.out.println(p2.quantity+" "+p2.name+" are remaining");

		Product p3 = new Product("eraser",2,15);
		p3.sell(5);		
		System.out.println(p3.quantity+" "+p3.name+" are remaining");

		Product p4 = new Product("noteBook",21.5,50);
		p4.sell(13);		
		System.out.println(p4.quantity+" "+p4.name+" are remaining");

		System.out.println("total product sold: "+Product.getTotalSold());


	}
}
