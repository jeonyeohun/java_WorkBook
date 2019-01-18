package WorkBook;

import java.util.Scanner;
public class L00_ArrayList {
	String name;
	int age;
	
	L00_ArrayList(String n, int a){
		this.name = n;
		this.age = a;
	}
	
	void print() {
		System.out.println(this.name + "\t" + this.age);
	}
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		L00_ArrayList u[] = new L00_ArrayList[5];
		for (int i=0 ; i<u.length ; i++) {
			System.out.print("사용자 이름을 입력하세요: ");
			String name = s.next();
			System.out.print("사용자 나이를 입력하세요: ");
			int age = s.nextInt();
			u[i] = new L00_ArrayList(name, age);
		}
		System.out.println("=========================");
		System.out.println("등록하신 사용자는 다음과 같습니다.");
		for (int i=0 ; i<u.length ; i++) {
			u[i].print();
		}
		s.close();
	}
}
