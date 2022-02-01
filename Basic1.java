
public class Basic1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		System.out.println("Before");
		System.out.println("a-->"+a);
		System.out.println("b-->"+b);
		System.out.println("c-->"+c);
		System.out.println("d-->"+d);
		a = a + b + c + d;
		d = a - (b+c+d);
		c = a - (b+c+d);
		b = a - (b+c+d);    
		a = a - (b+c+d);
		System.out.println("After");
		System.out.println("a-->"+a);
		System.out.println("b-->"+b);
		System.out.println("c-->"+c);
		System.out.println("d-->"+d);
        
	}

}
