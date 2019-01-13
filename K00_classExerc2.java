package WorkBook;

import java.util.Scanner;

class userInfo2{
	String name;
	String address;
	int age;
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		name = s.next();
		
		System.out.print("주소를 입력하세요 : ");
		address = s.next();
		
		System.out.print("나이를 입력하세요 : ");
		age = s.nextInt();
	}
	
	void print() { // 설정된 정보를 출력하는 메소드
		System.out.println("이름은 : " + name);
		System.out.println("주소는 : " + address);
		System.out.println("나이는 : " + age);
	}
}

public class K00_classExerc2 {
	public static void main (String[] args) {
		Scanner s =  new Scanner(System.in);
		int usercount = 0;
		userInfo2 user[] = new userInfo2[5];
		for (int i=0 ; i < user.length ; i++) {	// 총 5명의 정보를 입력받을 수 있음
			user[i] = new userInfo2();
		}
		
		while(true) {
			System.out.print("원하는 메뉴를 입력하세요 (1: 입력, 2: 출력, 3: 종료) : ");
			int menu = s.nextInt();
			if (menu == 1) {
				user[usercount].input();
				usercount++;
			}
			else if(menu == 2) {
				for (int i=0 ; i<usercount ; i++) {
					user[i].print();
				}
			}
			else if(menu == 3) {
				break;
			}
		}
		
	}
}
