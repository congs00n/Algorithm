package BaekJoon;

import java.util.Scanner;
public class AlarmClock {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int H = in.nextInt(); 
		int M = in.nextInt();
		in.close();
		
		// 나올 수 있는 조건을 정리 후 최대한 간결하게 축약! 
		if (M < 45) {
			H = H - 1;
			M = 60-(45-M);
			if (H < 0) {
				H = 23;
			}
			System.out.println(H + " " + M);
		}
		else {
			System.out.println(H + " " + (M-45));
			
		}
	}
}
