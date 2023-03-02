package innerclass;

public class classdemo {
	public static void main(String[] args) {
		Device.poweron();
		Device.chip.current();
		Device.chip c=new Device.chip();
		c.connection();
		Device d=new Device();
		d.poweron();
		Device.charge f=d.new charge();
		f.full();
		Device.charge.battery();
	}

}
class Device{
	static void poweron() {
		System.out.println("power is on");
	}
	static class chip{
		static void current() {
			System.out.println("positive");
		}
		void connection() {
			System.out.println("connected");
		}}
	class charge {
		void full() {
			System.out.println("NO");
			
		}
		static void battery(){
			System.out.println("battery 50");
			
		}
	}
		
	
}