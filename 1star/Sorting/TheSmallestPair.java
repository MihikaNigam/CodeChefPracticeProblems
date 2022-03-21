package practice;

import java.io.InputStream;
import java.util.Arrays;

public class TheSmallestPair {

	public static void main(String[] args) {
		InputStream inputStream = System.in;

		InputReader in = new InputReader(inputStream);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = in.nextInt();
			}
			Arrays.sort(arr);
			System.out.println(arr[0] + arr[1]);
		}

	}

}
