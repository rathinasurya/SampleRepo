package MavenPractice;

import org.testng.annotations.Test;

public class Sample1Test {
	@Test(groups = "regression")
	public void Datatest1() {
		System.out.println("Data 1 is created");
	}

	@Test(groups = "smoke")
	public void modifyDatatest() {
		System.out.println("Data 2 is modified");
	}

}
