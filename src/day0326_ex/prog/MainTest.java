package day0326_ex.prog;

public class MainTest {

	public static void main(String[] args) {
			
		// 객체(object) 생성 (참조형타입)
		//String str=new Stiring();
		
		Solution s= new Solution();
		s.aaa("밀가루"); //메서드 호출: {}가 실행된다
		s.aaa("쌀가루");
	
		String[] storage={ "pencil", "pencil", "pencil", "book" };
		int[]num= {2, 4, 3, 1 };
		
		
		String result=s.solution(storage, num);
		System.out.println(result);
	}

}
