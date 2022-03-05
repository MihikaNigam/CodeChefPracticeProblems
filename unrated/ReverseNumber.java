package practice;

import java.io.InputStream;

public class ReverseNumber {

	public static void main(String[] args) {
		InputStream inputStream = System.in;

		InputReader in = new InputReader(inputStream);
		int t = in.nextInt();
		while (t-- > 0) {
			int num = in.nextInt();
			int size = String.valueOf(num).length();
			int d,ans=0;
			while(size>0) {
				d=num%10;
				ans+=d*Math.pow(10, size--);
				num/=10;
			}
			System.out.println(ans/10);
		}

	}

}
