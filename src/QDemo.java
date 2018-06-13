


public class QDemo {
	public static void main(String[] args) { 
		Queue bigQ = new Queue(100);
		Queue smallQ = new Queue(4);
		char ch;
		int i; 
		
		System.out.println("Using bigQ to store the alphabet.");
		
		// populate bigQ's array with alphabet
		for(i = 0; i < 26; i++) {
			bigQ.put((char) ('A' + i));
		}
		
		// retrieve and output all elements of bigQ's array
		for(i = 0; i < 26; i++) {
			ch = bigQ.get();
			if(ch != (char) 0) System.out.print(ch);
		}
		
		System.out.println("\n");
		
		// generate errors with smalllQ
		// smallQ array holds only 4 elements
		// for loop is attempting to fill 5 indices 
		for(i = 0; i < 5; i++) {
			System.out.print("Attempting to store " +  (char) ('Z' -i));
			
			smallQ.put((char) ('Z' - i));
			
			System.out.println();
		}
		System.out.println();
		
		// more errors on smallQ
		System.out.print("Contents of smallQ: ");
		for(i = 0; i < 5; i++) {
			ch = smallQ.get();
			
			if(ch != (char) 0) System.out.print(ch);
		}
	}
}
