package TestNGTests;

import org.testng.annotations.Test;

public class Testgroup {
	
	@Test(groups = {"TeamXman"})
	public void Xman() {
		System.out.println("I am wolverine");
	}
	@Test(groups = {"TeamXman"})
		public void Xman2() {
			System.out.println("I am Nightcrawler");
		}
	@Test(groups = {"TeamXman"})
			public void Xman3() {
				System.out.println("I am Strom");
	}
	@Test(groups = {"TeamAvengers"})
			public void Avengers() {
				System.out.println("I am spiderman");
			}
	@Test(groups = {"TeamAvengers"})
			public void Avengers2() {
				System.out.println("I am Ironman");
			}
	@Test(groups = {"TeamAvengers"})
				public void Avengers3() {
					System.out.println("I am THor");
			}

}
