package day0326_ex.prog;

import java.util.Arrays;

public class Solutiontest06 {

	public static void main(String[] args) {
		
		/*
		int[] numbers = { 1 }; //가채점한 사람의 번호
		int[] our_score = { 100 };// 가채점한 사람의 점수
		int[] score_list = { 100, 80, 90, 84, 20 };// 번호순서대로 모든 학생의 점수
		//*/
		
	
		int[] numbers = { 3, 4 }; // 가채점한 사람의 번호
		int[] our_score = {85, 93 };// 가채점한 사람의 점수
		int[] score_list = {85, 92, 38, 93, 48, 85, 92, 56};// 번호순서대로 모든 학생의 점수
		
		
		int num_student = numbers.length;
		String[] answer = new String[num_student];

		for (int i = 0; i < num_student; i++) {
			
			//int target=numbers[i]-1; //학생번호
			
			if (our_score[i] == score_list[numbers[i]-1]) {
				answer[i] = "Same";
			} else {
				answer[i] = "Different";
			}
		}

		System.out.println(Arrays.toString(answer));
		// return answer;
	}
}
	
