package WorkBook;
/*
 * 숫자 2개와 하나의 연산기호문자('+', '-', '*', '/' 중 1개)를 입력받은 후, 
 * 첫 번째 숫자와 두 번째 숫자 사 이에 연산기호를 넣은 계산식의 결과 값을 계산하여 출력하라.
 * 
 * 2018.12.31 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class C10_simpleCalculator {
	public static void main (String[] args) {
		int num1, num2;
		String operator;
		int result = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("숫자1 을 입력하세요: ");
		num1 = input.nextInt();
		
		System.out.print("숫자2 을 입력하세요: ");
		num2 = input.nextInt();
		
		System.out.print("연산기호문자('+', '-', '*', '/') 중 한 개를 입력하세요: ");
		operator = input.next();
		
		input.close();
		
		if(operator.equals("+")) {
			result = num1 + num2;
		}
		else if (operator.equals("-")) {
			result = num1 - num2;
		}
		else if (operator.equals("*")) {
			result = num1 * num2;
		}
		else if (operator.equals("/")) {
			result = num1 / num2;
		}
		else {
			System.out.println("지원하지 않는 연산기호문자 입니다.");
			System.exit(0);
		}
		
		System.out.println("계산식의 결과 값은 "+ result + "입니다.");
	}
}
