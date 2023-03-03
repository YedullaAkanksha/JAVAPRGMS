package threads;

public class Example {
	public static void main(String[] args) throws Exception{
		int n=10;
		for(int i=1;i<=10;i++) {
			Utils.printmessage(""+i);
		}
		Runnable r1=new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=1;i<=10;i++) {
					if(i%2==0) {
						Utils.printmessage(""+i);
					}
				}}
					
			};
			Runnable r2=new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub
					for(int i=1;i<=10;i++) {
						if(i%2!=0) {
							Utils.printmessage(""+i);
						}
					}}
						
				};
				
				Thread t1=new Thread(r1);
				t1.setName("even");
				t1.start();
				Thread t2=new Thread(r2);
				t2.setName("odd");
				t2.start();
				for(int i=1;i<=10;i++) {
					Utils.printmessage(""+i);
				}
			
		}
}
		


