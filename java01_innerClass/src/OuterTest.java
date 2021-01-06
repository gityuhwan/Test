public class OuterTest {
		int num = 1234;
		String name = "세종대왕";
		
	public OuterTest() {
		System.out.println("OuterTest 기본생성자");
		
	}
	public void outerPrint() {
		System.out.println(num + "->" + name);
		//외부클래스는 내부클래스의 정보를 사용할 수 없다.
		//			객체를 생성하면 사용 가능
//		System.out.println(no + username);
		
		
		//내부클래스 객체 만들기 - 현재클래스(외부클래스)내에서 내부 클래스를 객체 생성가능하다.
		//메소드 내의 내부클래스는 메소드 호출시 생성된다.
		InnerTest it = new InnerTest();
		it.innerPrint();
		
		
	}
	
	
	//내부클래스(멤버영역)
		class InnerTest{
			int no = 6789;
			String username = "이순신";
			public InnerTest() {
				System.out.println("내부클래스 생성자");
				
			}
			public void innerPrint() {
				System.out.println(no + "----->" + username);
				//내부클래스에서는 외부클래스 정보 사용 가능
				System.out.println(no + "----->" + name);
//				outerPrint(); //외부클래스 정보사용가능 아우터 -> 이너 -> 아우터 -> 이너...무한루프
			}
		}

	
	public static void main(String[] args) {
	//메인은 다른클래스에	
//		new OuterTest().new InnerTest().innerPrint();
		
		System.out.println();
		OuterTest ot = new OuterTest();
//		ot.outerPrint();
		
		OuterTest ot2 = new OuterTest();
		OuterTest.InnerTest it = ot2.new InnerTest();
		
		ot2.outerPrint();
		
//		it.outerPrint(); //안됨
		
		//외부에서 내부클래스 객체를 생성하기 위해서는 외부클래스 객체를 이용하여 내부클래스 객체를 생성하여야 한다.
	}

}
