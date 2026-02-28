package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test
	public void verifyLogin() {

		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsername("Admin");
		loginPage.enterPassword("admin123");
		loginPage.clickLogin();

		HomePage homePage = new HomePage(driver);
		Assert.assertTrue(homePage.isDashboardDisplayed(), "Login Failed!");
	}
}