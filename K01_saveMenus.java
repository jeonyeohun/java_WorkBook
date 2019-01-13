package WorkBook;
/*
 * 다음 결과 예에서와 같이 메뉴 내용을 입력받은 후, 
 * 화면에 출력하는 프로그램을 제작하고 테스트하라.(멤버 변수와 메소드 및 파라미터, 리턴타입은 각자 결정함)
 * 
 * 2019.01.13 Jeon, Yeo Hun
 */
import java.util.Scanner;

class MenuPan{
	int num;
	String name;
	String origin;
	int price;
	Scanner s = new Scanner (System.in);
	
	
	void add () {
		System.out.print("메뉴의 번호, 메뉴명, 원산지, 가격을 입력하세요: ");
		num = s.nextInt();
		name = s.next();
		origin = s.next();
		price = s.nextInt();
	}
	
	void print() {
		System.out.print(num + "\t" + name + "\t" + origin + "\t" + price);
	}
}

public class K01_saveMenus {
	public static void main (String[] args) {
		MenuPan m = new MenuPan();
		
		m.add();
		System.out.println("=================================");
		System.out.println("메뉴번호\t메뉴이름\t원산지\t1인분 가격");
		m.print();
	}
}
