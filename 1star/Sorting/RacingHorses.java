package practice;

import java.io.InputStream;
import java.util.Arrays;

public class RacingHorses {

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
			int ans = arr[1] - arr[0];
			for (int i = 1; i < n; i++) {
				ans = Math.min(ans, arr[i] - arr[i - 1]);
			}
			System.out.println(ans);
		}

	}

}
