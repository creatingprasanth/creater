
public class Binary {

	public static void main(String[] args) {
		

		Binary mc = new Binary();
		mc.printBinary(23);
		
	}
	
 private void printBinary(int no)
{
	// int bin = 6;
	 String bin ="";
	while(no>0)
	{
		bin = no%2+bin;
	//	System.out.println(no%2);
		no = no/2;
	}
	System.out.println(bin);
}
}
