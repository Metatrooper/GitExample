package practice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		
		Map<String,Integer> students=new HashMap<>();
		
		students.put("Rahul",65);
		students.put("Raj",54);
		students.put("Ratri",90);
		students.put("Ritu",85);
		
	Set	<String> key=students.keySet();
	System.out.println("keys: "+key);
	
	Collection<Integer> values = students.values();
	System.out.println("Values:"+values);
	
	System.out.println(students.get("Ratri"));
	
	for(String keys:key) {
		System.out.println("keys: "+keys+" values: "+students.get(keys));
	}

	}

}
