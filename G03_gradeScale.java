package WorkBook;
/*
 * 학생 5명의 국어, 영어, 수학 점수를 각각 입력받아 저장한 후에, 다음 항목들을 계산하여 출력하라. 
 * 1) 각 과목별 총점과 평균 점수
 * 2) 각 학생별 총점과 평균점수, 평균에 따른 등급
 * 등급은 다음과 같은 기준으로 결정하라.
 * 평균 90이상 : A
 * 평균 80이상 ~ 90미만 : B
 * 평균 70이상 ~ 80미만 : C
 * 평균 60이상 ~ 70미만 : D
 * 평균 60미만 : F
 * 
 * 2019.01.05 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class G03_gradeScale {
	public static void main (String[] args) {
		int jumsu[][] = new int[5][3];	// 3과목의 점수, 총점을 저장하는 배열 
		double c_average[] = new double[3];	// 3과목의 평균을 저장하는 배열 
		String class_name[] = {"국어", "영어", "수학"};	// 과목명을 저장하고 있는 배열 
		int kor=0, eng=0, mat=0;				// 과목별 점수를 저장할 변수 
		int sum; 
		double average;
		String grade; // 총점, 평균, 등급
		int i, j;
		Scanner s1 = new Scanner (System.in);
		
		// 학생 별 점수 입력받기
		for (i=0 ; i<5 ; i++) {
			System.out.print(i+1 + "번 학생의 국어, 영어, 수학 점수는?: ");
			for (j=0 ; j< 3 ; j++) {
				jumsu[i][j] = s1.nextInt();
			}
		}
		
		s1.close();
		
		// 과목별 총점 계산
		for (i=0 ; i<5 ; i++) {
			kor += jumsu[i][0];
			eng += jumsu[i][1];
			mat += jumsu[i][2];
		}
		
		// 과목별 평균 계산
		c_average[0] = Math.round(kor/5.0*10)/10.0;
		c_average[1] = Math.round(eng/5.0*10)/10.0;
		c_average[2] = Math.round(mat/5.0*10)/10.0;
		
		
		// 계산 결과 출력 
		System.out.println("1) 각 과목별 총점과 평균 점수 ");
		System.out.println(class_name[0] + " 과목 총점은 "+ kor + " 평균은 "+ c_average[0]+ " 입니다.");
		System.out.println(class_name[1] + " 과목 총점은 "+ eng + " 평균은 "+ c_average[1]+ " 입니다.");
		System.out.println(class_name[2] + " 과목 총점은 "+ mat + " 평균은 "+ c_average[2]+ " 입니다.");
		
		// 학생별 총점과 평균 계산 
		System.out.println("2) 각 학생별 총점과 평균 점수 ");
		for (i=0 ; i<5 ; i++) {
			// 총점 계산 
			sum = 0;
			for (j=0 ; j<3 ; j++) {
				sum += jumsu[i][j];
			}
			
			// 평균 계산 
			average = Math.round(sum/3.0*10)/10.0;
			
			// 등급 지정 
			if (average >= 90) {
				grade = "A";
			}
			else if (average >=80) {
				grade = "B";
			}
			else if (average >= 70) {
				grade = "C";
			}
			else if (average >= 60) {
				grade = "D";
			}
			else {
				grade = "F";
			}
			
			// 출력 
			System.out.println(i+1 + "번 학생 점수 : 총점 " + sum + ", 평균 "+ average + ", 등급 "+ grade);
		}
	}
}
