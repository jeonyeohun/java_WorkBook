package WorkBook;
/*
 * 학생 5명의 국어, 영어, 수학 점수를 각각 입력받아 저장한 후에, 
 * 각 과목별 총점과 평균 점수를 계산하여 출력하라.
 * 
 * 2019.01.03 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class F04_subjectTotalandAvg2 {
	public static void main (String[] args) {
		int jumsu[][] = new int[5][3]; // 5명의 3과목 점수를 저장하는 리스트
		int sum[] = new int [5];	// 3과목 총점 리스트 
		double average[] = new double[5];	// 3과목 평균 리스트
		int i, j;	// 반복문 변수
		Scanner s1 = new Scanner(System.in);
		
		for (i=0 ; i<5 ; i++) {
			System.out.print(i+1 + "번 학생의 국어, 영어, 수학 점수를 입력하세요: ");
			jumsu[i][0] = s1.nextInt();
			jumsu[i][1] = s1.nextInt();
			jumsu[i][2] = s1.nextInt();
		}
		
		s1.close();
		
		// 총점 리스트에 학생별로 총점을 계산하여 저장, 한명의 총점계산이 끝날 때마다 3으로 나누어 평균 계산 후 평균 리스트에 저장.
		for (i =0 ; i<5 ; i++) {
			for (j=0 ; j<3 ; j++) {
				sum[i] = sum[i] + jumsu[i][j];
			}
			average[i] = Math.round(sum[i]/3.0*10)/10.0;
		}
		
		//
		for (i =0 ; i<5 ; i++) {
			System.out.println(i+1 + "번 학생의 총점은 "+ sum[i] + "이고, 평균은 "+ average[i] + " 입니다.");
		}
	}
}
