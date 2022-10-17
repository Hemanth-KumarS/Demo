package Pratice;


;

public class Demo2 {

	//@Test
	public void createCustomerTest() {
		System.out.println("customer details created");
		
	}
	//@Test(dependsOnMethods="createCustomerTest")
	public void modifyCustomerTest() {
		System.out.println("customer details modified");
	}
	//@Test(dependsOnMethods="createCustomerTest")
	public void deleteCustomerTest() {
		System.out.println("customer details deleted");
	}
	
}
