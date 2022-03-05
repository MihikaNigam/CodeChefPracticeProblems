package practice;

import java.io.InputStream;
import java.io.OutputStream;

public class FindRemainder {

	public static void main(String[] args) {
		InputStream inputStream = System.in;

		InputReader in = new InputReader(inputStream);
		int t = in.nextInt();
		int a, b;
		System.out.print("");
		while (t-- > 0) {
			a = in.nextInt();
			b = in.nextInt();
			System.out.println(a % b);
		}
	}

}
