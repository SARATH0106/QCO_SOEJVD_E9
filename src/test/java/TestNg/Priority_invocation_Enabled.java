package TestNg;

import org.testng.annotations.Test;

public class Priority_invocation_Enabled {
	@Test(priority=2,invocationCount=2	)
	public void demo1()
	{
		System.out.println("Hi from demo1");
	}
	
	@Test(priority=1,invocationCount=4)
    public void demo2()
  {
		System.out.println("Hi from demo2");
	}
	
    @Test(priority=3,invocationCount=3,enabled=true)
    public void demo3()
  {
	System.out.println("Hi from demo3");
  }

}
