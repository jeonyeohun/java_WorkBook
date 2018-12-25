package WorkBook;
import java.util.Scanner;

// 직사각형의 가로크기와 세로크기를 입력받아 이값을 이용하여 직사각형의 넓이를 계산하고 출력하라
// 직사각형의 넓이 = 가로크기 * 세로크기 로 계산한다.
// 2018.12.24 전여훈

public class A03_CalculateRectArea {
	public static void main (String[] args) {
		int width;
		int height;
		int area;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("직사각형의 가로 크기를 입력하시오: ");
		width = input.nextInt();
		
		System.out.print("직사각형의 세로 크기를 입력하시오: ");
		height = input.nextInt();
		
		input.close();
		
		area = width * height;
		
		System.out.println("직사각형의 넓이는 " + area + " 입니다.");
	}
}
