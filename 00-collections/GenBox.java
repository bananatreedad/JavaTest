public class GenBox < T > {
	
	private T t;

	public void setT(T t) {
		this.t = t;
	}

	public T getT() {
		return this.t;
	}

	public static void main(String[] args) {
		GenBox<Integer> intBox = new GenBox<Integer>();
		GenBox<String> stringBox = new GenBox<String>();	

		intBox.setT(new Integer(88));
		stringBox.setT(new String("waschloos"));

		System.out.println("generic content in class:");
		System.out.println("intBox : " + intBox.getT());
		System.out.println("stringBox: " + stringBox.getT());

	}
}