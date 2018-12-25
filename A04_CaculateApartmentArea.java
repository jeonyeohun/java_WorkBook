package WorkBook;
import java.util.Scanner;

//아파트 분양 면적을 제곱미터 단위로 입력받아 이 값을 평형 단위의 값으로 변환하여 출력하라
// 단 평형 수 = 제곱미터 / 3.305 로 계산한다.
// 2018.12.24 전여훈 

public class A04_CaculateApartmentArea {
	public static void main(String[] args) {
		double m2_area;
		double pyung_area;
		Scanner input = new Scanner (System.in);
		
		System.out.print("아파트의 분양 면적을 입력하시오(m^2): ");
		m2_area = input.nextDouble();
		
		input.close();
		
		pyung_area = m2_area / 3.305;
		
		System.out.println("아파트의 평형은 "+ pyung_area + " 입니다.");
	}
}
