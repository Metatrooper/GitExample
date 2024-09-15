package practice;

public class EqualMethod {

	public static void main(String[] args) {
		
		String t1=new String("Radha");
		String t2=new String("Radha");
		
		System.out.println(t1==t2); //false
		System.out.println(t1.equals(t2)); //true

	}

}
