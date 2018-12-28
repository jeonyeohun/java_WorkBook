package WorkBook;
/*
 * 직사각형의 가로크기와 세로크기를 입력받아 이 값을 이용하여 직사각형의 모양에 대해 평가하는 내용을 출 력하라.
 * 단, 평가 내용은 다음 중 1가지 경우로 결정한다.
 * 가로 크기와 세로크기가 동일 : "정사각형입니다."
 * 가로 크기가 세로크기의 2배 이상 : "좌우로 길쭉한 직사각형입니다." 
 * 세로 크기가 가로크기의 2배 이상 : "위아래로 길쭉한 직사각형입니다." 
 * 가로 크기가 세로크기보다 크면 : "일반적인 가로형 직사각형입니다" 
 * 세로 크기가 가로크기보다 크면 : "일반적인 세로형 직사각형입니다"
 * 
 * 2018.12.28 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class C03_ShapofRect {
	public static void main (String[] args) {
		int width, height;
		Scanner input = new Scanner(System.in);
		
		System.out.print("직사각형의 가로 크기를 입력하시오: ");
		width = input.nextInt();
		
		System.out.print("직사각형의 세로 크기를 입력하시오: ");
		height = input.nextInt();
		
		input.close();
		
		if (width == height) {
			System.out.println("정사각형입니다.");
		}
		else if (width >= height*2) {
			System.out.println("좌우로 길쭉한 직사각형입니다.");
		}
		else if (height >= width*2) {
			System.out.println("위아래로 길쭐한 직사각형입니다.");
		}
		else if (width > height) {
			System.out.println("일반적인 가로형 직사각형입니다.");
		}
		else if (height > width) {
			System.out.println("일반적인 새로형 직사각형입니다.");
		}
	}
}
