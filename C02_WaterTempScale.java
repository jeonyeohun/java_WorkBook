package WorkBook;
/*
 * 물의 온도를 입력받은 후, 이 물이 어느 정도의 온수인지 판정하여 그 결과를 출력하라. 단, 온수의 판정 구간은 다음과 같이 판정한다.
 * 음수값 (0미만) : 잘못입력
 * 0도 이상 ~ 25도 미만 : 냉수
 * 25도 이상 ~ 40도 미만 : 미온수
 * 40도 이상 ~ 80도 미만 : 온수
 * 80도 이상 : 끓는 물
 * 2018.12.28 Jeon, Yeo Hun
 */
import java.util.Scanner;
public class C02_WaterTempScale {
	public static void main (String[] args) {
		double input_degree;
		Scanner input = new Scanner(System.in);
		
		System.out.print("물의 온도를 입력하세요: ");
		input_degree = input.nextDouble();
		
		input.close();
		
		if(input_degree < 0) {
			System.out.println("잘못된 입력입니다.");
		}
		else if (input_degree < 25) {
			System.out.println("냉수입니다.");
		}
		else if (input_degree < 40) {
			System.out.println("미온수입니다.");
		}
		else if (input_degree < 80) {
			System.out.println("온수입니다.");
		}
		else {
			System.out.println("끓는 물입니다.");
		}
	}
}
