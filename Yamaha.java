package showroom;

public class Yamaha extends Bike
{
public static void main(String[] args)
{
Yamaha company = new Yamaha();
company.bike();
company.brand();
company.race();
company.speed();
}
public void brand()
{
System.out.println("brand: yamaha");
}
public void speed()
{
System.out.println("max:100kmph");
}
}