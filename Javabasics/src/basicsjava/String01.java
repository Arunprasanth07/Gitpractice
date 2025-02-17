package basicsjava;

public class String01 {

	String litral = "Litral method";

	String neo = new String("newmethod");

	public static void main(String[] args) {

		String name = "Arunprasanth"; 


		// To find the character at the nth in the string
		System.out.println(name.charAt(5));

		// To find the total length of the string
		System.out.println(name.length());
		
		//Check the equality of the string from given object
		System.out.println(name.equals("Arun"));
		
		//Check the equality of the string with case sensitive from given object
		System.out.println(name.equalsIgnoreCase("PRASANTH"));
		
		// To check if the string is empty or not
		System.out.println(name.isEmpty());





	}

}
