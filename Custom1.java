package practice;

public class Custom1 {
	static int age=14;
		static void validate()  {
			
			if (age<18) {
				throw new InvalidAgeException("age is not valid to vote");
			}
			else {
				System.out.println("Welcome to vote");
			}
		}
		public static void main(String[] args) {

			
			try {
				validate();
			}
			catch(InvalidAgeException e) {
				
				System.err.println("caught the excetion");
				
				System.err.println("Exception occured"+e);
			}
			System.out.println("rest of the code");
		}
	    
	}


