package WorkBook;
//  메뉴에 따라 데이터를 입력받거나, 삭제하거나, 리스트를 보여주는 프로그램을 객체지향으로 제 작하라.

import java.util.*;

class menuList {
	String name;
	String origin;
	int price;
	

	
	void add() {
		ArrayList<menuList> u = new ArrayList<menuList>();
		menuList(String n, String o, int p){
			this.name = n;
			this.origin = o;
			this.price = p;
		}
	}
	
	void print(int i) {
		System.out.println(i + "/t" + this.name + "/t" + this.origin + "/t" + this.price);
	}
}
public class L01_saveMenus {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		menuList m = new menuList();
		
		int op;
		
		while(true) {
			System.out.print("1)추가 2)수정 3)삭제 4)리스트 5)총개수 6)종료 ==> ");
			op = s.nextInt();
	
			if(op == 6) {
				break;
			}
			else if (op == 1) {
				m.add();
			}
			
			
		}
	}
}
