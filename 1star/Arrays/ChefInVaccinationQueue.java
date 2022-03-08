package practice;

import java.io.InputStream;

public class ChefInVaccinationQueue {

	public static void main(String[] args) {
		InputStream inputStream = System.in;

		InputReader in = new InputReader(inputStream);
		int t = in.nextInt();
		int n, p, x, y, queue[];
		while (t-- > 0) {
			n = in.nextInt();
			p = in.nextInt();
			x = in.nextInt();
			y = in.nextInt();
			queue = new int[n];
			int waiting_time = 0;
			for (int i = 0; i < n; i++) {
				queue[i] = in.nextInt();
			}
			for (int i = 0; i < p; i++) {
				waiting_time = queue[i] == 0 ? x + waiting_time : y + waiting_time;
			}
			System.out.println(waiting_time);
		}

	}

}
