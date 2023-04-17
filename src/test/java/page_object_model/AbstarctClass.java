package page_object_model;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AbstarctClass {

    public AndroidDriver driver;


    WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));


    public void clickFunction(WebElement clickElement) {
        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();
    }

    public void sendKeysFunction(WebElement sendKeysElement, String value) {
        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));
        sendKeysElement.sendKeys(value);
    }

    public void selectElementfromDropdown(WebElement dropdown, String text){
        Select slc = new Select(dropdown);
        slc.selectByVisibleText(text);
    }

    public void Assertion(WebElement actual,String expected){
        wait.until(ExpectedConditions.visibilityOf(actual));
        Assert.assertEquals(actual.getText(),expected);
        System.out.println("My Message" + actual.getText());
    }
}
