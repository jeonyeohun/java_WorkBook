package WorkBook;
// 파일 용량을 기가바이트 단위로 입력받아 이 값을 메가바이트, 킬로바이트, 바이트 단위로 계산하여 각각 출 력하라.
// 단, 계산방법은 다음과 같다.
// 메가바이트 수 = 기가바이트 수 * 1024
// 킬로바이트 수 = 메가바이트 수 * 1024 
// 바이트 수 = 킬로바이트 수 * 1024
// 2018.12.24 Jeon, Yeo Hun

import java.util.Scanner;
public class A07_CalculateFileSize {
	public static void main (String[] args) {
		int gigabytes, megabytes, kilobytes;
		long bytes;
		Scanner input = new Scanner (System.in);
		
		System.out.print("파일 용량을 기가바이트 단위로 입력하세요: ");
		gigabytes = input.nextInt();
		
		input.close();
		
		megabytes = gigabytes * 1024;
		kilobytes = megabytes * 1024;
		bytes = (long)kilobytes * 1024; // int형의 범위를 넘어서기 때문에 long타입으로 형변환 후 연산이 필요함 
		
		System.out.println("입력하신 파일 용량은 ");
		System.out.println(megabytes + " 메가바이트,");
		System.out.println(kilobytes + " 킬로바이트, ");
		System.out.println(bytes + " 바이트 입니다.");
		
	}

}
