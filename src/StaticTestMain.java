
public class StaticTestMain {

	public static void main(String[] args) {
		
		//1. 클래스내의 메소드를 호출하기 위해 객체를 생성
		StaticTest st = new StaticTest();
		//같은 클래스에서 객체 2 생성
		StaticTest st2 = new StaticTest();
		StaticTest st3 = new StaticTest();
		
		//객체의 메소드 호출
		st.prn();
		System.out.println();
		
		
		
		//2. 멤버변수에 static 키워드 사용하며 클래스를 객체생성하지않고 사용 할 수 있다.
		// 							  클래스명.StaticTest멤버변수
		System.out.println("num = " + StaticTest.num2);
	
		// 객체생성 않고 메소드 사용(void 앞 static) == static메소드 호출
		//클래스명.static메소드
		StaticTest.prn2();
		
		//static 멤버변수는 객체를 생성시 공통 변수로 사용된다.
		
		//값변경
		st.num1 = 12345;
		st.num2 =  12345;
		
		st2.prn();
		
		
		
	}

}
