package WorkBook;
/*
 * 반복해서 0부터 100 사이의 숫자를 입력받아서 지금까지 입력된 숫자들이 모두 몇 개이며, 
 * 이 숫자들의 총 합계와 평균 값을 계산하여 출력하라. 
 * 0부터 100 사이의 숫자가 아닌 수가 입력되면 반복문이 중단되도록 하라.
 * 
 * 2018.12.31 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class D03_TotalandAvg {
	public static void main (String[] args) {
		int number;
		int count = 0;
		int totalsum = 0;
		double average;
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.print("0부터 100 사이의 숫자를 입력하세요: ");
			number = input.nextInt();
			if (number < 0 || number > 100) break; // number변수가 범위를 벗어날 경우 반복문 종료.
			
			totalsum = totalsum + number;
			count = count + 1;
		}
		
		input.close();
		
		average = totalsum / (double) count;		// 강제 형변환으로 double형으로 연산 후 저장.
		average = Math.round(average * 10)/10.0;	// 소수점 밑 한자리까지 반올림 
		
		System.out.println("입력한 "+ count + " 개의 숫자들의 총합계는 "+ totalsum +" 이고, 평균 값은 "+ average +" 입니다.");
	}
}
