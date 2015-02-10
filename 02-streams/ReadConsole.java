
import java.io.*;

public class ReadConsole {
	public static void main(String[] args) throws IOException {
		
		InputStreamReader cin = null;
		OutputStream output = null;

		try {
			cin = new InputStreamReader(System.in);
			output = new FileOutputStream("output.txt");

			System.out.println("Enter chars, press 'q' to quit.");

			char c;
			do {
				c = (char) cin.read();
				System.out.print(c);
				output.write(c);

			} while(c != 'q');
		} finally {
			if(cin != null) {
				cin.close();
			}
			if(output != null) {
				output.close();
			}
		}
	}
}