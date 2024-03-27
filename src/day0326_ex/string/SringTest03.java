package day0326_ex.string;

public class SringTest03 {

	public static void main(String[] args) {

		String str = "안녕하세요 저는 김유진이라고 합니다. 반갑습니다";
		// char ch1=str.charAt(0);
		// System.out.println(ch1);

		System.out.println("문자열의 길이" + str.length());

		for (int i = 0; i < str.length(); i++) {

			System.out.print(str.charAt(i));
		}

	}

}
