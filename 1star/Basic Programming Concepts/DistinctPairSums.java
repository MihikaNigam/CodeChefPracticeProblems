package practice;

import java.io.InputStream;
import java.util.HashSet;

public class DistinctPairSums {

	public static void main(String[] args) {
		InputStream inputStream = System.in;

		InputReader in = new InputReader(inputStream);
		int t = in.nextInt();
		int l, r;
		while (t-- > 0) {
			l = in.nextInt();
			r = in.nextInt();
			
			System.out.println(2*r-2*l+1);
		}

	}

}
