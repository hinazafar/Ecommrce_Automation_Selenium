package ui;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hellotest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().driverVersion("131.0.6778.205").setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}

}
