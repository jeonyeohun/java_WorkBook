package WorkBook;
/*
 * 10명의 신장(cm단위)과 체중(kg단위)를 입력받은 후, 
 * 이들 중 몇 번째 사람들이 비만인지를 판정하여 출력하라. 그리고 도합 몇 명이 비만인지 출력하라.
 * 단, 비만여부는 다음 비만도 수치가 25이상인 경우에 "비만"으로 판단한다.
 * 비만도 수치 = 체중(kg) / (신장(m)의 제곱) 으로 계산한다. 이 때, 신장은 미터 단위로 환산해야 함을 유의하라.
 * 
 * 2019.01.03 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class F05_findObesity {
	public static void main (String[] args) {
		int height, weight;					// 입력받은 신장, 체중 
		int bmi;							// 비만도 수치 
		int bmilist[][] =  new int[10][3];	// 10명에 대한 신장, 체중, 비만도 수치를 담고있는 리스트 
		int count=0;							// 비만인 사람의 숫자 
		int i;
		Scanner s1 = new Scanner(System.in);
		
		// 정보 입력받기
		for (i=0 ; i<10 ; i++) {
			System.out.print(i+1 + "번째 사람의 신장(cm)과 체중(kg)을 입력하세요: ");
			height = s1.nextInt();
			weight = s1.nextInt();
			 
			bmi = (int) (weight / ((height*0.01) * (height*0.01)));	// bmi 계산 
			
			bmilist[i][0] = height;
			bmilist[i][1] = weight;
			bmilist[i][2] = bmi;
		}
		s1.close();
		
		// 비만인 사람 찾기 
		for (i=0 ; i<10 ; i++) {
			if(bmilist[i][2] >= 25) {
				System.out.println(i+1 + "번째 사람은 비만입니다.");
				count++;
			}
		}
		System.out.println("총 "+count+"명의 사람이 비만입니다.");
	}
}
