package practice;

import java.util.List;

public class ImmutableCollection {

	public static void main(String[] args) {

		List<Integer> l=List.of(1,2,5,7,9);
		
		l.add(23);
		System.out.println(l);
	}

}
