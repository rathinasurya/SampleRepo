package MavenPractice;

import org.testng.annotations.Test;

public class Sample3Test {
	@Test(groups = "regression")
	public void datatest5()
	{
		System.out.println("Data 5 is created");
	}
	@Test(groups = "smoke")
	public void datatest6()
	{
		System.out.println("Data 6 is modified");
	}
}
