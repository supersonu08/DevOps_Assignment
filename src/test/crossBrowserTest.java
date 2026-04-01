import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class crossBrowserTest {
  
@Test
  public void browserTest() {
	  
	  WebDriver driver =new ChromeDriver()
      driver.get("https://www.amazon");
			  
  }
}
