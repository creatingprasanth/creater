package chennai;
 
import us.CTS;

public class CTSC extends CTS
{
public String head;
public CTSC()
{
this(500);
System.out.println("Chennai CTS");
}
public CTSC(int i)
{
System.out.println(i);
}
public static void main(String[] args)
{
CTSC obj = new CTSC();
//CTSC emp=new CTSC(5);
//emp.head="Pqrs";
//emp.recruit();
}
public void recruit()
{
System.out.println(super.head);     //super yedhukuna parent class ulla head yarunu therijika super keyword use pannurom (super keyword irutha object create panna venna)
System.out.println(head);
super.recruit();
}
}



//child class parent class layum same (non-static value , non-static method) same irutha non method vennuna parent class variable la access panna super keyword use pannalam
