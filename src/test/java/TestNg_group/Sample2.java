package TestNg_group;

import org.testng.annotations.Test;

public class Sample2 {
	
	@Test(groups="smoke")
	public void demo4() {
		System.out.println("hi from demo 4");
	}
	@Test
	public void demo5() {
		System.out.println("hi from demo 5");
	}
		@Test(groups="smoke")
		public void demo6() {
			System.out.println("hi from demo 6");
		}

}
