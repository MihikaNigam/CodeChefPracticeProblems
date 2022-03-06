package practice;

import java.io.InputStream;

public class ChefAndSpells {

	public static void main(String[] args) {
		InputStream inputStream = System.in;

		InputReader in = new InputReader(inputStream);
		int t = in.nextInt();
		int a, b, c;
		while (t-- > 0) {
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			System.out.println(Math.max(a + c, Math.max(a + b, b + c)));

		}

	}

}
