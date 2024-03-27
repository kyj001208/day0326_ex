package day0326_ex.array;

public class ArrayTest04 {

	public static void main(String[] args) {

		// 배열의 불편한점 :동일한 데이터 묶음
		// 고정길이: 배열 생성시 결정된 길이=확정이 불편하다

		int[] arr = new int[] { 3, 13, 33, 43, 45 };
		int[] arr1 = new int[6]; // +20을 추가

		for (int i = 0; i < arr.length; i++) {

			arr1[i] = arr[i];

		}
		arr1[5] = 20;
		//한줄을 추가하면 arr에도 20도 나옵니다.
		arr=arr1; //arr1을 arr에 넣으면 됌
		

		for (int i = 0; i < arr1.length; i++) {

			System.out.println(arr[i]);
		}

		
	}

}
