public class Library
{
	 int salary = 20000;
public int mFee = 10;
public void lendbooks()
{
System.out.println("Lending Books");
}
	private void getSalary()
	{
		System.out.println(salary);
	}
	public static void main(String[] args)
	{
		Library librarian = new Library();
		librarian.getSalary();
		System.out.println(librarian.salary);
	}
}