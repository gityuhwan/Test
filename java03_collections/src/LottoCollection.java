import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class LottoCollection {
	Scanner scan = new Scanner(System.in);
	
	
	public LottoCollection() {
//		TreeSet<Integer> ts = new TreeSet<Integer>();
				
//		while (ts.size() < 7) {
//		lastNum = ran.nextInt(45) + 1;
//			ts.add(ran.nextInt(45)+1);
//		}
//		
//		System.out.println(ts.size());
//		System.out.println(ts);
	}
	public int gameCount() {
		System.out.println("입력 = ");
		int intCnt = 0;
	
		do {
		
		try {
			intCnt = Integer.parseInt(scan.nextLine());
			//게임
			if(intCnt<=0) {
				throw new Exception("게임수는 1보다 큰값이여야 한다.");
				//예외발생
			}
			break;
		}catch(NumberFormatException ne) {
		System.out.println("게임수는 정수만");	
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		}while(true);
		
		return intCnt;
	}
	
	public void createLotto() {
		Random ran = new Random();
		TreeSet<Integer> ts = new TreeSet<Integer>();
		int lastNum = 0;
		while(true) {
			lastNum = ran.nextInt(45) + 1;
			ts.add(lastNum);
			if(ts.size()>=7)break;
		}
		
		// 마지막으로 생성된 번호는 보너스이므로 TreeSet에서 제거
		ts.remove(lastNum);
		System.out.println(ts.toString()); //
		System.out.println(", bonus = " + lastNum);
		
	}
	
	//계속여부 확인 true:계속 false:중지
	public int qna() {
		int boo;
//		boolean boo = false;
		
		do {
			System.out.println("계속 하시겠습니까(Y or y : 예, N or n : 아니오 = ");
			String que = scan.nextLine();
			if(que.equalsIgnoreCase("Y")) { // "Y".equalsIgnoreCase(que)
				boo = 0;
//				boo = true;
				break;
			}else if(que.equalsIgnoreCase("N")) {
				boo = 1;
//				boo = false;
				break;
			}else {
			System.out.println("다시입력하세요");
	
			}
		}while(true);
			
		return boo;
	}
	
	public void start() {
		do {
			int cnt = gameCount();
			for(int i = 1; i<= cnt ; i++) {
				System.out.println(i + "게임 = ");
				createLotto();
			}
			if(qna()==1) {
				break;
			}
						
		}while(true);
		System.out.println("------------ 끝 -------------");
	}
	
	
	public static void main(String[] args) {
		new LottoCollection().start();
		
	}

}
