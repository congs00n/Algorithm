package BaekJoon;

import java.util.Scanner;
public class YoonNyeon {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int nyeon = scanner.nextInt();
		
		if (nyeon % 4 == 0 && nyeon % 100 != 0 || nyeon % 400 == 0 ) {
			System.out.println(1);	
		}
		else {
			System.out.println(0);
		}
	}

}
