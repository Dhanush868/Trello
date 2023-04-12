package learntestng;

import org.testng.annotations.Test;
//testNG class
public class KGF {
	@Test(priority = 2)
	public void garuda() {
		System.out.println("KGF Controlled by garuda");
	}
	@Test(priority = 4)
	public void adheera() {
		System.out.println("KGF Controlled by adheera");
	}
	@Test(priority = 3)
	public void rajendraDesai() {
		System.out.println("KGF Controlled by rajendraDesai");
	}
	@Test(priority = 6, invocationCount = 9, dependsOnMethods = {"mumbaiShetty","vanaram","garuda"})
	public void rocky() {
		System.out.println("KGF Controlled by rocky");
	}
	@Test
	public void vanaram() {
		int a[] = {1,2,3};
		System.out.println(a[2]);
		System.out.println("KGF Controlled by vanaram");
	}
	@Test(priority = 5)
	public void mumbaiShetty() {
		System.out.println("KGF Controlled by mumbaiShetty");
	}
	@Test(priority = 1)
	public void suryavardhan() {
		System.out.println("KGF Controlled by suryavardhan");
	}
	@Test(priority = 7)
	public void ramikasen() {
		System.out.println("KGF Controlled by ramikasen");
	}
}
