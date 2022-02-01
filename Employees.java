public class Employees implements Persons 
{

public void department()
{
System.out.println("Department:L&D");
}

public void jobrole()
{
System.out.println("Job:Corporate Trainer");

}
public static void main(String[] args)
{
Employees e = new Employees();
e.department();
e.jobrole();
}
}
