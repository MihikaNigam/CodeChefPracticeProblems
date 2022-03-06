package practice;

import java.io.InputStream;

public class Motivation {

	public static void main(String[] args) {
		InputStream inputStream = System.in;

		InputReader in = new InputReader(inputStream);
		int t = in.nextInt();
		int i, n, x, movie_size, movie_rating, chosenmovie;
		while (t-- > 0) {
			n = in.nextInt();
			x = in.nextInt();
			chosenmovie = 0;
			for (i = 0; i < n; i++) {
				movie_size = in.nextInt();
				movie_rating = in.nextInt();
				if (chosenmovie < movie_rating && x >= movie_size) {
					chosenmovie = movie_rating;
				}
			}
			System.out.println(chosenmovie);

		}
	}

}
