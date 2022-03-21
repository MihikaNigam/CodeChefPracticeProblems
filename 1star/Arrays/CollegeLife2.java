package practice;

import java.io.InputStream;

public class CollegeLife2 {

	public static void main(String[] args) {
		InputStream inputStream = System.in;

		InputReader in = new InputReader(inputStream);
		int t = in.nextInt();
		int s, intro_duration[], no_episodes;
		while (t-- > 0) {
			long total_time = 0;
			s = in.nextInt();
			intro_duration = new int[s];
			for (int i = 0; i < s; i++) {
				intro_duration[i] = in.nextInt();
			}
			for (int i = 0; i < s; i++) {
				no_episodes = in.nextInt();
				for (int j = 0; j < no_episodes; j++) {
					total_time += in.nextInt();
					// for all but 1st episode
					if (j != 0) {
						total_time -= intro_duration[i];
					}
				}
			}
			System.out.println(total_time);

		}

	}

}
