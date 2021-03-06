package WorkBook;
/*
 * 출력모드(홀수 또는 짝수)를 입력받아 이에 따라 홀수 단 또는 짝수 단의 구구단 만을 1줄에 3개씩 출력하 라. 
 * 단, 출력모드 입력 내용이 1이면 홀수단, 2이면 짝수단으로 결정하도록 한다.
 * 
 * 2019.01.02 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class E04_EvenOrOddGugudan {
	public static void main (String[] args) {
		int mode; // 출력모드: 1은 홀수단, 2는 짝수단 
		int i, j; // 반복문 변수 
		Scanner input = new Scanner(System.in);
		
		System.out.print("구구단의 출력모드(1: 홀수단, 2: 짝수단)를 입력하시오: ");
		mode = input.nextInt();
		input.close();
		
		if (mode == 1) {	// 홀수단 
			for (i = 3 ; i < 10 ; i+=2) {	// 3단부터 2씩 증가
				for (j=1 ; j<10 ; j++) {
					System.out.print(i + " X " + j + " = " + (i*j) + "\t");
					if (j%3 == 0) {
						System.out.print("\n");
					}
				}
				System.out.print("\n");
			}
		}
		else if (mode == 2) {	// 짝수단 
			for (i = 2 ; i < 10 ; i+=2) {	// 2단부터 2씩 증가 
				for (j=1 ; j<10 ; j++) {
					System.out.print(i + " X " + j + " = " + (i*j) + "\t");
					if (j%3 == 0) {
						System.out.print("\n");
					}
				}
				System.out.print("\n");
			}
		}
		else {	// 1이나 2가 아닌 다른 값이 입력되었을 때.
			System.out.println("잘못된 입력입니다.");
		}
	}
}
