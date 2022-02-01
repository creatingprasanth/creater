public class School
{
public static void main(String[] args)
{ 

School st1 = new School();         // dynamic 
School st2 = new School(); 
st2.buySnacks(10);               //Passing values as arguments
st1.takeAnswerSheet(st2);        //Represents School

}
public void buySnacks(int purse)
{
  System.out.println("Buying Snacks"); 
  System.out.println(purse); 
}
public void takeAnswerSheet(School student)
{
System.out.println("Taking all answer sheets"); 
}

}