package WorkBook;
/*
 * na를 계산할 수 있는 math 모듈 내의 pow() 메소드와 같은 일을 하는 power() 메소드를 재귀 호출을 이 용하여 만들어라. 
 * 그리고 숫자 2개(num1, num2)를 입력받아 num1^num2 를 계산하라.
 * 단, power() 메소드는 다음과 같이 정의된다.
 * 
 * 2019.01.12
 */

import java.util.Scanner;
public class J09_pow {
	int power (int num1, int num2) {
		if (num2 == 0) {
			return 1;
		}
		else if (num2 == 1) {
			return num1;
		}
		else if (num2>1 && num2%2==0) {
			return power(num1, num2/2) * power(num1, num2/2);
		}
		
		else if (num2>1 && num2%2==1) {
			return power(num1, num2/2) * power(num1, num2/2) * num1;
		}
		else {
			return -1;
		}
		
	}
	
	public static void main (String[] args) {
		int num1, num2;
		Scanner s = new Scanner(System.in);
		J09_pow obj = new J09_pow();
		System.out.print("숫자 2개를 입력하시오: ");
		num1 = s.nextInt();
		num2 = s.nextInt();
		
		System.out.println("\n" + num1 + "의 "+ num2 + "승은 " + obj.power(num1, num2) + " 입니다.");
		s.close();
	}
}
