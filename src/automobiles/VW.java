package automobiles;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class VW {
	@BeforeClass
	public void Vw() {
		
		System.out.println("Das Auto");
	}
	@AfterSuite
	public void Thanks() {
		
		System.out.println("Thanks Welcome Again to Automobile world of Cars");
	}
	@BeforeMethod
	public void Germans() {
		
		System.out.println("We are Germans");
	}
	
	@Test(dataProvider="year")
	public void Polo(String make, String model){
		
		System.out.println("VW Polo");
		System.out.println(make);
		System.out.println(model);
	}
	@BeforeTest
	public void Vento(){
		
		System.out.println("VW Vento");
	}
	@Test(groups = {"Sedan"})
	public void Passat(){
		
		System.out.println("VW Passat");
	}
	@AfterClass
	public void Volks() {
		
		System.out.println("Welcome back to VW");
	}
	@DataProvider
	public Object[][] year() {
		
		Object[][] data = new Object[3][2];
		data[0][0] = "2013";
		data[0][1] = "TSI";
		data[1][0] = "2014";
		data[1][1] = "TDI";
		data[2][0] = "2015";
		data[2][1] = "TDI";
		return data;
				
	}
}
