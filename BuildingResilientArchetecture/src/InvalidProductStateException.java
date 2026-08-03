
public class InvalidProductStateException extends RuntimeException {
	
	private Object rejectedValue;
	
	//constructor
	 public InvalidProductStateException(String message, Object rejectedValue) {
	        super(message);
	        this.rejectedValue = rejectedValue;
	    }
	
	 //getters
	 public Object getRejectedValue() {
	        return rejectedValue;
	    }
}
