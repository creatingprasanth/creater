public class Mycalculation extends Calculation
{
public static void main(String[] args)
{
int a=30,b=20;
Mycalculation mc = new Mycalculation();
mc.addition(a,b);
mc.subtraction(a,b);
mc.multiplication(a,b);
}
public void multiplication(int x,int y)
{
z=x*y;
System.out.println("The product of the given numbers:"+z);

}
}