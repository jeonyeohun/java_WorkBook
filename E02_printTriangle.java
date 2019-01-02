package WorkBook;
/*
 * 높이와 여백을 정하는 숫자 두 개를 입력받은 후에 
 * 이 숫자만큼의 높이와 왼쪽 여백을 갖는 우직각 삼각형을 '*' 문자로 화면에 출력하라. 
 * 예를 들어 10을 입력하면 첫 줄에는 1개, 2번째 줄에는 2개, 3번째 줄에는 3 개, .. 
 * 10번째 줄에는 10개의 '*' 을 왼쪽 여백을 가진 우측 정렬된 모습으로 출력하는 것이다.
 * 
 * 2019.01.02 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class E02_printTriangle {
	public static void main (String[] args) {
		int height;	// 입력받은 높이 
		int blank;	// 입력받은 여백 크기 
		int i,j;	// 반복문 변수 
		Scanner input = new Scanner(System.in);
		
		System.out.print("직각 삼각형의 높이와 왼쪽 여백의 크기를 입력하세요: ");
		height = input.nextInt();
		blank = input.nextInt();
		
		input.close();
		
		for (i=1 ; i<height ; i++) {
			for (j=blank+height ; j>i ; j--) { // 문제가 이상하긴 한데 입력받은 왼쪽 여백 + 높이로 연산해야 결과가 나옴.
				System.out.print(" ");
			}
			for (int k = 0 ;k <i ; k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}

// 아무래도 가장 마지막줄의 여백이 blank값인 것 같다.. 
