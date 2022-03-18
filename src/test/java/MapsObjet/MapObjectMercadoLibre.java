package MapsObjet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.testNG.ClaseBase;

public class MapObjectMercadoLibre extends ClaseBase
{

	public MapObjectMercadoLibre(WebDriver driver) {
					
		super(driver);
		this.driver=driver;
					
					
	}
	
	// ELEMENTOS PAGINA INICIAL
	// RUTA BUSCADOR
	protected By txtBusquedaML = By.cssSelector("#cb1-edit");
	// RUTA BOTÓN LUPA
	protected By btnBuscarML = By.xpath("//div[@aria-label='Buscar']");
	//SELECCIONAR MICROFONO
	protected By selecObjeto = By.xpath("//h2[contains(text(),'Xiaomi Poco F3 5G Dual SIM 256 GB negro nocturno 8')]");
	// CREAR TU CUENTA
	protected By crearCuentaML = By.xpath("//nav[@id='nav-header-menu']//a[contains(text(),'Crea tu cuenta')]");
	// VALIDAR DATOS
	protected By validarDatosML = By.xpath("//span[@class='andes-button__content']");
	// BTNVALIDAR EMAIL
	protected By btnvalidarEmailML = By.xpath("//span[@class='andes-button__text']");
	// INGRESAR MAIL
	protected By txtIngresarEmailML = By.xpath("//input[@name='email']");
	// BTN INGRESAR MAIL
	protected By btnIngresarEMailML = By.xpath("//span[@class='andes-button__content']");

	
  @Test
  public void f() {
  }
}
