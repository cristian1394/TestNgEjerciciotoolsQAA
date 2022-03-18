package MapsObjet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.testNG.ClaseBase;

public class MapsObjetDemo extends ClaseBase{
  public MapsObjetDemo(WebDriver driver) {
		
	  super(driver);
		this.driver=driver;
	}
  
  protected By btnregistrar= By.xpath("//a[@href='register.php']");

@Test
  public void f() {
  }
}
