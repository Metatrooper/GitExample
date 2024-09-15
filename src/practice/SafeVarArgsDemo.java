package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SafeVarArgsDemo {

	public static void main(String[] args) {
		List<String> l1= Arrays.asList("abc","kmn");
		List<String>l2=Arrays.asList("wre","lrt");
		SafeVarArgsDemo.mymethod(l1,l2);
		
		

	}
	@SafeVarargs
	public static void mymethod(List<String>...l) {   //List<String>...l means that the method mymethod can take zero or more arguments, each of which is a List<String>.
		Object[] o=l;                         //this will throw exception due to wrong dt of args
		o[0]=Arrays.asList(1,2);				//this will throw exception due to wrong dt of args
		System.out.println(l[0].get(0));
	}

}
