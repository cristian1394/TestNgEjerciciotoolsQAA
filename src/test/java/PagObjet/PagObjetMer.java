package PagObjet;

import java.io.File;

import org.openqa.selenium.WebDriver;
import MapsObjet.MapsObjetMer;

public class PagObjetMer  extends MapsObjetMer{
  
	public PagObjetMer(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public void urlAcceso(String url2) 
	{
		driver.get(url2);
		//busquedaInicial();
	}
	
	public void Registro(String FirstName,String LastName,String Phone,String Email,String Address,
			String City,String StateProvince,String PostalCode,String Country,String UserName,String Password,
			String ConfirmPassword,File rutaCarpeta) throws Exception
	{
		
		
		sendkey(FirstName, txtFN, rutaCarpeta);
		sendkey(LastName, txtLN, rutaCarpeta);
		sendkey(Phone, txtPhone, rutaCarpeta);
		sendkey(Email, txtEmail, rutaCarpeta);
		sendkey(Address, txtAd, rutaCarpeta);
		sendkey(City, txtCity, rutaCarpeta);
		sendkey(StateProvince, txtState, rutaCarpeta);
		sendkey(PostalCode, txtPC, rutaCarpeta);
		sendkey(Country, Pais, rutaCarpeta);
		sendkey(UserName, txtUN, rutaCarpeta);
		sendkey(Password, txtPswd, rutaCarpeta);
		sendkey(ConfirmPassword, txtCPswd, rutaCarpeta);
		
		
	}
	
}
