package WorkBook;
/*
 * 문제 [J06]에서 제작한 피보나치 메소드 fibonacci(n)를 사용하여 황금비율을 찾아내라. 
 * n번째 황금비율 이란 피보나치 수열의 연속적인 2개의 숫자의 비율(n+1번째수 / n번째 수)로 정한다.
 * 단, 계산한 비율이 직전의 비율에 비해 그 차이가 백만분의 1보다 작게 되면 멈추도록 하라.
 * 
 * 2019.01.12 Jeon Yeo Hun
 */
public class J10_GoldenRatio {
		int fibonacci (int n) {
			if (n == 1 || n ==2) {
				return 1;
			}
			else if (n>2) {
				return fibonacci(n-1) + fibonacci(n-2); 
			}
			else {
				return 0;
			}
		}
		
		public static void main (String[] args) {
			int n=2; 
			double GR = 0;
			double PGr = 0;
			J10_GoldenRatio obj = new J10_GoldenRatio();
			
			while(true) {
				// 이전 황금비율 결과를 저장
				PGr = GR;
				// 새로운 황금 비율 계산 
				GR = Math.round((double) (obj.fibonacci(n+1)) / (double) (obj.fibonacci(n)) *1000000)/1000000.0;
				
				System.out.println(n + "번째 비율 (" + obj.fibonacci(n+1) + "/" + obj.fibonacci(n) + ") : " + GR);
				
				// 이전 황금비율과 현재황금비율의 차가 1000000 분의 1 이상이라면 반복 종료.
				if (Math.abs(GR-PGr) <= Math.round(1/1000000 * 1000000)/1000000.0) {
					break;
				}
				
				n++;
				
			}
			
		}
	}
