package MavenPractice;

import org.testng.annotations.Test;

public class Sample4Test {
	@Test(groups = "regression")
	public void datatest7()
	{
		System.out.println("Data 7 is created");
	}
	@Test(groups = "smoke")
	public void datatest8()
	{
		System.out.println("Data 8 is modified");
	}
}
