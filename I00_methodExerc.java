package WorkBook;

import java.util.Random;

public class I00_methodExerc {
	void print_header() {	// 매개변수, 리턴값이 없는 메소
		System.out.println("=======================");
		System.out.println("생성된 로또 번호");
		System.out.println("=======================");
	}
	
	public static void main (String[] args) {
		int lotto[] = new int[6];
		Random r = new Random();
		
		for (int i=0 ; i<lotto.length ; i++) {
			lotto[i] = r.nextInt(45)+1;
		}
		
		I00_methodExerc obj = new I00_methodExerc();	//객체화, 인스턴스 생성 
		obj.print_header(); // 메소드 호출
		
		for (int i = 0 ;i< lotto.length ; i++) {
			System.out.print(lotto[i] + " ");
		}
		
		System.out.println(" ");
	}
}
