package com.testNG;

import org.testng.annotations.Test;

import com.Utilidades.ExcelUtilidades;
import com.Utilidades.MyScreenRecorder;

import PagObjet.PagObjectMercadoLibre;
import PagObjet.PagObjetAlerts;
//import PagObjet.PagObjetAlerts;
import PagObjet.PagObjetTools;
import PagObjet.PagObjetDemo;
import PagObjet.PagObjetMer;
import PagObjet.PagObjetWidges;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class EjemploTestNG

// Fusion

{
	private WebDriver driver;

	PagObjetTools tools;
	PagObjetWidges widges;
	PagObjetAlerts alerts;
	PagObjetDemo pagObjetInicio;
	PagObjetMer mer;
	PagObjectMercadoLibre libre;
	ClaseBase claseBase;
	By txtBusquedaGoogle = By.name("q");

	@BeforeClass
	@Parameters({ "url", "url2", "url3" })

	public void beforeClass(@Optional("default") String url, @Optional("default") String url2,
			@Optional("default") String url3) {

		driver = ClaseBase.chromeDriverConnection();

		claseBase = new ClaseBase(driver);

		widges = new PagObjetWidges(driver);

		alerts = new PagObjetAlerts(driver);

		tools = new PagObjetTools(driver);

		pagObjetInicio = new PagObjetDemo(driver);

		mer = new PagObjetMer(driver);

		libre = new PagObjectMercadoLibre(driver);

		tools.setUrl(url);
		pagObjetInicio.setUrl2(url2);
		libre.setUrl3(url3);

	}

	// TEST MERCURY TOOLS QA
	@Test(dataProvider = "Tools")
	public void pruebaInicialTest(String Ejecutar, String Evidencia, String FirstName, String LastName, String Email,
			String Age, String Salary, String Department, String Dia, String Date, String Hora, String casilla)
			throws Exception {

		if (Ejecutar.equals("SI")) {

			String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

			File rutaCarpeta = claseBase.crearCarpeta(nomTest);
			tools.urlAcceso();

			if (Evidencia.contains("SI")) {

				MyScreenRecorder.startRecording(nomTest, rutaCarpeta);

				tools.Registro(FirstName, LastName, Email, Age, Salary, Department, rutaCarpeta);
				widges.SeleccionarDate(Dia, Date, Hora, rutaCarpeta);
				alerts.busquedaAlert(casilla, rutaCarpeta);

				MyScreenRecorder.stopRecording();
			} else {

				tools.Registro(FirstName, LastName, Email, Age, Salary, Department, rutaCarpeta);
				widges.SeleccionarDate(Dia, Date, Hora, rutaCarpeta);
				alerts.busquedaAlert(casilla, rutaCarpeta);
			}
		}
	}

	@DataProvider(name = "Tools")
	public Object[][] datos() throws Exception {
		Object[][] arreglo = ExcelUtilidades.getTableArray("./Data/buscar.xlsx", "Hoja1");

		return arreglo;
	}

	@Test(dataProvider = "Demo")
	public void pruebaInicial(String Ejecutar, String Evidencia, String FirstName, String LastName, String Phone,
			String Email, String Address, String City, String StateProvince, String PostalCode, String Country,
			String UserName, String Password, String ConfirmPassword) throws Exception

	{
		if (Ejecutar.equals("SI")) {

			String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

			File rutaCarpeta = claseBase.crearCarpeta(nomTest);

			pagObjetInicio.urlAcceso();

			if (Evidencia.contains("SI")) {
				MyScreenRecorder.startRecording(nomTest, rutaCarpeta);

				pagObjetInicio.busquedaI(FirstName, rutaCarpeta);
				mer.Registro(FirstName, LastName, Phone, Email, Address, City, StateProvince, PostalCode, Country,
						UserName, Password, ConfirmPassword, rutaCarpeta);

				MyScreenRecorder.stopRecording();

			} else {

				pagObjetInicio.urlAcceso();
				pagObjetInicio.busquedaI(FirstName, rutaCarpeta);
				mer.Registro(FirstName, LastName, Phone, Email, Address, City, StateProvince, PostalCode, Country,
						UserName, Password, ConfirmPassword, rutaCarpeta);
			}
		}
	}

	@DataProvider(name = "Demo")
	public Object[][] datos2() throws Exception {
		Object[][] arreglo = ExcelUtilidades.getTableArray("./Data/buscar.xlsx", "Hoja2");

		return arreglo;
	}

	@Test(dataProvider = "Libre")
	public void PruebaMLibre(String Ejecutar, String Evidencia, String Producto, String Correo) throws Exception {
		if (Ejecutar.equals("SI")) {
			String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();
			File rutaCarpeta = claseBase.crearCarpeta(nomTest);

			pagObjetInicio.urlAcceso();

			if (Evidencia.contains("SI")) {
				MyScreenRecorder.startRecording(nomTest, rutaCarpeta);

				libre.urlAcceso();
				libre.buscarObjeto(Producto, Correo, rutaCarpeta);

				MyScreenRecorder.stopRecording();

			} else {
				libre.buscarObjeto(Producto, Correo, rutaCarpeta);
			}
		}
	}

	@DataProvider(name = "Libre")
	public Object[][] datos3() throws Exception {
		Object[][] arreglo = ExcelUtilidades.getTableArray("./Data/buscar.xlsx", "Hoja3");

		return arreglo;
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
