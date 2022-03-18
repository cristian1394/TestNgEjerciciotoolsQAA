package PagObjet;
//crist

import java.io.File;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import MapsObjet.MapObjectMercadoLibre;


public class PagObjectMercadoLibre extends MapObjectMercadoLibre
{

	public  String url3 ;
	
	


	public String getUrl3() {
		return url3;
	}

	public void setUrl3(String url3) {
		this.url3 = url3;
	}

	public PagObjectMercadoLibre(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
	}
	
	public void urlAcceso() 
	{
		driver.get(url3);
		
	}
	
	
	
	// METODO PRIMERA PRUEBA - BUSCAR OBJETO EN MERCADO LIBRE
	public void buscarObjeto(String Producto,String Correo,File rutaCarpeta) throws Exception
	{
		sendkey(Producto,txtBusquedaML, rutaCarpeta);
		submit(txtBusquedaML, rutaCarpeta);
		click(btnBuscarML, rutaCarpeta);
		tiempoEspera(2000);
		click(selecObjeto, rutaCarpeta);
		tiempoEspera(2000);	
	
		
		
	//public void crearCuenta2(String Correo,File rutaCarpeta) throws Exception {
		
		
		click(crearCuentaML, rutaCarpeta);
		tiempoEspera(3000);
		click(validarDatosML, rutaCarpeta);
		tiempoEspera(2000);
		click(btnvalidarEmailML, rutaCarpeta);
		tiempoEspera(3000);	
		sendkey(Correo,txtIngresarEmailML, rutaCarpeta);
		click(btnIngresarEMailML, rutaCarpeta);
		//submit(crearCuentaML, rutaCarpeta);
		tiempoEspera(2000);
			
	}


}
