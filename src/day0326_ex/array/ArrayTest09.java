package day0326_ex.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest09 {

	public static void main(String[] args) {

		String[] subject = { "국어", "영어", "수학", "JAVA", "WEB" };
		int[] score = new int[subject.length];

		// 점수는 랜덤클래스, 또는 Math.random() 활용하여 0 ~100까지의 점수를 적용하세요
		// 과목: 점수 4개를 출력하세요
		// 총점, 평균(소숫점아래 2자리까지 , 3자리 반올림) 출력

		int sum = 0;
		double num = 0;

		Random ran = new Random();
		for (int i = 0; i < score.length; i++) {

			score[i] = ran.nextInt(101); // 0부터 100까지 (5단위로 지정시 : (21)*5를 해도 됌
			sum += score[i];

		}
		for (int i = 0; i < subject.length; i++) {

			System.out.printf("%-4s : ", subject[i]);
			System.out.println(score[i]);

		}
		System.out.println("총점 " + sum);
		System.out.printf("%-5s : %.2f\n", "평균" ,(double)sum/subject.length);
	}//출력서식은 경우 다섯자리로 평균을 나타내세요 (%5) , %.f나누기
}
