package WorkBook;
/*
 * 3개의 정수를 입력받아 이 숫자들에 대해서 다음 조건 중에 만족시키는 번호들을 모두 출력하라. 
 * 1번. 3개의 숫자 중 적어도 두 수의 값이 같다.
 * 2번. 3개의 숫자 중 적어도 두 수의 크기가 모두 50 보다 크다.
 * 3번. 3개의 숫자 중 어떤 두 수의 합이 나머지 하나의 숫자와 같다.
 * 4번. 3개의 숫자 중 어떤 하나의 수로 다른 두 수를 나누면 나누어떨어지는 경우가 있다.
 * 2018.12.28 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class B08_ConditionExcercise {
	public static void main (String[] args) {
		int num1, num2, num3;
		Scanner input = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요: ");
		num1 = input.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요: ");
		num2 = input.nextInt();
		
		System.out.print("세번째 숫자를 입력하세요: ");
		num3 = input.nextInt();
		
		input.close();
		
		if (num1 == num2 || num1 == num3 || num2 == num3) {
			System.out.println("1번 조건 만족 : 3개의 숫자 중 적어도 두 수의 값이 같다.");
		}
		if (num1+num2>=100 || num1+num3>=100 || num2+num3>=100) {
			System.out.println("2번 조건 만족 : 3개의 숫자 중 적어도 두 수의 크기가 모두 50보다 크다.");
		}
		if (num1+num2 == num3 || num1+num3 == num2 || num2+num3 == num1) {
			System.out.println("3번 조건 만족 : 3개의 숫자 중 어떤 두 수의 합이 나머지 하나의 숫자와 같다.");	
		}
		if ((num1+num2) % num3 == 0 || (num1+num3)%num2 == 0 || (num2+num3)%num1 == 0) {
			System.out.println("4번 조건 만족 : 3개의 숫자 중 어떤 하나의 수로 다른 두 수를 나누면 나누어 떨어지는 경우가 있다.");
		}
		
	}
}
