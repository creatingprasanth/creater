
public class MiniCalculator  {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MiniCalculator mc = new MiniCalculator(); 
		
//mc.printBinary(8);
		//int result = mc.calculatePower(3);
		
//System.out.println(result);
		
		mc.printDecimal(1001); // Debug --> Understand

	}

	private void printDecimal(int no) {
		// TODO Auto-generated method stub
		//int no = 1001;
		int deci = 0; 
		int power =0; 
		while(no>0)//1001>0
		{
		int rem = no%10; //1
		int pResult = calculatePower(power);
		deci = deci + (rem*pResult); //1
		no = no/10; 
		power = power+1;
		} 
		System.out.println("Decimal value is "+ deci);
		
	}

	private int calculatePower(int power) {
		// TODO Auto-generated method stub
		int no = 2; 
		int count = 1; 
		int result = 1; 
		while(count<=power)	//1<=0
		{
			result = result * no; 
			count = count +1; 
		}
		return result; 		
	}

	private void printBinary(int no) {
		// TODO Auto-generated method stub
		//int no = 6; 
		String bin = ""; //110
		while(no>0)
		{
			bin = no%2 + bin;//"011"
	//	System.out.println(no%2); 
		no = no/2; 
		}
		System.out.println(bin);
		
	}

	


	
} 