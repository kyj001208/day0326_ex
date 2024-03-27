package day0326_ex.array;

public class ArrayTest02 {

	public static void main(String[] args) {

		int[]ar1=new int[3];
		
		double[]ar2=null;
		ar2=new double[3];
		
		ar2=null;//GC
		
		System.out.println();
		//메모리 할당과 해제 : JVM이 자동으로 해준다. 메모리 누수 방지를 위해
		//참조되지 않음 heap메모리를 해제
		//가비지 컬렉터 실행 요청(아래와 같은 코드)
		//하지만 일반적으로 권장하지 않으며 즉시 실행될것이라는 보장은 없음
		System.gc();
		Runtime.getRuntime().gc();
	} 

}
