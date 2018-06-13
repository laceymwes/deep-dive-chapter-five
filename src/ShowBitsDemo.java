
public class ShowBitsDemo {

	public static void main(String[] args) {
		
		ShowBits b = new ShowBits(8);
		ShowBits i = new ShowBits(32);
		ShowBits li = new ShowBits(64);
		
		System.out.println("123 to binary: ");
		b.show(123);
		
		System.out.println("\n87987 to binary: ");
		i.show(87987);
		
		System.out.println("\n237658768");
		li.show(237658768);
	}
}
