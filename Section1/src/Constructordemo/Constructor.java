package Constructordemo;

public class Constructor {
	private int id;
	private int salary;
	private String Name;

	 Constructor(int id,int salary,String Name) {
		this.id=id;
		this.salary=salary;
		this.Name=Name;
		System.out.println("id is"+ id + "salary is"+ salary + "Name is"+ Name);
		}
	 Constructor() {
	    System.out.print("hii");}
	Constructor(int id) {
		this.id=id;
		System.out.println("id is"+ id);
	  
	}
	public static void main(String args[]) {
		Constructor c=new Constructor(23,111,"asdf");
		Constructor d=new Constructor();
		
	}

}
