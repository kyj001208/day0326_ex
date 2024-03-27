package day0326_ex.string;

public class StringTest05 {

	public static void main(String[] args) {

		String URL ="https://school.programmers.co.kr/";

		int idx1= URL.indexOf('.');
		int idx2= URL.indexOf(".", idx1+1);

		System.out.println(idx2); //첫번째는 . 위치
		
		String se=URL.substring(idx1+1, idx2);
		
		System.out.println(se);
	}

}
