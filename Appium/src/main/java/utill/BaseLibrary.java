package utill;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseLibrary {
    private static AppiumDriver<MobileElement> driver;
    public static void initializeDriver() throws MalformedURLException {

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.0"); // Update according to your simulator version
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "OOPOA76");
        dc.setCapability("automationName", "UiAutomator2");
        dc.setCapability("udid", "PNXKOV4PIJFIZXAA");
        dc.setCapability("appPackage", "com.openai.chatgpt");
        dc.setCapability("appActivity", "com.openai.chatgpt.MainActivity");

        // dc.setCapability("appActivity", "com.dazn.splash.view.SplashScreenActivity");
        URL url = new URL("http://127.0.0.1:4723");
        driver = new AppiumDriver(url, dc);

        if (driver == null) {
            System.err.println("Driver initialization failed.");
            throw new RuntimeException("Failed to initialize Appium driver.");
        } else {
            System.out.println("Appium driver initialized successfully.");
        }
    }
    public AppiumDriver getDriver() {
        return driver;
    }

}
