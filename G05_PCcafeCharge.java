package WorkBook;
/*
 * PC방 이용료를 계산하는 프로그램을 작성하라. 사용한 시간(시간, 분)을 입력받은 후 
 * 이에 따른 이용료를 화면에 출력하는 것을 반복한다. 시간과 분이 모두 0으로 입력되면 계산을 마치고 지금까지의 이용료 총금액 을 출력하라.
 * 단, 이용료는 매 30분 당 1,000원씩으로 계산하며, 다음과 같이 시간에 따라 할인혜택을 적용한다.
 * 1) 2시간 이상 3시간 미만 이용자는 비용의 5%를 할인받는다.
 * 2) 3시간 이상 5시간 미만 이용자는 비용의 10%를 할인받는다.
 * 3) 5시간 이상 이용자는 비용의 20%를 할인받는다.
 * 예) 이용시간이 4시간 20분이면 정상금액 9,000원에서 10% 할인을 받아 이용료는 8,100원이 된다.
 * 
 * 2019.01.05 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class G05_PCcafeCharge {
	public static void main (String[] args) {
		int hour, minute;	// 이용한 시간 
		int charge;			// 이용료  
		int total_charge=0;	// 이용료 총액 
		Scanner s1 = new Scanner (System.in);
		
		while(true) {
			
			// 값 입력받기 
			System.out.print("사용한 시간을 시간과 분으로 입력하세요: ");
			hour = s1.nextInt();
			minute = s1.nextInt();
			
			// 종료 조건 설정  
			if (hour == 0 && minute == 0) {
				break;
			}
			
			// 30 분단위로 계산 되기 때문에 30분이 초과되면 이용료 1천원 증가.
			if (minute == 0) {
				minute = 0;
			}
			else if (minute <= 30) {
				minute = 1; 
			}
			else {
				minute = 2;
			}
			
			
			// 할인 적용 전 이용료 계산
			charge = hour * 2000 + 1000 * minute;
			
			
			// 이용시간 별 할인율 및 할인된 이용료 계산
			if (hour == 2) {
				charge -= (int)(charge * 0.05);
			}
			else if (hour >= 3 && hour < 5) {
				charge -= (int)(charge * 0.1);
			}
			else if (hour >= 5) {
				charge -= (int)(charge * 0.2);
			}
			
			total_charge += charge; 
			System.out.println("고객님의 이용료는 "+ charge + "입니다.");
		}
		
		// 총 이용료 출력 
		System.out.println("지금까지의 총 이용료는 "+ total_charge + "입니다.");
		s1.close();
		
	}

}
