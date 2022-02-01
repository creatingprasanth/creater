public class Reader
{
public static void main(String[] args)
{
Library librarian = new Library();
	librarian.lendbooks();
System.out.println(librarian.mFee);
	librarian.getSalary();
	System.out.println(librarian.salary);
}
}