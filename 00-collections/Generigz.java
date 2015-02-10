
public class Generigz {

	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println("first generics:");
        printArray(intArray);
        printArray(doubleArray);
        printArray(charArray);
        System.out.println("bounded type parameter with strings:");
        System.out.println(maximum("pear", "xylophon", "albatrouz"));
	}

	public static <E> void printArray(E[] inputArray) {
		//Display array elements
		for (E element : inputArray) {
			System.out.print(element);
		}
		System.out.println();
	}

	public static <T extends Comparable<T>> T maximum(T x, T y, T z){
		
		T max = x;
		if(y.compareTo(max) < 0) {
			max = y;
		}
		if(z.compareTo(max) < 0) {
			max = z;
		}
		return max;
	}
}