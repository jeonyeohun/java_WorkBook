package WorkBook;
import java.util.Scanner;

// 국어, 영어, 수학 점수를 입력받아 이 점수의 총점과 평균을 계산하여 출력하라.
// 단, 총점 = 국어점수 + 영어점수 + 수학점수, 평균 = 총점 / 3.0 으로 계산하라.
// 2018.12.24 Jeon, Yeo Hun

public class A06_TotalandAvg {
	public static void main (String[] args) {
		int kor, eng, math, total;
		double average;
		Scanner input = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요: ");
		kor = input.nextInt();
		System.out.print("영어 점수를 입력하세요: ");
		eng = input.nextInt();
		System.out.print("수학 점수를 입력하세요: ");
		math = input.nextInt();
		
		input.close();
		
		total  = kor + eng + math;
		average = total / 3.0;
		
		System.out.println("입력하신 점수의 총점은 "+ total + " 이고,");
		System.out.println("평균은 " + Math.round(average*10)/10.0 + "입니다.");
		// 반올림 하고 싶을 때 Math.round()를 사용하고 파라미터 값에 원하는 자릿수 만큼 곱했다가 다시 그 값으로 나누어 준다.
	}

}
