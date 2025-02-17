package basicsjava;


public class Bmw extends Polymorphism {
	
	@Override
	
	public void topendbm()
	{
		System.out.println("The new powerhouse of beemer in M5 compatation");
	}
	public static void main(String[] args) {
		
		Polymorphism poly = new Bmw();
		
		poly.topendbm();
		
	}

}
