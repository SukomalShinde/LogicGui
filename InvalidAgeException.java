package practice;

public  class InvalidAgeException extends RuntimeException {

String str;
	public InvalidAgeException(String str) {
		super(str);
	}
}

