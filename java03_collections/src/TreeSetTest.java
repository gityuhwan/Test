import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public TreeSetTest() {
		//TreeSet : 중복허용하지 않음, 입력순서 유지하지 않음, 크기 순서대로 정렬됨.
		int numData[] = { 10,50,30,40,10,50,60,70,40,40,40,40 };
		String strData[] = {"홍길동", "세종대앙","홍길동", "홍길동", "이순신","이순신","김정희"};
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for( int n : numData) {
			ts.add(n);
		}
		System.out.println(ts);
		
		
		TreeSet<String> ts2 = new TreeSet<String>();
		for( String n : strData) {
			ts2.add(n);
		}
		
		Iterator<Integer> ii = ts.iterator();// 오름차순 이터레이터
		while(ii.hasNext()) {
			System.out.println("ts--> " + ii.next());
		}
		
		
		Iterator<Integer> ii2 = ts.descendingIterator();// 내림차순 이터레이터
		while(ii2.hasNext()) {
			int data = ii2.next();
			System.out.println("ts --> desc = " + data);
			
		}
		
		
		//출력
		
		Iterator<String> ii3 = ts2.iterator();// 오름차순 이터레이터
		while(ii3.hasNext()) {
			System.out.println("ts--> " + ii3.next());
		}
		
		
		
		
		
	}

	public static void main(String[] args) {
		new TreeSetTest();
		
	}

}
