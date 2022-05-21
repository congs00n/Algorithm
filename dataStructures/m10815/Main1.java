package com.dataStructures.m10815;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/* 숫자 카드에 정수 하나가 적혀있다.
 * 상근이는 N개의 숫자카드를 가지고 있다. 
 * 상근이에게 정수 M개의 카드가 주어졌을 때, 
 * 이 수가 적혀있는 숫자 카드를 상근이가 가지고 있는지 아닌지를 구하는 프로그램을 작성하시오.
 * (단, 카드에 숫자가 중복되는 경우는 없다) > 
*입력* 
5
6 3 2 10 -10
8
10 9 -5 2 3 4 5 -10
 * 첫째 줄에 입력으로 주어진 M개의 수에 대해서, 
 * 각 수가 적힌 숫자 카드를 상근이가 가지고 있으면 1을, 아니면 0을 공백으로 구분해서 출력할 것 
 */
public class Main1 {			
		
				/*
				int[] is = {0,0,0,0,0,0,0,0};
				for(int i = 0; i < m; i ++) {
					if(N.indexOf(M.get(i))!=-1) {
						is[i] = 1;
					}
					System.out.print(is[i]+" ");*/
		
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			// 숫자카드 N개 입력 
			int n = scan.nextInt(); // 5입력 
			
			ArrayList<String> N = new ArrayList<>(n); // n개의 Integer 값이 담긴 객체배열 N 생성 
			
				for (int i=0; i < n; i++ ) {
					N.add(scan.nextLine());
					System.out.print(N.get(i)+" ");
				}// int[] N = { 6, 3, 2 10, -10}; 입력받은 상태로 존재한다. 
			
				
			// 숫자카드 M개 입력 (중복 없음)
			int m = scan.nextInt();
		
			ArrayList<String> M = new ArrayList<>(m); // m개의 Integer 값이 담긴 객체 배열 M 생성 
			
				for (int i = 0; i < m; i ++) {
					M.add(scan.nextLine());
				 System.out.print(M.get(i)+" "); // int[] M = {10 9 -5 2 3 4 5 -10}; 입력받은 상태로 존재한다. 
				}
					scan.close();
				
			int[] is = new int[]{0,0,0,0,0,0,0,0};
			for(int i = 0; i < m; i ++) {
				if(N.indexOf(M.get(i))!=-1) {
					is[i] = 1;
				}
				System.out.print(is[i]+" ");
			}
			
			
			
	
		}
}

	
