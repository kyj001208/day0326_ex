package day0326_ex;

public class ArrayTest03 {
	
	public static void main(String[] args) {
		
		int [] arr=new int[3];
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
			
		}
		System.out.println();
		
		arr=null;
		
		System.out.println(arr);
		
		//System.out.println(arr[0]); ↓
		//NullPointerException :null(참조한게 x) 넣었는데 왜 접근하니?
		
		if(arr !=null) arr[0]=10;
	}

}
