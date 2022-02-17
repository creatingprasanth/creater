import java.util.Scanner;

public class ArrayDemo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayDemo1 demo = new ArrayDemo1();
  
    //demo.twoDimension();
 //demo.twoDimension1();
  //demo.twoDimension2();
   // demo.twoDimension3();
    //demo.twoDemension4();
   // demo.addMatrix();
    //demo.transposeMatrix();
   // demo.multiplication();
    demo.addition();
	}

	private void addition() {
		int[][] a = {{1,2,3},{3,4,2},{3,2,1}};
		int[][] b = {{1,1,1},{3,4,2},{3,2,1}};
		int[][] c =new int[3][3];
		for(int row=0;row<a.length; row++)
		{
		for(int col=0;col<a.length; col++)
		{
			System.out.print(a[row][col]+" ");
		}
		System.out.println();
		}
		for(int row=0;row<b.length; row++)
			{
		for(int col=0;col<b.length; col++)
			{
			System.out.print(a[row][col]+" ");
			}
		System.out.println();
			}
		System.out.println("Matric Addition");
		for(int row=0;row<c.length; row++)
		{
		for(int col=0;col<c.length; col++)
		{
		c[row][col]=a[row][col]+b[row][col];	
		System.out.print(c[row][col]+" ");
		}
		System.out.println();
		}
	}
			
		
		
	private void multiplication() {
		// TODO Auto-generated method stub
		int[][] a = {{1,2,3},{3,4,2},{3,2,1}};
		int[][] b = {{1,1,1},{3,4,2},{3,2,1}};
		int[][] c =new int[3][3];
		for(int row=0;row<a.length; row++)
		{
		for(int col=0;col<a.length; col++)
		{
			System.out.print(a[row][col]+" ");
		}
		System.out.println();
		}
		for(int row=0;row<b.length; row++)
			{
		for(int col=0;col<b.length; col++)
			{
			System.out.print(a[row][col]+" ");
			}
		System.out.println();
			}
		System.out.println("Matric Multiplication");
		for(int row=0;row<c.length; row++)
		{
		for(int col=0;col<c.length; col++)
		{
		for(int coll=0;coll<c.length; coll++)
		{
		c[row][col]=a[row][coll]*b[coll][col]+c[row][col];	
		}
		System.out.print(c[row][col]+" ");
		}
		System.out.println();
		}
			}
		
	

	private void transposeMatrix() {
		// TODO Auto-generated method stub
		int[][] a = {{10,20,30},{40,50,60},{70,80,90}};
		int[][] b =new int[3][3];
		for(int r=0;r<a.length; r++)
		{
			for(int c=0;c<b.length; c++)
			{
				b[r][c] = a[c][r];
			}
		}
			for(int r=0;r<a.length; r++)
		{
			for(int c=0;c<b.length; c++)
			{
				System.out.print(b[r][c]+" ");
			}
			System.out.println();
		}
			}
		
	

	private void addMatrix() {
		// TODO Auto-generated method stub
		int[][] a = {{1,2},{3,4}};
		int[][] b = {{2,3},{4,5}};
		int[][] c = new int[2][2];
		for(int row=0; row<a.length; row++)
		{
			for(int col=0;col<a[row].length;col++)
			{
				c[row][col] = a[row][col]+b[row][col];
			}
		}
		for(int row=0; row<a.length; row++)
		{
			for(int col=0;col<a[row].length;col++)
			{
				System.out.print(c[row][col]+ "\t");
			}
			System.out.println();
			}
		
	}

	private void twoDemension4() {
		// TODO Auto-generated method stub
		int[] [] ar = 	{	{10,20,30},
            	{40,50,60},
	            {70,80,90}
            };
		for(int row=0; row<ar.length; row++)
		{
		for(int col=ar[row].length-1;col>=0; col-- )
			{
			
			System.out.print(ar[row][col]+" "); 
			}
		System.out.println(); 
		} 
	}

	private void twoDimension3() {
		// TODO Auto-generated method stub
		int[] [] ar = 	{	{10,20,30},
	                    	{40,50,60},
				            {70,80,90}
			            };
for(int row=0; row<ar.length; row++)
{
for(int col=0; col<ar[row].length; col++)
	{
	if(row==col)
System.out.print(ar[row][col]+" "); 
	}
System.out.println(); 
} 
		
	}

	private void twoDimension2() {
		// TODO Auto-generated method stub
		int[][] marks = new int[8][]; 
		System.out.println(marks.length);
		marks[0] = new int[6]; 
		System.out.println(marks[0].length);
		marks[1] = new int[8]; 
		marks[3] = new int[10]; 
		marks[4] = new int[8]; 
		System.out.println(marks[5].length); 
		
	}

	private void twoDimension1() {
		// TODO Auto-generated method stub
		int[][][] ar = new int[3][2][4];
		System.out.println(ar.length);
		System.out.println(ar[0].length);
		System.out.println(ar[0][0].length);
	}

	private void twoDimension() {
		int[][][] ar = new int[2][2][4];
		Scanner sc = new Scanner(System.in);
	for(int student=0;student<2;student++)
	{
		
		System.out.println("Enter marks ");
		int exam = 0; 
		int total = 0; 
		while(exam<2)	//row --> exam	col --> sub
		{
			total = 0; 
		for(int sub=0; sub<4; sub++)
		{
			System.out.println("Enter marks ");
			ar[student][exam][sub] = sc.nextInt(); 
			total = total + ar[student][exam][sub]; 
		}
		System.out.println(total);
		exam++; 
		}
	} 
	}
}