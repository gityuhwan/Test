
public class TypeCasting {
	public int a;
	
	//멤버변수는 초기화 안해줘도됨 int == 0 String == null 등 자동
	public TypeCasting() {
		BBB b1 = new BBB();
		b1.print();
		b1.namePrint();
		//하위클래스로 객체생성 후 상위클래스 변수에 대입가능, BBB로 객체만들어서 AAA로 넣는다
		AAA a1 = new BBB();
		a1.print();
		//a1.namePrint(); // AAA클래스에는 BBB클래스가 숨겨져있다.
		
		BBB b2 = (BBB)a1;
		b2.namePrint();
		
		//상위 클래스의 객체를 하위클래스의 레퍼런스변수에 대입할수 없음.
		AAA a2 = new AAA();
//		BBB b3 = (BBB)a2; // 런타임 에러발생
//		b3.namePrint(); 
				
		BBB b3 = new BBB();
		b3.output();	
		
		//오버라이딩된 메소드는 상위클래스로 형변환 하더라도 오버라이딩된(BBB의 output) 메소드가 출력
		
		//하위클래스에서 오버라이딩된 메소드는 상위클래스로 타입캐스팅하더라도 메소드가 존재한다.
		AAA a3 = b3;
		a3.output();

		
		Object obj = new BBB();		
		BBB b4 = (BBB)obj;
		b4.namePrint();
	}

	public static void main(String[] args) {
		TypeCasting b = new TypeCasting();
		System.out.println(b.a);
			
			
	}

}
