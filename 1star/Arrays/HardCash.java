package practice;

import java.io.InputStream;

public class HardCash {

	public static void main(String[] args) {
		InputStream inputStream = System.in;

		InputReader in = new InputReader(inputStream);
		int t = in.nextInt();
		long n, k;
		while (t-- > 0) {
			n = in.nextLong();
			k = in.nextLong();
			long summation = 0;
			for (int i = 0; i < n; i++) {
				long x = in.nextLong();
				summation += x;
			}

			System.out.println(summation % k);
		}

	}

}
