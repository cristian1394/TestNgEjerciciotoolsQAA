package PagObjet;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import MapsObjet.MapsObjetWidges;

public class PagObjetWidges extends MapsObjetWidges {
	public PagObjetWidges(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void urlAcceso(String url) {
		driver.get(url);
		// busquedaInicial();
	}

	public void SeleccionarDate(String Dia,String Date,String Hora,File rutaCarpeta) throws Exception {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		click(btnwidgets, rutaCarpeta);
		tiempoEspera(2000);

		click(datepicker, rutaCarpeta);
		tiempoEspera(1000);

		click(selectdate, rutaCarpeta);
		tiempoEspera(3000);

		controla(selectdate, rutaCarpeta);
		tiempoEspera(3000);

		teclaborrar(selectdate, rutaCarpeta);

		sendkey(Dia, selectdate, rutaCarpeta);

		intro(selectdate, rutaCarpeta);

		controla(dateMonthDateHour, rutaCarpeta);
		tiempoEspera(3000);
		
		teclaborrar(dateMonthDateHour, rutaCarpeta);
		
		
		sendkey(Date+" "+Hora, dateMonthDateHour, rutaCarpeta);
		tiempoEspera(3000);
		
		
		intro(dateMonthDateHour,rutaCarpeta);
		
		

	}

}
