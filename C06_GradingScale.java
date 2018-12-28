package WorkBook;
/*
 * 국어, 영어, 수학 점수를 입력받아 이 점수의 총점과 평균을 계산하고, 평균에 따라 등급을 정하여 출력하라. 
 * 단, 총점 = 국어점수 + 영어점수 + 수학점수, 평균 = 총점 / 3.0 으로 계산하고 등급은 다음과 같은 기준 으로 결정하라.
 * 평균 90이상 : 수
 * 평균 80이상 ~ 90미만 : 우 
 * 평균 70이상 ~ 80미만 : 미 
 * 평균 60이상 ~ 70미만 : 양 
 * 평균 60미만 : 가
 * 
 * 2018.12.28 Jeon, Yeo Hun;
 */

import java.util.Scanner;
public class C06_GradingScale {
	public static void main (String[] args) {
		int kor, eng, math;
		int total;
		double average;
		Scanner input = new Scanner (System.in);
		
		System.out.print("국어 점수를 입력하세요: ");
		kor = input.nextInt();
		
		System.out.print("영어 점수를 입력하세요: ");
		eng = input.nextInt();
		
		System.out.print("수학 점수를 입력하세요: ");
		math = input.nextInt();
		
		input.close();
		
		
		total = kor+eng+math;
		average = Math.round(total/3.0*10)/10.0;
		
		System.out.println("입력하신 점수의 총점은 "+ total + " 이고,");
		System.out.println("평균은 " + average + " 입니다.");
		
		if (average >= 90 ) {
			System.out.println("수 입니다. ");
		}
		else if (average >= 80 ) {
			System.out.println("우 입니다. ");
		}
		else if (average >= 80 ) {
			System.out.println("미 입니다. ");
		}
		else if (average >= 70 ) {
			System.out.println("양 입니다. ");
		}
		else {
			System.out.println("가 입니다. ");
		}
	}
}
