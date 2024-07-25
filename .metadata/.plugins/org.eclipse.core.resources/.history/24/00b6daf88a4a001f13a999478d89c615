package Helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Config {
	
	public static WebDriver driver;
	public static Actions Action;
	public static void ConfChrome() throws Exception {
		System.setProperty("webdriver.chrome.driver", Utils.getproprety("TestDriverPath"));
	}
	
    public static void maximizewindow() {
    	driver.manage().window().maximize();
    }
    public static void attente(long s)  {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(s));
    }
}
