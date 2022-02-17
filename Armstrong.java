
public class Armstrong 
{
	public static void main(String[] args) 
	{
	int box=156;  //box change 156 
	int box2=box;
	int armstrong=0;
	while(box>0)
	{
		int rem = box%10;
		box = box/10;
		armstrong = armstrong+ (rem*rem*rem);
	}
	System.out.println(armstrong);
	if(box2 == armstrong)
	{
        System.out.println("Its a armstrong number");
	}
	else
	{
		System.out.println("Not an armstrong number");
	}
	
}
}