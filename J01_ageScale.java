package WorkBook;
/*
 * [G01] 문제를 참고하여 최대 100명까지 사람들의 2012보다 큰 년도가 입력되기 전까지 태어난 년도를 입력받도록 하라. 
 * 입력이 끝나면 AskAge() 메소드를 사용해서 지금까지 입력된 사람들의 나이를 모두 출력 하고, 연령대 별로 각각 몇 명인지 출력하라.
 * AskAge()에서는 태어난 년도를 입력하면 나이를 출력한 후, 유아, 어린이, 청소년, 청년, 중년, 노년 여부 를 판정하여 연령대 번호를 리턴한다.
 * 단, 나이 = 2019 – 태어난 년도 + 1 로 계산하고 연령대 구분은 다음과 같이 판정한다. 
 * 7세 미만 : 유아, 
 * 7세 이상 ~ 13세미만 : 어린이, 
 * 13세 이상 ~ 20세 미만 : 청소년, 
 * 20세 이상 ~ 30세 미만 : 청년, 
 * 30세 이상 ~ 60세 미만 : 중년, 
 * 60세 이상 : 노년
 * 
 * 2019.01.12 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class J01_ageScale {
	int AskAge(int birthyear) {	// 리턴 값은 계산된 나이에 따른 연령대 번호 (0.유아, 1.어린이, 2.청소년, 3.청년, 4.중년, 5.노년)
		int age;
		// 나이 계산.
		age = 2019 - birthyear + 1;
		
		System.out.println("나이는 "+ age + " 입니다.");
		
		// 연령대 번호 리턴
		if (age < 7) {
			return 0;
		}
		else if (age < 13) {
			return 1;
		}
		else if (age < 20) {
			return 2;
		}
		else if (age < 30) {
			return 3;
		}
		else if (age < 60) {
			return 4;
		}
		else {
			return 5;
		}
		
	}
	
	public static void main (String[] args) {
		J01_ageScale obj = new J01_ageScale();
		Scanner s = new Scanner(System.in);
		int scale=-1;
		int cnt = 1;
		int birthyear;
		int baby=0, child=0, youth=0, young=0, adult=0, old=0;
		while(true) {
			System.out.print((cnt++) + "번째 사람의 태어난 년도를 입력하시오: ");
			birthyear = s.nextInt();
			
			// 종료조건. 2012년보다 큰 년도가 입력되거나 100명 초과로 입력된 경우
			if (birthyear > 2012 || cnt>100) {
				break;
			}
			
			// 연령대 인원 수 계산
			scale = obj.AskAge(birthyear);
			if (scale == 0) {
				baby++;
			}
			else if (scale == 1) {
				child++;
			}
			else if (scale == 2) {
				youth++;
			}
			else if (scale == 3) {
				young++;
			}
			else if (scale == 4) {
				adult++;
			}
			else if (scale == 5) {
				old++;
			}
		}
		
		System.out.println("유아는 " + baby + "명 입니다.");
		System.out.println("어린이는 " + child + "명 입니다.");
		System.out.println("청소년은 " + youth + "명 입니다.");
		System.out.println("청년은 " + young + "명 입니다.");
		System.out.println("중년은 " + adult + "명 입니다.");
		System.out.println("노년은 " + old + "명 입니다.");
		
		s.close();
	}
}
