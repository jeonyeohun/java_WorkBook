package WorkBook;
/*
 * 주차장에서 차량들의 주차 관리 시스템을 만들어라. 
 * 차량마다 주차를 시작한 시간을 시와 분으로 입력받고, 주차를 종료한 시간을 시와 분으로 입력받은 후, 
 * 이를 CalcParking() 메소드에 파라미터로 넘겨 주차요금 을 리턴받도록 하라. 
 * 차량이 더 있는지 물어서 더 이상 차량이 없을 때까지 반복해서 요금을 계산하되 반복 이 끝나면 지금까지 계산한 차량의 수량과 총 주차요금을 화면에 출력하라. 
 * 주차요금은 10분당 500원으로 한다.
 */

import java.util.Scanner;
public class J05_parkingManage {
	int CalcParking(int start_h, int start_m, int end_h, int end_m) {	// 리턴 값은 주차 시간종료 후 계산된 주차요금
		int start_mins;
		int end_mins;
		int CalcMin;
		int total;
		
		// 시간을 분으로 변환하여 총 몇분인지 계산
		start_mins = start_h * 60 + start_m;
		end_mins = end_h * 60 + end_m;
		
		CalcMin = Math.abs(start_mins - end_mins);
		
		total = (CalcMin/10) * 500;
		
		// 10분 단위이므로 10분이 초과되면 바로 500원이 올라감. 딱 떨어지지 않는 경우에는 500원 추가 부과.
		if (CalcMin%10 > 0 ) {
			total += 500;
		}
		
		// 총 주차요금 리턴
		return total;
	}
	
	public static void main (String[] args) {
		int start_h, start_m;
		int end_h, end_m;
		int price;
		int total_price=0;
		String op;
		int cnt = 0;
		
		Scanner s = new Scanner(System.in);
		J05_parkingManage obj = new J05_parkingManage ();
		
		// 사용자가 입력을 종료를 원할때 까지 계속 반복해서 정보 받기
		while(true) {
			cnt++;
			// 시간 정보 입력
			System.out.print((cnt) + "번 차량 주차 시작 시각 (시 분) : ");
			start_h = s.nextInt();
			start_m = s.nextInt();
			System.out.print((cnt) + "번 차량 주차 종료 시각 (시 분) : ");
			end_h = s.nextInt();
			end_m = s.nextInt();
			
			// 요금 계산 메소드 호출
			price = obj.CalcParking(start_h, start_m, end_h, end_m);
			
			// 총 요금 계산
			total_price += price;
			
			System.out.println("주차요금 : " + price);
			System.out.print("더 입력하시겠습니까? (Y/N) : ");
			op = s.next();
			
			// 루프 종료 조건
			if (op.equals("N")) {
				break;
			}
		}
		
		System.out.println("주차차량 "+ (cnt) + "대의 총 주차요금은 " + total_price + "원 입니다.");
		s.close();
	}
}
