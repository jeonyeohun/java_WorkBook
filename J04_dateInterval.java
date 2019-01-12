package WorkBook;
/*
 * 날짜 2개를 입력받은 후, 이 2개의 날짜 간격은 며칠인지 계산하여 출력하라. 
 * 단, 월과 일로 파라미터로 넘 기면 이 날짜가 1년 중 몇 번째 날에 해당되는지 리턴하는 메소드 CalcDate() 메소드를 만들어 사용하라. 
 * 이 메소드에서 매 월의 날 수 계산 시 다음과 같이 매월의 날 수를 배열로 만들어 이를 이용하여 계산하라. 
 * int monthdays = {31,28,31,30,31,30,31,31,30,31,30,31}; // 1~12월의 날 수
 * 
 * 2019.01.12 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class J04_dateInterval {
	int CalcDate(int month, int day) {
		int monthdays[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		int days=0;
		int i;
	
		// 유효하지 않은 날짜가 입력되면 비정상 종료 반환
		if (month > 12 || monthdays[month-1] < day) {
			return -1;
		}
		
		// 총 날짜 계산
		for (i=0 ; i<month ; i++) {
			days+=monthdays[i];
		}
		days += day;
		
		
		return days;
	}
	
	public static void main (String[] args) {
		int month, day;
		int days1;
		int days2;
		Scanner s = new Scanner(System.in);
		J04_dateInterval obj = new J04_dateInterval();
		
		// 첫번째 날짜 입력받고 메소드를 호출하여 총 며칠인지 계산
		System.out.print("첫번째 날짜를 입력하시오(월 일): ");
		month =  s.nextInt();
		day = s.nextInt();
		
		days1 = obj.CalcDate(month, day);
		
		// 두번째 날짜 입력받고 메소드를 호출하여 총 며칠인지 계산
		System.out.print("두번째 날짜를 입력하시오(월 일): ");
		month =  s.nextInt();
		day = s.nextInt();
		
		days2 = obj.CalcDate(month, day);
		
		// 비정상 종료 값이 반환될 경우 에러 메세지 출력 후 프로그램 종료
		if (days1 == -1 || days2 == -1) {
			System.out.println("잘못 입력하셨습니다.");
			System.exit(0);
		}
		
		// 둘 날짜의 차를 절댓값으로 출력
		System.out.println("두 날짜의 간격은 "+ Math.abs(days1 - days2) + "일 입니다.");
		s.close();
	}
}
