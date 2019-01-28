package WorkBook;
//  메뉴에 따라 데이터를 입력받거나, 삭제하거나, 리스트를 보여주는 프로그램을 객체지향으로 제작하라.

import java.util.*;

class menuList {
	String name;
	String origin;
	int price;
	
	public menuList(String name, String origin, int price) {
		this.name = name;
		this.origin = origin;
		this.price = price;
	}
	
	void mod(String name, String origin, int price) {
		this.name = name;
		this.origin = origin;
		this.price = price;
	}
	
	
	
	void print(int i) {
		System.out.println(i+1 + "\t\t" + this.name + "\t\t" + this.origin + "\t\t" + this.price);
	}
}
public class L01_saveMenus {
	void printset() {
		System.out.println("메뉴번호\t\t메뉴이름\t\t원산지\t\t1인분가격");
	}
	
	
	public static void main (String[] args) {
		String name;
		String origin;
		int price;
		int op;
		int modnum=0;
		
		Scanner s = new Scanner(System.in);
		ArrayList<menuList> u = new ArrayList<menuList>(); 
		L01_saveMenus obj = new L01_saveMenus();
		
		
		while(true) {
			System.out.print("1)추가 2)수정 3)삭제 4)리스트 5)총개수 6)종료 ==> ");
			op = s.nextInt();
			System.out.println("-----------------------------------------------");
			if(op == 6) {
				break;
			}
			
			// 메뉴 추가 //
			else if (op == 1) {
				System.out.print("메뉴의 메뉴명, 원산지, 가격을 입력하시오: ");
				name = s.next();
				origin = s.next();
				price = s.nextInt();
				
				u.add(new menuList(name, origin, price));
				obj.printset();
				for(int i=0 ; i<u.size(); i++) {
					u.get(i).print(i);
				}
				System.out.println("-----------------------------------------");
			}
			
			// 수정 //
			else if (op==2) {
				System.out.print("==>수정할 번호를 입력하세요: ");
				modnum = s.nextInt();
				System.out.print("==>메뉴의 메뉴명, 원산지, 가격을 입력하시오: ");
				name = s.next();
				origin = s.next();
				price = s.nextInt();
				u.get(modnum-1).mod(name, origin, price);
				obj.printset();
				for(int i=0 ; i<u.size(); i++) {
					u.get(i).print(i);
				}
				System.out.println("-----------------------------------------");
			}
			
			// 삭제 //
			else if (op==3) {
				System.out.print("==>삭제할 번호를 입력하세요: ");
				modnum = s.nextInt();
				
				u.remove(modnum-1);
				for(int i=0 ; i<u.size(); i++) {
					u.get(i).print(i);
				}
				System.out.println("-----------------------------------------");
			}
			
			// 리스트 출력 //
			else if (op==4) {
				obj.printset();
				for(int i=0 ; i<u.size(); i++) {
					u.get(i).print(i);
				}
				System.out.println("-----------------------------------------");
			}
			
			// 총 개수 //
			else if (op == 5) {
				System.out.println("-----------------------------------------");
				System.out.println("총 "+ u.size() + "개의 메뉴가 등록되어 있습니다.");
			}
		}
		
		System.out.println("종료되었습니다.");
		s.close();
	}
}
