public class User {

	public static void main(String[] args)  {
	
		User user = new User(); 
		user.findFactorial(5);
		user.findStrongNumber(145); 
		
	}

	private void findStrongNumber(int no) {//145
		// TODO Auto-generated method stub
		int no2 = no; //no2 =145
		int total = 0; 
		//5	4	1
		while(no>0)
		{
		int rem = no%10; //1
		int result = findFactorial(rem); //1
		total = total + result; //145
		no = no/10; //
		}
		
		System.out.println("Total is "+ total);
		if(total == no2)
			System.out.println("Strong Number");
		else
			System.out.println("Not Strong");
		
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

} 
private void findAdditionOfDigits(int no) {//35
		// TODO Auto-generated method stub
		int addition = 0; 
		while(no>0)
		{
			int rem = no%10; 
			addition = addition + rem ; 
			no = no/10; 
		}
		if(addition>9)
		{
			findAdditionOfDigits(addition); 
		}
		else
		{
			System.out.println(addition);
		}
	} 

