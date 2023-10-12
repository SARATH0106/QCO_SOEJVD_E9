package TestNg_group;

import org.testng.annotations.Test;

public class Sample1 {
	@Test
	public void demo1() {
		System.out.println("hi from demo 1");
	}
	@Test(groups="smoke")
	public void demo2() {
		System.out.println("hi from demo 2");
	}
		@Test
		public void demo3() {
			System.out.println("hi from demo 3");
		}

}
