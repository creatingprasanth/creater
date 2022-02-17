
public class PatternDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PatternDemo1 pd1 = new PatternDemo1();
		pd1.pattern1();
		pd1.pattern2();
		pd1.pattern3();
			}
			private void pattern1()
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
			
			private void pattern2()
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
				private void pattern3()
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

	}
