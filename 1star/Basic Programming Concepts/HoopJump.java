package practice;

import java.io.InputStream;

public class HoopJump {

	public static void main(String[] args) {
		InputStream inputStream = System.in;

		InputReader in = new InputReader(inputStream);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			if (n == 1) {
				System.out.println(1);
			} else {
				System.out.println((n + 1) / 2);
			}
		}

	}

}
