package tamilnadu.chennai;
 
public class CommonManInChennai implements TrafficRules
{
public static void main(String[] args)
{
CommonManInChennai people = new CommonManInChennai();
people.goBicycle();
people.goByDieselVehicle();
}
public void goBicycle()
{
System.out.println("fitness & energytic");
}
public void goByDieselVehicle()
{
System.out.println("Dieselvehicle are pollution spread");
}
}