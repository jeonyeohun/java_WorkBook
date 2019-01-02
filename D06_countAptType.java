package WorkBook;
/*
 * 아파트 10채의 분양 면적을 제곱미터(m2) 단위로 입력받아 이 값을 평형 단위의 값으로 변환하여 평형 수 에 따라 아파트의 종류를 구분하여 종류별로 개수를 센 후, 그 결과를 출력하라.
 * 단, 평형 수 = 제곱미터 / 3.305 로 계산하고, 크기에 따른 아파트 종류는 다음과 같이 판정한다.
 * 15평 미만 : 소형
 * 15평 이상 ~ 30평 미만 : 중소형
 * 30평 이상 ~ 50평 미만 : 중형
 * 50평 이상 : 대형
 * 반복문은 for 구문을 사용
 * 
 * 2019.01.02 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class D06_countAptType {
	public static void main(String[] args) {
		double m2_area;	// 면적(제곱미터)
		double pyung_area; // 면적(평수)
		int count1=0;	// 소형 아파트 개수
		int count2=0; // 중소형 아파트 개수
		int count3=0; // 중형 아파트 개수 
		int count4=0; // 대형 아파트 개수
		int i;	// 반복문 변수 
		Scanner input = new Scanner(System.in);
		
		for (i=0 ; i<10 ; i++) {
			System.out.print("아파트의 분양 면적(제곱미터)을 입력하세요: ");
			m2_area = input.nextDouble();
			
			pyung_area =  Math.round(m2_area / 3.305 * 10)/ 10.0; // 소수점 밑 10의 자리까지 반올림하여 연산
			
			System.out.println("-->이 아파트의 평형은 "+ pyung_area + " 입니다.");
			
			if (pyung_area < 15) {	// 연산 결과가 15 미만이라면 
				count1++;	// 소형 아파트 개수 1 증가
			}
			else if (pyung_area < 30) { // 15이상 30 미만 
				count2++;	// 중소형 아파트 개수 1 증가
			}
			else if (pyung_area < 50) { // 30이상 50 미만
				count3++;	// 중형 아파트 개수 1 증가 
			}
			else {	// 50 이상
				count4++;	// 대형 아파트 개수 1 증가 
			}
		}
		
		input.close();
		System.out.println("소형 아파트의 개수는 "+ count1 + " 입니다.");
		System.out.println("중소형 아파트의 개수는 "+ count2 + " 입니다.");
		System.out.println("중형 아파트의 개수는 "+ count3 + " 입니다.");
		System.out.println("대형 아파트의 개수는 "+ count4 + " 입니다.");
	}

}
