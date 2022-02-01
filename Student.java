public class Student
{
int mark1,mark2;
public static void main(String[] args)
{
Student s1 = new Student();
s1.calculateTotal();
}
public void calculateTotal()
{
	int m1 = 100, m2 = 200;
	int result = m1+m2;
System.out.println(result);
}
}