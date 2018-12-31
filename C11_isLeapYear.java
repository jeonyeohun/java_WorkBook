package WorkBook;
/*
 * 년도를 입력받은 후, 이 년도가 윤년이지 아닌지를 판정하여 그 결과를 출력하라. 
 * 윤년의 판정 기준은 다음 과 같다.
 * 1) 년도가 4로 나누어떨어지는 경우에 윤년이다.
 * 2) 위 1)의 기준 중에 100으로 나누어떨어지는 년도는 윤년에서 제외한다.
 * 3) 위 2)의 기준 중에 400으로 나누어떨어지는 년도는 윤년이다.
 * 
 * 2018.12.31 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class C11_isLeapYear {
	public static void main(String[] args) {
		int year=0;
		Scanner input = new Scanner(System.in);
		
		input.close();
		
		
		System.out.print("년도를 입력하세요: ");
		year = input.nextInt();
		
		if (year % 4 == 0) {		    // 4로 나누어 떨어지는 경우는 윤년 
			if (year % 100 == 0) { 		// 그 중에서 100으로 나누어 떨어지는 경우는 윤년이 아님 
				if(year % 400 ==0 ) { 	// 그 중에서 400으로 나누어 떨어지는 경우는 윤년 
					System.out.println("입력하신 년도는 윤년입니다.");
					System.exit(0);		// 조건이 만족되면 강제로 종료 
				}
				System.out.println("입력하신 년도는 윤년이 아닙니다.");
			}
			else{		// 4로 나누어 떨어지면서 100으로 나누어 떨어지지 않는 경우는 윤년 
				System.out.println("입력하신 년도는 윤년입니다.");
			}
		}
		else {	// 4로 나누어 떨어지지 않는 경우는 윤년이 아님 
			System.out.println("입력하신 년도는 윤년이 아닙니다.");
		}
	}
}
