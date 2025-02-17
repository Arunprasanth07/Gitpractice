package reCap;

public class switchCase {

	String bike;
	
	public void moto(String bike) {
	
     switch (bike) {
	case "KTM":
		System.out.println("You are thinking about KTM");break;
	case "yamaha":
		System.out.println("You are thinking about Yamaha");break;
	case "RE":
		System.out.println("You are thinking about RE");break;
     case "Hero":
		System.out.println("You are thinking about Hero");break;
     case "BMW":
		System.out.println("You are thinking about BMW");break;
	default :
		System.out.println("You are not thinking about bike, Bitch");
	}
	
}
	public static void main(String[] args) {

		switchCase rider = new switchCase();
		rider.moto("KTM");
	}

}
