package Testsuites;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.DisqueSSD;

public class DisqueSSDtestsuite {

	@Before 
	
	public void init() {
		Config.confChrome();
		Config.driver = new ChromeDriver ();
		Config.maximizewindow();
		String url = "https://www.tunisianet.com.tn/379-disques-ssd";
		Config.driver.get(url);
				
	}
	@Test
	public void clickonproduct() throws Exception {
		DisqueSSD SSD = new DisqueSSD();
		SSD.clickonproductbyname("Disque Dur Interne HIKVISION E100 / 128 Go SSD");
		
	}
}
