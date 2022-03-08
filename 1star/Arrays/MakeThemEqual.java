package practice;

import java.io.InputStream;
import java.util.Arrays;

public class MakeThemEqual {

	public static void main(String[] args) {
		InputStream inputStream = System.in;

		InputReader in = new InputReader(inputStream);
		int t = in.nextInt();
		int n, arr[];
		while (t-- > 0) {
			n = in.nextInt();
			arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = in.nextInt();
			}
			Arrays.sort(arr);

			System.out.println(arr[n - 1] - arr[0]);
		}

	}

}
