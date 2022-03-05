package practice;

import java.util.*;
import java.io.*;

public class EnormousInputTest {

	public static void main(String[] args) {
		InputStream inputStream = System.in;

		InputReader in = new InputReader(inputStream);
		int n = in.nextInt();
		int k = in.nextInt();
		int ans = 0;
		int t;
		for (int i = 0; i < n; i++) {
			t = in.nextInt();
			if (t % k == 0) {
				ans++;
			}
		}
		System.out.print(ans);
	}

}
