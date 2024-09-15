package practice;

public class EqualMethod {

	public static void main(String[] args) {
		
		String s1=new String("Radha");
		String s2=new String("Radha");
		
		System.out.println(s1==s2); //false
		System.out.println(s1.equals(s2)); //true

	}

}
