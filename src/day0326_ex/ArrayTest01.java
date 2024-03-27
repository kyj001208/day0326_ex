package day0326_ex;

public class ArrayTest01 {

	public static void main(String[] args) {

		int[]ar1=new int[3];
		
		int[]ar2=ar1; //ar1의 heap에서 동일한 메모리 참조가능  
		
		System.out.println();
		
		ar2[0]=100;
		
		System.out.println(ar1[0]);

	} 

}
