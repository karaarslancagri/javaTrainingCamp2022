package kodlama.io.coreLogging;

public class FileLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Logged to File : " + message);
		
	}

}
