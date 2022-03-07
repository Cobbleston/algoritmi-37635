package exceptions;

public class BadException extends Exception {

	private static final long serialVersionUID = 1L;

	public String getMessage() {
    return "This is a really bad exception...";
  }
	
}
