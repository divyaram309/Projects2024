package steps;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;
import utill.BaseLibrary;

import java.net.MalformedURLException;

public class LoginSteps {
    public static AppiumDriver<MobileElement> driver;
    private static BaseLibrary baseLibrary = new BaseLibrary();
    LoginPage RHP;

    @Before
    public void setUp(Scenario scenario) throws MalformedURLException {
        BaseLibrary.initializeDriver();
        driver = baseLibrary.getDriver();

        RHP = PageFactory.initElements(driver, LoginPage.class);

        System.out.println("Before scenario: " + scenario.getName());

    }

    @Given("the application is opened")
    public void the_application_is_opened() {

    }


    @Then("the user should be logged in")
    public void the_user_should_be_logged_in() {

        //RHP.Continue(driver).click();
    }

    @Then("User Enter Email as {string}")
    public void userEnterEmailAs(String username) throws InterruptedException {
        Thread.sleep(3000);
        RHP.Email(driver).sendKeys(username);

    }

    @And("I enter password as {string}")
    public void iEnterPasswordAs(String password) throws InterruptedException {
        Thread.sleep(10000);

        RHP.Email(driver).sendKeys(password);

    }

    @Then("User click on Continue Button")
    public void continueButton() throws InterruptedException {
        Thread.sleep(10000);
        RHP.ContinueButton(driver).click();
    }

    @Then("User click on Signup Button")
    public void SignupButton() throws InterruptedException {
        Thread.sleep(3000);
        RHP.Signup(driver).click();
    }

    @Then("User click on Login Button")
    public void login() throws InterruptedException {
        Thread.sleep(3000);
        RHP.LoginButton(driver).click();
    }

    @And("User click login Continue Button")
    public void loginContinueButton() throws InterruptedException {
        Thread.sleep(3000);
        RHP.logContinueButton(driver).click();
    }


    @Then("User click on Continue{int} Button")
    public void userClickOnContinueButton(int arg0) throws InterruptedException {
        Thread.sleep(3000);
        RHP.ContinueButton(driver).click();
    }

    @Then("User click on ContinueWithLogin")
    public void userClickOnContinueWithLogin() throws InterruptedException {
        Thread.sleep(10000);
        RHP.ContinueWithGoogle(driver).click();
    }

    @Then("User click on ContinueWithGoogle")
    public void user_click_on_continue_with_google() throws InterruptedException {
        Thread.sleep(3000);
        RHP.ContinueWithGoogle(driver).click();
    }
}