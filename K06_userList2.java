package WorkBook;
/*
 * K05에서 만든 UserInfo 클래스를 변경하지 않고, 
 * 10명의 아이디와 비밀번호를 저장하는 클래스를 생성하 여 입력받는 메소드와 출력하는 메소드를 생성하라.
 * 
 * 2019.01.15 Jeon, Yeo Hun
 */

import java.util.Scanner;

// 같은 패키지 내에 있으면 다른 파일에서 선언된 class를 불러와서 사용할 수 있다.
public class K06_userList2 {
	public static void main (String[] args) {
		int max;
		int i;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("등록할 학생 명수는? ");
		max = s.nextInt();
		
		UserInfo3[] obj = new UserInfo3[max];
		
		for(i=0 ; i<max ; i++) {
			System.out.print((i+1) + "번 ");
			obj[i] = new UserInfo3();
			obj[i].input();
		}
		
		System.out.println("등록된 " + max + "명의 학생 목록은 다음과 같습니다.");
		System.out.println("--------------------------");
		System.out.println("번호\t 아이디\t 비밀번호\t");
		
		
		for(i=0 ; i<max ; i++) {
			System.out.print((i+1) + "\t ");
			obj[i].print();
		}
		
		s.close();
	}
}