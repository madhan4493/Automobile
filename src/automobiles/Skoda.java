package automobiles;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Skoda {
	
	@Test(groups = {"Sedan"})
	public void Octavia(){
		
		System.out.println("Skoda Octavia");
	}
	@Test
	public void Laura(){
		
		System.out.println("Skoda Laura");
	}
	@AfterTest
	public void Kodiaq(){
		
		System.out.println("Skoda Kodiaq");
	}

}
