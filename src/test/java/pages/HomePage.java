package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;

	private By dashboardText = By.xpath("//h6[text()='Dashboard']");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isDashboardDisplayed() {
		return driver.findElement(dashboardText).isDisplayed();
	}
}