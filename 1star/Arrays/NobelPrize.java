package practice;

import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;

public class NobelPrize {

	public static void main(String[] args) {
		InputStream inputStream = System.in;

		InputReader in = new InputReader(inputStream);
		int t = in.nextInt();
		long n, m;
		while (t-- > 0) {

			n = in.nextLong();
			m = in.nextLong();
			boolean arr[] = new boolean[(int) m];
			Arrays.fill(arr, false);
			for (int i = 0; i < n; i++) {
				long topic = in.nextLong();
				topic--;
				arr[(int) topic] = true;
			}
			boolean flag = false;
			for (boolean val : arr) {
				if (!val) {
					flag = true;
					break;
				}
			}
			System.out.println(flag ? "yes" : "no");

		}

	}

}
