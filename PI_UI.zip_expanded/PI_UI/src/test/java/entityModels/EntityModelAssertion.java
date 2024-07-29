package entityModels;
import java.awt.AWTException;
import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.LogStatus;

public class EntityModelAssertion extends MyRunner {
	public void addBtnEntityModel() throws InterruptedException {
		driver.navigate().refresh();
		test=report.startTest("PI_Add Button");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
  WebElement addBtn=driver.findElement(By.xpath("//button[@class='btn border-radius-0 center my-2 add-btn']"));
   if(addBtn.isDisplayed()) {
	   test.log(LogStatus.PASS,"Add Button is Displayed");
	   captureScreenshot(driver);
	   if(addBtn.isEnabled()) {
		   test.log(LogStatus.PASS,"Add Button is Enabled");
		   captureScreenshot(driver);
		    }
	   else
	   {
		   test.log(LogStatus.FAIL,"Add Button is not Enabled");
		   captureScreenshot(driver);
	   } 
   }
   else
   {
	   test.log(LogStatus.FAIL,"Add Button is not Displayed");
	   captureScreenshot(driver);
   }
   addBtn.click();
   
  
    }


public void selectConstructDrpdwnEntityModel()throws InterruptedException {
		test=report.startTest("PI_Construct_DropDown");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    WebElement dropdown=driver.findElement(By.xpath("//div[@class='selectbutton']/img"));
    if(dropdown.isDisplayed()) {
 	   test.log(LogStatus.PASS,"dropDown is Displayed");
 	   captureScreenshot(driver);
 	  if(dropdown.isEnabled()) {
 	 	   test.log(LogStatus.PASS,"dropDown is Enabled");
 	 	   captureScreenshot(driver);
 	 	    }
 	    else
 	    {
 	 	   test.log(LogStatus.FAIL,"dropDown is not Enabled");
 	 	   captureScreenshot(driver);
 	    }
    }
    else
    {
 	   test.log(LogStatus.FAIL,"dropDown is not Displayed");
 	   captureScreenshot(driver);
    }
    dropdown.click();
    }

public void selectEntityModelDropDown()throws Exception {
	test=report.startTest("PI_Entity_Model_DropDown");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	List<WebElement> entityModelDropdown=driver.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show']/div"));
	entityModelDropdown.forEach(s->System.out.println(s.getText()));
String data=getDataFromExcel("EntityModel", 1, 0);
entityModelDropdown.stream().filter(s->s.getText().equalsIgnoreCase(data)).forEach(S->S.click());	 

test.log(LogStatus.PASS,"Entity model dropdown selected");
captureScreenshot(driver);
}

public void infoBtnEntityModel() throws InterruptedException {
	test=report.startTest("PI_Info_Button");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement infoButton=driver.findElement(By.xpath("//button[@class='info-acl toggle-button']"));
	if(infoButton.isDisplayed()) {
	 	   test.log(LogStatus.PASS,"info Button is Displayed");
	 	   captureScreenshot(driver);
	 	  if(infoButton.isEnabled()) {
		 	   test.log(LogStatus.PASS,"info Button is Enabled");
		 	   captureScreenshot(driver);
		 	    }
		    else
		    {
		 	   test.log(LogStatus.FAIL,"info Button is not Enabled");
		 	   captureScreenshot(driver);
		    }
	}
	    else
	    {
	 	   test.log(LogStatus.FAIL,"info Button is not Displayed");
	 	   captureScreenshot(driver);
	    }
    }
public void selectuniverseDropdownEntityModel() throws InterruptedException {
	test=report.startTest("PI_Selct_Universe_Entity_Model_Dropdown");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement selectuniverseDropdown=driver.findElement(By.xpath("//label[text()='Select Universe']/../div/div/following-sibling::div"));
	if(selectuniverseDropdown.isDisplayed()) {
	 	   test.log(LogStatus.PASS,"Select Universe Entity Model DropDown is Displayed");
	 	   captureScreenshot(driver);
	if(selectuniverseDropdown.isEnabled()) {
	 	   test.log(LogStatus.PASS,"Select Universe Entity Model  DropDown is Enabled");
	 	   captureScreenshot(driver);
	 	    }
	    else
	    {
	 	   test.log(LogStatus.FAIL,"Select Universe Entity Model DropDown is not Enabled");
	 	   captureScreenshot(driver);
	    }
	}
else {
	 	   test.log(LogStatus.FAIL,"Select Universe Entity Model DropDown is not Displayed");
	 	   captureScreenshot(driver);
	    }
	selectuniverseDropdown.click();

}
public void srchBox() throws InterruptedException, Exception {
	test=report.startTest("PI_Select_Universe_DropDown_SearchBox");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String data=getDataFromExcel("EntityModel", 2, 0);
	WebElement searchBox=driver.findElement(By.xpath("//input[@placeholder='Search']"));
	if(searchBox.isDisplayed()) {
	 	   test.log(LogStatus.PASS,"Select Universe DropDown SearchBox is Displayed");
	 	   captureScreenshot(driver);
	 	  if(searchBox.isEnabled()) {
		 	   test.log(LogStatus.PASS,"Select Universe DropDown SearchBox is Enabled");
		 	   captureScreenshot(driver);
		 	    }
		    else
		    {
		 	   test.log(LogStatus.FAIL,"Select Universe DropDown SearchBox is not Enabled");
		 	   captureScreenshot(driver);
		    }
	 	    }
	    else
	    {
	 	   test.log(LogStatus.FAIL,"Select Universe DropDown SearchBox is not Displayed");
	 	   captureScreenshot(driver);
	    }
	searchBox.sendKeys(data);
	List<WebElement> universeList=driver.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show']/div"));
	universeList.forEach(s->System.out.println(s.getText()));
	String universeNameData=getDataFromExcel("EntityModel", 3, 0);
	universeList.stream().filter(s->s.getText().equalsIgnoreCase(universeNameData)).forEach(S->S.click());
}
public void EntityModelNameTxtBox() throws Exception {
	test=report.startTest("PI_Entity_Model_Name");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String data=getDataFromExcel("EntityModel", 4, 0);
	WebElement entityModelName =driver.findElement(By.xpath("//input[@formcontrolname='entityName']"));
	if(entityModelName.isDisplayed()) {
	 	   test.log(LogStatus.PASS,"Entity Model Name is Displayed");
	 	   captureScreenshot(driver);
	 	  if(entityModelName.isEnabled()) {
		 	   test.log(LogStatus.PASS,"Entity Model Name is Enabled");
		 	   captureScreenshot(driver);
		 	    }
		    else
		    {
		 	   test.log(LogStatus.FAIL,"Entity Model Name is not Enabled");
		 	   captureScreenshot(driver);
		    }
	}
	    else
	    {
	 	   test.log(LogStatus.FAIL,"Entity Model Name is not Displayed");
	 	   captureScreenshot(driver);
	    } 
	entityModelName.click();
	entityModelName.sendKeys(data);
    }
public void EntityModelDescriptionTxtBox() throws Exception {
	test=report.startTest("PI_Entity_Model_Description");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String data=getDataFromExcel("EntityModel", 5, 0);
WebElement entityModelDescription=driver.findElement(By.xpath("//textarea[@formcontrolname='description']"));
	if(entityModelDescription.isDisplayed()) {
	 	   test.log(LogStatus.PASS,"Entity Model Description is Displayed");
	 	   captureScreenshot(driver);
	 	  if(entityModelDescription.isEnabled()) {
		 	   test.log(LogStatus.PASS,"Entity Model Description is Enabled");
		 	   captureScreenshot(driver);
		 	    }
		    else
		    {
		 	   test.log(LogStatus.FAIL,"Entity Model Description is not Enabled");
		 	   captureScreenshot(driver);
		    }
	}
	    else
	    {
	 	   test.log(LogStatus.FAIL,"Entity Model Description is not Displayed");
	 	   captureScreenshot(driver);
	    }
	entityModelDescription.sendKeys(data);
    }

