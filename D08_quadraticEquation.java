package WorkBook;
/*
 * 2차 메소드 y=ax^2+bx+c에 대해 계수 a와 b와 c를 입력받은 후, 
 * x값의 시작값과 마지막 값을 입력받아 이 두 수 사이의 x값에 대한 2차 메소드의 (x, y) 좌표들을 출력하라.
 * 반복문은 for 구문을 사용
 * 
 * 2019.01.02 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class D08_quadraticEquation {
	public static void main (String[] args) {
		int a, b, c; // 2차 함수의 계수 a, b, c
		int x_begin, x_end; // x좌표의 시작 값과 끝 값
		int x, y; // 좌표 값
		Scanner input = new Scanner(System.in);
		
		System.out.print("2차 함수 y=ax^2+bx+c 의 계수 a와 b, c를 입력하시오: ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		System.out.print("x 좌표의 시작 값과 끝 값을 입력하시오: ");
		x_begin = input.nextInt();
		x_end = input.nextInt();
		
		input.close();
		
		for (x = x_begin ; x <= x_end ; x++) {
			y = a * (x*x) + b * x + c;		// 값을 2차 함수 방정식에 대입해서 값 구하기 
			System.out.println("좌표 ("+ x +" ,"+ y + ")");
		}
		
	}
}
