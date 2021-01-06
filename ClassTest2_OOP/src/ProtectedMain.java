
public class ProtectedMain extends ProtectedEx{

	public ProtectedMain() {
	}

	public void start() {
		//protected 접근제한자는 같은 팩키지일경우 접근허용
		//protected 접근제한자는 다른팩키지일경우 상속받아 접근허용
		//ProtectedTest pt = new PropectedTest();
//		ProtectedEx pe = new ProtectedEx();
//		System.out.println("-----" + pe.username);
//		pe.print();
		System.out.println("이름=" + username);
		print();
	
	}	
		
		
	
	public static void main(String[] args) {
		new ProtectedMain().start();
	}

}
