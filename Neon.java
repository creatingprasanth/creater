
public class Neon {

	public static void main(String[] args) {
	int num = 7;
	int sum = 0;
    int square = num*num;
	while(square>0)
	{
	int rem = square%10;
    sum = sum+rem;
    square = square/10;
	}
	System.out.println(sum);
	if(sum == num)
	{
        System.out.println("Its a neon number");
	}
	else
	{
		System.out.println("Not an neon number");
	}
	

	}

}
