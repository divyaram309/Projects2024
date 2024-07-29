package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.pageObject;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class sample {
    WebDriver driver;
    ExtentReports extent;
    ExtentTest test;
    pageObject pageObject;
    private static final Logger logger = LogManager.getLogger(sample.class);
    private static final String BASE_URL = "https://www.makemytrip.com/";


    @BeforeClass
    public void setup() throws IOException {
        // Create a timestamp for unique report file names
        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String reportName = "Test-Report-" + timestamp + ".html";

        // Ensure the reports directory exists
        File reportDir = new File("reports");
        if (!reportDir.exists()) {
            reportDir.mkdir();
        }

        // Set up ExtentHtmlReporter
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("reports/" + reportName);
        htmlReporter.config().setDocumentTitle("Automation Test Report");
        htmlReporter.config().setReportName("Functional Test Report");
        htmlReporter.config().setTheme(Theme.STANDARD);

        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        // Additional information about the project
        extent.setSystemInfo("Host Name", "Localhost");
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("User Name", "Divya");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BASE_URL);

        pageObject = new pageObject(driver);
        logger.info("Setup completed and navigated to MakeMyTrip website");
    }

    @BeforeMethod
    public void beforeMethod() {
        if (!driver.getCurrentUrl().equals(BASE_URL)) {
            driver.get(BASE_URL);
        }
        logger.info("Navigated to MakeMyTrip homepage");
    }

    @Test
    public void searchContext() {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        test = extent.createTest("MakeMytripSearch");
        logger.info("Test case MakeMytripSearch started");

        try {
            pageObject.enterDismiss();
            takeScreenshot("dismissAlert");
            test.addScreenCaptureFromPath("screenshots/dismissAlert.png");
            logger.info("Dismissed alert");

            if (driver.findElement(pageObject.clickHotel).isDisplayed()) {
                test.pass("Hotel is displayed ");
                logger.info("Hotel is displayed");
            } else {
                test.fail("Hotel is not displayed");
                logger.error("Hotel is not displayed");
            }
            pageObject.clickHotel();
            takeScreenshot("clickHotel");
            test.addScreenCaptureFromPath("screenshots/clickHotel.png");

            if (driver.findElement(pageObject.search).isDisplayed()) {
                test.pass("Search is displayed ");
                logger.info("Search is displayed");
            } else {
                test.fail("Search is not displayed");
                logger.error("Search is not displayed");
            }
            pageObject.clickSearch();
            takeScreenshot("clickSearch");
            test.addScreenCaptureFromPath("screenshots/clickSearch.png");

            pageObject.enterText("Singapore");
            takeScreenshot("enterText_Singapore");
            test.addScreenCaptureFromPath("screenshots/enterText_Singapore.png");
            pageObject.selectFirstOption();
            takeScreenshot("selectFirstOption");
            test.addScreenCaptureFromPath("screenshots/selectFirstOption.png");

            if (driver.findElement(pageObject.checkIn).isDisplayed()) {
                test.pass("Checkin is displayed ");
                logger.info("Checkin is displayed");
            } else {
                test.fail("Checkin is not displayed");
                logger.error("Checkin is not displayed");
            }
            pageObject.clickCheckIn();
            takeScreenshot("clickCheckIn");
            test.addScreenCaptureFromPath("screenshots/clickCheckIn.png");

            pageObject.clickCheckOut();
            takeScreenshot("clickCheckOut");
            test.addScreenCaptureFromPath("screenshots/clickCheckOut.png");

            pageObject.clickDropdownElement();
            takeScreenshot("clickDropdownElement");
            test.addScreenCaptureFromPath("screenshots/clickDropdownElement.png");

            pageObject.selectDropDownOption();
            takeScreenshot("selectDropDownOption");
            test.addScreenCaptureFromPath("screenshots/selectDropDownOption.png");

            pageObject.clickApply();
            takeScreenshot("clickApply");
            test.addScreenCaptureFromPath("screenshots/clickApply.png");

            logger.info("Test case MakeMytripSearch completed successfully");

        } catch (IOException e) {
            test.fail("Exception occurred: " + e.getMessage());
            logger.error("Exception occurred: ", e);
        }
    }

    @AfterClass
    public void cleanup() {
        driver.quit();
        extent.flush();
        logger.info("Driver quit and Extent report flushed");
    }

    private void takeScreenshot(String screenshotName) throws IOException {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File screenshotDir = new File("screenshots");
        if (!screenshotDir.exists()) {
            screenshotDir.mkdir();
        }
        FileUtils.copyFile(screenshot, new File(screenshotDir, screenshotName + ".png"));
        logger.info("Screenshot taken: " + screenshotName);
    }
}
