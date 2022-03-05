package practice;

import java.io.InputStream;

public class ValidTriangles {

	public static void main(String[] args) {
		InputStream inputStream = System.in;

		InputReader in = new InputReader(inputStream);
		int t = in.nextInt();
		while (t-- > 0) {
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			System.out.println(a + b + c == 180 ? "YES" : "NO");
		}
	}

}
