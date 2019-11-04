package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IndexSePage {
    private  WebDriver driver;
 ///loginButton = driver.findElement(By.linkText("Logga in"));
    //        loginButton.click();
//        System.out.println(driver.getTitle());
    private By loginButton = By.linkText("Logga in");
//    private By singUpButton = By.linkText("Skapa konto");

    public IndexSePage(WebDriver driver){
        this.driver = driver;
    }


    public LoginPageWithEmail clickLoginButton (){
    driver.findElement(loginButton).click();
    return new LoginPageWithEmail(driver);
    }





}
