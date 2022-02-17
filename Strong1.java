
public class Strong1
{
public static void main(String[] args)
{
int num = 145;
int num1 = num;
int value = 0;
while (num > 0) 
{
	int rem = (num % 10);
	num = num/10;
	int total = 1;
	System.out.println(rem);
	while (1 <= rem) 
	{
		total = total * rem;
		rem--;
	}
	value = total + value;
	System.out.println(value);
}
if (num1 == value) {
	System.out.println("Given number is strong number");
} else

{
	System.out.println("Given number is not strong number");
}
}
}