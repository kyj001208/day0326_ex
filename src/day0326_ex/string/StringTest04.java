package day0326_ex.string;

public class StringTest04 {

	public static void main(String[] args) {

		String naverURL = "https://www.naver.com";

		String[] arr = naverURL.split("[.]");

		// 중간 문자를 추출할때는 split

		System.out.println(arr[1]);

		// for(int i=0;i<arr.length;i++) {

		// System.out.println(arr[1]);

	}

}
