package WorkBook;
/*
 * 숫자를 하나 입력받은 후에 이 숫자만큼의 크기를 갖는 정사각형을 '#' 문자로 화면에 출력하라. 
 * 예를 들어 10을 입력하면 10개의 '#' 문자가 들어있는 라인 10개를 출력하는 것이다.
 * 
 * 2019.01.02 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class E01_printRect {
	public static void main (String[] args) {
		int length; // 입력받은 정사각형 한 변의 길이 
		int i, j;	// 반복문 사용을 위한 변수 
		Scanner input = new Scanner(System.in);
		
		System.out.print("정사각형의 크기를 입력하시오: ");
		length = input.nextInt();
		
		input.close();
		
		for (i=0 ; i<length ; i++) {
			for (j = 0 ; j< length ; j++) {
				System.out.print("# ");
			}
			System.out.print("\n");
		}
	}
}
