import java.util.*;

public class CollectionTest {
	public static void main(String[] args) {


		System.out.println("\nhashCode tests");
		System.out.println("--------------");
		List a1 = new ArrayList();
		System.out.println(a1.hashCode());

		a1.add("asdf");
		System.out.println(a1.hashCode());

		a1.add("joni");
		System.out.println(a1.hashCode());
		
		a1.add("test");
		System.out.println(a1.hashCode());

		List b1 = new ArrayList();
		b1 = a1;
		System.out.println(b1.hashCode());

		System.out.println("\nlastIndexOf if not in the list:");
		System.out.println("-------------------------------");
		System.out.println(b1.lastIndexOf(1000));

		System.out.println("\nadd the same value again to a sortedset:");
		System.out.println("------------------------------------------");
		SortedSet set = new TreeSet();
		set.add("a");
		set.add("a");
		set.add("a");
		set.add("a");
		System.out.println("size: " + set.size());


		System.out.println("\nget the value set out of a map with same values:");
		System.out.println("--------------------------------------------------");
		Map m1 = new HashMap();
		m1.put("Joni", 8);
		m1.put("Timmy", 8);
		m1.put("Sabrina", 9);

		Set s1 = m1.entrySet();
		System.out.println("size of set: " + s1.size());

		Iterator itr = s1.iterator();		
		while(itr.hasNext()) {
			Object element = itr.next();
         	System.out.println(element.toString());
		} //seems to return key AND value

		System.out.println("\nattempt to push a map into a LinkedList with constructor:");
		System.out.println("-----------------------------------------------------------");
		List linked = new LinkedList(m1.keySet()); //values with m1.values(), keys with m1.keySet()
												   //and both with m1.entrySet()
		System.out.println(linked);

		
		System.out.println("\nattempt to push a map into a LinkedList with constructor:");
		System.out.println("-----------------------------------------------------------");
	}
}