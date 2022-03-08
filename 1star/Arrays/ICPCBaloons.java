package practice;

import java.io.InputStream;

public class ICPCBaloons {

	public static void main(String[] args) {
		InputStream inputStream = System.in;

		InputReader in = new InputReader(inputStream);
		int t = in.nextInt();
		int n, arr[];
		while (t-- > 0) {
			n = in.nextInt();
			arr = new int[n];
			int count = 0;
			for (int i = 0; i < n; i++) {
				arr[i] = in.nextInt();
			}
			int k = 0;

			while (count != 7 && k < n) {
				if (arr[k] >= 1 && arr[k] <= 7) {
					count++;
				}
				k++;
			}
			System.out.println(k);
		}

	}

}
