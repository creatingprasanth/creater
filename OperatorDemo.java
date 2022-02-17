
public class OperatorDemo {
public static void main(String[] args) 
{
OperatorDemo Demo = new OperatorDemo();
  Demo.Demo1();
  //Demo.Demo2();
}

	private void Demo2() {
		int a = 10, b = 20, c = 30; 
		System.out.println(a++ + --b + c++);   //10+19+30 =59
		System.out.println(++a + b-- + c--);   //12+19+31 =62
		System.out.println(--a + b++ + c++);   //11+18+30=59
		System.out.println(c++ - --b);         //31-18=13
		System.out.println(c---b---a--);       //32-18-11=3
	 
	}
	

	private void Demo1() {
	
	int a =5;
	System.out.println(a++);         //5 =5
	int b = 5;
	System.out.println(++b);        //6 =6
	int c = 5, d = 5;
	System.out.println(c++ + ++d);  //5 + 6=11
	System.out.println(c);          //6=6
	System.out.println(d);          //6=6
}

}