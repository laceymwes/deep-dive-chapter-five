
public class ShowBits {

	int numbits;
	
	ShowBits(int n){ // initialize numbits field
		numbits = n; 
	}
	
	void show(long val) {
		long mask = 1;
		
		// left-shift a 1 into proper position
		mask <<= numbits -1;
		
		int spacer = 0;
		for(; mask != 0; mask >>>= 1) {
			if((val & mask) != 0) System.out.println("1"); // if current bit of val and mask are both on
			else System.out.print("0");
			spacer++;
			if((spacer % 8) == 0) { // if 8 bits have been printed to output, add space for octet formating
				System.out.print(" ");
				spacer = 0;
			}
		}
	}
	
}
