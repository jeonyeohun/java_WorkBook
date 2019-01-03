package WorkBook;
/*
 * 학생 5명의 국어, 영어, 수학 점수를 각각 입력받아 저장한 후에, 
 * 각 과목별 총점과 평균 점수를 계산하여 출력하라.
 * 
 * 2019.01.03 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class F03_subjectTotalandAvg {
	public static void main (String[] args) {
		int jumsu[][] = new int[5][3]; // 5명의 3과목 점수를 저장하는 리스트
		int sum[] = new int [3];	// 3과목 총점 리스트 
		double average[] = new double[3];	// 3과목 평균 리스트
		int kor=0, eng=0, mat=0;	// 3과목 점수 입력 변수
		int i;	// 반복문 변수
		Scanner s1 = new Scanner(System.in);
		
		for (i=0 ; i<5 ; i++) {
			System.out.print(i+1 + "번 학생의 국어, 영어, 수학 점수를 입력하세요: ");
			jumsu[i][0] = s1.nextInt();
			jumsu[i][1] = s1.nextInt();
			jumsu[i][2] = s1.nextInt();
		}
		
		s1.close();
		
		// 총점 계산 
		for (i=0 ; i<5 ; i++) {
			kor = kor + jumsu[i][0];
			eng = eng + jumsu[i][1];
			mat = mat + jumsu[i][2];
		}
		
		// 계산한 총점을 배열에 저장 
		sum[0] = kor; sum[1] = eng; sum[2] = mat;
		
		// 평균을 계산 하여 배열에 저장 
		average[0] = Math.round(kor/5.0 *10)/10.0;
		average[1] = Math.round(eng/5.0 *10)/10.0;
		average[2] = Math.round(mat/5.0 *10)/10.0;
		
		System.out.println("국어의 총점은 "+ sum[0] + "이고, 평균은 "+ average[0] + " 입니다.");
		System.out.println("영어의 총점은 "+ sum[1] + "이고, 평균은 "+ average[1] + " 입니다.");
		System.out.println("수학의 총점은 "+ sum[2] + "이고, 평균은 "+ average[2] + " 입니다.");
	}
}
