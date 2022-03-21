package practice;

import java.io.InputStream;

public class AverageFlex {

	public static void main(String[] args) {
		InputStream inputStream = System.in;

		InputReader in = new InputReader(inputStream);
		int t = in.nextInt();
		int n;

		while (t-- > 0) {
			int freq[] = new int[101];
			n = in.nextInt();
			for (int i = 0; i < n; i++) {
				int x = in.nextInt();
				freq[x]++;
			}
			int ans = 0, cnt = 0;
			for (int i = 0; i < 101; i++) {
				if (freq[i] != 0) {
					cnt += freq[i];
					if (cnt > n - cnt) {
						ans += freq[i];
					}
				}
			}
			System.out.println(ans);

		}

	}

}
