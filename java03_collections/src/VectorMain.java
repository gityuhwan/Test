
import java.util.Calendar;
import java.util.Random;
import java.util.Vector;

public class VectorMain {

	public VectorMain() {

	}

	public static void main(String[] args) {
			VectorTest vt = new VectorTest();
			Vector vv = vt.getdata();
			
//			System.out.println(vv);
//			System.out.println(vv.elementAt(2));
//			System.out.println(vv.get(2));
			 
//			컬렉션에 객체 얻어오기 - 객체가 지워지지 않는다.
			
			Member m1 = (Member)vv.elementAt(2);
			Calendar date = (Calendar)vv.get(5);
			
			m1.memberPrn();
			System.out.println(date);
						
			//마지막 객체 얻어오기
			Random ran = (Random) vv.lastElement();
			System.out.println("랜덤 = " + ran.nextInt());
			
			//객체 지우기
			vv.remove(3);
			vv.removeAllElements();
			System.out.println("객체의 수 --> " + vv.size());
	}

}
