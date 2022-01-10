public class GroceryShop
{
static String name = "prasanth";
static int doorNo = 9999;
	

public static void main(String[] args)
{
GroceryShop gs = new GroceryShop();
float balance = gs.buy(100);
	System.out.println(balance);
	gs.comeback(balance);
}
	
	
	public float buy(int no1)

{
	
		System.out.println(no1/2);
		return no1/2;
}

		public void comeback(float balance)
		{
			System.out.println(balance + " "+name +" "+doorNo);
		}
	
}