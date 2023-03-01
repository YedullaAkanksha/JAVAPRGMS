package Multipleint;

public interface Monitor {
	public default void poweron() {
		System.out.println("mon");
	}

}
