import pac.Access2;
import pac.Access3;

public class AccessMain extends Access3 {

	public AccessMain() {
		
	}
	public void start() {
		
		//객체생성
	
		Access1 a1 = new Access1();
		
		System.out.println(a1.a);
		
		/*
//		a1.printDate();
//		System.out.println(a1.userid);// 객체.멤버변수
		System.out.println(a1.userpwd);
		
		Access2 a2 = new Access2(); //패키지가 다르다. 접근제한자(접근제어자)가 default면 안됨
//		System.out.println(a2.num);
//		System.out.println(a2.name);
		System.out.println(a2.getName());
		System.out.println("a2 num = " + a2.getNum());
		
		//a2객체에 있는 num을 200으로 변경
		//	a2.num=200;
		a2.setNum(400);
		System.out.println("a2 num = " + a2.getNum());
		*/
		Access3 a3 = new Access3();
		System.out.println(a3.a);
//		a3.start2(); //객체로 호출불가
		
//		super.start2();
		
	}

	public static void main(String[] args) {
		new AccessMain().start();
		
		
//			AccessMain obj = new AccessMain();
//			obj.start();
	}

}
