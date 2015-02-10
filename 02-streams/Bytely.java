import java.io.*;

public class Bytely {
	public static void main(String[] args) throws IOException {
		
		InputStream byIn = null;	

		try {
			char c = (char) System.in.read();

			byte b = (byte) c;
			System.out.println(b);

		} finally {
			if (byIn != null) {
				byIn.close();
			}
		}
	}
}