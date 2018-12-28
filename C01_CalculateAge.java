package WorkBook;
/*
 * 태어난 년도를 입력받아 나이를 계산한 후, 나이에 따라 유아, 어린이, 청소년, 청년, 중년, 노년 여부를 판 정하여 그 결과를 출력하라.
 * 단, 나이 = 2018 – 태어난 년도 + 1 로 계산하고 연령대 구분은 다음과 같이 판정한다.
 * 7세 미만 : 유아,
 * 7세 이상 ~ 13세미만 : 어린이, 
 * 13세 이상 ~ 20세 미만 : 청소년, 
 * 20세 이상 ~ 30세 미만 : 청년, 
 * 30세 이상 ~ 60세 미만 : 중년, 
 * 60세 이상 : 노년
 * 
 * 2018.12.28 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class C01_CalculateAge {
	public static void main(String[] args) {
		int birth_year;
		int age;
		Scanner input = new Scanner (System.in);
		
		System.out.print("태어난 년도를 입력하세요: ");
		birth_year = input.nextInt();
		
		input.close();
		
		age = 2018 - birth_year + 1;
		
		if (age < 7) {
			System.out.println("유아입니다.");
		}
		else if (age < 13) {
			System.out.println("어린이입니다.");
		}
		else if (age < 20) {
			System.out.println("청소년입니다.");
		}
		else if (age < 30) {
			System.out.println("청년입니다.");
		}
		else if (age < 60) {
			System.out.println("중년입니다.");
		}
		else {
			System.out.println("노년입니다.");
		}
	}
}
