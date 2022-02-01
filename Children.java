public class Children extends Parents
{
public static void main(String[] args)
{
Children ch=new Children();
ch.work();
ch.study();
ch.grow();

Parents pa = new Children();
pa.study();
pa.work();
pa.chat();
pa.play();
}
public void work()
{
System.out.println("Working");
}
public void chat()
{
System.out.println("Chatting");
}
public void play()
{
System.out.println("Playing");
}
public void study()
{
System.out.println("IT Related");
}
}