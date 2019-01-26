package WorkBook;


import java.util.*;

class UserInfoArrayList{
	String name;
	int age;
	
	UserInfoArrayList(String n, int a){
		this.name = n;
		this.age = a;
	}
	
	void print() {
		System.out.println(this.name + "\t" + this.age);
	}
}

public class L00_ArrayList2 {
	public static void main (String args[]) {
		Scanner s = new Scanner(System.in);
		
		// UserInfoArrayList를 요소로 갖는 ArrayList 객체화 
		ArrayList<UserInfoArrayList> u = new ArrayList<UserInfoArrayList>();
		
		while(true) {
			System.out.print("사용자 이름을 입력하세요: ");
			String name = s.next();
			
			System.out.print("사용자 나이를 입력하세요: ");
			int age = s.nextInt();
			
			u.add(new UserInfoArrayList(name, age));
			
			System.out.print("계속 등록하시겠습니까?(Y/N): ");
			String re = s.next();
			if(re.equals("N")) break;
		}
		
		System.out.println("==========================");
		System.out.println("등록하신 사용자는 다음과 같습니다.");
		
		for (int i=0 ; i<u.size(); i++) {
			u.get(i).print();
		}
		
		s.close();
		
	}
}
