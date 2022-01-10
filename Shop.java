public class Shop
{
static String name = "prasanth";
static int doorNo = 123;
int price;
public static void main(String[] args)
{
	System.out.println(Shop.name);
	System.out.println(Shop.doorNo);
Shop pencil = new Shop();
	pencil.price = 5;
Shop note = new Shop();
	note.price = 10;
Shop paper = new Shop();
	paper.price = 1;
Shop pen = new Shop();
	System.out.println(note.price);
}

}