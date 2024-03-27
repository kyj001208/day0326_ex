package day0326_ex.string;

public class StringTest01 {

	public static void main(String[] args) {

		String str1 = "문자열"; // 문자열 상수(리터널)=고정된 값을 의미

		// "문자열" = 문자열 상수풀에 저장됌 : 재사용을 위하여 존재하는 공간

		String str2 = "문자열";
		
		// 문자열상수는 이미 존재하는 문자열 상수를 코딩을 하면 새로 추가하는것이 아닌 기존 메모리상 문자열을 참조
		
		System.out.println(str1 == str2);
		
		//////////////////////↓디버그 사용시 검증 문장↓////////////////////////
		
		int moon=(int)str1.charAt(0);//'문'
		System.out.println(moon);
		String binaryStr=Integer.toBinaryString(moon);
		System.out.println(binaryStr);
		int data1=0B00111000;
		int data2=0B10111011;
		System.out.println(data1);
		System.out.println((byte)data2);
		
	}

}
