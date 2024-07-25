package Testsuites;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.Telephoneportable;

public class TelephoneportableTestSuite {
	@Before
	public void init() {
		Config.ConfigChrome();
		Config.driver = new ChromeDriver();
		Config.maximisewindow();
		
		String url = "https://www.mytek.tn/telephonie-tunisie/smartphone-mobile-tunisie/telephone-portable.html";
		Config.driver.get(url);
		
				
	}

	@Test
	public void clickonproduit() throws Exception {
		Telephoneportable Tel = new Telephoneportable ();
		Tel.clickonproductbyname("Téléphone Portable M-HORSE M3310 - Bleu Foncé");
		
	}
}
