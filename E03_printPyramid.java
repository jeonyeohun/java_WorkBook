package WorkBook;
/*
 * 숫자를 하나 입력받은 후에 이 숫자만큼의 높이를 갖는 이등변삼각형을 '*' 문자로 화면에 출력하라. 
 * 예를 들어 10을 입력하면 첫 줄에는 1개, 2번째 줄에는 3개, 3번째 줄에는 5개, ..., 10번째 줄에는 19개의 '*' 을 가운데 정렬한 모습으로 출력하는 것이다.
 * 
 * 2019.01.02 Jeon, Yeo Hun 
 */

import java.util.Scanner;
public class E03_printPyramid {
	public static void main (String[] args) {
		int height;
		int i, j;
		Scanner input = new Scanner (System.in);
		
		System.out.print("이등변 삼각형의 높이를 입력하시오: ");
		height = input.nextInt();
		
		input.close();
		
		for (i=1 ; i<height ; i++) {
			for (j = 0 ; j<height-i  ; j++) {
				System.out.print(" ");
			}
			for (j=1 ; j<i*2 ; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
