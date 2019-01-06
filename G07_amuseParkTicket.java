package WorkBook;
/*
 * 놀이공원 매표소 프로그램을 제작하라. 프로그램 시작하면 몇 팀이 방문하였는지 입력받아 팀의 수만큼 다음 과 같은 순서로 진행하도록 한다.
 * 1) 팀별 인원 구성을 입력받는다. 인원구성은 (초등학생, 청소년, 일반인, 경로대상) 4종류별 인원수를 숫 자로 입력받는다.
 * 
 * 2) 팀별 정상요금을 계산한다. 1인당 요금은 다음과 같다.
 * - 초등학생 : 5000원, 
 * - 청소년 : 10000원, 
 * - 일반인 : 15000원, 
 * - 경로대상 : 3000원 
 * 
 * 3) 팀 별로 할인카드 소지 여부를 확인한다. 할인카드 종류별 할인율은 다음과 같다.
 * - 카드없음 : 할인 없음, 
 * - 일반등급 카드 : 10% 할인, 
 * - VIP 등급 카드 : 20% 할인
 * 
 * 4) 최종 계산된 팀별 입장료를 출력한다.
 * 모든 팀에 대한 처리가 완료되면 다음 내용을 화면에 출력하라.
 * 1) 총 방문자 수
 * 2) 인원구성별 방문자 합계 (4종류)
 * 3) 총 입장료
 * 
 * 2019.01.06 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class G07_amuseParkTicket {
	public static void main (String[] args) {
		int team_count;								// 방문한 팀수  
		int charge[] = {5000, 10000, 15000, 3000};	// 연령별 수 
		int count[] = new int[4];					// 입력받은 연령별 인원 수 
		int v_count[] = new int[4];					// 연령별 방문자 합계 
		int total_count = 0;						// 총 방문자 수 
		int sum;									// 팀별 요금 
		int total_sum = 0;							// 총 요금 
		int membership = 0;							// 할인 카드 종류 (카드없음:0, 일반등급:1, VIP 등급: 2)
		int i, j=0;
		Scanner s1 = new Scanner (System.in);
		
		System.out.print("오늘 방문한 팀 수를 입력하세요: ");
		team_count = s1.nextInt();
		
		// 방문팀 수만큼 팀 입력받기 
		for (i=0 ; i<team_count ; i++) {
			sum = 0;
			
			// 연령별 인원 수 입력받기 
			System.out.print(i+1 + "번팀 인원수(초등학생, 청소년, 일반, 경로대상)를 입력하세요: ");
			for (j=0 ; j<4 ; j++) {
				count[j] = s1.nextInt();
				total_count += count[j];	// 총 인원 수 업데이트 
				v_count[j] += count[j];  	// 연령별 인원 수 업데이트 
				sum = sum + charge[j] * count[j];	// 총 입장료 계산  
			}
			
			// 할인카드 정보 입력받기 
			System.out.print(i+1 + "번팀 할인카드 종류(카드없음:0, 일반등급:1, VIP 등급: 2)를 입력하세요: ");
			membership = s1.nextInt();
			
			// 할인률 적용 후 입장료 계
			if (membership == 1) {
				sum = sum - (int)(sum * 0.1);
			}
			else if (membership == 2) {
				sum = sum - (int)(sum * 0.2);
			}
			System.out.println(i+1 + "번팀 입장료는 "+ sum + "입니다.\n");
			
			total_sum += sum;	
			
		}
		
		// 정보 출력
		System.out.println("오늘 총 방문자 수는 " + total_count + "명 입니다.");
		System.out.println("초등학생 수는 "+ v_count[0] + "명 입니다.");
		System.out.println("청소년 수는 "+ v_count[1] + "명 입니다.");
		System.out.println("일반인 수는 "+ v_count[2] + "명 입니다.");
		System.out.println("경로대상 수는 " + v_count[3] + "명 입니다.\n");
		
		System.out.println("총 입장료는 "+ total_sum + "원 입니다.");
		s1.close();
		
	}
}
