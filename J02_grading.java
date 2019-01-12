package WorkBook;
/*
 * 심사점수를 10개를 입력받아 리스트에 저장한 후, 
 * 이 리스트를 파라미터로 하여 가장 큰 점수를 구하는 Max()와 가장 작은 점수를 구하는 Min()을 사용하여 
 * 10개의 점수 중 최대점수와 최소점수를 제외한 8개 의 점수에 대한 평균을 계산하여 출력하라.
 * 
 * 2019.01.12 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class J02_grading {
	double Max(double num[]) {	// 최댓값 리턴
		double max = num[0];
		
		for (int i=0 ; i<10 ; i++) {
			if (max<num[i]) {
				max = num[i];
			}
		}
		return max;
	}
	
	double Min(double num[]) { // 최솟값 리턴
		double min = num[0];
		
		for (int i=0 ; i<10 ; i++) {
			if(min>num[i]) {
				min = num[i];
			}
		}
		return min;
	}
	
	public static void main (String[] args) {
		double num[] = new double[10];
		double avg;
		double sum=0;
		double min, max;
		boolean minflag = true;
		boolean maxflag = true;
		J02_grading obj = new J02_grading();
		Scanner s = new Scanner(System.in);
		
		// 10개의 점수 입력받기
		for (int i=0 ; i<10 ; i++) {
			System.out.print((i+1) + "번 심사점수를 입력하시오: ");
			num[i] = s.nextDouble();
		}
		
		// 최댓값과 최솟값 찾기
		min = obj.Min(num);
		max = obj.Max(num);
		
		// 최댓값과 최솟값을 제외한 8개의 점수의 평균
		// 최댓값이나 최솟값과 중복되는 점수가 여러개 있을 경우 한번만 걸러내고 총 점수에 포함 시키기 위해 max와 min에 대한 flag 변수 두개를 선언함. 
		for (int i=0 ; i<10 ; i++) {
			if (num[i] == min && minflag == true) {
				minflag = false;
				continue;
			}
			else if (num[i] == max && maxflag == true) {
				maxflag = false;
				continue;
			}
			sum += num[i];
		}
		
		
		// 평균값 계산 및 결과 출력
		avg = Math.round(sum/8.0*10)/10.0;
		System.out.println("가장 큰 점수와 가장 작은 점수를 제외한 8개의 점수에 대한 평균은 " + avg + "입니다.");
		s.close();
	}

}
