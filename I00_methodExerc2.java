package WorkBook;

import java.util.Random;
public class methodExerc2 {
	void print_header(char ch) {
		for (int i=0 ; i<17 ; i++) {
			System.out.print(ch);
		}
		System.out.println();
		System.out.println("생성된 로또 번호");
		
		for(int i=0 ; i<17 ; i++) {
			System.out.print(ch);		// 전달 받은 문자로 메뉴 구성
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int lotto[] = new int[6];
		Random r = new Random();
		
		for (int i =0 ; i<lotto.length ; i++) {
			lotto[i] = r.nextInt(45) + 1;
		}
		
		methodExerc2 obj = new methodExerc2();
		obj.print_header('=');	// 매개변수로 문자 하나 전달 
		
		for (int i=0 ; i<lotto.length ; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println("");
	}
}
