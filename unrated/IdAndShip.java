package practice;

import java.io.InputStream;

public class IdAndShip {

	public static void main(String[] args) {
		InputStream inputStream = System.in;

		InputReader in = new InputReader(inputStream);
		int t = in.nextInt();
		while (t-- > 0) {
			String str = in.next().toLowerCase();
			String ans;
			switch (str) {
			case "b":
				ans = "BattleShip";
				break;
			case "c":
				ans = "Cruiser";
				break;
			case "d":
				ans = "Destroyer";
				break;
			case "f":
				ans = "Frigate";
				break;
			default:
				ans = "";
			}
			System.out.println(ans);
		}

	}

}
