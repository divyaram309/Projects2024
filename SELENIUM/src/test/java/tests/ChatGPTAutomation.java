package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import pages.ChatGPTPage;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class ChatGPTAutomation {
    WebDriver driver;
    ChatGPTPage chatGPTPage;

    // Define the base URL as a constant
    private static final String BASE_URL = "https://www.chatgpt.com";

    @BeforeClass
    @Parameters("browser")
    public void setUp(@Optional("chrome") String browser) {
        System.out.println("Browser is: " + browser);
        // Initialize the WebDriver based on the browser parameter
        switch (browser.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();

                // Create ChromeOptions object
                ChromeOptions options = new ChromeOptions();

                // Disable secure data warnings
                options.addArguments("--disable-web-security");
                options.addArguments("--disable-site-isolation-trials");
                options.addArguments("--disable-features=IsolateOrigins,site-per-process");

                // Spoof User-Agent to mimic a regular browser
                options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.3");

                // Initialize WebDriver with ChromeOptions
                driver = new ChromeDriver(options);
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            case "safari":
                WebDriverManager.safaridriver().setup();
                driver = new SafariDriver();
                break;
            default:
                throw new IllegalArgumentException("Browser " + browser + " not supported");
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        chatGPTPage = new ChatGPTPage(driver);
    }

    @Test(priority = 1)
    public void signup() throws InterruptedException {
        driver.get(BASE_URL);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//        driver.get("https://tinyurl.com/4f4pmh66");
        chatGPTPage.clickSignup();
        chatGPTPage.visibilityOfDashB();
        chatGPTPage.clickenterEmail();
        chatGPTPage.clickContinue();
        chatGPTPage.pwd();
        chatGPTPage.Continue1();
    }

    @Test(priority = 2)
    public void testChatGPT() {
        // Navigate to ChatGPT's website
        driver.get(BASE_URL);

        // Interact with the page using Page Object methods
        chatGPTPage.enterMessage("Explain Selenium automation");
        chatGPTPage.clickSendButton();
        chatGPTPage.assertChatResponse();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
