package WorkBook;
/*
 * K03에서 만든 point 클래스를 변경하지 않고, 
 * 화면과 같이 원하는 수만큼의 좌표 값(x,y)을 입력받아 이 좌표가 몇 사분면에 위치하는 지를 알아내는 메소드를 통해 각 사분면에 속하는 좌표의 갯수를 출력하라.
 * 2019.01.15 Jeon, Yeo Hun

 */
import java.util.Scanner;

class point2 {
	int get_area (double x, double y) {	// 사분면 위 좌표의 위치를 반환
		
		if (x>0 && y>0) { // 1사분면 조건 
			return 1;
		}
		else if (x<0 && y>0) {	// 2사분면 조건 
			return 2;
		}
		else if (x<0 && y<0) {	// 3사분면 조건 
			return 3;
		}
		else if (x>0 && y<0){	// 4사분면 조건 
			return 4;
		}
		else {	// 원점
			return 0;	
		}	
	}
}
public class K04_savePoint2 {
	public static void main (String[] args) {
		double x, y;
		int max, i;
		Scanner s = new Scanner(System.in);
		int s1cnt=0, s2cnt=0, s3cnt=0, s4cnt=0;
		
		
		System.out.print("몇개의 좌표를 입력하시겠습니까? ");
		max = s.nextInt();
		
		int[] point = new int[max];
		point2[] p = new point2[max];
		
		for(i=0 ; i<max ; i++) {
			p[i] = new point2();
		}
		
		
		// 메소드를 호출하여 좌표가 몇 사분면에 있는지 판단
		for (i=0 ; i<max ; i++) {
			System.out.print((i+1)+"좌표의 X, Y 값을 입력하세요 --> ");
			x = s.nextDouble();
			y = s.nextDouble();
			point[i] = p[i].get_area(x, y);
		}
		
		System.out.println("==============================================");
		
		for (i=0 ; i<max ; i++) {
			// 메소드에서 리턴 받은 값으로 결과 출력
			if (point[i]==1) {							
				System.out.println((i+1)+"번째 좌표는 1사분면에 위치합니다.");
				s1cnt++;
			}
			else if (point[i]==2) {
				System.out.println((i+1)+"번째 좌표는 2사분면에 위치합니다.");
				s2cnt++;
			}
			else if (point[i]==3) {
				System.out.println((i+1)+"번째 좌표는 3사분면에 위치합니다.");
				s3cnt++;
			}
			else if (point[i]==4) {
				System.out.println((i+1)+"번째 좌표는 4사분면에 위치합니다.");
				s4cnt++;
			}
			else {
				System.out.println((i+1)+"번째 좌표는 원점에 위치합니다.");
			}
		}
		
		
		// 각 사분면에 위치한 좌표 개수 출력
		System.out.println("1사분면의 좌표는 모두 " + s1cnt + "개 입니다.");
		System.out.println("2사분면의 좌표는 모두 " + s2cnt + "개 입니다.");
		System.out.println("3사분면의 좌표는 모두 " + s3cnt + "개 입니다.");
		System.out.println("4사분면의 좌표는 모두 " + s4cnt + "개 입니다.");
		
		s.close();
	}
}