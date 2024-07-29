package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(xpath = "//div[normalize-space()='Sign up']")
    WebElement ContinueScreen;
    @FindBy(xpath = "//input[@id='email-input']")
    WebElement ContinueBtn;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Sign up\"]")
    WebElement Signup;
    @FindBy(xpath = "//android.widget.EditText")
    WebElement Email;

    @FindBy(xpath = "//input[@id='password']")
    WebElement Pwd;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Log in\"]")
    WebElement LoginButton;

    @FindBy(xpath = "//android.widget.Button[@text=\"Continue with Google\"]")
    WebElement ContinueWithGoogle;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Continue\"]")
    WebElement ContinueButton;

    @FindBy(xpath = "//android.widget.Button[@text=\"Continue\"]")
    WebElement logContinueButton;

    public WebElement logContinueButton(WebDriver driver) {
        return (logContinueButton);
    }

    public WebElement ContinueWithGoogle(WebDriver driver) {
        return (ContinueWithGoogle);
    }

    public WebElement LoginButton(WebDriver driver) {
        return (LoginButton);
    }

    public WebElement ContinueButton(WebDriver driver) {
        return (ContinueButton);
    }

    public WebElement Signup(WebDriver driver) {
        return (Signup);
    }

    public WebElement Email(WebDriver driver) {
        return (Email);
    }

    public WebElement ContinueScreen(WebDriver driver) {
        return (ContinueScreen);
    }

    public WebElement ContinueBtn(WebDriver driver) {
        return (ContinueBtn);
    }

    public WebElement Pwd(WebDriver driver) {
        return (Pwd);
    }


}
