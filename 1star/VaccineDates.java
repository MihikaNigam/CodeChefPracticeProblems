package practice;

import java.io.InputStream;

public class VaccineDates {

	public static void main(String[] args) {
		InputStream inputStream = System.in;

		InputReader in = new InputReader(inputStream);
		int t = in.nextInt();
		while (t-- > 0) {
			int d = in.nextInt();
			int l = in.nextInt();
			int r = in.nextInt();
			System.out.println(d < l ? "Too Early" : d > r ? "Too Late" : "Take second dose now");

		}

	}

}
