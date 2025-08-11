package corejava;

public class GarbageCollectionConcept {
	public void finalize() {
		System.out.println("Unwanted object is collected by Garbage Collector");
	}

	public static void main(String[] args) {
		GarbageCollectionConcept obj = new GarbageCollectionConcept();
		obj = null;
		GarbageCollectionConcept obj1 = new GarbageCollectionConcept();
		GarbageCollectionConcept obj2 = new GarbageCollectionConcept();
		obj1 = obj2;
		//System.gc();
		Runtime.getRuntime().gc();// TODO Auto-generated method stub

	}

}
