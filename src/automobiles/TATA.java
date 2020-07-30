package automobiles;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TATA {

	
	@Test
	public void SafariStorme(){
		
		System.out.println("TATA SafariStorme");
	}
	@Test
	public void Hexa(){
		
		System.out.println("TATA Hexa");
		System.out.println("new update");
	}
	@Test
	public void Aria(){
		
		System.out.println("TATA ARIA");
		System.out.println("discontinued");
	}
	@BeforeSuite
	public void Welcome() {
		
		System.out.println("Welcome to Automobile world of Cars");
	}
}
