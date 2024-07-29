package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ChatGPTPage {
    WebDriver driver;
    WebDriverWait wait;

    // Constructor
    public ChatGPTPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Timeout in seconds
    }

    // Locators
    By chatInput = By.xpath("//textarea[@id='prompt-textarea']"); // Replace with actual ID or selector
    By sendButton = By.xpath("(//*[name()='svg'][@class='icon-2xl'])[1]"); // Replace with actual ID or selector
    By Login = By.xpath("//div[normalize-space()='Log in']");
    By Signup = By.xpath("//label[normalize-space()='Email address*']");
    By pwd = By.cssSelector("#password"); // Replace with actual ID or selector for the password field
    By enterEmail = By.xpath("//input[@id='email-input']");

    By createActDashBoard = By.xpath("//section[@class='content-wrapper']");
    By Continue = By.xpath("//button[normalize-space()='Continue']");

    By Continue1 = By.xpath("(//button[normalize-space()='Continue'])[1]");


    By ShowPwd = By.xpath("//button[@type='button']");


    // Methods
    public void enterMessage(String message) {
        WebElement inputField = driver.findElement(chatInput);
        inputField.sendKeys(message);

        // Initialize Actions class
        Actions actions = new Actions(driver);

        // Send Enter key using Actions
        actions.sendKeys(inputField, Keys.ENTER).perform(); // or use "\uE007" for Unicode
    }

    public void enterLogin() {
        WebElement loginElement = driver.findElement(Login);
        loginElement.click();
    }

    public void clickSendButton() {
        driver.findElement(sendButton).click();
    }

    public void clickContinue() {
        driver.findElement(Continue).click();
    }

    public void visibilityOfDashB() {
        WebElement dashboardElement = wait.until(ExpectedConditions.visibilityOfElementLocated(createActDashBoard));

        // Assert that the element is displayed
        Assert.assertTrue(dashboardElement.isDisplayed(), "Dashboard element is not visible.");
    }

    public void clickSignup() {
        WebElement element = driver.findElement(By.xpath("//label[normalize-space()='Email address*']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }


    public void clickenterEmail() {

        driver.findElement(enterEmail).sendKeys("divyaram309@gmail.com");


    }

    public void Continue1() {
        driver.findElement(Continue1).click();
    }

    public void pwd() {
        // Click the "Show Password" button to reveal the password field if necessary
        WebElement showPwdButton = driver.findElement(ShowPwd);
        if (showPwdButton.isEnabled()) {
            showPwdButton.click();
        } else {
            System.out.println("Show Password button is not enabled.");
        }

        // Wait for the password field to be interactable (if needed)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(pwd));

        // Enter the password into the field
        if (passwordField.isDisplayed() && passwordField.isEnabled()) {
            passwordField.sendKeys("Divyaram@820");
        } else {
            System.out.println("Password field is not interactable.");
        }
    }

    public void assertChatResponse() {
        // Wait for the response element to be visible
        WebElement responseElement = wait.until(ExpectedConditions.visibilityOfElementLocated(sendButton));

        // Retrieve the actual response text from the web element
        String actualResponse = responseElement.getText();

        // Assert that the actual response matches the expected response
        Assert.assertEquals(actualResponse, "Chat response did not match expected response.");
    }
}
