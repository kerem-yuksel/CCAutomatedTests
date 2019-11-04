package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.IndexSePage;
import pages.LoginPageWithEmail;
import pages.MainDashboardPage;

public class BaseTests {

    private WebDriver driver; //create a webdriver object
    protected IndexSePage indexSePage;

@BeforeClass
    public void setUp() {
        System.setProperty ("webdriver.chrome.driver", "resourses/chromedriver");
        //lets intantiate chrome driver ogject
        driver = new ChromeDriver();
        driver.get("https://coolcompany.com/se/");
        driver.manage().window().maximize();
        indexSePage = new IndexSePage(driver);
        LoginPageWithEmail loginPageWithEmail = indexSePage.clickLoginButton();
        loginPageWithEmail.setEmailField("tetiana.kharyna@gmail.com");
        loginPageWithEmail.setPasswordField("223334444");
        //netx 3 lines I put just to test if it works, budWithEmail.clickLoginPrimaryButton();
        mainDashboardPage.getAlertText();
        System.out.println(driver.getTitle());
    }

    public static void main (String [] args){
        BaseTests test = new BaseTests();
        test.setUp();
    }

    @AfterClass
    public void tearDown (){
        driver.quit();
    }

}
}
