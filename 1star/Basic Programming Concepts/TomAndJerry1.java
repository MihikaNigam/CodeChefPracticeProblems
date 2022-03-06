package practice;

import java.io.InputStream;

public class TomAndJerry1 {

	public static void main(String[] args) {
		InputStream inputStream = System.in;

		InputReader in = new InputReader(inputStream);
		int t = in.nextInt();
		int a, b, c, d, k;
		while (t-- > 0) {
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			d = in.nextInt();
			k = in.nextInt();
			int steps = Math.abs(a - c) + Math.abs(b - d);
			if (k == steps) {
				System.out.println("YES");
			} else if (k < steps) {
				System.out.println("NO");
			} else {
				if (k % 2 == 0 && steps % 2 == 0 || k % 2 != 0 && steps % 2 != 0) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}

		}

	}

}
