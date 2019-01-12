package WorkBook;
/*
 * 물의 온도를 10회 입력받은 후, 이 물이 각각 어느 정도의 온수인지 AskWater()를 통해 판정하여 그 결과 를 출력하라. 
 * 출력할 내용은 입력된 10개의 온도 값, 냉수 입력 횟수, 미온수 입력 횟수, 온수 입력 횟수, 끓는 물 입력 횟수를 각각 출력하라.
 * 단, 온수의 판정 구간은 다음과 같이 판정한다.
 * 0도 ~ 25도 미만 : 냉수 
 * 25도 ~ 40도 미만 : 미온수 
 * 40도 ~ 80도 미만 : 온수 
 * 80도 이상 : 끓는 물
 * 
 * 2019.01.12 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class J03_waterTemp {
	byte AskWater(double degree) {	// 리턴값은 온도 판정 번호  (0.냉수, 1.미온수, 2.온수, 3.끓는 물)
		if (degree < 25) {
			return 0;
		}
		else if (degree < 40) {
			return 1;
		}
		else if (degree < 80) {
			return 2;
		}
		else {
			return 3;
		}
	}

	public static void main (String[] args) {
		double degree;
		Scanner s = new Scanner(System.in);
		J03_waterTemp obj = new J03_waterTemp();
		int scale0 = 0;
		int scale1 = 0;
		int scale2 = 0;
		int scale3 = 0;
		
		// 10개의 물 온도 입력받기
		for (int i=0 ; i<10 ; i++) {
			System.out.print((i+1) + "번째 물 온도를 입력하세요: ");
			degree = s.nextDouble();
			
			// 입력 횟수를 메소드를 호출하여 판정
			if (obj.AskWater(degree) == 0) {
				scale0++;
			}
			else if (obj.AskWater(degree) == 1) {
				scale1++;
			}
			else if (obj.AskWater(degree) == 2) {
				scale2++;
			}
			else if (obj.AskWater(degree) == 3) {
				scale3++;
			}
		}
		
		// 결과 출력
		System.out.println("냉수 입력 횟수는 " + scale0 + "입니다.");
		System.out.println("미온수 입력 횟수는 " + scale1 + "입니다.");
		System.out.println("온수 입력 횟수는 " + scale2 + "입니다.");
		System.out.println("끓는 물 입력 횟수는 " + scale3 + "입니다.");
		s.close();
	}
}