	public void selectIcon() throws AWTException
	{
		test=report.startTest("PI_Upload_Files");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement file_Upload=driver.findElement(By.xpath("//app-file-upload[@label='Select Icon']/div/div[2]"));
		if(file_Upload.isDisplayed()) {
		 	   test.log(LogStatus.PASS,"Upload Files is Displayed");
		 	   captureScreenshot(driver);
		 	  if(file_Upload.isEnabled()) {
			 	   test.log(LogStatus.PASS,"Upload Files is Enabled");
			 	   captureScreenshot(driver);
			 	    }
			    else
			    {
			 	   test.log(LogStatus.FAIL,"Upload Files is not Enabled");
			 	   captureScreenshot(driver);
			    }
		}
		    else
		    {
		 	   test.log(LogStatus.FAIL,"Upload Files is not Displayed");
		 	   captureScreenshot(driver);
		    }
		}
public void attributes() throws Exception {
	test=report.startTest("PI_Attributes");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement attributes=driver.findElement(By.xpath("//label[text()='Attributes']"));
	if(attributes.isDisplayed()) {
	 	   test.log(LogStatus.PASS,"Attributes is Displayed");
	 	   captureScreenshot(driver);
	 	  if(attributes.isEnabled()) {
		 	   test.log(LogStatus.PASS,"Attributes is Enabled");
		 	   captureScreenshot(driver);
		 	    }
		    else
		    {
		 	   test.log(LogStatus.FAIL,"Attributes is not Enabled");
		 	   captureScreenshot(driver);
		    }
	}
	    else
	    {
	 	   test.log(LogStatus.FAIL,"Attributes is not Displayed");
	 	   captureScreenshot(driver);
	    }
    }

public void AttributeNameTxtBox() throws Exception {
	test=report.startTest("PI_Attribute_Name");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//WebElement b1=driver.findElement(By.xpath("//input[@class='inputfield ng-tns-c64-1 ng-pristine ng-invalid ng-touched']"));
	String data=getDataFromExcel("EntityModel", 6, 0);
	WebElement attributeName=driver.findElement(By.cssSelector("input[formcontrolname='name']"));
	if(attributeName.isDisplayed()) {
	 	   test.log(LogStatus.PASS,"Attribute Name is Displayed");
	 	   captureScreenshot(driver);
	 	  if(attributeName.isEnabled()) {
		 	   test.log(LogStatus.PASS,"Attribute Name is Enabled");
		 	   captureScreenshot(driver);
		 	    }
		    else
		    {
		 	   test.log(LogStatus.FAIL,"Attribute Name is not Enabled");
		 	   captureScreenshot(driver);
		    }
	}
	    else
	    {
	 	   test.log(LogStatus.FAIL,"Attribute Name is not Displayed");
	 	   captureScreenshot(driver);
	    }
	attributeName.sendKeys(data); 

    }


public void DefaultValueTxtBox() throws Exception {
	test=report.startTest("PI_Default_Value");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String data1=getDataFromExcel("EntityModel", 7, 0);
	//WebElement b1=driver.findElement(By.xpath("//input[@class='inputfield ng-tns-c64-0 ng-pristine ng-invalid ng-touched']"));
	WebElement defaultValue=driver.findElement(By.cssSelector("input[formcontrolname='default']"));
	if(defaultValue.isDisplayed()) {
	 	   test.log(LogStatus.PASS,"Default Value is Displayed");
	 	   captureScreenshot(driver);
	 	  if(defaultValue.isEnabled()) {
		 	   test.log(LogStatus.PASS,"Default Value is Enabled");
		 	   captureScreenshot(driver);
		 	    }
		    else
		    {
		 	   test.log(LogStatus.FAIL,"Default Value is not Enabled");
		 	   captureScreenshot(driver);
		    }
	}
	    else
	    {
	 	   test.log(LogStatus.FAIL,"Default Value is not Displayed");
	 	   captureScreenshot(driver);
	    }
	defaultValue.sendKeys(data1);
    }


public void requiredDrpdwn() throws Exception {
	test=report.startTest("PI_Required");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebElement required=driver.findElement(By.xpath("//label[text()='Required ']/following-sibling::div/div/following-sibling::div"));
	if(required.isDisplayed()) {
	 	   test.log(LogStatus.PASS,"Required DropDown is Displayed");
	 	   captureScreenshot(driver);
	if(required.isEnabled()) {
	 	   test.log(LogStatus.PASS,"Required DropDown is Enabled");
	 	   captureScreenshot(driver);
	 	  required.click();
	 	    }
	    else
	    {
	 	   test.log(LogStatus.FAIL,"Required DropDown is not Enabled");
	 	   captureScreenshot(driver);
	    }
	}
else {
	 	   test.log(LogStatus.FAIL,"Required DropDown is not Displayed");
	 	   captureScreenshot(driver);
	    }
//List<WebElement> rqirdTrue=driver.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show']/div"));
	List<WebElement> requiredFalse=driver.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show']/div/following-sibling::div"));
	requiredFalse.forEach(s->System.out.println(s.getText()));
	String data=getDataFromExcel("EntityModel", 13, 0);
	requiredFalse.stream().filter(s->s.getText().equalsIgnoreCase(data)).forEach(S->S.click());
    }


public void dataTypeDrpdwn() throws Exception {
	test=report.startTest("PI_Data_Type");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  WebElement dataType= driver.findElement(By.xpath("//label[text()='Data Type ']/following-sibling::div/div/following-sibling::div"));
  dataType.click();
	if(dataType.isDisplayed()) {
	 	   test.log(LogStatus.PASS,"Data Type DropDown is Displayed");
	 	   captureScreenshot(driver);
	if(dataType.isEnabled()) {
	 	   test.log(LogStatus.PASS,"Data Type DropDown is Enabled");
	 	   captureScreenshot(driver);
	 	  dataType.click();
	 	    }
	    else
	    {
	 	   test.log(LogStatus.FAIL,"Data Type DropDown is not Enabled");
	 	   captureScreenshot(driver);
	    }
	}
else {
	 	   test.log(LogStatus.FAIL,"Data Type DropDown is not Displayed");
	 	   captureScreenshot(driver);
	    }
	//dataType.click();
    List<WebElement>dataTypeString=driver.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show']/div"));
	dataTypeString.forEach(s->System.out.println(s.getText()));
	String data=getDataFromExcel("EntityModel", 8, 0);
	dataTypeString.stream().filter(s->s.getText().equalsIgnoreCase(data)).forEach(S->S.click());
    }


public void closeBtn() throws Exception {
	test=report.startTest("PI_Close_Button");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement closeButton=driver.findElement(By.xpath("//img[@class='col-1']"));
	if(closeButton.isDisplayed()) {
	 	   test.log(LogStatus.PASS,"Close Button is Displayed");
	 	   captureScreenshot(driver);
	 	  if(closeButton.isEnabled()) {
		 	   test.log(LogStatus.PASS,"Close Button is Enabled");
		 	   captureScreenshot(driver);
		 	    }
		    else
		    {
		 	   test.log(LogStatus.FAIL,"Close Button is not Enabled");
		 	   captureScreenshot(driver);
		    }
	}
	    else
	    {
	 	   test.log(LogStatus.FAIL,"Close Button is not Displayed");
	 	   captureScreenshot(driver);
	    }
    }


public void addAttribute() throws Exception {
	test=report.startTest("PI_Add_Attribute");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement addAttribute=driver.findElement(By.xpath("//div[@class='d-flex align-items-center']"));
	if(addAttribute.isDisplayed()) {
	 	   test.log(LogStatus.PASS,"Add attribute is Displayed");
	 	   captureScreenshot(driver);
	 	  if(addAttribute.isEnabled()) {
		 	   test.log(LogStatus.PASS,"Add attribute is Enabled");
		 	   captureScreenshot(driver);
		 	    }
		    else
		    {
		 	   test.log(LogStatus.FAIL,"Add attribute is not Enabled");
		 	   captureScreenshot(driver);
		    }
	}
	    else
	    {
	 	   test.log(LogStatus.FAIL,"Add attribute is not Displayed");
	 	   captureScreenshot(driver);
	    }
    }


public void primaryKeyDrpdwn() throws Exception {
	test=report.startTest("PI_Primary_Key");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//String data1=getDataFromExcel("EntityModel", 6, 0);
	//WebElement primaryKey=driver.findElement(By.xpath("//a[@class='ms-2']/../following-sibling::div/div/div/following-sibling::div"));
	WebElement primaryKey=driver.findElement(By.xpath("//div[text()=' Select Primary Key ']/following-sibling::div/following-sibling::div/img"));
	if(primaryKey.isDisplayed()) {
	 	   test.log(LogStatus.PASS,"Primary Key is Displayed");
	 	   captureScreenshot(driver);
	 	  if(primaryKey.isEnabled()) {
		 	   test.log(LogStatus.PASS,"Primary Key is Enabled");
		 	   captureScreenshot(driver);
		 	    }
		    else
		    {
		 	   test.log(LogStatus.FAIL,"Primary Key is not Enabled");
		 	   captureScreenshot(driver);
		    }
	}
	    else
	    {
	 	   test.log(LogStatus.FAIL,"Primary Key is not Displayed");
	 	   captureScreenshot(driver);
	    }
	primaryKey.click();
	//List<WebElement> prmkey=driver.findElements(By.xpath("List<WebElement> prmkey=driver.findElements(By.xpath(\"//div[@class='selectcontent2 dropdown-menu show']/div\"))"));
	/* List<WebElement> prmkey=driver.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show']/div"));
	String data2=getDataFromExcel("EntityModel", 6, 0);*/
    }


public void aclBtnEntityModel() throws Exception {
	test=report.startTest("PI_ACL");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//WebElement acl=driver.findElement(By.xpath("//button[@class='info-acl toggle-button']"));
	WebElement acl=driver.findElement(By.cssSelector("button[class='info-acl']"));
	if(acl.isDisplayed()) {
	 	   test.log(LogStatus.PASS,"ACL is Displayed");
	 	   captureScreenshot(driver);
	 	  if(acl.isEnabled()) {
		 	   test.log(LogStatus.PASS,"ACL is Enabled");
		 	   captureScreenshot(driver);
		 	    }
		    else
		    {
		 	   test.log(LogStatus.FAIL,"ACL is not Enabled");
		 	   captureScreenshot(driver);
		    }
	}
	    else
	    {
	 	   test.log(LogStatus.FAIL,"ACL is not Displayed");
	 	   captureScreenshot(driver);
	    }
acl.click();
    }


public void entityModelReadAccessDrpdwn() throws Exception {
	test=report.startTest("PI_Entity_Model_Read_Access");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//WebElement entityModelReadAccess= driver.findElement(By.xpath("//app-select[@name='schemaReadAccess']//div[@class='selectbutton']"));
WebElement entityModelReadacess=driver.findElement(By.xpath("//label[text()='Entity Model Read Access ']/following-sibling::div/div/following-sibling::div"));
	if(entityModelReadacess.isDisplayed()) {
 	   test.log(LogStatus.PASS,"Entity Model Read Access is Displayed");
	 	   captureScreenshot(driver);
	 	  if(entityModelReadacess.isEnabled()) {
		 	   test.log(LogStatus.PASS,"Entity Model Read Access is Enabled");
		 	   captureScreenshot(driver);
		 	  entityModelReadacess.click();
		 	    }
		    else
		    {
		 	   test.log(LogStatus.FAIL,"Entity Model Read Access is not Enabled");
		 	   captureScreenshot(driver);
		    }
	}
	    else
	    {
	 	   test.log(LogStatus.FAIL,"Entity Model Read Access is not Displayed");
	 	   captureScreenshot(driver);
	    }
	
	     
	List<WebElement> readAccessPublic=driver.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show']/div"));
	readAccessPublic.forEach(s->System.out.println(s.getText()));
	String data=getDataFromExcel("EntityModel",9, 0);
	readAccessPublic.stream().filter(s->s.getText().equalsIgnoreCase(data)).forEach(S->S.click());
    }


public void dataReadAccessDrpdwn() throws Exception {
	test=report.startTest("PI_Data_Read_Access");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement dataReadAccess=driver.findElement(By.xpath("//label[text()='Data Read Access ']/following-sibling::div/div/following-sibling::div"));
	if(dataReadAccess.isDisplayed()) {
	 	   test.log(LogStatus.PASS,"Data Read Access is Displayed");
	 	   captureScreenshot(driver);
	 	  if(dataReadAccess.isEnabled()) {
		 	   test.log(LogStatus.PASS,"Data Read Access is Enabled");
		 	   captureScreenshot(driver);
		 	  dataReadAccess.click();
		 	    }
		    else
		    {
		 	   test.log(LogStatus.FAIL,"Data Read Access is not Enabled");
	 	   captureScreenshot(driver);
		    }
	}
	    else
	    {
	 	   test.log(LogStatus.FAIL,"Data Read Access is not Displayed");
	 	   captureScreenshot(driver);
   }
	List<WebElement> dataReadAccessPrivate=driver.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show']/div/following-sibling::div"));
	dataReadAccessPrivate.forEach(s->System.out.println(s.getText()));
	String data=getDataFromExcel("EntityModel", 10, 0);
	dataReadAccessPrivate.stream().filter(s->s.getText().equalsIgnoreCase(data)).forEach(S->S.click());
    }


public void dataWriteAccessDrpdwn() throws Exception {
	test=report.startTest("PI_Data_Write_Access");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement dataWriteAccess=driver.findElement(By.xpath("//label[text()='Data Write Access ']/following-sibling::div/div/div/following-sibling::div/../following-sibling::div"));	
	if(dataWriteAccess.isDisplayed()) {
	 	   test.log(LogStatus.PASS,"Data Write Access is Displayed");
	 	   captureScreenshot(driver);
	 	  if(dataWriteAccess.isEnabled()) {
		 	   test.log(LogStatus.PASS,"Data Write Access is Enabled");
		 	   captureScreenshot(driver);
		 	  dataWriteAccess.click();	    
	 	  }
		    else
		    {
		 	   test.log(LogStatus.FAIL,"Data Write Access is not Enabled");
		 	   captureScreenshot(driver);
		 	 
		    }
	}
   else
   {
	 	   test.log(LogStatus.FAIL,"Data Write Access is not Displayed");
 	   captureScreenshot(driver);
	    }
	List<WebElement> dataWriteAccessPrivate=driver.findElements(By.xpath("//div[@data-popper-placement='bottom-start']/div/following-sibling::div"));
	dataWriteAccessPrivate.forEach(s->System.out.println(s.getText()));
String data=getDataFromExcel("EntityModel", 11, 0);
dataWriteAccessPrivate.stream().filter(s->s.getText().equalsIgnoreCase(data)).forEach(S->S.click());

    }


public void visibilityAccessDrpdwn() throws Exception {
	test=report.startTest("PI_Visibility_Access");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//driver.findElement(By.xpath("//label[text()='Visibility Access ']/../div/div/following-sibling::div/img")).click();
	WebElement visibilityAccess=driver.findElement(By.xpath("//label[text()='Visibility Access ']/following-sibling::div/div/following-sibling::div"));
	
	if(visibilityAccess.isDisplayed()) {
	 	   test.log(LogStatus.PASS,"Visibility Access is Displayed");
	 	   captureScreenshot(driver);
	 	  if(visibilityAccess.isEnabled()) {
		 	   test.log(LogStatus.PASS,"Visibility Access is Enabled");
		 	   captureScreenshot(driver);
		 	  visibilityAccess.click();
		 	    }
		    else
		    {
		 	   test.log(LogStatus.FAIL,"Visibility Access is not Enabled");
		 	   captureScreenshot(driver);
		 	  
		    }
	}
	    else
	    {
	 	   test.log(LogStatus.FAIL,"Visibility Access is not Displayed");
	 	   captureScreenshot(driver);
	    }
	//List<WebElement> visibilityAccessOrganization=driver.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show']/div/following-sibling::div/following-sibling::div"));
	List<WebElement> visibilityAccessOrganization=driver.findElements(By.xpath("//div[@data-popper-placement='bottom-start']/div/following-sibling::div/following-sibling::div"));
	visibilityAccessOrganization.forEach(s->System.out.println(s.getText()));
	String data=getDataFromExcel("EntityModel", 12, 0);
	visibilityAccessOrganization.stream().filter(s->s.getText().equalsIgnoreCase(data)).forEach(S->S.click());

    }
public void discardBtnEntityModel() throws Exception {
    	test=report.startTest("PI_Discard");
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	//WebElement discard=driver.findElement(By.xpath("//label[normalize-space()='Discard']"));
    	WebElement discard=driver.findElement(By.xpath("//label[text()='Discard']"));
    	if(discard.isDisplayed()) {
    	 	   test.log(LogStatus.PASS,"Discard is Displayed");
    	 	   captureScreenshot(driver);
    	 	  if(discard.isEnabled()) {
    		 	   test.log(LogStatus.PASS,"Discard Access is Enabled");
    		 	   captureScreenshot(driver);
    		 	  // discard.click();
    		 	    }
    		    else
    		    {
    		 	   test.log(LogStatus.FAIL,"Discard is not Enabled");
    		 	   captureScreenshot(driver);
    		    }
    	}
    	    else
    	    {
    	 	   test.log(LogStatus.FAIL,"Discard is not Displayed");
    	 	   captureScreenshot(driver);
    	    }
    	
        }


public void saveBtnEntityModel() throws Exception {
	test=report.startTest("PI_Save");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//WebElement save=driver.findElement(By.xpath("//label[text()='Save']"));
	WebElement save=driver.findElement(By.cssSelector("label[type='submit']"));
	if(save.isDisplayed()) {
	 	   test.log(LogStatus.PASS,"Save is Displayed");
	 	   captureScreenshot(driver);
	 	  if(save.isEnabled()) {
		 	   test.log(LogStatus.PASS,"Save Access is Enabled");
		 	   captureScreenshot(driver);
		 	    }
		    else
		    {
		 	   test.log(LogStatus.FAIL,"Save is not Enabled");
		 	   captureScreenshot(driver);
		    }
	}
	    else
	    {
	 	   test.log(LogStatus.FAIL,"Save is not Displayed");
	 	   captureScreenshot(driver);
	    }
	//save.click();
	driver.quit();

    }

}


