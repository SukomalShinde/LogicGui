package practice;

public class InvalidAge extends Exception {

	
	InvalidAge() {

		super("You are under age");
	}

	InvalidAge(String msg) {

		super(msg);
	}

	public static void main(String[] args) {
		
		 int age =17;
		 try {
			 if (age<18)
			 
			throw  new InvalidAge();
			 
		 else {System.out.println("You can vote now");}}
			 catch(InvalidAge e) {
				 System.out.println(e);
			 }
				 }
}