
public class Prime {

	public static void main(String[] args) {
	Prime prime = new Prime();
	//prime.findDivisors(100);
	//Prime.findcommonDivisors(100,50);
	//Prime.findcommonMultiple(5,12);
	//Prime.findFactorial(5);
	Prime.Addition of digit();
	}

	private static void findcommonMultiple(int no1, int no2) {
		int big = no1>no2?no1: no2;
		while(true)
		{
			if(big%no1==0 && big%no2==0)
			{
				System.out.println("Lcm-->"+big);
				break;
			}
			big =big+1;
		}
		
	}

	private static void findcommonDivisors(int no1, int no2) {
	//Ternary operator
		int small =no1<no2? no1: no2;
		int div = 2;
		int gcd =0;
		while(div<=small)
		{
			if(no1%div==0 && no2%div==0)
			{
				gcd = div;
				//System.out.println(div);
			}
			div=div+1;
		}
		System.out.println(gcd);
	}
	

	private void findDivisors(int no) {
		int div = 2;
		int count =0;
		while(div<no)
		{
			if(no%div==0)
			{
				System.out.println(div);
				count = count+1;
			}
		div =div+1;
		}
		System.out.println("No.of Divisors");
		if(count==0)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}

	private int findFactorial(int no) { //4
		// TODO Auto-generated method stub
		int fact = 1; 
		while(no>0)
		{
		fact = fact * no; 
		no= no-1; 
		}
		System.out.println(fact); 
		return fact; //24
		
}
	private void Addition of digit(int no)
	{
	int box = 12347;     
	int count = 0;
	while(box>0)
			{
	//System.out.println(box%10);
		int rem = box%10;
	box = box/10;
	count = count +rem;
			}
	System.out.println(count);

}
}

	
