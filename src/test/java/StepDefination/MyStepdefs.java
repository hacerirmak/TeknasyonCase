package StepDefination;

import com.comcast.magicwand.spells.appium.AppiumDriverBuilder;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import page_object_model.AbstarctClass;
import page_object_model.access_page;

import java.net.URL;


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
            // Write code here that turns the phrase above into concrete actions

        }
        @Then("Ok butonuna tıklanır.")
        public void ok_butonuna_tıklanır() {
            // Write code here that turns the phrase above into concrete actions

        }

    }
