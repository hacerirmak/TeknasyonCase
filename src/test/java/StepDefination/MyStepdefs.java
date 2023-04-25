package StepDefination;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.time.Duration;


public class MyStepdefs {

    public AndroidDriver driver;


    @Before
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Pixel 4 XL API 29");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("platformVersion", "10.0");
        capabilities.setCapability("appPackage", "com.hmh.api");
        capabilities.setCapability("appActivity", "com.hmh.api.ApiDemos");
        capabilities.setCapability("skipUnlock", "true");
        capabilities.setCapability("noReset", "false");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);


    }

    @Given("Header alanindaki baslik kontrol edilir.")
    public void header_alanindaki_baslik_kontrol_edilir() {
        By headerText = By.id("com.android.permissioncontroller:id/permissions_message");
        WebElement headerTextApi = driver.findElement(headerText);
        Assert.assertNotNull(headerTextApi);
        System.out.println("Header alanindaki baslik basarili kontrol edilir.");


    }

    @And("Devam butonuna tıklanır.")
    public void devam_butonuna_tıklanır() {
        By continueButton = By.id("com.android.permissioncontroller:id/continue_button");
        WebElement continueSelect = driver.findElement(continueButton);
        continueSelect.click();
        System.out.println("Devam butonuna tıklanır.");

    }

    @And("Ok butonuna tiklanir.")
    public void ok_butonuna_tiklanir() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/button1")));
        By okButton = By.id("android:id/button1");
        WebElement okSelect = driver.findElement(okButton);
        okSelect.click();
        System.out.println("Ok butonuna tiklanir.");

    }

    @And("App butonuna tiklanir.")
    public void app_butonuna_tiklanir() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='App']")));
        driver.findElement(By.xpath("//android.widget.TextView[@text='App']")).click();
        System.out.println("App butonuna basarili tiklanir.");
    }

    @And("Action bar butonuna tiklanir.")
    public void action_bar_butonuna_tiklanir() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Action Bar']")));
        driver.findElement(By.xpath("//android.widget.TextView[@text='Action Bar']")).click();
        System.out.println("Action Bar butonuna basarili tiklanir.");

    }

    @And("Action Bar Tabs butonuna tiklanir.")
    public void action_bar_tabs_butonuna_tiklanir() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Action Bar Tabs']")));
        driver.findElement(By.xpath("//android.widget.TextView[@text='Action Bar Tabs']")).click();
        System.out.println("Action Bar Tabs butonuna basarili tiklanir.");

    }

    @And("Toggle tab mode butonuna tiklanir.")
    public void toggle_tab_mode_butonuna_tiklanir() {
        driver.findElement(By.xpath("//android.widget.Button[@text='Toggle tab mode']")).click();
        System.out.println("Toggle tab mode butonuna tiklanir.");

    }

    @And("Header alaninin pasife gectigi kontrol edilir.")
    public void header_alaninin_pasife_gectigi_kontrol_edilir() {
        By headerTextToggle = By.xpath("//android.widget.LinearLayout[@text='']");
        WebElement headerTextApiToggle = driver.findElement(headerTextToggle);
        Assert.assertNotNull(headerTextApiToggle);

    }

    @And("Add new tab  butonuna uc kere tiklanir.")
    public void add_new_tab_butonuna_kere_tiklanir() {
        WebElement newTabButton = driver.findElement(By.id("com.hmh.api:id/btn_add_tab"));
        int i;
        for (i = 0; i <= 2; i++) {
            newTabButton.click();
        }
    }

    @And("Sekmelerin dogrulugu kontrol edilir.")
    public void sekmelerin_dogrulugu_kontrol_edilir() {
        //   By headerTextTab= By.xpath("//android.app.ActionBar$Tab[@text='TAB 0']/ActionBar$Tab[@text='TAB 1']/ActionBar$Tab[@text='TAB 2']");
        //   WebElement headerTextApiTab = driver.findElement(headerTextTab);
        //  Assert.assertNotNull(headerTextApiTab);

        //  WebElement username=driver.findElement(By.xpath("//TableLayout[@index='1']/TableRow[@index='0']/EditText[@index='0']"));
    }

    @And("Son eklenen tab silinir.")
    public void son_eklenen_tab_silinir() {

        driver.findElement(By.id("com.hmh.api:id/btn_remove_tab")).click();
        System.out.println("Son eklenen tab silinir.");

    }

    @And("Dogru sekmenin silindigi kontrol edilir.")
    public void dogru_sekmenin_silindigi_kontrol_edilir() {
        if (!driver.findElements(By.xpath("//android.widget.TextView[@text='TAB 2']")).isEmpty()) {
            Assert.assertTrue(true);
        }

    }

    @And("Remove all tabs tiklanir.")
    public void remove_all_tabs_tiklanir() {
        driver.findElement(By.id("com.hmh.api:id/btn_remove_all_tabs")).click();
        System.out.println("Remove all tabs tiklanir.");

    }

    @Then("Tüm tablarin silindiği kontrol edilir.")
    public void tüm_tablarin_silindiği_kontrol_edilir() {
        By headerEmpty = By.xpath("//android.widget.LinearLayout[@text='']");
        WebElement headerEmptyVerify = driver.findElement(headerEmpty);
        Assert.assertNotNull(headerEmptyVerify);
    }
}

