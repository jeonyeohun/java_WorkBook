package WorkBook;
/*
 * Ackermann's Function A 는 다음과 같이 정의된다. 
 * A( i, j ) 를 재귀 호출 메소드로 만들고, 이 메소드 를 이용하여 A(0,0) 에서 A(3,3) 의 값을 구하라.
 * Ackermann's Function A
 	- A(0, j) = j+1 i = 0 이고, j ≥ 0 인 경우
	- A(i, 0) = A(i-1, 1) i > 0 이고 j = 0 인 경우 
	- A(i,j) = A(i-1, A(i,j-1)) i 와 j 모두 0 보다 큰경우
 * 
 *  2019.01.12 Jeon, Yeo Hun
 */


public class J08_AckermanNum{
	int Ackermann(int i, int j) {
		if (i==0 && j>=0) {
			return j+1;
		}
		else if (i>0 && j==0) {
			return Ackermann(i-1, 1);
		}
		else if (i>0 && j>0) {
			return Ackermann(i-1, Ackermann(i, j-1));
		}
		else
			return 1;
	}
	
	public static void main (String[] args) {
		int i, j;
		J08_AckermanNum obj = new J08_AckermanNum();
		
		for (i=0 ; i<4 ; i++) {
			for (j=0 ; j<4 ; j++) {
				System.out.println("Ackermann("+ i + ", " + j + ") = "+ obj.Ackermann(i, j));
			}
		}
	}
}
