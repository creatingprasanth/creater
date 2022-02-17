import java.util.Scanner;

public class Looping
{
	String name;
	public static void main(String[] args)
	{
		reverseNo();
	}
		private static void reverseNo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers");
		int no = sc.nextInt();
		int addition = 0;
		while(no>0)
		{
			addition = (addition*10) + no%10;
			no = no/10;
			
		}
		System.out.println(addition);
	}
	
		
	}

