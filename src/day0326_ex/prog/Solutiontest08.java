package day0326_ex.prog;

import java.util.Arrays;

public class Solutiontest08 {

	public static void main(String[] args) {
		
		/*
		  String [] storage = { "pencil", "pencil", "pencil", "book" }; int[] num = {
		  2, 4, 3, 1 }; 
		//*/
		
		/*
		  String [] storage = { "doll", "doll", "doll", "doll", "doll" }; int[] num = {
		  1, 1, 1, 1 }; 
		//*/
		
		/*
		  String [] storage = { "apple", "steel", "leaf", "apple", "leaf" }; int[] num
		  = { 5, 3, 5, 3, 7}; 
		//*/

		String[] storage = { "mirror", "net", "mirror", "net", "bottle" };
		int[] num = { 4, 1, 4, 1, 5 };

		String[] cleanStorage = new String[storage.length];
		int[] cleannum = new int[num.length];

		for (int i = 0; i < storage.length; i++) {
			
			for (int c = 0; c < cleanStorage.length; c++) {
				// 새로운 함이 비어있으면(null) 넣으면 됌

				if (cleanStorage[c] == null) {
					cleanStorage[c] = storage[i];
					cleannum[c] = num[i];
					break;

				}
				// 새로운 함에 아이템이 존재할 경우 그 공간에 추가로 넣으면 끝
				if (storage[i].equals(cleanStorage[c])) {

					cleannum[c] += num[i];
					break;
				}

			}

		}

		System.out.println(Arrays.toString(cleanStorage));
		System.out.println(Arrays.toString(cleannum));
		// 새로운함의 개수중에서 제일 큰 수를 찾아야함
		int max = cleannum[0];
		int maxIdx = 0;
		for (int i = 1; i < cleannum.length; i++) {

			if (cleannum[i] > max) {
				max = cleannum[i];
				maxIdx = i;
			}

		}
		System.out.println("몇번째 : " + maxIdx);
		System.out.println("아이템 이름 :" + cleanStorage[maxIdx]);
		System.out.println("개수" + cleannum[maxIdx]);

	}
}
