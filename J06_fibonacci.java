package WorkBook;
/*
 * n이 1부터 20까지 증가하는 경우 각각의 피보나치 수 fibonacci(n)을 출력하라. 
 * 피보나치 수는 다음과 같 이 정의한다.
 */
public class J06_fibonacci {
	int fibonacci (int n) {
		if (n == 1 || n ==2) {
			return 1;
		}
		else
			return fibonacci(n-1) + fibonacci(n-2); 
		}
	
	public static void main (String[] args) {
		int n; 
		System.out.println("1부터 20까지 피보나치 수는 다음과 같습니다.");
		J06_fibonacci obj = new J06_fibonacci();
		
		for (n=1 ; n<=20 ; n++) {
			System.out.println( n + "번째 : " + obj.fibonacci(n));
		}
	}
}
