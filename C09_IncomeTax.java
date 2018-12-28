package WorkBook;
/*
 * 연봉(원 단위)을 숫자로 입력받은 후, 연봉 금액에 대한 소득세를 계산하여 출력하라. 
 * 단, 소득세의 금액은 다음과 같이 계산한다.
 * 연봉 1천만 원 미만 : 연봉의 9.5%
 * 연봉 1천만 원 이상 ~ 4천만원미만 : 연봉의 19%
 * 연봉 4천만 원 이상 ~ 8천만원미만 : 연봉의 28% 
 * 연봉 8천만 원 이상 : 연봉의 37%
 *
 * 2018.12.28 Jeon, Yeo Hun
 */


import java.util.Scanner;
public class C09_IncomeTax {
	public static void main (String[] args) {
		int income;
		int tax;
		Scanner input = new Scanner(System.in);
		
		System.out.print("연봉(원 단위)을 숫자로 입력하세요: ");
		income = input.nextInt();
		
		input.close();
		
		if (income<10000000) {
			tax = (int) (income * 0.095);
		}
		else if (income<40000000) {
			tax = (int) (income * 0.19);
		}
		else if (income<80000000) {
			tax = (int) (income * 0.28);
		}
		else {
			tax = (int) (income * 0.37);
		}
		
		System.out.println("연봉에 대한 소득세는 " + tax + "원 입니다.");
	}
}
