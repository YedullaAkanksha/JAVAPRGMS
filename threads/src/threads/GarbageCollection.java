package threads;

public class GarbageCollection {
	public static void main(String[] args) {
//		
//		for(int i=1;i<=10000;i++) {
//			new House(i);
//			
//		}
		new House(1);
		System.gc();
	}
}

class House{
	int id;
	House(int id){
		this.id=id;
		Utils.printmessage("House created" +id);
	}
	@Override
	protected void finalize() throws Throwable{
		Utils.printmessage("House destroyed"+ id);
	}
}