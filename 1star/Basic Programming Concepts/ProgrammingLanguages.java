package practice;

import java.io.InputStream;

public class ProgrammingLanguages {

	public static void main(String[] args) {
		InputStream inputStream = System.in;

		InputReader in = new InputReader(inputStream);
		int t = in.nextInt();
		int a, b, a1, b1, a2, b2;
		while (t-- > 0) {
			a = in.nextInt();
			b = in.nextInt();
			a1 = in.nextInt();
			b1 = in.nextInt();
			a2 = in.nextInt();
			b2 = in.nextInt();

			if ((a1 == a || b1 == a) && (a1 == b || b1 == b)) {
				System.out.println(1);
			} else if ((a2 == a || b2 == a) && (a2 == b || b2 == b)) {
				System.out.println(2);
			} else {
				System.out.println(0);
			}
		}
	}

}
