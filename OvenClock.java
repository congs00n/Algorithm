package BaekJoon;

import java.util.Scanner;
public class OvenClock {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
									// 콘솔창에 두 번 출력되는 오류 
		if (C > 60) { 
			A = A +(C/60);
			B = B +(C%60);
			if (B == 60) {
				A = A + 1;
				B = 0;
			}
			if(C % 60 == 0) {
				B = B;
			}
			System.out.println(A + " " + B); 
		}
		if (C < 60) {
			B = B + C;
			if (B >= 60) {
				A = A + 1;
				B = B - 60; 
				if (A == 24) {
					A = 0;
				}
			}
		
		}	
		System.out.println(A + " " + B);
		
	}

}
