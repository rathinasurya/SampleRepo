package MavenPractice;

import org.testng.annotations.Test;

public class Sample2Test {
	@Test(groups = "smoke")
	public void Datatest3()
	{
		System.out.println("Data 3 is created");
	}
	@Test(groups = "regression")
	public void Datatest4()
	{
		System.out.println("Data 4 is modified");
	}
}
