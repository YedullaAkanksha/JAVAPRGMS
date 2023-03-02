package exception;

public class ThrowDemo {
	public static void main(String[] args) {
		int arr[]=new int[3];
		try {
			arr[10]=6;
			
			throw(new Exception( "exceptn"));
		}
		catch(Exception e) {
			System.out.println("exception" + e.getMessage());
		}
		finally {
		System.out.printf("arr length is:"+ arr.length);	
			//System.out.println("change the b" );
	}
		class MyException extends ThrowDemo{
			   String str1;
			   MyException(String str2) {
				str1=str2;
			   }
			   public String toString(){ 
				return ("MyException Occurred: "+str1) ;
			   }
			}
				try{
					System.out.println("Starting of try block");
					// I'm throwing the custom exception using throw
					throw(new Exception("This is My error Message"));
				}
				catch(Exception exp){
					System.out.println("Catch Block"+ exp.getMessage()) ;
					//System.out.println(exp) ;
				}
			   }

	
	
	}


