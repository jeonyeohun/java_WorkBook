package WorkBook;
// 직사각형의 가로크기와 세로크기를 입력받아 이 값을 이용하여 직사각형의 넓이를 계산하고 
// 정사각형인지의 여부를 판정하여 함께 출력하라.
// 2018.12.27 Jeon, Yeo Hun

import java.util.Scanner;
public class B03_isRectanngle {
	public static void main (String[] args) {
		int width, height;
		int area;
		Scanner input = new Scanner(System.in);
		
		System.out.print("직사각형의 가로 크기를 입력하세요: ");
		width = input.nextInt();
		
		System.out.print("직사각형의 세로 크기를 입력하세요: ");
		height = input.nextInt();
		
		input.close();
		
		area = width * height;
		
		if (width==height) {
			System.out.println("직사각형의 넓이는 "+ area + " 이고");
			System.out.println("정사각형입니다.");
		}
		else {
			System.out.println("직사각형의 넓이는 "+ area + " 이고");
			System.out.println("정사각형이 아닙니다.");
		}
	}
}
