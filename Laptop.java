public class Laptop {
	String brand; 
	int price; 
	public Laptop(String brand, int price) {
		this.brand = brand; 
		this.price = price;
	}
	public static void main(String[] args) {
		Laptop l1 = new Laptop("Dell",40000); 
		Laptop l2 = new Laptop("Dell",35000);
		System.out.println(l1.equals(l2));	//
		System.out.println(l1.equals(l2));// Laptop 
	}
	public int hashCode()
	{
		return this.price; 
	}
	public boolean equals(Object obj) // Laptop 
	{
		int no1 = this.hashCode();//40000
		System.out.println(no1);
		int no2 = obj.hashCode(); //35000
		System.out.println(no2);
		if(no1==no2)
			return true; 
		else
			return false;
	}
	public String toString()
	{
		return this.brand;
	}
	

} 

