package WorkBook;
/*
 * 신장(cm단위)과 체중(kg단위)를 입력받은 후, 비만 여부를 판정하여 출력하라.
 * 단, 비만여부는 다음 비만도 수치가 25이상인 경우에 "비만"으로 판단한다.
 * 비만도 수치 = 체중(kg) / (신장(m)의 제곱) 으로 계산한다. 
 * 이 때, 신장은 미터 단위로 환산해야 함을 유의하라.
 * 2018.12.28 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class B09_CalculateBMI {
	public static void main (String[] args) {
		double height; 
		int weight; // 신장(cm), 체중(kg)
		int bmi; // 비만도 수
		Scanner input =  new Scanner (System.in);
		
		System.out.print("신장(cm단위)을 입력하세요: ");
		height = input.nextDouble();
		height = height/100.0;
		
		System.out.print("체중(kg단위)을 입력하세요: ");
		weight = input.nextInt();
		
		input.close();
		
		bmi = weight / (int)(height * height);
		
		if(bmi >= 25) {
			System.out.print("당신은 비만이십니다.");
		}
		else {
			System.out.print("당신은 비만이 아니군요.");
		}
	}
}
