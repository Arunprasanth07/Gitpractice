package basicsjava;

public class basics1 {
Integer accountno = 100;
	
	String name = "Arun";
	
	int balance = 999999990;
	
	public int Getbalance() {
		System.out.println("Richie Rich " + balance);
		return(balance);
	}
		
	public static void main(String[] args) {
	
    basics1 account = new basics1();
   int status = account.Getbalance();
		System.out.println("I am rich " + status);
	}
}
