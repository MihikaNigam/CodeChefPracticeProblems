package practice;

import java.io.InputStream;

public class ATM {

	public static void main(String[] args) {
		InputStream inputStream = System.in;
		InputReader in = new InputReader(inputStream);
		int x = in.nextInt();
		double y = in.nextDouble();
		if (x % 5 == 0 && y >= x+0.50) {
			System.out.println(String.format("%.2f", y - x - 0.50));
		} else {
			System.out.println(y);
		}

	}

}
