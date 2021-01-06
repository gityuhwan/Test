package pac;

public class Access2{
	private	int num = 3254; // private제한자 걸면 캡슐화
	private String name = "홍길동";
	//접근제어자 (default)의 경우 같은 패키지 내에서만 사용가능
	public Access2() {
	
	}
	
	public String getName() {//getter
		return this.name;
	}
	
	public void setName(String name){//setter
		this.name = name;
	}
	
	public int getNum() {//getter : pirvate으로 캡슐화된 멤버변수를 밖으로 가지고나가기 위한 메소드
		return num;
	}
	public void setNum(int num) {//setter : private된 멤버변수를 getter를 통해 값 변환
		//기능구현
		if(num%100 == 0)
		this.num = num;
	}
	public static void main(String[] args) {

	}

}
