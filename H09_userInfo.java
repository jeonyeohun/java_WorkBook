package WorkBook;
/*
 * 아래와 같은 포맷으로 사용자 정보를 입력하면 그 정보를 split 함수를 이용하여 분리한 후, 
 * 결과 예시 화면 처럼 화면에 출력하라.
 * 
 * 2019.01.08 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class H09_userInfo {
	public static void main (String[] args) {
		String input;			// 입력받는 문자열(사람들 간은 ### 로 구분, 이름과 성별은 | 로 구분)
		String userList[];		// 사용자 리스트 
		String userInfo[];		// 한 사람의 정보
		int i;
		Scanner s1 = new Scanner (System.in);
		
		while(true) {
			System.out.println("========================");
			System.out.print("문자열을 입력하세요 (x: 종료): ");
			input = s1.next();
			
			// 종료 조건
			if (input.equals("x")) {
				break;
			}
			
			// "###" 기준으로 잘라서 문자열 리스트 생성
			userList = input.split("###");
			
			System.out.println("=> 총 "+ userList.length + "명이 등록되었습니다.");
			
			for (i=0 ; i<userList.length ; i++) {
				// "!" 기준으로 잘라서 문자열 리스트 생성  및 결과 출력
				userInfo = userList[i].split("!");
				System.out.println((i+1) + " " + userInfo[0] + " " + userInfo[1]);
			}
			
		}
		
		// 종료 메세지
		System.out.println("* 종료되었습니다.");
		s1.close();
	}
}
