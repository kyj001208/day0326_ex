package day0326_ex.array;

import java.util.Arrays;

public class ArrayTest05 {

	public static void main(String[] args) {

		// 배열을 관리하는 클래스 존재합니다.
		// Arrays 클래스(생성자) 입니다.

		// Arrays aa=new Arrays();// not visible=안보인다
		// Arrays경우 private로 인하여 외부에서 호출 불가능
		// static 멤버: 객체 생성 하지 않고 직접 접근 가능, 클래스.멤버(메서드,필드=변수)

		int[] org = {88, 1, 100, 30, 50, 20 };
		int[] copy = Arrays.copyOf(org, org.length+1);
		
		copy[org.length]=20;
		
	
		System.out.println(Arrays.toString(copy));
		Arrays.sort(copy);// 정렬해 :오름차순으로 재배치
		
		System.out.println(Arrays.toString(copy));

	}
}