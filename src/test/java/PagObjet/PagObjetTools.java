package PagObjet;

import java.io.File;

import org.openqa.selenium.WebDriver;

import MapsObjet.MapsObjetTools;
import MapsObjet.MapsObjetWidges;

public class PagObjetTools extends MapsObjetTools {
	
	public  String url ;
	
	
	public PagObjetTools(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void setUrl(String url) {
		this.url = url;
	}


	public void urlAcceso() {
		driver.get(url);
		// busquedaInicial();
	}
	
	

	public void Registro(String FirstName, String LastName, String Email, String Age, String Salary, String Department,
			File rutaCarpeta) throws Exception {
		
		click(btnelements, rutaCarpeta);

		click(webtables, rutaCarpeta);

		click(add, rutaCarpeta);

		sendkey(FirstName, txtFN, rutaCarpeta);
		sendkey(LastName, txtLN, rutaCarpeta);
		sendkey(Email, txtEmail, rutaCarpeta);
		sendkey(Age, txtAge, rutaCarpeta);
		sendkey(Salary, txtSalary, rutaCarpeta);
		sendkey(Department, txtDepartment, rutaCarpeta);

		click(submit, rutaCarpeta);
		tiempoEspera(1000);

		click(delete, rutaCarpeta);
		tiempoEspera(1000);

	}

}
