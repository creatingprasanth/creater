import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayDemo demo = new ArrayDemo();
   // demo.SecondBig();
    //demo.sortArray();
    demo.twoDimension();
	}

	private void twoDimension() {
		// TODO Auto-generated method stub
	int[][] ar = new int[2][4];
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter marks");
	int row = 0;
	while(row<2)
	{
		for(int col=0; col<4; col++)
		{
			System.out.println("Enter marks");
			ar[row][col] = sc.nextInt();
			}
		row++;
	}

	private void sortArray() {
		// TODO Auto-generated method stub
	int[] ar= {13,78,97,2,5};
	int j=1;
	while(i<ar.length)
		
	{
		if(ar[i]>ar[i+1])
		{
				int temp = ar[i];
				ar[i]=ar[i+1];
				ar[i+1]=temp;
			}
			i++;
		}
		i++;
	}
	int len=ar.length;
	j++;
	}
	System.out.println("After Sorting");
for(int i=0;i<ar.length;i++)
{
	System.out.println(ar[i]);
}
}

	private void SecondBig() {
		// TODO Auto-generated method stub
		int[] ar = {18,5,2,1,60};
		int big = ar[0],sbig=ar[0];
		for(int i=1;i<ar.length;i++)
		{
			int v=ar[i];
			if(v>big)
			{
				sbig=big;
				big=v;
			}
			else if(v>sbig)
			{
				sbig = v;
				
			}
		}
		System.out.println(big);
		System.out.println(sbig);
	}

}
