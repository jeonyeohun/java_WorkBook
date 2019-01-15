package WorkBook;
/*
 * K01에서 만든 MenuPan을 변경하지 않고, 다음에서와 같이 다섯 개의 메뉴를 입력할 수 있도록 프로그램 을 제작하고 테스트하라.(멤버변수와 메소드 및 파라미터, 리턴타입은 각자 결정함)
 * main 메소드 포함 클래스 명 : K02
 * 
 * 2019.01.14
 */

import java.util.Scanner;

// 메뉴 저장 및 출력 메소드를 포함하는 클래스 
class MenuPan2{
		int num;
		String name;
		String origin;
		int price;
		Scanner s = new Scanner (System.in);
		
		// 메뉴 추가 메소드 
		void add () {
			System.out.print("메뉴의 번호, 메뉴명, 원산지, 가격을 입력하세요: ");
			num = s.nextInt();
			name = s.next();
			origin = s.next();
			price = s.nextInt();
		}
		
		// 메뉴 출력 메소드
		void print() {
			System.out.println(num + "\t" + name + "\t" + origin + "\t" + price);
		}
	}

public class K02_saveMenus {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int cnt;
		int i;
		
		System.out.print("등록하실 메뉴의 개수를 입력하세요 : ");
		cnt = s.nextInt();
		
		MenuPan2[] m = new MenuPan2[cnt];
		
		// 입력받은 메뉴의 개수만큼 인스턴스를 생성하면서 메뉴 정보 받기
		for (i=0 ; i<cnt ; i++) {
			m[i] = new MenuPan2();
			m[i].add();
		}
	
		// 저장 되어 있는 모든 메뉴 출력
		System.out.println("=================================");
		System.out.println("메뉴번호\t메뉴이름\t원산지\t1인분 가격");
		for (i=0 ; i<cnt ; i++) {
			m[i].print();
		}
		
		s.close();
	}
}
