package day0326_ex.string;

public class StringTest02 {

	public static void main(String[] args) {

		// 생성자의 특징
		// 1. 생성자는 이름 = 클래스이름 동일
		// 2. 구조 메서드와 유사 : 생성자이름(){}
		// 호출-{}내부를 실행: 이름()
		// 클래스이름 String

		String str1 = new String("안녕하세요");// 객체 표현식
		String str2 = new String("안녕하세요");// 객체 표현식

		 //Scanner sc=new Scanner(System.in);
		 //Random num=new Random();
		 //int[]arr=new int[5];

		String str3 = "안녕하세요"; // 리터널 표현식
		String str4 = "안녕하세요"; // 리터널 표현식

		System.out.println(str1 == str3);
		System.out.println(str3 == str4);
		System.out.println(str1 == str2);

		//문자열 비교시 ==(비교연산자) 비교하면 단순비교(참조된 메모리 주소만 확인)
		//실제값이 같더라도 단순비교로 인하여 메모리 주소가 달라 다르다고 나올수도 있다.
		//문자열 비교시 실제 데이터를 확인하려면 == 로 비교하면 안됌
		
		//문자열 비교시 문자열 변수.equals(비교할 문자열변수)
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4));
		
		////////////////////////////////////////////////////////
		
		Runtime runtime=Runtime.getRuntime();
		long totalm=runtime.totalMemory();
		System.out.println("총메모리"+ totalm+"byte");
		
	}
	
	

}
