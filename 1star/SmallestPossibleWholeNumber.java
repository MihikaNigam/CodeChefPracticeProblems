package practice;

import java.io.InputStream;

public class SmallestPossibleWholeNumber {

	public static void main(String[] args) {
		InputStream inputStream = System.in;

		InputReader in = new InputReader(inputStream);
		int t = in.nextInt();
		int n, k;
		while (t-- > 0) {
			n = in.nextInt();
			k = in.nextInt();
//			while (n >= k) {
//				n -= k;
//			}
			if (n < k || k==0) {
				System.out.println(n);
			} else {
				System.out.println(n % k);
			}

		}

	}

}
