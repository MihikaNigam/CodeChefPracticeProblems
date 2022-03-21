package practice;

import java.io.InputStream;
import java.util.Arrays;

public class CopsAndTheThiefDevu {

	public static void main(String[] args) {
		InputStream inputStream = System.in;

		InputReader in = new InputReader(inputStream);
		int t = in.nextInt();
		while (t-- > 0) {
			int x, y, m;
			m = in.nextInt();
			x = in.nextInt();
			y = in.nextInt();

			int arr[] = new int[m];
			for (int i = 0; i < m; i++) {
				arr[i] = in.nextInt();
			}
			Arrays.sort(arr);
			int ans = 0;
			int range = x * y;
			for (int i = 1; i <= 100; i++) {
				boolean safe = true;
				for (int h : arr) {
					int lb = h - range;
					int ub = h + range;
					if (i >= lb && i <= ub) {
						safe = false;
					}
				}
				if(safe)ans++;
			}
			System.out.println(ans);

		}

	}

}
