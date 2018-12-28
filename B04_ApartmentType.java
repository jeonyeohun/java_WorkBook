package WorkBook;

import java.util.Scanner;

/*
 * 아파트의 분양 면적을 제곱미터(m2) 단위로 입력받아 이 값을 평형 단위의 값으로 변환하라. 
 * 그리고 평형 수에 따라 아파트의 종류가 작은 아파트인지 큰 아파트인지 판정하여 판정 결과를 출력하라.
 * 단, 평형 수 = 제곱미터 / 3.305 로 계산하고, 30평 미만이면 작은 아파트 30평 이상이면 큰 아파트로 판정한다.
 */

// 2018.12.28 Jeon, Yeo Hun

public class B04_ApartmentType {
	public static void main (String[] args) {
		double m2_area;
		double pyung_area;
		Scanner input = new Scanner (System.in);
		
		System.out.print("아파트의 분양 면적을 제곱미터로 입력하시오: ");
		m2_area = input.nextDouble();
		
		input.close();
		
		pyung_area = m2_area / 3.305;
		
		pyung_area = Math.round(pyung_area*10)/10.0;
		
		System.out.println("아파트의 평형은 " + pyung_area + " 이고.");
		
		if (pyung_area < 30) {
			System.out.println("30평 미만이므로 작은 아파트입니다.");
		}
		else {
			System.out.println("30평 이상이므로 큰 아파트입니다.");
		}
	}
}
