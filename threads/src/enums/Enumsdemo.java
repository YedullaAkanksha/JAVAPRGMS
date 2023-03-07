package enums;

public class Enumsdemo {
	public static void main(String[] args) {
		Payment p=Payment.DEBITCARD;
		System.out.println(p);
		Payment[] val=Payment.values();
		for(Payment payment:val) {
			System.out.println(payment);
			System.out.println(payment.ordinal());
			System.out.println(payment.getfee());
		}
	}

}
enum Payment{
	DEBITCARD(5),
	CREDITCARD(10),
	CASH(5);
	int fee;
	Payment(int fee){
		this.fee=fee;
	}
	public int getfee() {
		return this.fee;
	}}
//class Payment{
//	static final Payment DEBITCARD=new Payment();
//}
