package practice;

import java.io.InputStream;

public class WeightBalance {

	public static void main(String[] args) {
		InputStream inputStream = System.in;

		InputReader in = new InputReader(inputStream);
		int t = in.nextInt();
		int w1, w2, x1, x2, m;
		while (t-- > 0) {
			w1 = in.nextInt();
			w2 = in.nextInt();
			x1 = in.nextInt();
			x2 = in.nextInt();
			m = in.nextInt();
			if ((w2 - w1) >= x1 * m && (w2 - w1) <= x2 * m) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}

	}

}
