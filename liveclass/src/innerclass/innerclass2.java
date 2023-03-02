package innerclass;

public class innerclass2 {
	public static void main(String[] args) {
		Car c=new Car("red");
		c.start();
		Car.speaker s=c. new speaker(0);
		s.displaydetails();
		s.playmusic();
		
	}

}
class Car{
	private static String model="i20";
	private String color;
	void start() {
		System.out.println("Starting");
	}
	Car(String color){
		this.color=color;
	}
	class speaker{
		private int range;
		speaker(int num ){
			this.range=num;
		}
		void displaydetails() {
			System.out.println("model:" + Car.model);
			System.out.println("color :" + Car.this.color);
			System.out.println("range :"+ this.range);
		}
		void playmusic() {
			System.out.println("playing");
			class channel{
				int freq;
				void currentsong() {
					System.out.println("displaying")
				}
			}
			channel ch=new channel();
			ch.currentsong();
			
		}
	}
	
}