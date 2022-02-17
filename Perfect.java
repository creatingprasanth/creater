
public class Perfect 
{

	public static void main(String[] args)
	{
		int num = 28;
		int perfect =0;
		int i = 1;
		while(num%i==0)
		{
	   perfect = perfect+i;
    	i = i +1;
		}
		System.out.println(perfect);
		
		if(perfect==num)
		{
	        System.out.println("Its a perfect number");
		}
		else
		{
			System.out.println("Not an prefect number");
		}
	}
}
