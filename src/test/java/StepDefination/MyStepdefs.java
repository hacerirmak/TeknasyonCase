package StepDefination;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.time.Duration;


public class MyStepdefs {
        
        public AndroidDriver driver;

    
    @Before
    public void setUp() throws  Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Pixel 4 XL API 29");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("udid","emulator-5554");
        capabilities.setCapability("platformVersion","10.0");
        capabilities.setCapability("appPackage","com.hmh.api");
        capabilities.setCapability("appActivity","com.hmh.api.ApiDemos");
        capabilities.setCapability("skipUnlock","true");
        capabilities.setCapability("noReset","false");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);


    }

        @Given("Haedar alanindaki baslik kontrol edilir.")
        public void haedar_alanindaki_baslik_kontrol_edilir() {



        }
        @And("Devam butonuna tıklanır.")
        public void devam_butonuna_tıklanır() {
            By continueButton = By.id("com.android.permissioncontroller:id/continue_button");
            WebElement continueSelect = driver.findElement(continueButton);
            continueSelect.click();
        }
        @Given("Pop up kontrol edilir.")
        public void pop_up_kontrol_edilir() {


        }
        @Then("Ok butonuna tiklanir.")
        public void ok_butonuna_tiklanir() {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/button1")));
            By okButton=By.id("android:id/button1");
            WebElement okSelect = driver.findElement(okButton);
            okSelect.click();
        }

    }
