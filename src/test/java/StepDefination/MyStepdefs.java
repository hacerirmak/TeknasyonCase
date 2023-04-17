package StepDefination;

import com.comcast.magicwand.spells.appium.AppiumDriverBuilder;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
    @RunWith(Cucumber.class)
    class MyStepdefs {
        
        public AndroidDriver<MobileElement> driver;

    
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
        driver = new AndroidDriver<MobileElement>(new URL("htpp://127.0.0.1:4723/wd/hub"), capabilities);


    }

    @Given("Haedar alanındaki başlık kontrol edilir.")
    public void haedarAlanındakiBaşlıkKontrolEdilir() {
        System.out.println("Header alanındaki baslik dogrudur");
    }

    @And("Devam butonuna tıklanır.")
    public void devamButonunaTıklanır() {
        System.out.println("Devam butonuna tıklanır");
    }

    @And("Pop up kontrol edilir.")
    public void popUpKontrolEdilir() {
        System.out.println("Ekrana pop up ciktigi gorulur");
    }

    @Then("Ok butonuna tıklanır.")
    public void okButonunaTıklanır() {
        System.out.println("Ok butonuna basarili tiklanir.");
    }
}
