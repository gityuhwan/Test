class PrivateChild extends PrivateParent{
	
	PrivateChild(){
	//private 접근제어자가 있는 멤버변수는 상속되지않는다
//		System.out.println("num =" + num);
		setNum();
	/*	private 접근제어자 메소드 상속되지 않는다.
		super.setNum(); */
	}
	
	//오버라이딩 반환형, 메소드명, 매개변수가 같은것을 재정의
	
	private void setNum() {
		age +=2;
	}
	
	}


////////////////////////////////////////////////////
public class PrivateMain {//클래스가 한파일에 여러게 있을때 public 으로 지정된 클래스로 java파일은 저장 컴파일은 클래스별로

	public PrivateMain() {
		
	}

	public static void main(String[] args) {
		
		PrivateChild pc = new PrivateChild();
		System.out.println("pc.getnum = " + pc.age);
		
		// System.out.println("pc.num = " + pc.num); private 객체명을 통한 접근 불가
		

	}

}
