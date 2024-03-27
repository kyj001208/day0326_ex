package day0326_ex.array;

import java.util.Arrays;

public class ArrayTest06 {

	public static void main(String[] args) {

		int[] org = { 5, 4, 3, 2, 1 };

		// org[0], org [1]하고 비교해서 왼쪽이 크면 교환
		// org[1], org [2]하고 비교해서 왼쪽이 크면 교환
		// org[2], org [3]하고 비교해서 왼쪽이 크면 교환
		// org[3], org [4]하고 비교해서 왼쪽이 크면 교환

		//버블 정렬
		for (int c=0; c< org.length-1;c++) {
			
			for (int i = 0; i < org.length - 1; i++) {

				if (org[i] > org[i + 1]) {

					int temp = org[i];
					org[i] = org[i + 1];
					org[i + 1] = temp;

				}

			}
			System.out.println(Arrays.toString(org));
		}

	}
}
