package practice;

import java.io.InputStream;

public class TwoDishes {

	public static void main(String[] args) {
		InputStream inputStream = System.in;

		InputReader in = new InputReader(inputStream);
		int t = in.nextInt();
		int n, a, b, c;
		while (t-- > 0) {
			n = in.nextInt();
			a = in.nextInt();// fruits
			b = in.nextInt();// vegetables
			c = in.nextInt();// fishes

			if (b < n) {
				System.out.println("NO");
			} else if (a + c < n) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}

	}

}
