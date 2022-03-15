package practice;
@SuppressWarnings("serial")
class TooyoungException extends RuntimeException{
	TooyoungException(String msg){
		super(msg);
	}
}
@SuppressWarnings("serial")
class TooOldException extends RuntimeException{
	TooOldException(String msg){
		super(msg);
	}
}
public class CustDemo {
	public static void main(String[] args) {
		int age= Integer.parseInt(args[0]);
		if (age>60) {
			throw new TooyoungException("pls wait for some time");
		}
		else if(age <18) {
			throw new TooOldException("fkljsahfklaj");
		}
		else {
			System.out.println("thanks for registration");
		}
		
	}
}
