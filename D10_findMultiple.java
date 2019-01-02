package WorkBook;
/*
 * 숫자 2개를 입력받은 후, 1부터 100까지의 숫자 중에 이 두 숫자 중 하나의 숫자에 대해서만 배수인 수를 모두 출력하라. 
 * 즉, 두 숫자의 공통 배수인 숫자는 출력하지 않아야 한다.
 * 예를 들어 15와 20을 입력하게 되면 "15, 20, 30, 40, 45, 75, 80, 90, 100"이 출력된다. 
 * 반복문은 for 구문을 사용 
 * 
 * 2019.01.02 Jeon. Yeo Hun
 */

import java.util.Scanner;
public class D10_findMultiple {
	public static void main (String[] args) {
		int num1, num2; // 입력받은 두 수
		int i; // 반복문을 위한 변수
		Scanner input = new Scanner(System.in);
		
		System.out.print("2개의 숫자를 입력하세요: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		input.close();
		
		for (i=1 ; i<100 ; i++) {
			// num1 이나 num2 로 나누어 떨어지지만 두수의 공통되는 배수가 아닌 경우만 출력
			if ((i%num1 == 0 || i%num2 == 0) != (i%num1 == 0 && i%num2 == 0)) {
				System.out.print(i + ", ");
			}
			
		}
		
	}
}
