package WorkBook;
/*
 * 아이디와 비밀번호를 저장하는 클래스를 생성하여 입력받는 메소드와 출력하는 메소드를 생성하라
 * 
 * 2019.01.15 Jeon, Yeo Hun
 */

import java.util.Scanner;

class UserInfo3 {
	Scanner s = new Scanner(System.in);
	String ID;
	String pwd;
	
	void input() {
		System.out.print("학생의 아이디, 비밀번호를 입력하세요: --> ");
		ID = s.next();
		pwd = s.next();
	}
	void print() {
		System.out.println(ID + "\t " + pwd);
	}
}
public class K05_userList {
	public static void main (String[] args) {
		int cnt = 1;
		UserInfo3 obj = new UserInfo3();
		
		obj.input();
		System.out.println("==========================");
		System.out.println("등록된 학생 목록은 다음과 같습니다.");
		System.out.println("--------------------------");
		System.out.println("번호\t 아이디\t 비밀번호\t");
		System.out.print((cnt++) + "\t ");
		obj.print();
		
		
	}
}
