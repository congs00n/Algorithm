package algorithm.algo2750;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*n개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 *첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다.
 *둘째 줄부터 N개의 줄에는 수 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 
 *수는 중복되지 않는다.
 *첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.*/
public class Algo2750 {
	public static void main(String[] args) throws IOException {
		
		// BufferedReader의 선언 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// BufferedReader는 String형으로 리턴이 고정되어 있기 때문에 반드시 형변환! 
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		// 자바에서 기본으로 제공해주는 정렬 메소드이다. 
		// Arrays 패키지만 Import 해준 뒤 sort 메소드를 사용하면 됨. 
		Arrays.sort(arr);
		
		for(int val : arr) {
			System.out.println(val);
		}
		
	}
}

