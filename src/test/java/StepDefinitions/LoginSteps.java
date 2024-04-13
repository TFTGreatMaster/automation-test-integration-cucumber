package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class LoginSteps {

    WebDriver driver = null;

    @Given("is on Login Page")
    public void useIsOnLoginPage() {
        System.out.println("login");
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        driver.navigate().to("https://demoqa.com/login");
    }

    @When("^users enter username and password$")
    public void UseEnterUserAndPassword(){
        driver.findElement(By.id("userName")).sendKeys("nguyen.le");
        driver.findElement(By.id("password")).sendKeys("1");
    }

    @When("user click login")
    public void useClickLogin(){
        driver.findElement(By.id("login")).click();
    }

    @Then("we can see honepage")
    public void we_can_see_homepage(){
        driver.getPageSource().contains("Invalid username or password!\n" + "\n");
        driver.close();
        driver.quit();
    }
}
