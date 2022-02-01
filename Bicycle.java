public class Bicycle implements Vehicle
{
      
int speed;
int gear;
public void changeGear(int newGear) //change gear
{
          
gear = newGear;
}
      
public void speedUp(int increment)      // increase speed
{
          
speed = speed + increment;
}
   
public void applyBrakes(int decrement)    //  decrease speed
{
          
speed = speed - decrement;
}
public void printStates()        
{
System.out.println("speed: " + speed + " gear: " + gear);
}

}