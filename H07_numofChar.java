package WorkBook;
/*
 * 문자열을 입력받아 입력받은 문자의 개수를 출력하고, 각 문자를 한 줄에 하나씩 출력하라. 
 * 프로그램은 입력 받는 문자열에 x가 들어오면 종료되도록 한다.
 * 
 * 2019.01.08 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class H07_numofChar {
	public static void main (String[] args) {
		String input;
		int i;
		Scanner s1 = new Scanner(System.in);
		
		
		while(true) {
			// 시작 메뉴 
			System.out.println("=================================");
			System.out.print("=> 문자열을 입력하세요(x: 종료) : " );
			input =  s1.next();
			
			// 종료조건 
			if (input.equals("x")) {
				break;
			}
			
			// 총 문자의 개수 출력
			System.out.println("=> 총 문자의 개수는 "+ input.length() + "개 입니다." );
			
			// 문자 하나씩 끊어서 출력>> charAt(indexNum) 메소드 사용
			for (i=0 ; i<input.length() ; i++) {
				System.out.println("=> " + input.charAt(i));
			}
		}
		
		System.out.println("* 종료되었습니다.");
		s1.close();
	}
}
