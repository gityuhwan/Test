
public interface InterfaceTest extends InterfaceTest2{
		//static 멤버변수들
		public static String global = "Seoul";
		public static final int MAX = 100; // 상수화된 변수 : 100이외의 값은 대입할수 없다.
		//추상메소드 집합 // 추상 메소드명만 정의해서 모아놓은 클래스
		public void print();
		public int[] recordAll(int num);
		public String total(int max);
		
		
}
