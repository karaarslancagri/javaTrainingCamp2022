package kodlama.io.coreLogging;

public class DatabaseLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Logged to Database : " + message);
		
	}

}
