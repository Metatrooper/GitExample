package practice;

public class TestTryWithResource {

	public static void main(String[] args) {
		Worker w=new Worker();         //you can define object outside try block
		
		try(w){
			w.dosomething();
		}catch (Exception e) {
			
		}

	}

}
