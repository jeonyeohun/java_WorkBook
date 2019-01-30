package WorkBook;
/*
 * 다음과 같이 메뉴에 따라 데이터를 입력받거나, 삭제하거나, 리스트를 보여주는 프로그램을 객체지향으로 제 작하라.(클래스이름, 멤버변수, 메소드 및 파라미터, 리턴타입은 각자 결정함)
- 입차할 때는 비어있는 자리부터 순서대로 입차한다.
- 주차 비용은 처음 10분은 무료, 10분 추가할 때마다 500원씩 정한다.
단, 현재 날짜와 시간을 가져오기 위해서 SimpleDateFormat 클래스를 참조한다.
예)
SimpleDateFormat f = new SimpleDateFormat("YYYYMMdd", Locale.KOREA); String today = f.format(new Date());
 * 2019.01.28
 */

import java.util.*;
import java.text.SimpleDateFormat;

class parking {
	String num, name;
	String today;
	public parking(String num, String name, int i) {
		this.num = num;
		this.name = name;
		
		SimpleDateFormat f = new SimpleDateFormat("YYYY년 MM월 DD일 HH시 mm분", Locale.KOREA);
		this.today = f.format(new Date());
		System.out.println("["+(i+1)+"번] " + today + "입차 되었습니다.");
	}
	
	void print(int i) {
		SimpleDateFormat f = new SimpleDateFormat("YYYY-MM-DD HH:mm", Locale.KOREA);
		this.today = f.format(new Date());
		System.out.println("["+(i+1)+"번] \t"+ num + " \t" + name + " \t" + today);
	}
}

public class L02_parkingInfo {
	
	void showlist(ArrayList<parking> p) {
		
		int size = p.size();
		
		if(size<=0) {
			System.out.println("주차된 차량이 없습니다.");
		}
		else {
			for(int i=0 ; i<p.size() ; i++) {
				p.get(i).print(i);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int parklimit, op;
		String num;
		String name;
		int i;
		ArrayList<parking> p = new ArrayList<parking>();
		L02_parkingInfo obj =new L02_parkingInfo();
		
		System.out.print("주차할 수 있는 차의 개수를 입력하세요: ");
		parklimit = s.nextInt();
		System.out.println("총 "+ parklimit + "대를 주차할 수 있습니다.");
		
		while(true) {
			int size = p.size();
			System.out.println("\n-------------------------------------------------");
			System.out.print("1)입차 2)출차 3)리스트 4)입차 총개수 5)주차찬여개수 6)종료 ==> ");
			op = s.nextInt();
			System.out.println("-------------------------------------------------");
			
			
			if (op == 6) {
				System.out.println("종료되었습니다.");
				break;
			}
			else if(op == 1) {
				if (size+1>parklimit) {
					System.out.println("주차공간이 가득찼습니다.");
				}
				else {
					System.out.print("입차할 차의 번호와 차종을 입력하세요: ");
					num = s.next();
					name = s.next();
					p.add(new parking(num, name, size));
				}
			}
			else if(op == 2) {
			}
			else if(op == 3) {
				obj.showlist(p);
				System.out.println((parklimit-size)+"대 주차가능.");
			}
			else if(op == 4) {
				System.out.println("총 "+size+"대가 주차되어 있습니다.");
			}
			else if(op == 5) {
				System.out.println("주차 가능한 자리는 "+(parklimit-size)+"대입니.");
			}
		}
	}
}
