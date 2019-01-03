package WorkBook;
/*
 * 날짜를 월과 일로 입력받아 이 날짜는 1년 중 몇 번째 날에 해당되는지 계산하여 출력하라.
 * 단, 매 월의 날 수를 다음과 같이 리스트로 만들어 이를 이용하여 계산하라.
 */

import java.util.Scanner;
public class F09_calculateDays {
	public static void main (String[] args) {
		int monthdays[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int month,day;
		int day_count=0;
		int i;
		
		Scanner s1 = new Scanner(System.in);
		System.out.print("월을 입력하세요: ");
		month= s1.nextInt();
		System.out.print("일을 입력하세요: ");
		day = s1.nextInt();
		
		s1.close();
		
		// 존재하지 않는 날짜를 입력할 경우 
		if (month>12 || day > monthdays[month-1] ) {
			System.out.println("잘못 입력 하셨습니다.");
			System.exit(0);
		}
		
		// 해당 월 전까지 날짜 모두 합산 
		for(i=0 ; i<month-1 ; i++) {
			day_count += monthdays[i];
		}
		
		day_count = day_count + day;
		
		System.out.println("이 날짜는 1년 중 " + day_count + "번째 날에 해당됩니다.");
	}	
}
