package Multipleint;
public class Multipleint {
	public static void main(String args[]) {
	Tv tv=new Tv();
	tv.poweron();
	Monitor Mon=new Monitor();
	Mon.poweron();

}}
class elecdev{
	void poweron() {
		System.out.println("screen on");
	}
}
class Tv extends elecdev{
	void poweron() {
		System.out.println("Tv on");
	}
}
class Monitor extends elecdev{
	void poweron() {
		System.out.println("mon on");
	}
}

class desktop implements Tv, Monitor{
	public void poweron() {
		Tv.super.poweron();
		Monitor.super.poweron();
		
	}
	
}
interface Tv {
	
}
