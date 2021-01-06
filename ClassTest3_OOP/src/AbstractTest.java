//추상클래스 : 추상메소드 포함하고있다 class앞에 abstract 키워드 표기해야한다
//		추상클래스는 객체 생성을 할 수 없고 추상클래스를 상속받은 클래스는 추상클래스의 모든 추상메소드를 오버라이딩해야한다.(메소드 재정의)

public abstract class AbstractTest {
	int num = 1234;
	String name = "홍길동";
	
	public AbstractTest() {
		
	}
	
	public void total() {
		int sum = 0;
		for(int i = 1 ; i<=100; i+=2) {
			sum += i;
		}
		this.num = sum;
	}
	//추상메소드 : 반환형 앞에 abstract 키워드 입력해야함.
	public abstract void output();
	public abstract void sum(int max);
	
	
	//ㅇ
}
