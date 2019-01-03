package WorkBook;
/*
 * 
 * 심사점수를 10개 입력받아 리스트에 저장한 후, 
 * 이 중에서 가장 큰 점수와 가장 작은 점수를 제외한 8개의 점수에 대한 평균을 계산하여 출력하라.
 * 
 * 2019.01.03 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class F02_findAvg {
	public static void main (String[] args) {
		double score[] = new double[10]; // 심사점수 리스트
		double maxscore=0;
		double minscore=0;;	// 가장 큰 점수, 가장 작은 점수
		double total=0;		// 점수 총 합계 
		double average;	// 평균점수 
		double newnum;	// 숫자 입력 변수
		int i;	// 반복문 변수 
		Scanner s1 = new Scanner(System.in);
		
		// 10개의 점수 입력받기 
		for (i=0 ; i<10 ; i++) {
			System.out.print(i+1 + "번 심사점수를 입력하세요: ");
			newnum = s1.nextDouble();
			
			score[i] = newnum;
			total = total + newnum;
			
			if (i==0) {	// 입력받은 값이 첫 인덱스 값이라면 가장 큰 값과 가장 작은 값을 모두 score[0]의 값으로 설정 
				maxscore = score[i];
				minscore = score[i];
			}
			else {	// 두 번째 부터는 입력받은 값을 계속 비교해서 가장 큰수와 가장 작은수를 업데이트한다.
				if (score[i] > maxscore) {
					maxscore = score[i];
				}
				if (score[i] < minscore) {
					minscore = score[i];
				}
			}
		}
		
		s1.close();
		total = total-maxscore-minscore;	// 가장 큰수와 가장 작은 수를 전체 합계에서 빼주고 평균 연산.
		average = Math.round(total/8.0 * 10) / 10.0;
		
		System.out.println("가장 큰 점수와 가장 작은 점수를 제외한 8개의 점수에 대한 평균은 "+ average + " 입니다.");
	}
}
