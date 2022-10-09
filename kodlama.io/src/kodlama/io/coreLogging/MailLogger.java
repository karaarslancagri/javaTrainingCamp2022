package kodlama.io.coreLogging;

public class MailLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Mail sent : " + message);
		
	}

}
