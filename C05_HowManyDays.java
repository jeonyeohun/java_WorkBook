package WorkBook;
/*
 * 날짜를 월과 일로 입력받아 이 날짜는 1년 중 몇 번째 날에 해당되는지 계산하여 출력하라. 
 * 단, 매 월의 날 수는 다음과 같이 정한다.
 * 2월 : 28일
 * 1, 3, 5, 7, 8, 10, 12월 : 31일
 * 4, 6, 9, 11월 : 30일
 * 
 * 2018.12.28 Jeon, Yeo Hun
 */

import java.util.Scanner;

public class C05_HowManyDays {
	public static void main (String[] args) {
		int month, day;
		int day_count=0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("월을 입력하시오: ");
		month = input.nextInt();
		
		System.out.print("일을 입력하시오: ");
		day = input.nextInt();
		
		input.close();
		
		if (month > 12) {
			System.out.println("잘못된 입력입니다.");
			System.exit(0);
		}
		else if (month>11) {
			day_count = 31+28+31+30+31+30+31+31+30+31+30 + day; 
		}
		else if (month>10) {
			day_count = 31+28+31+30+31+30+31+31+30+31 + day;
		}
		else if (month>9) {
			day_count = 31+28+31+30+31+30+31+31+30+ day;
		}
		else if (month>8) {
			day_count = 31+28+31+30+31+30+31+31+ day;
		}
		else if (month>7) {
			day_count = 31+28+31+30+31+30+31+ day;
		}
		else if (month>6) {
			day_count = 31+28+31+30+31+30 + day;
		}
		else if (month>5) {
			day_count = 31+28+31+30+31+ day;
		}
		else if (month>4) {
			day_count = 31+28+31+30+ day;
		}
		else if (month>3) {
			day_count = 31+28+31+ day;
		}
		else if (month>2) {
			day_count = 31+28+ day;
		}
		else if (month>1) {
			day_count = 31+ day;
		}
		else {
			day_count = day;
		}
		
		System.out.println("이 날짜는 1년 중 "+ day_count + " 번째 날에 해당됩니다.");
	}
}
