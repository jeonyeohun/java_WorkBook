package WorkBook;
/*
 * 10명의 신장(cm단위)과 체중(kg단위)를 입력받으면서 
 * AskBiman() 메소드를 통해 이들이 비만도를 출력 하고 다음 기준에 따라 비만여부를 판정하여 출력하라.
 * 비만도 수치 = 체중(kg) / (신장(m)의 제곱) 으로 계산한다. 
 * 이 때, 신장은 미터 단위로 환산해야 함을 유 의하라.
 * 비만도 수치에 따른 비만도 판정 
 * 1. 18.5 미만 : 저체중
 * 2. 18.5 ~ 23 미만 : 정상체중 
 * 3. 23~25미만 : 과체중
 * 4. 25~30미만 : 경도비만 
 * 5. 30이상 : 고도비만
 * 
 * 2019.01.10 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class I03_detemineObesity {
	void AskBiman(int height, int weight) {
		int bmi;
		bmi = (int)(weight/Math.pow((height * 0.01), 2));
		
		if (bmi < 18.5) {
			System.out.println("저체중 입니다.");
		}
		else if (bmi < 23) {
			System.out.println("정상체중 입니다.");
		}
		else if (bmi < 25) {
			System.out.println("과체중 입니다.");
		}
		else if (bmi < 30) {
			System.out.println("경도비만 입니다.");
		}
		else {
			System.out.println("고도비만 입니다.");
		}
	}
	
	public static void main (String[] args) {
		int height;
		int weight;
		Scanner s = new Scanner(System.in);
		I03_detemineObesity obj = new I03_detemineObesity();
		
		for (int i=0 ; i<10 ; i++) {
			System.out.print((i+1)+"번째 사람의 신장(cm)과 체중(kg)을 입력하시오: ");
			height = s.nextInt();
			weight = s.nextInt();
			obj.AskBiman(height, weight);
		}
		s.close();
	}

}
