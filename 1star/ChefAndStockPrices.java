package practice;

import java.io.InputStream;

public class ChefAndStockPrices {

	public static void main(String[] args) {
		InputStream inputStream = System.in;

		InputReader in = new InputReader(inputStream);
		int t = in.nextInt();
		int s, a, b, c = 0;
		while (t-- > 0) {
			s = in.nextInt();
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			double changeinstock = (double) (s * c) / 100.00;
			int newstock = (int) (s + changeinstock);
			System.out.println(newstock >= a && newstock <= b ? "YES" : "NO");
		}

	}

}
