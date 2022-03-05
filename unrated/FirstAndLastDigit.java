package practice;

import java.io.InputStream;

public class FirstAndLastDigit {

	public static void main(String[] args) {
		InputStream inputStream = System.in;
		InputReader in = new InputReader(inputStream);
		int t = in.nextInt();
		int n, sum;
		while (t-- > 0) {
			sum = 0;
			n = in.nextInt();
			String s = Integer.toString(n);
			int firstdigit = Character.getNumericValue(s.charAt(0));
			int lastdigit = Character.getNumericValue(s.charAt(s.length() - 1));
			System.out.println(firstdigit + lastdigit);
		}

	}

}
