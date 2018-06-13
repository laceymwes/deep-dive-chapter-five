
public class Bubble {

	public static void main(String[] args) {
		int nums[] = { 99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49 };
		
		int a, b, t;
		int size;
		
		size = 10; // number of elements in nums array

		System.out.println("Orriginal array is:");
		for(int i = 0; i < size; i++) System.out.print(" " + nums[i]);
		
		System.out.println();
		
		for(a = 1; a < size; a++) {
			for(b = size -1; b >= a; b--) {
				if(nums[b -1] > nums[b]) { // if preceding element is higher than current element, switch
					t = nums[b-1]; // store current element value
					nums[b-1] = nums[b]; // assign lower current element to preceding index
					nums[b] = t; // take stored larger value to current element
				}
			}
		}
		
		System.out.println("Sorted array is: ");
		for(int i = 0; i < size; i++) System.out.print(" " + nums[i]);
		
		System.out.println();
		
	}
}
