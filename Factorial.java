
public class Factorial {

	public static void main(String[] args) {
		int box = 12347;     // Addition  of  digit
		int count = 0 ;
		while(box>0)
				{
		//System.out.println(box%10);
			int rem = box%10;
		box = box/10;
		count = count +rem;
				}
		System.out.println(count);

}
}
