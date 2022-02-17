public class PatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PatternDemo pd = new PatternDemo();
//pd.pattern1();
//pd.pattern2();
//pd.pattern3();
//pd.pattern4();
//pd.pattern5();
//pd.pattern6();
//pd.pattern7();
//pd.pattern8();
//pd.pattern9();
//pd.pattern10();
//pd.pattern11();
//pd.pattern12();
//pd.pattern13();
//pd.pattern14();
//pd.pattern15();
//pd.pattern16();
//pd.pattern17();
//pd.pattern18();
//pd.pattern19();
//pd.pattern20();
//pd.pattern21();
pd.pattern22();
	}
	private void pattern1()
	{
		for(int count=1; count<=3;count++)
		{
			for(int col=1; col<=5; col++)
			{
				System.out.print(1+" ");
			}
			System.out.println();
		}
	}
		private void pattern2()
		{
			for(int count=1; count<=3;count++)
			{
				for(int col=1; col<=5; col++)
				{
					System.out.print(col+"");
				}
				System.out.println();
			}
		}
			private void pattern3()
			{
				for(int count=1; count<=3;count++)
				{
					for(int col=1; col<=5; col++)
					{
						System.out.print(count+"");
					}
					System.out.println();
				}
		
	}
			private void pattern4()
			{
				for(int count=1; count<=4;count++)
				{
					for(int col=1; col<=5; col++)
					{
						System.out.print("*"+" ");
					}
					System.out.println();
				}
			}
			
			private void pattern5()
			{
				for(int count=1; count<=3;count++)
				{
					for(int col=5; col>=1; col--)
					{
						System.out.print(col+"");
					}
					System.out.println();
				}
			}
				private void pattern6()
				{
					for(int count=3; count>=1;count--)
					{
						for(int col=1; col<=5; col++)
						{
							System.out.print(count+"");
						}
						System.out.println();
					}
				}
			 private void pattern7()
			 {
				 for(int r=5; r>=1;r--)
				 {
					 for(int col=1; col<=r; col++)
					 {
						 System.out.print((col)+" ");
					 }
					 System.out.println();
				 }
			 }
			 private void pattern8()
			 {
				 for(int r=5; r>=1;r--)
				 {
					 for(int col=1; col<=r; col++)
					 {
						 System.out.print((col*2)+" ");
					 }
					 System.out.println();
				 }
			 }
			 private void pattern9()
			 {
				 for(int row=5; row>=1;row--)
				 {
					 for(int col=1; col<row; col++)
					 {
						 System.out.print(" "+" ");
					 }
					 for(int star =1; star<=6 -row; star++)
					 {
					 System.out.print(" "+row+" ");
				 }
					 System.out.println();
				 }
			 }
			 private void pattern10()
			 {
				 for(int r=1; r<=5;r++)
				 {
					 for(int col=1; col<=r; col++)
						 
					 {
						 System.out.print((col)+" ");
					 }
					 System.out.println();
				 }
			 }
			 private void pattern11()
			 {
				 for(int row=5; row>=1;row--)
				 {
					 for(int col=1; col<=row; col++)
					 {
						 System.out.print(col+" ");
						 
					 }
					 System.out.println();
				 }
			 }
			 private void pattern12()
			 {
				 for(int row=1; row<=5;row++)
				 {
					 for(int col=1; col<=row; col++)
					 {
						 System.out.print(1+" ");
						 
					 }
					 System.out.println();
				 }
			 }
			 private void pattern13()
			 {
				 for(int row=1; row<=5;row++)
				 {
					 for(int col=1; col<=row; col++)
					 {
						 System.out.print(row+" ");
						 
					 }
					 System.out.println();
				 }
			 }
			 private void pattern14()
			 {
				 for(int row=1; row<=5;row++)
				 {
					 for(int col=1; col<=row; col++)
					 {
						 System.out.print(col+" ");
						 
					 }
					 System.out.println();
				 }
			 }
			 private void pattern15()
			 {
				 int no = 1;
				 for(int row=1; row<=5;row++)
				 {
					 for(int col=1; col<=row; col++)
					 {
						 System.out.print(no+" ");
						 no++;
						 
					 }
					 System.out.println();
				 }
			 }
			 private void pattern16()
			 {
				 for(int row=1; row<=5;row++)
				 {
					 for(int col=1; col<=row; col++)
					 {
						 System.out.print(" "+" ");
						 
					 }
					 for(int hash=1; hash<=5-row;hash++)
					 {
						 System.out.print("*");
					 }
					 System.out.println();
				 }
			 } 
			 private void pattern17()
			 {
				 for(int row=1; row<=5;row++)
				 {
					 for(int col=1; col<row; col++)
					 {
						 System.out.print(" "+" ");
						 
					 }
					 for(int hash=1; hash<=5-row;hash++)
					 {
						 System.out.print("*");
					 }
					 System.out.println();
				 }
			 } 
			 private void pattern18()
			 {
				 for(int row=1; row<=5;row++)
				 {
					 for(int col=1; col<row; col++)
					 {
						 System.out.print(" "+" ");
						 
					 }
					 for(int hash=1; hash<=6-row;hash++)
					 {
						 System.out.print(hash+" ");
					 }
					 System.out.println();
				 }
			 } 
 private void pattern19()
{
for(int row=5; row>=1;row--)
{
int i = 5;
for(int col=1; col<=row; col++)
{
System.out.print(i+" ");
i--;
}
System.out.println();
}
}
 private void pattern20()
 {
	 int i = 1;
 for(int row=5; row>=1;row--)
 {
 for(int col=1; col<=row; col++)
 {
 System.out.print((col*i)+" ");
 }
 i++;
 System.out.println();
 }
 }
 private void pattern21()
{
for(int row=5; row>=1;row--)
{
for(int col=2; col<=row; col++)
{
System.out.print(" "+" ");
}
int i=5;
for(int star =1; star<=6 -row; star++)
{
System.out.print(i+" ");
i--;
}
System.out.println();
}
}
 private void pattern22()
 {
int i=1;
for(int row=5; row>=1;row--)
{
for(int col=2; col<=row; col++)
{
System.out.print(" "+" ");
}
for(int star =1; star<=6 -row; star++)
{
System.out.print(i+" ");
}
System.out.println();
i++;
}
}
 
 
}


 
 
