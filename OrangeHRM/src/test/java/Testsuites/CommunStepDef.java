package Testsuites;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.LoginPage;
import io.cucumber.java.en.Given;

public class CommunStepDef {
	@Given("Admin is connected with the correct username {string} and the correct password {string}")
	public void admin_is_connected_with_the_correct_username_and_the_correct_password(String username, String Pwd) {
	   Config.confChrome();
	   Config.driver = new ChromeDriver();
	   Config.maximizewindow();
	   String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	   Config.driver.get(url);
	   
	   LoginPage login = new LoginPage();
	   login.connect(username, Pwd);
	}

}
