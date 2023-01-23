package MavenPractice;

import org.testng.annotations.Test;

public class Sample6Test {
	@Test(groups = "regression")
	public void datatest11()
	{
		System.out.println("Data 11 is created");
	}
	@Test(groups = "smoke")
	public void datatest12()
	{
		System.out.println("Data 12 is modified");
	}
}
