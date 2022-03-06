package practice;

import java.io.InputStream;

public class ProblemCategory {

	public static void main(String[] args) {
		InputStream inputStream = System.in;

		InputReader in = new InputReader(inputStream);
		int t = in.nextInt();
		int x;
		while (t-- > 0) {
			x = in.nextInt();
			if (x < 100 && x >= 1) {
				System.out.println("Easy");
			} else if (x < 200 && x >= 100) {
				System.out.println("Medium");
			} else {
				System.out.println("Hard");
			}
		}

	}

}
