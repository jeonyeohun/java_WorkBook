package WorkBook;
/*
 * 숫자를 3개 입력받은 후, 이 숫자 중에서 가장 큰 수, 가장 작은 수를 출력하라.
 * 2018.12.28 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class C08_BiggestandSmallestNum {
	public static void main (String[] args) {
		int num1, num2, num3;
		int max_num, min_num;
		Scanner input = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요: ");
		num1 = input.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요: ");
		num2 = input.nextInt();
		
		System.out.print("세번째 숫자를 입력하세요: ");
		num3 = input.nextInt();
		
		input.close();
		
		max_num = num1;
		min_num = num1;
		
		if (num1 > num2) {
			if(num1 > num3) {
				max_num = num1;
			}
			else {
				max_num = num3;
			}
		}
		else {
			if (num2 > num3) {
				max_num = num2;
			}
			else {
				max_num = num3;
			}
		}
		
		if (num1 < num2) {
			if(num1 < num3) {
				min_num = num1;
			}
			else {
				min_num = num3;
			}
		}
		else {
			if (num2 < num3) {
				min_num = num2;
			}
			else {
				min_num = num3;
			}
		}
		
		System.out.println("가장 큰 수는 "+ max_num + " 이고, 가장 작은 수" + min_num + " 입니다.");
	}
}
