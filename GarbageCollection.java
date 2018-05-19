package chapter1;
import java.util.ArrayList;
import java.util.Hashtable;

public class GarbageCollection {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		Runtime runtime = Runtime.getRuntime();
		for(int i=0; true; i++ ) {
			ObjectOnHeap allocation = new ObjectOnHeap();
			
			allocation = null;
			//list.add(allocation);
			
			System.out.println("An instance of ObjectOnHeap was placed on the Heap... ");
		}
	}
}
class ObjectOnHeap {
	protected void finalize() {
	
		System.out.println(this.getClass().getName()+ 
				" is being destroyed by the Garbage Collector.");
	}
}
