package day0326_ex.array;

import java.util.Arrays;

public class ArraysTest07 {

	public static void main(String[] args) {
		
		//내가 만든 코드

		int[] arr = { 9,9,8,7,8,7,5,6,5,7,6,8,9};
		// 중복 숫자가 존재하니 1개만 표기해서 배열로 저장하세요

		int[] arr1 = new int[arr.length];
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr1.length; j++) {

				if (arr1[j] == 0) {
					arr1[j] = arr[i];
					break;


				}

				if (arr1[j] == arr[i]) {

					break;

				}

			}

		}

		System.out.println(Arrays.toString(arr1));
		//최종 배열 공간 

	}

}
