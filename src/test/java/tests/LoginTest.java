package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest {

    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://example.com/login");
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testValidLogin() {
        loginPage.enterUsername("testuser");
        loginPage.enterPassword("password");
        loginPage.clickLogin();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
