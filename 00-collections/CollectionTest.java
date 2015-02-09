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

	}
}