package MavenPractice;

import org.testng.annotations.Test;

public class Sample5Test {
	@Test(groups = "regression")
	public void datatest9()
	{
		System.out.println("Data 9 is created");
	}
	@Test(groups = "smoke")
	public void datatest10()
	{
		System.out.println("Data 10 is modified");
	}
}
