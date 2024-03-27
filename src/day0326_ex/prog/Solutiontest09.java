package day0326_ex.prog;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solutiontest09 {

	public static void main(String[] args) {
		
		//*
		  String [] storage = { "pencil", "pencil", "pencil", "book" }; 
		  int[] num = {
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
		
		/*
		String[] storage = { "mirror", "net", "mirror", "net", "bottle" };
		int[] num = { 4, 1, 4, 1, 5 };
		//*/
		
		//컬렉션 :List(배열 구조와 비슷), Set(데이터를 하나만 넣어), Map(데이터를 쌍으로 넣기)
		
		Map <String, Integer> map=new HashMap <>();
		
		for(int i=0; i<storage.length;i++) {
			String itemName=storage[i];
			if(map.containsKey(storage[i])) {
				//누적
				 int ea= map.get(itemName);
				 //ea=ea+num[i];
				 ea += num[i];
				 map.put(itemName,ea); 
				 
			}else {
				map.put(itemName, num[i]); 
			}
			
		
			
		}
		
			Set<String> keyset=map.keySet();
			for(String itemName:keyset) {
				System.out.print(itemName);
				System.out.println(":"+map.get(itemName));
			}
	}
}
