package WorkBook;
/*
 * 국어, 영어, 수학 점수를 입력받아 이 점수의 총점과 평균을 계산하고, 
 * 각 과목별로 90점 이상이면 성적우수 로 표시하여 출력하라.
 * 단, 총점 = 국어점수 + 영어점수 + 수학점수, 평균 = 총점 / 3.0 으로 계산하라.
 * 2018.12.28 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class B06_CalculateGrade {
	public static void main (String[] args) {
		int kor, eng, math;
		int total;
		double average;
		Scanner input = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요: ");
		kor = input.nextInt();
		
		System.out.print("영어 점수를 입력하세요: ");
		eng = input.nextInt();
		
		System.out.print("수학 점수를 입력하세요: ");
		math = input.nextInt();
		
		input.close();
		
		total = kor + eng + math;
		average = Math.round(total / 3.0 *10)/10.0;
		
		System.out.println("입력하신 점수의 총점은 " + total + " 이고,");
		System.out.println("평균은 " + average + " 입니다.");
		
		if (kor >= 90) {
			System.out.println("국어점수가 우수합니다.");
		}
		if (eng >= 90) {
			System.out.println("영어점수가 우수합니다.");
		}
		if (math >= 90) {
			System.out.println("수학점수가 우수합니다.");
		}
		
	
	}
}
