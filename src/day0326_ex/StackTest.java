package day0326_ex;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StackTest {

	public static void main(String[] args) {

		
		int a=0;
		if(true){

			int b=10;
			System.out.println(b);
			
		}
		int c=20;
		//System.out.println(b); =>블록을 빠져 나와 b 변수 불가능
		for(int i=0;i<2;i++) {
			System.out.println(i); // => a변수 경우 메인메서드 안에 있길래 확인가능
		}
		
	}

}
