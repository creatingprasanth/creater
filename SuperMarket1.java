public class SuperMarket1
{
static String name = "muthu"; 
static int doorNo = 1234; 
int price, discount; //object specific variables
String brand; //object specific variables
// Special Nature 
// Constructor should be with same name of our class name
// Constructors wont have return datatype
// Constructor will be called automatically when objects are created

// Constructor Overloading	- no. of arguments / order of arg.
public SuperMarket1
	System.out.println("Check"); 
	this.price = price; 
	this.discount = discount; 
	this.brand = brand; 
}
public SuperMarket1(int price, String brand)
{
	this.price = price; 
	this.brand = brand; 
}
public SuperMarket1(String brand, int price)
{
	this.price = price; 
	this.brand = brand; 
}
public SuperMarket1()
{
System.out.println("Zero Arguments Constructor"); 	
}
public static void main(String[] args)
{
SuperMarket1 prod1 = new SuperMarket1(100, 20, "ABCD"); 
SuperMarket1 prod2 = new SuperMarket1(200, 30, "BCD"); 
SuperMarket1 prod3 = new SuperMarket1(10, "PQR"); 
SuperMarket1 prod4 = new SuperMarket1("XYZ", 20);
SuperMarket1 prod5 = new SuperMarket1();
	
prod1.buy
(); 
	
prod2.buy
(); 
}
public void buy()
{
	System.out.println(price); 
	System.out.println(discount); 
	System.out.println(brand); 
}
} 