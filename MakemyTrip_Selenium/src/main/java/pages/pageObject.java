package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class pageObject {
    private static final Logger logger = LogManager.getLogger(pageObject.class);
    WebDriver driver;

    // Locators
    public By dismissAlert = By.xpath("//span[@class='commonModal__close']");
    public By clickHotel = By.xpath("//li[@class='menu_Hotels']");
    public By search = By.xpath("//label[@for='city']");
    public By enterText = By.xpath("//input[@placeholder='Where do you want to stay?']");
    public By firstOption = By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']//span[@class='blackText'][normalize-space()='Singapore']");
    public By checkIn = By.xpath("//div[@class='DayPicker-Day DayPicker-Day--end DayPicker-Day--selected']");
    public By checkOut = By.xpath("//div[@aria-label='Wed Aug 07 2024']");
    public By dropdownElement = By.xpath("//div[@class='makeFlex primaryTraveler']//div[2]//div[2]//div[1]");
    public By dropDownOption = By.xpath("//li[normalize-space()='03']");
    public By applyButton = By.xpath("//button[normalize-space()='Apply']");

    public pageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void enterDismiss() throws IOException {
        WebElement alert = driver.findElement(dismissAlert);
        alert.click();
    }

    public void clickHotel() throws IOException {
        WebElement hotel = driver.findElement(clickHotel);
        hotel.click();
    }

    public void clickSearch() throws IOException {
        WebElement searchElement = driver.findElement(search);
        searchElement.click();
    }

    public void enterText(String text) throws IOException {
        WebElement textBox = driver.findElement(enterText);
        textBox.sendKeys(text);
    }

    public void selectFirstOption() throws IOException {
        WebElement option = driver.findElement(firstOption);
        option.click();
    }

    public void clickCheckIn() throws IOException {
        WebElement checkInElement = driver.findElement(checkIn);
        checkInElement.click();
    }

    public void clickCheckOut() throws IOException {
        WebElement checkOutElement = driver.findElement(checkOut);
        checkOutElement.click();
    }

    public void clickDropdownElement() throws IOException {
        WebElement dropdown = driver.findElement(dropdownElement);
        dropdown.click();
    }

    public void selectDropDownOption() throws IOException {
        WebElement option = driver.findElement(dropDownOption);
        option.click();
    }

    public void clickApply() throws IOException {
        WebElement apply = driver.findElement(applyButton);
        apply.click();

    }
}
