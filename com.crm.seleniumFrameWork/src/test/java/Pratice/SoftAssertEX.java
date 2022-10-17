package Pratice;


import org.testng.asserts.SoftAssert;

public class SoftAssertEX {
	
	//@Test
	public void createCustomer() {
		System.out.println("step1");
		System.out.println("step2");
		SoftAssert soft=new SoftAssert();
		soft.assertEquals("A", "B");
		System.out.println("step3");
		System.out.println("step4");
		soft.assertAll();
	}
	
	//@Test
	public void modifyCustomer() {
		System.out.println("-------------------------");
		System.out.println("step1");
		System.out.println("step2");
	}

}
