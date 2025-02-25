package chapter5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private final By txtusername = By.cssSelector("input[placeholder='Username']");
    private final By txtpassword = By.cssSelector("input[placeholder='Password']");
    private final By btnLogin = By.cssSelector("button[type='submit']");

    //WebDriver driver;
    public LoginPage(WebDriver driver){

        super(driver);
    }


    public void Login(){

        driver.findElement(txtusername);
        driver.findElement(txtpassword);
        driver.findElement(btnLogin).click();



    }

    //public HomePage

}
