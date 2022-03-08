package practice;

import java.io.InputStream;

public class ASubtaskProblem {

	public static void main(String[] args) {
		InputStream inputStream = System.in;

		InputReader in = new InputReader(inputStream);
		int t = in.nextInt();
		int n, m, k, arr[];
		while (t-- > 0) {
			n = in.nextInt();
			m = in.nextInt();
			k = in.nextInt();
			arr = new int[n];
			int points_scored = 0;
			boolean flag = true;// flag for all cases
			boolean firstcasespassed = true;
			boolean allcasespassed = true;
			for (int i = 0; i < n; i++) {
				arr[i] = in.nextInt();
			}
			for (int i = 0; i < n; i++) {
				if (i < m && arr[i] != 1) {
					flag = false;
					firstcasespassed = false;
					break;
				}
				if (i >= m && arr[i] != 1) {
					flag = false;
					points_scored = k;
					break;
				}
			}
			if (flag && allcasespassed && firstcasespassed) {
				points_scored = 100;
			}
			System.out.println(points_scored);

		}

	}

}
