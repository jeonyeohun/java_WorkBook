package WorkBook;
/*
 * 파라미터로 문자 하나와 숫자 두 개를 넘겨주면 한 줄에 첫 번째 숫자만큼 빈칸을 출력한 후, 
 * 바로 이어서 두 번째 숫자만큼 넘겨받은 문자를 화면에 출력하는 메소드를 만들어라. 
 * 그리고 사용자로부터 모양(문자 하 나)과 높이, 여백을 입력받은 후, 
 * 이 메소드를 사용해서 입력한 크기만큼의 여백과 높이를 갖는 우직각 삼각 형을 입력한 문자모양으로 화면에 출력시켜라.
 * 
 * 2019.01.10 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class I02_rightTri {
	void printCharWithBlank(int blanks, int size, char ch) {
		
		// 직각삼각형 그리기
		for (int i=1 ; i<size ; i++) {
			for (int j=0 ; j<blanks+size-i ; j++) { 
				System.out.print(" ");
			}
			for (int k = 0 ;k <i ; k++) {
				System.out.print(ch);
			}
			System.out.print("\n");
		}
	}
	
	public static void main (String[] args) {
		Scanner s1 = new Scanner(System.in);
		int blank;
		int size;
		char ch;
		
		// 정보 입력받기
		System.out.print("직각 삼각형을 그리는데 사용할 문자를 입력하시오: ");
		ch = s1.next().charAt(0);
		System.out.print("직각 삼각형의 높이와 왼쪽 여백의 크기를 입력하시오: ");
		size = s1.nextInt();
		blank = s1.nextInt();
		
		
		
		// 인자로 정보전달
		I02_rightTri obj = new I02_rightTri();
		
		obj.printCharWithBlank(blank, size, ch);
		s1.close();
	}
}
