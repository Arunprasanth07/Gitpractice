package basicsjava;

public abstract class Polymorphism {

	public abstract void topendbm();
	
	public void topend(Bmw powerhouse) {
		System.out.println("The powerhouse of Benz is AMG One");
	}
	public void topend(Benz powerhouse) {
		System.out.println("The powerhouse of Benz is AMG One");
	}
		public void topend(Audi powerhouse) {
			System.out.println("The powerhouse of Audi is RS Q8");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	Polymorphism ex = new Polymorphism(); // Can create objects since the class is abstract class
		Bmw Bmw = new Bmw();
		ex.topend(Bmw);
		
		Audi Audi = new Audi();
		ex.topend(Audi);
		
		Benz Benz = new Benz();
		ex.topend(Benz); */
		
	}

}
