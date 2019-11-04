package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainDashboardPage {

    private WebDriver driver;

    private By statusAlert = By.xpath("//*[@id=\"main-container\"]/div/div[2]/div[1]/div[2]/section/p");

    public MainDashboardPage (WebDriver driver){
        this.driver = driver;
    }

    public String getAlertText (){
        return driver.findElement(statusAlert).getText();
    }
}
