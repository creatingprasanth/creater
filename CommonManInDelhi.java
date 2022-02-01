 package india.newDelhi;
 import tamilnadu.chennai.TrafficRules;
 
 public class CommonManInDelhi implements TrafficRules,TrafficRulesDelhi
 {
 public static void main(String[] args)
{
CommonManInDelhi people2 = new CommonManInDelhi();
people2.goBicycle();
people2.goByDieselVehicle();
people2.dontGoByDieselVehicle();
}
public void goBicycle()
{
System.out.println("Bicycle ride is a trip luck youth");
}
public void goByDieselVehicle()
{
System.out.println("High vibration and noise");
 }
public void dontGoByDieselVehicle()
{
System.out.println("Bicycle only use");
}
 }