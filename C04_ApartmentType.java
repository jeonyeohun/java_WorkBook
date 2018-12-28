package WorkBook;
/*
 * 아파트의 분양 면적을 제곱미터(m2) 단위로 입력받아 이 값을 평형 단위의 값으로 변환하라. 
 * 그리고 평형 수에 따라 아파트의 종류를 구분하여 그 결과를 출력하라.
 * 단, 평형 수 = 제곱미터 / 3.305 로 계산하고, 크기에 따른 아파트 종류는 다음과 같이 판정한다.
 * 15평 미만 : 소형
 * 15평 이상 ~ 30평 미만 : 중소형
 * 30평 이상 ~ 50평 미만 : 중형
 * 50평 이상 : 대형
 * 
 * 2018.12.28 Jeon, Yeo Hun
 */
import java.util.Scanner;
public class C04_ApartmentType {
	public static void main (String[] args) {
		double m2_area;
		double pyung_area;
		Scanner input = new Scanner (System.in);
		
		System.out.print("아파트의 분양 면적(제곱미터)을 입력하시오: ");
		m2_area = input.nextDouble();
		
		input.close();
		
		pyung_area = Math.round(m2_area / 3.305 * 10)/10.0;
		
		System.out.println("아파트의 평형은 "+ pyung_area + " 입니다.");
		
		if (pyung_area < 15) {
			System.out.println("소형 아파트입니다.");
		}
		else if (pyung_area < 30) {
			System.out.println("중소형 아파트입니다.");
		}
		else if (pyung_area < 50) {
			System.out.println("중형 아파트입니다.");
		}
		else {
			System.out.println("대형 아파트입니다.");
		}
	}
}
