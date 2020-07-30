package automobiles;

import org.testng.annotations.Test;

public class Toyota {

	@Test
	public void Fortuner(){
		
		System.out.println("Toyota Fortuner");
	}
	@Test
	public void Qualis(){
		
		System.out.println("Toyota Qualis");
	}
	@Test(groups = {"Sedan"})
	public void Corolla(){
		
		System.out.println("Toyota Corolla");
	}
	@Test
	public void InnovaCrysta(){
		
		System.out.println("Toyota Innova Crysta");
	}
}
