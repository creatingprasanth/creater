public class Member
{
public static void main(String[] args)
{
Library1 lib=new Library1();

int fee=lib.getAnnualFee();
System.out.println(fee);
//System.out.println(lib.annualFee);
lib.lendBooks();
}
}
