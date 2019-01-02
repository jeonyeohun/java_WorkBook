package WorkBook;
/*
 * 10개의 숫자를 입력받아 배열에 저장한 후에 
 * 이 중에서 두 번째로 큰 수가 몇 번째 숫자인지 찾아내어 출력 하라.
 * **배열을 사용하라 
 * 
 * 2019.01.02 Jeon. Yeo Hun
 */

import java.util.Scanner;
public class F01_secondBigNum {
	public static void main (String[] args) {
		int[] num = new int[10]; // 숫자 10개를 담을 배열
		int first = 0;	// 가장 큰 수 
		int second = 0;	// 두 번째로 큰 수 
		int second_max_index = 0; // 두 번째로 큰 수의 인덱스
		int newnum; // 숫자 입력을 위한 변수
		int i;	//	반복문 변수 
		Scanner s1 = new Scanner(System.in);
		
		// 배열 요소 값 입력받기
		for (i=0 ; i<10 ; i++) {
			System.out.print(i+1 + "번째 수를 입력하세요: ");
			newnum = s1.nextInt();
			num[i] = newnum;
		}
		
		
		for (i=0 ; i<10 ; i++) {
			// 중복되는 값이 나올 경우 건너뛰기
			if (num[i] == first || num[i] == second) {
				continue;
			}
			// 가장 큰 수보다 큰 값이 나오면 이전 큰 수를 두 번째 큰수로 설정 
			else if (num[i]>first) {
				second = first;
				first = num[i];
			}
			// 가장 큰수보다는 작지만 이전에 나온 두번째 큰 수보다 크다면 두번째로 설정.
			else if(num[i]>second) {
				second = num[i];
			}
		}
		
		// 배열요소에 접근해 second값과 일치하는 요소 번호를 찾아냄.
		for (i=0 ; i<10 ; i++) {
			if (num[i] == second) {
				second_max_index = i+1;
			}
		}
		s1.close();
		System.out.println("두 번째로 큰 수는 "+ second_max_index + "번째 수 " + second + "입니다.");
	}
}
