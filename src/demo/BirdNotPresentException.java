package demo;

@SuppressWarnings("serial")
public class BirdNotPresentException extends Exception {
	
	public BirdNotPresentException(String message){
		super(message);
	}
}