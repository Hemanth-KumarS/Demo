package Pratice;





public class DataProvider {
//@Test(dataProvider="dataProvider_test")
public void bookTicket(String src,String dst)
{
	System.out.println("Book tickets from "+src+" to "+dst+"");
}
@org.testng.annotations.DataProvider
public Object[][] dataProvider_test(){
	Object[][] objArr=new Object[5][2];
	
	objArr[0][0]="Bengaluru";
	objArr[0][1]="Hubli";
	
	objArr[1][0]="Bengaluru";
	objArr[1][1]="Mysore";
	
	objArr[2][0]="Bengaluru";
	objArr[2][1]="Goa";
	
	objArr[3][0]="Bengaluru";
	objArr[3][1]="Delhi";
	
	objArr[4][0]="Bengaluru";
	objArr[4][1]="Gadag";
	
	return objArr;
	
	
}

}
