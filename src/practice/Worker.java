package practice;

public class Worker implements AutoCloseable {
	
	
	public void dosomething() {
		System.out.println("doing something");
	}

	@Override
	public void close() throws Exception {
		
		System.out.println("Closing the resource");

	}

}
