
public class StaticTest {
		//멤버변수 Field 영역
		//초기값을 설정하지 않은 경우
		int num;
		// 정수는 0, 실수 0.0, boolean false, 객체형 null;
		int num1 = 100;
		
		static int num2 = 255;
		
		
		
		String name = "웅엥잉잉";
		static String name2 = "웅엥웅엥웅";
		public StaticTest() {
		//생성자 메소드
		}
		
		public void prn() {
		System.out.println(num1);
		System.out.println();
		System.out.println(num2);
//		Aclass obj = new Aclass();
		}
		public static void prn2() {
			System.out.println(num2);
			System.out.println(name2);
		
		}
	
	
}
