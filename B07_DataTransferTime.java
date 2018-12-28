package WorkBook;
/*
 * 파일 용량을 메가바이트 단위로 입력받고, 
 * USB 포트가 2.0인지 아닌 지를 'Y'또는 'N'으로 입력받아 
 * 이에 따라 파일 전송 시간을 초 단위로 계산하여 출력하라.
 * 단, 계산방법은 다음과 같다.
 * 바이트 수 = 메가바이트 수 * 1024 * 1024
 * USB 1.1 전송 속도 = 1,500,000바이트 / 초 
 * USB 2.0 전송 속도 = 60,000,000바이트 / 초
 * 
 * 2018.12.28 Jeon, Yeo Hun
 */

import java.util.Scanner;
public class B07_DataTransferTime {
	public static void main (String[] args) {
		int megabytes;
		long bytes;
		String usb2;
		int time;
		Scanner input = new Scanner(System.in);
		
		System.out.print("파일 용량을 메가바이트 단위로 입력하세요: ");
		megabytes = input.nextInt();
		
		System.out.print("USB 포트가 2.0이면 Y, 아니면 N을 입력하세요: ");
		usb2 = input.next();
		
		input.close();
		bytes = megabytes * 1024 * 1024;
		
		if (usb2.equals("Y")) {
			time = (int) (bytes / 60000000); // 강제 형변환 필요.
		}
		else {
			time = (int) (bytes / 1500000);
		}
		
		System.out.println("파일 전송 시간은 "+ time + " 초 입니다.");
	}
}
