package practice;

import java.io.InputStream;

public class SumofDigits {

	public static void main(String[] args) {
		InputStream inputStream = System.in;

		InputReader in = new InputReader(inputStream);
		int t = in.nextInt();
		int sum = 0;
		int n, d;
		while (t-- > 0) {
			n = in.nextInt();
			while (n > 0) {
				d = n % 10;
				sum += d;
				n /= 10;
			}
			System.out.println(sum);
			sum=0;
		}
	}

}
