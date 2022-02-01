
public class Basic
{
public static void main(String[] args) 
{
	int a = 10;
	int b = 20;
	int c = 30;
	System.out.println("Before");
	System.out.println("a-->"+a);
	System.out.println("b-->"+b);
	System.out.println("c-->"+c);
	
	a = a + b + c;
	c = a - (b+c);
	b = a - (b+c);    
	a = a - (b+c);
	System.out.println("After");
	System.out.println("a-->"+a);
	System.out.println("b-->"+b);
	System.out.println("c-->"+c);
    	
}
}
