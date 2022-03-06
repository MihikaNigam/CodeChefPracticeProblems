package practice;

import java.io.InputStream;

public class TheTwoDishes {

	public static void main(String[] args) {
		InputStream inputStream = System.in;
		InputReader in = new InputReader(inputStream);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int s = in.nextInt();
			int t1=0,t2=0;
			for(int i=n;i>=0;i--) {
				if(i<=s) {
					t1=i;
					break;
				}
			}
			for(int i=0;i<=n;i++) {
				if(i==s-t1) {
					t2=i;
					break;
				}
			}
			System.out.println(Math.abs(t2-t1));
			
		}

	}

}
