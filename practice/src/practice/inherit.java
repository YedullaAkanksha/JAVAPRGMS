package practice;
public static void main(String args[]) {
	child c=new child();
	c.meth1();
}


public class inherit {
	void meth1() {
	System.out.println("hoo");
	}
public class child extends inherit{
	void meth1() {
	super.meth1();
	System.out.println("hi");
	             }
    }
}
