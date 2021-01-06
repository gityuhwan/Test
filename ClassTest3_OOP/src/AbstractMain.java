
public class AbstractMain extends AbstractTest{


	
	public AbstractMain() {
			
			
	}
	
	public void output() {
		
		
	}
	
	public void sum(int max) {//자료형 일치해야함, 매개변수명은 달라도 됨
		int total = 0;
		for(int i =1 ; i<=max; i++) {
			total+=i;
		}
		System.out.println("1~" + max + "까지의 합은" + total);
	}
	public void start() {
		
	}
	public static void main(String[] args) {
			AbstractMain am = new AbstractMain();
			am.sum(100);
			
			//
			//new AbstractTest(); 추상클래스는 객체 직접생성 불가
			
	}

}
