package WorkBook;
/*
  온도를 입력받은 후, 이 값이 섭씨온도인지 화씨온도인지 종류를 C또는 F로 입력받아 섭씨온도이면 화씨온 도로 변환하고, 화씨온도이면 섭씨온도로 변환하여 그 값을 출력하라.
  단, 화씨온도 = 섭씨온도 * 1.8 + 32, 섭씨온도 = (화씨온도 – 32)/1.8 로 계산한다.
*/
// 2018.12.27 Jeon, Yeo Hun

import java.util.Scanner;
public class B02_TempCalculator {
	public static void main(String[] args) {
		int input_degree;
		String kind;
		double output_degree = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("온도를 입력하세요: ");
		input_degree = input.nextInt();
		
		System.out.print("입력하신 온도가 섭씨온도이면 C를, 화씨온도이면 F를 입력하세요: ");
		kind = input.next();
		
		input.close();
		
		if (kind.equals("C")) { //문자열 비교는 equals 메소드 사용 
			output_degree = input_degree * 1.8 +32; 
		}
		else if(kind.equals("F")) {
			output_degree = (input_degree-32)/1.8;
		}
		else {
			System.out.println("잘못된 입력입니다.");
		}
		System.out.println("변환된 온도는 "+ output_degree + " 도 입니다.");
	}
}
