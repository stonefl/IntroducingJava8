package Java8Features;

public class LambdaExpressions {

	public static void main(String[] args) {
		
		// create a Runnable object
		Runnable oRun = new Runnable(){

			@Override
			public void run() {
				// print a greeting
				System.out.println("Hello Java 8!");
				
			}			
		};
		
		//pass the defined Runnable object to the thread
		//new Thread(oRun).start();
		
		//using lambda expression
		new Thread( () -> System.out.println("Hello lambda expression!") ).start();

	}

}
