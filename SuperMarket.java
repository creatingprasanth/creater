public class SuperMarket
{
static String name ="prasanth";
static int doorNo = 1234;
int price , discount;
String brand;
	public SuperMarket(int i,int j,String s)
	{
		price = i;
		discount = j;
		brand = s;
	}
public static void main(String[] args)
{
SuperMarket prod1 = new SuperMarket(100, 20,"ABCD");
SuperMarket prod2 = new SuperMarket(200, 30, "BCD");
	prod1.buy();
	prod2.buy();
}
	public void buy()
	{
		System.out.println(price);
		System.out.println(discount);
		System.out.println(brand);
}
}