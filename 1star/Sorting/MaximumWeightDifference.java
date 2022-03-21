package practice;

import java.io.InputStream;
import java.util.Arrays;

public class MaximumWeightDifference {

	public static void main(String[] args) {
		InputStream inputStream = System.in;

		InputReader in = new InputReader(inputStream);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int k = in.nextInt();
			int wt[] = new int[n];
			int sum = 0;
			for (int i = 0; i < n; i++) {
				wt[i] = in.nextInt();
				sum += wt[i];
			}
			Arrays.sort(wt);

			int smallsum = 0;
			k = (k < (n - k)) ? k : (n - k);
			for (int i = 0; i < k; i++) {
				sum -= wt[i];
				smallsum += wt[i];

			}
			System.out.println(Math.abs(sum - smallsum));
		}

	}

}
