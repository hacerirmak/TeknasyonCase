package page_object_model;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class access_page  extends  AbstarctClass {

    AndroidDriver driver;

    By continueButton = By.id("continue_button");
     WebElement continueSelect = driver.findElement(continueButton);


}