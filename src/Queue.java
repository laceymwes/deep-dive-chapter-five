public class Queue {
	char q[];
	int putloc, getloc;
	
	Queue(int size){
		q = new char[size];
		putloc = getloc = 0;
	}
	
	void put(char ch) {
		if(putloc == q.length) {
			System.out.println(" - Queue is full.");
			return;
		}
		
		q[putloc++] = ch; // index is assign char element, and putloc is incremented with postfix (after allocation)
	}
	
	char get() {
		if(getloc == putloc) {
			System.out.println(" - Queue is empty.");
			return (char) 0;
		}
		
		return q[getloc++];
	}
} 