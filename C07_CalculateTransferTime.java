package WorkBook;
/*
 * 파일 용량을 메가바이트 단위로 입력받고, 
 * 전송 방식을 숫자로 입력받아 이에 따라 파일 전송 시간을 초 단 위(소수점 1자리)로 계산하여 출력하라.
 * 단, 계산방법은 다음과 같다.
 * 바이트 수 = 메가바이트 수 * 1024 * 1024
 * Wi-Fi 전송 속도 = 1,500,000바이트 / 초 
 * Bluetooth 전송 속도 = 300,000바이트 / 초 
 * LTE 전송 속도 = 1,000,000바이트 / 초 
 * USB 전송 속도 = 60,000,000바이트 / 초
 * 
 * 2018.12.28 Jeon, Yeo Hun;
 */

import java.util.Scanner;
public class C07_CalculateTransferTime {
	public static void main (String[] args) {
		int megabytes;	
		long bytes;
		byte kind; // 전송방식 (1: Wi-Fi, 2: BlueTooth, 3: LTE, 4: USB)
		double time=0;
		Scanner input = new Scanner (System.in);
		
		System.out.print("파일 용량을 메가바이트 단위로 입력하세요: ");
		megabytes = input.nextInt();
		
		System.out.print("전송방식을 1: WI-FI, 2: BlueTooth, 3: LTE, 4: USB 에서 선택하여 입력하세요: ");
		kind = input.nextByte();
		
		input.close();
		
		bytes = megabytes * 1024 * 1024;
		
		if (kind == 1) {
			time = Math.round(bytes / 1500000.0 * 10)/10.0;
		}
		else if (kind == 2) {
			time = Math.round(bytes / 300000.0 * 10.0)/10.0;
		}
		else if (kind == 3) {
			time = Math.round(bytes / 1000000.0 * 10.0)/10.0;
		}
		else if (kind == 4) {
			time = Math.round(bytes / 60000000.0 * 10.0)/10.0;
		}
		
		System.out.println("파일 전송 시간은 " + time + " 입니다.");
	}
}
