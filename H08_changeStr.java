package WorkBook;
/*
 * 사용자에게 문자열과 찾을 문자열, 바꿀 문자열을 입력 받아서 원본 문자열에서 찾을 문자열을 찾을 후 
 * 바꿀 문자열로 변경하도록 한다. 이때 몇 번 변경되었는지 출력하도록 한다. 
 * 프로그램은 입력받는 문자열에 x가 들어오면 종료되도록 한다.
 * 
 * 2019.01.08 Jeon Yeo Hun
 */

import java.util.Scanner;
public class H08_changeStr {
	public static void main (String[] args) {
		String input;		// 입력받는 문자열 
		String findStr;		// 찾을 문자열
		String replaceStr;	// 반복문에 사용되는 변수
		int cnt=0;
		Scanner s1 = new Scanner (System.in);
		
		while(true) {
			// 시작메뉴	>> 공백을 포함하여 문자열 입력기는 .nextLine();
			System.out.println("============================");
			System.out.println("문자열을 입력하세요 (x: 종료): ");
			input = s1.nextLine();
			
			// 종료 조건
			if (input.equals("x")) break;
			
			// 찾을 문자열, 바꿀 문자열 입력받기 
			System.out.print("=> 찾을 문자열을 입력하세요: ");
			findStr = s1.nextLine();
			System.out.print("=> 바꿀 문자열을 입력하세요: ");
			replaceStr = s1.nextLine();
			
			
			// 문자열 몇번 바뀌는지 카운트
			int index = 0;
			while (true){
				index = input.indexOf(findStr, index+1);	// indexOf 는 가장 처음 발견된 문자열의 시작 인덱스를 반환하기 때문에 그 인덱스 이후부터 다시 찾으면 된다. -1은 일치하는 값이 없다는 것을 의미
				if (index == -1) {
					break;
				}
				else {
					cnt++;
				}
			}
			
			// 문자열 바꿔주기
			input = input.replace(findStr, replaceStr);
			
			// 바꾼 결과 출력
			System.out.println("\n\n=> 총 "+ cnt + "번 바뀌었습니다.");
			System.out.println("=> " + input + "\n\n");
		}
		
		// 종료메세지 출력
		System.out.println("* 종료되었습니다.");
		s1.close();
		
	}
}
