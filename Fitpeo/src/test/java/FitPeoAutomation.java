import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FitPeoAutomation {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

        try {
            // Step 1: Navigate to the FitPeo Homepage
            driver.get("https://www.fitpeo.com");
            driver.manage().window().maximize();

            // Step 2: Navigate to the Revenue Calculator Page
            WebElement revenueCalculatorLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Revenue Calculator')]")));
            revenueCalculatorLink.click();

            // Step 3: Scroll down to the Slider section
            JavascriptExecutor js = (JavascriptExecutor) driver;
            WebElement sliderSection = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[normalize-space()='Medicare Eligible Patients']")));
            js.executeScript("arguments[0].scrollIntoView();", sliderSection);

            // Step 4: Adjust the Slider to set its value to 820
            WebElement sliderValueField = driver.findElement(By.xpath("//input[@id=':r0:']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].value = '820'; arguments[0].dispatchEvent(new Event('input'));", sliderValueField);
            // Validate if the slider value has been updated to 820
            wait.until(ExpectedConditions.attributeToBe(sliderValueField, "value", "820"));
            String actualValue = sliderValueField.getAttribute("value");
            System.out.println("Slider value after adjustment to 820: " + actualValue);

            // Step 5: Update the Text Field to 560 and ensure slider updates
            ((JavascriptExecutor) driver).executeScript("arguments[0].value = '560'; arguments[0].dispatchEvent(new Event('input'));", sliderValueField);
            wait.until(ExpectedConditions.attributeToBe(sliderValueField, "value", "560"));
            String newValue = sliderValueField.getAttribute("value");
            System.out.println("Slider value after updating text field to 560: " + newValue);

            // Step 6: Select CPT Codes dynamically based on label text
            String[] cptCodes = {"CPT-99091", "CPT-99453", "CPT-99454", "CPT-99474"};
            for (int i = 0; i < cptCodes.length; i++) {
                WebElement cptCheckbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[" + (i + 1) + "]"));
                if (!cptCheckbox.isSelected()) {
                    cptCheckbox.click();
                }
            }
            // Step 7: Validate Total Recurring Reimbursement
            WebElement totalReimbursementHeader = driver.findElement(By.xpath("//p[contains(text(),'Total Recurring Reimbursement for all Patients Per')]"));
            String expectedReimbursement = "$110700";
            String actualReimbursement = totalReimbursementHeader.getText();
            if (actualReimbursement.contains(expectedReimbursement)) {
                System.out.println("Validation passed: Total Recurring Reimbursement is correct.");
            } else {
                System.out.println("Validation failed: Expected " + expectedReimbursement + " but got " + actualReimbursement);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
