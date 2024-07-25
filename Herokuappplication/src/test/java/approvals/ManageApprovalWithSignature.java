package approvals;

import java.time.Duration;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageApprovalWithSignature {

	@Test
	public void approbationNonEtablie_SignaturNonSaisie() throws Exception {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
		String url = "https://szimek.github.io/signature_pad/";
		driver.manage().window().maximize();
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement btnsavepng = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[2]/button[1]"));
		btnsavepng.click();
		
		String Text = driver.switchTo().alert().getText();
		System.out.println("Le message d'alerte est: " + Text);
		
		String expectedText = "Please provide a signature first.";
		
		Assert.assertEquals(Text, expectedText);
		Thread.sleep(4000);
		
		driver.switchTo().alert().accept();
		
		
		
	}
}
