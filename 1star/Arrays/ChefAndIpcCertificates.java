package practice;

import java.io.InputStream;

public class ChefAndIpcCertificates {

	public static void main(String[] args) {
		InputStream inputStream = System.in;

		InputReader in = new InputReader(inputStream);
		// int t = in.nextInt();
		int n, m, k;
		// while (t-- > 0) {
		n = in.nextInt();
		m = in.nextInt();
		k = in.nextInt();
		int q = 0;
		int total_min = 0;
		int eligible_students = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k; j++) {
				int v = in.nextInt();
				total_min += v;
			}
			q = in.nextInt();
			if (q <= 10 && total_min >= m) {
				eligible_students++;
			}
			total_min = 0;
		}
		System.out.println(eligible_students);
		// }

	}
	}

}
