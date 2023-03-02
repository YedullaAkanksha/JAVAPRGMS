package innerclass;

public class anonomouscls {
	public static void main(String[] args) {
		connection con=printerdrive.connect();
		con.print();
	}

}
class printerdrive{
	static connection connect() {
		//anonymous
		connection con=new connection() {

			@Override
			public void print() {
				System.out.println("printing");
				// TODO Auto-generated method stub
				
			}
			
		};return con;
	}
}
interface connection{
	void print();
}