package WorkBook;


import java.util.Scanner;

class userInfo{	// 메소드를 담고있는 상위 클래스
	String name;
	String address;
	int age;
	
	void input() {	// 사용자에게 정보를 입력받는 메소드
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

class K00_classExerc1{
	public static void main (String args[]) {
		userInfo user1 = new userInfo();	// 인스턴스 생성
		user1.input(); // 클래스 내의 메소드 호출
		user1.print();
	}
}
