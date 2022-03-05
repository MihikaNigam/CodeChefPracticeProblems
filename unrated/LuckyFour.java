package practice;

import java.io.InputStream;

public class LuckyFour {

	public static void main(String[] args) {
		InputStream inputStream = System.in;
		InputReader in = new InputReader(inputStream);
		int t = in.nextInt();
		while (t-- > 0) {
			String n = in.next();
			char arr[] = n.toCharArray();
			int ans = 0;
			for (char c : arr) {
				if (c == '4') {
					ans++;
				}
			}
			System.out.println(ans);
		}

	}

}
