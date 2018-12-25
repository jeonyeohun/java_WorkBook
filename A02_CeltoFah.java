package WorkBook;

//섭씨 온도를 입력받아 이 값을 화씨 온도로 변환하여 출력하는 프로그램
//화씨 온도 = 섭씨 온도 * 1.8 + 32 로 계산한다.
// 2018.12.24 전여훈 

import java.util.Scanner;

public class A02_CeltoFah {
	public static void main (String[] args) {
		double c_degree; //섭씨온도 
		double f_degree; //화씨온도 
		Scanner input = new Scanner(System.in);
		
		System.out.print("섭씨 온도를 입력하세요: ");
		c_degree = input.nextDouble();
		
		f_degree = c_degree * 1.8 + 32;
		
		System.out.println("화씨 온도는 "+ f_degree + " 도 입니다.");
		input.close();
		
	}
}
