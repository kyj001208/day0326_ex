package day0326_ex.array;

import java.util.Arrays;

public class ArraysTest08_teching {

	public static void main(String[] args) {
		
		// 선생님이 만들어주신 코드

		int[] arr = { 5, 1, 3, 4, 2, 2, 3, 5, 5, 1, 5, 4, 3, 5, 3, 3 };
		// 중복 숫자가 존재하니 1개만 표기해서 배열로 저장하세요

		int[] arr1 = new int[arr.length];

		int size = 0;
		for (int i = 0; i < arr.length; i++) {
			// 중복체크
			boolean flag = false;

			for (int j = 0; j < size; j++) {

				if (arr[i] == arr1[j]) {

					flag = true;
					break;
				}
			}

			if (!flag) {

				arr1[size++] = arr[i];

			}

		}

		System.out.println(Arrays.toString(arr1));
		System.out.println("사이즈는?" + size);
		// 최종 배열 공간
		int[] result = new int[size];
		for (int i = 0; i < result.length; i++) {
			result[i] = arr1[i];
		}

		for(int n : result) {
			
			System.out.print(n + "");
		}
		System.out.println();
	}

}
