package com.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* 3. 문장 속 단어
 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하시오.
 * 문장 속의 단어는 공백으로 구분합니다. 
 * 
 * 입력 : 첫 줄에 길이가 100을 넘지 않는 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
 * 출력 : 첫 줄에 가장 긴 단어를 출력합니다. 가장 길이가 긴 단어가 여러개일 경우 문장 속에서 가장 앞쪽에 위치한 단어를 답으로 합니다. 
 * 
 * (예)
 * input : it is time to study.
 * print : study
 *  
 * */
public class Main1 {
	
		public String solution(String str) {
			
			// 1) String 타입 배열 arr 선언 > 사용자가 입력한 문자열 넣을 용도 
			// 	.split(" ") > 공백으로 문자열 구분 후 arr 에 넣어줌 
			// * Arrays.toString(array)
			// * 배열의 값을 String으로 한 번에 확인 
			// * cf) System.out.println(Arrays.toString(arr)); 
			// [it, is, time, to, study]
				String[] arr = str.split(" ");
		
			// 2) Integer 타입 ArrayList len 생성 > 문자열의 길이를 담을 용도 
			//		- 길이의 최댓값과 해당 인덱스를 조회해야 하므로 ArrayList 내의 다양한 메소드를 사용하기 위함 
				ArrayList<Integer> len = new ArrayList<>(arr.length);
				
			// 3) for 문을 통해 arr 각 인덱스 길이를 구한 후 len 리스트에 할당 
					// 문자열의 길이를 담은 ArrayList len 배열 : [2, 2, 4, 2, 5]
					// add(i번째에 arr의 i번째 문자열의 길이를 할당해 주세요)
				for (int i=0; i<arr.length; i++) {
					len.add(i, arr[i].length());
				}
			
			// 4) 배열의 최댓값 > Collections.max(array)
				int max = Collections.max(len);
					
			// 5) 최댓값이 있는 인덱스> list.indexOf()
					// 만약, 없으면 -1을 반환함 
				int indexOf = len.indexOf(max);
			
			// 6) 최댓값의 인덱스를 arr[] 의 인덱스에 대입하여 가장 긴 단어를 구한다. 
				String longStr = arr[indexOf];
				
					return longStr;
		}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// nextLine() >> 띄어쓰기가 있는 입력메소드로 공백을 입력할 수 있도록 함. 
		// cf) next() >> 띄어쓰기 없이 개행 
		String input = scan.nextLine();
		
		Main1 main = new Main1();
		String rslt = main.solution(input);
			
			System.out.println(rslt);
	}

}
