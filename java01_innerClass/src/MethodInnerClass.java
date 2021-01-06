
public class MethodInnerClass {
	String email = "abc@abc.com";
	public MethodInnerClass() {
	}
	public void output() {
		System.out.println("이메일(외부클래스) - > " + email);
		
	}
	
	public void innerClassMethod() {
		int num = 100;
		//메소드가 호출될때 내부클래스가 생성
		
		//메소드에 정의된 내부 클래스
		class InnerCreate{
			String name = "홍길동";
			public InnerCreate() {
				
			}
			public void innerPrint() {
				System.out.println("name = " + name);
				System.out.println("num = " + num);
				System.out.println("e-mail(메서드내 내부클래스) = " + email);
				System.out.println();
				output();
			}
		}
		InnerCreate ic = new InnerCreate();
		ic.innerPrint();
		
	}
	
	
	public static void main(String[] args) {
		new MethodInnerClass().innerClassMethod();
	}

}
