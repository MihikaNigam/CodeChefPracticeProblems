package practice;

import java.io.InputStream;

public class MaximumLengthEvenSubarray {

	public static void main(String[] args) {
		InputStream inputStream = System.in;

		InputReader in = new InputReader(inputStream);
		int t = in.nextInt();
		int n;
		while (t-- > 0) {
			n = in.nextInt();
			int sum = (n * (n + 1)) / 2;
			System.out.println(sum % 2 == 0 ? n : n - 1);
		}

	}

}
