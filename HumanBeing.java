public class HumanBeing
{
int amount;
public static void main(String[] args)
{
HumanBeing hb = new HumanBeing();
hb.amount =10000;
	System.out.println("hb amount" + hb.amount);
	HumanBeing hb2 = new HumanBeing();
	hb2.amount = 100000;
	hb2.getveg(200);
	}
public void getveg(int amount)
{
System.out.println("local amount" + amount);
System.out.println("global amount" + this.amount);
}
public static void paint()
{
//System.out.println(this.amount);
}
}