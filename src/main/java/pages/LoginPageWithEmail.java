package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageWithEmail {

    private WebDriver driver;
    private By emailField = By.name("Email");
    private By passwordField = By.name("Password");
    private By loginPrimaryButton = By.xpath("//*[@id=\"password\"]/form/div[3]/button");

    public LoginPageWithEmail (WebDriver driver){
        this.driver = driver;
    }

    public void setEmailField (String email){
        driver.findElement(emailField).sendKeys();
    }

    public void setPasswordField (String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public MainDashboardPage clickLoginPrimaryButton (){
        driver.findElement(loginPrimaryButton).click();
        return new MainDashboardPage (driver);

    }


}
