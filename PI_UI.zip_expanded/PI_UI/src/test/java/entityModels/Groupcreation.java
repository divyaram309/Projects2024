package entityModels;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

public class Groupcreation extends MyRunner {
public void addBtn_GroupModel()  {
		
     	test=report.startTest("PI_click on add button");
     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     	
     WebElement btnAdd=driver.findElement(By.xpath("//div[text()='Add']"));
     if(btnAdd.isDisplayed())
		{
	 		 test.log(LogStatus.PASS, "Add button is  visible");
	 		captureScreenshot(driver);
		}
	else {
		test.log(LogStatus.FAIL, " Add button is not visible");
	        captureScreenshot(driver);       
	}
     if(btnAdd.isEnabled())
		{
	 		 test.log(LogStatus.PASS, " Add button is enabled");
	 		captureScreenshot(driver);
	
		}
	else {
		test.log(LogStatus.FAIL, "Add button is disabled ");
	        captureScreenshot(driver);
	       
	}
     
    
     btnAdd.click();
     test.log(LogStatus.PASS, "click on add button");
		captureScreenshot(driver);
     }
   
	
	

	
 public void constructorLst_GroupModel() throws Throwable{
	 test=report.startTest("PI_click on dropdown");
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 	String strConstructName=getDataFromExcel("Data", 1, 0);
	 	WebElement lstConstructs=driver.findElement(By.className("selectbutton"));
	 	
	 	 if(lstConstructs.isDisplayed())
			{
		 		 test.log(LogStatus.PASS, "Dropdown is  visible");
		 		captureScreenshot(driver);
			}
		else {
			test.log(LogStatus.FAIL, " Dropdown is not visible");
		        captureScreenshot(driver);       
		}
	  if(lstConstructs.isEnabled())
			{
		 		 test.log(LogStatus.PASS, " Dropdown is enabled");
		 		captureScreenshot(driver);
		
			}
		else {
			test.log(LogStatus.FAIL, "Dropdown is disabled ");
		        captureScreenshot(driver);
		       
		}
	  
	  lstConstructs.click();
		     
		     
	  
	  List<WebElement> lstConstructs1 =driver.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show']/div"));
	  lstConstructs1.forEach(s->System.out.println(s.getText()));
	  lstConstructs1.stream().filter(s->s.getText().equalsIgnoreCase(strConstructName)).forEach(S->S.click());
	  test.log(LogStatus.FAIL, "click on group ");
      captureScreenshot(driver);
//	 	for(WebElement i : ele1) {
//	 		String data1=i.getText();
//	 		
// 		if(data==data1) {
//	 			i.click();
//	 			test.log(LogStatus.FAIL, "Group is  clickable");
//	 	 		captureScreenshot(driver);
// 			break;
//	 		}
//	 		else {
// 			test.log(LogStatus.FAIL, "Group is not clickable");
//	 	 		captureScreenshot(driver);
//	 		}
 	
	 	}
	 	 
	 
 public void infoBtn_GroupModel()  {
  	test=report.startTest("PI_click on info button");
  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

  WebElement mnuInfo=driver.findElement(By.xpath("//button[text()='Info']"));
  if(mnuInfo.isDisplayed())
		{
	 		 test.log(LogStatus.PASS, "Info button is  visible");
	 		captureScreenshot(driver);
		}
	else {
		test.log(LogStatus.FAIL, " Info button is not visible");
	        captureScreenshot(driver);       
	}
  if(mnuInfo.isEnabled())
		{
	  
	 		 test.log(LogStatus.PASS, " Info button is enabled");
	 		captureScreenshot(driver);
	
		}
	else {
		test.log(LogStatus.FAIL, "Info button is disabled ");
	        captureScreenshot(driver);
	       
	}
  mnuInfo.click();
  test.log(LogStatus.PASS, " Clicks on Info ");
	captureScreenshot(driver);

	}
 public void srchSelectUniverse_GroupModel() throws Throwable {
	 WebElement lstSelectUniverse=driver.findElement(By.xpath("//input[@class='inputfield ng-pristine ng-valid ng-star-inserted ng-touched']"));
	 WebElement srchselectuniverse=driver.findElement(By.xpath("//div[text()='Gaian-Praveen-5 Universe']"));
	 String strselectuniverse=getDataFromExcel("Data", 1,11);
	 
 	 if(lstSelectUniverse.isDisplayed())
		{
	 		 test.log(LogStatus.PASS, " Search select universe is  visible");
	 		captureScreenshot(driver);
		}
	else {
		test.log(LogStatus.FAIL, "Search select universe is not visible");
	        captureScreenshot(driver);       
	}
  if(lstSelectUniverse.isEnabled())
		{
	 		 test.log(LogStatus.PASS, " Search select universe is enabled");
	 		captureScreenshot(driver);
	
		}
	else {
		test.log(LogStatus.FAIL, "select universe is disabled ");
	        captureScreenshot(driver);
	       
	}
  lstSelectUniverse.click();
  srchselectuniverse.click();
  srchselectuniverse.sendKeys(strselectuniverse);
  srchselectuniverse.clear();
  test.log(LogStatus.PASS, "clear the select universe search box");
	captureScreenshot(driver);
 }
 
public void selectUniverseLst_GroupModel() throws Throwable {
	test=report.startTest("PI_click on select universe");
 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 
 	WebElement lstSelectUniverse=driver.findElement(By.xpath("//div[text()='Gaian-DELHI-1 Universe']/../../following-sibling::div"));
 	
 	 if(lstSelectUniverse.isDisplayed())
		{
	 		 test.log(LogStatus.PASS, "select universe is  visible");
	 		captureScreenshot(driver);
		}
	else {
		test.log(LogStatus.FAIL, " select universe is not visible");
	        captureScreenshot(driver);       
	}
  if(lstSelectUniverse.isEnabled())
		{
	 		 test.log(LogStatus.PASS, " select universe is enabled");
	 		captureScreenshot(driver);
	
		}
	else {
		test.log(LogStatus.FAIL, "select universe is disabled ");
	        captureScreenshot(driver);
	       
	}
  
  lstSelectUniverse.click();
	  
  WebElement srchselectuniverse=driver.findElement(By.cssSelector("input[placeholder='Search']"));
	 String strselectuniverse=getDataFromExcel("Data", 1,11);
	 srchselectuniverse.click();
	  srchselectuniverse.sendKeys(strselectuniverse);
  List<WebElement> lstSelectUniverse1 =driver.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show']/div"));
  String strselectuniverse1=getDataFromExcel("Data", 1, 1);
  
  lstSelectUniverse1.forEach(s->System.out.println(s.getText()));
  lstSelectUniverse1.stream().filter(s->s.getText().equalsIgnoreCase(strselectuniverse1)).forEach(S->S.click());
  test.log(LogStatus.PASS, "Click on support");
	captureScreenshot(driver);
// 	for(WebElement i : ele) {
// 		String data1=i.getText();
// 		
// 		if(data==data1) {
// 			i.click();
// 			test.log(LogStatus.FAIL, "Support is  clickable");
// 	 		captureScreenshot(driver);
// 			break;
// 		}
// 		else {
// 			test.log(LogStatus.FAIL, "Support is not clickable");
// 	 		captureScreenshot(driver);
// 		}
 			
 	//}
 	 
 }
public void srchSelectSchema_GroupModel() throws Throwable {
	 WebElement lstSelectUniverse=driver.findElement(By.xpath("//label[text()='Select Schema']/../div/div/following-sibling::div"));
	 WebElement srchselectuniverse=driver.findElement(By.xpath("//div[@class='selectcontent2 dropdown-menu show']/div/input"));
	 String strselectuniverse=getDataFromExcel("Data", 1,12);
	 
	 if(lstSelectUniverse.isDisplayed())
		{
	 		 test.log(LogStatus.PASS, " Search select schema is  visible");
	 		captureScreenshot(driver);
		}
	else {
		test.log(LogStatus.FAIL, "Search select schema is not visible");
	        captureScreenshot(driver);       
	}
 if(lstSelectUniverse.isEnabled())
		{
	 		 test.log(LogStatus.PASS, " Search select schema is enabled");
	 		captureScreenshot(driver);
	
		}
	else {
		test.log(LogStatus.FAIL, "select schema is disabled ");
	        captureScreenshot(driver);
	       
	}
 lstSelectUniverse.click();
 srchselectuniverse.click();
 srchselectuniverse.sendKeys(strselectuniverse);
 srchselectuniverse.clear();
 test.log(LogStatus.PASS, "Clear the select schema search box");
	captureScreenshot(driver);
}

	public void selectSchemaLst_GroupModel() throws Throwable {
		test=report.startTest("PI_click on select schema");
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 	String strSelectSchema=getDataFromExcel("Data", 1, 2);
	 	WebElement lstSelectSchema=driver.findElement(By.xpath("//label[text()='Select Schema']/../div/div/following-sibling::div"));
	 	
	 	 if(lstSelectSchema.isDisplayed())
			{
		 		 test.log(LogStatus.PASS, "select schema is  visible");
		 		captureScreenshot(driver);
			}
		else {
			test.log(LogStatus.FAIL, " select schema is not visible");
		        captureScreenshot(driver);       
		}
	  if(lstSelectSchema.isEnabled())
			{
		 		 test.log(LogStatus.PASS, " select schema is enabled");
		 		captureScreenshot(driver);
		
			}
		else {
			test.log(LogStatus.FAIL, "select schema is disabled ");
		        captureScreenshot(driver);
		       
		}
	  
	  lstSelectSchema.click();
	  WebElement srchselectuniverse=driver.findElement(By.xpath("//div[@class='selectcontent2 dropdown-menu show']/div/input"));
		 String strselectuniverse=getDataFromExcel("Data", 1,12);
		 srchselectuniverse.click();
		 srchselectuniverse.sendKeys(strselectuniverse);
	  List<WebElement> lstSelectSchema1 =driver.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show']/div"));
	  lstSelectSchema1.forEach(s->System.out.println(s.getText()));
	  lstSelectSchema1.stream().filter(s->s.getText().equalsIgnoreCase(strSelectSchema)).forEach(S->S.click());
	  test.log(LogStatus.PASS, "Click's on Demo_Computer");
		captureScreenshot(driver);
//	 	for(WebElement i : ele) {
//	 		String data1=i.getText();
//	 		
//	 		if(data==data1) {
//	 			i.click();
//	 			test.log(LogStatus.FAIL, "Demo_Computer is  clickable");
//	 	 		captureScreenshot(driver);
//	 			break;
//	 		}
//	 		else {
//	 			test.log(LogStatus.FAIL, "Democomputer is not clickable");
//	 	 		captureScreenshot(driver);
//	 		}
	 			
	 	}
	 	 
	
	
	
 
 public void groupNameTxt_GroupModel() throws Throwable {
	 test=report.startTest("PI_Enter's group name");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 String strgroupnamecheck=getDataFromExcel("Data", 1, 8);
   	String strgroupname=getDataFromExcel("Data", 1, 3);
   	
   WebElement txtgroupname=	driver.findElement(By.cssSelector("[formcontrolname='name']"));
   if(txtgroupname.isDisplayed())
	{
		 test.log(LogStatus.PASS, "Group name is  visible");
		captureScreenshot(driver);
	}
else {
	test.log(LogStatus.FAIL, "Group name is not visible");
       captureScreenshot(driver);       
}
if(txtgroupname.isEnabled())
	{
		 test.log(LogStatus.PASS, " Group name is enabled");
		captureScreenshot(driver);

	}
else {
	test.log(LogStatus.FAIL, "Group name is disabled ");
       captureScreenshot(driver);
      
}


txtgroupname.click();
txtgroupname.clear();
Thread.sleep(3000);
txtgroupname.sendKeys(strgroupname);

test.log(LogStatus.PASS, "Enter the group name");
captureScreenshot(driver);
 }
 public void groupDescriptionTxt_GroupModel() throws Throwable {
	 test=report.startTest("PI_Enter's group description");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 String strgroupdescriptioncheck=getDataFromExcel("Data", 1, 9);
   	String strgroupdescription=getDataFromExcel("Data", 1, 4);
   WebElement txtgroupdescription=	driver.findElement(By.cssSelector("[formcontrolname='desc']"));
   if(txtgroupdescription.isDisplayed())
	{
		 test.log(LogStatus.PASS, "Group description is  visible");
		captureScreenshot(driver);
	}
else {
	test.log(LogStatus.FAIL, "Group description is not visible");
       captureScreenshot(driver);       
}
if(txtgroupdescription.isEnabled())
	{
		 test.log(LogStatus.PASS, " Group description is enabled");
		captureScreenshot(driver);

	}
else {
	test.log(LogStatus.FAIL, "Group description is disabled ");
       captureScreenshot(driver);
      
}


txtgroupdescription.click();
Thread.sleep(3000);
txtgroupdescription.sendKeys(strgroupdescriptioncheck);
txtgroupdescription.clear();
Thread.sleep(3000);
txtgroupdescription.sendKeys(strgroupdescription);
test.log(LogStatus.PASS, "Enter the group description");
captureScreenshot(driver);
 }
 public void queryRadioBtn_GroupModel()  {
  	test=report.startTest("PI_click on query radiobutton");
  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

  WebElement rdoquery=driver.findElement(By.xpath("//div[@class='d-flex ng-star-inserted']/div/following-sibling::div/input"));
  if(rdoquery.isDisplayed())
		{
	 		 test.log(LogStatus.PASS, "Query radiobutton is  visible");
	 		captureScreenshot(driver);
		}
	else {
		test.log(LogStatus.FAIL, "Query radiobutton is not visible");
	        captureScreenshot(driver);       
	}
  if(rdoquery.isEnabled())
		{
	 		 test.log(LogStatus.PASS, "Query radiobutton is enabled");
	 		captureScreenshot(driver);
	
		}
	else {
		test.log(LogStatus.FAIL, "Query radiobutton is disabled ");
	        captureScreenshot(driver);
	       
	}
  
  
  rdoquery.click();
  test.log(LogStatus.PASS, "Click on query button");
  captureScreenshot(driver);
	}
 public void queryTxt_GroupModel() throws Throwable {
	 test=report.startTest("PI_Enter's query");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 String strquerycheck=getDataFromExcel("Data", 1, 10);
   	String strquery=getDataFromExcel("Data", 1, 5);
   WebElement txtquery=	driver.findElement(By.cssSelector("[formcontrolname='query']"));
   if(txtquery.isDisplayed())
	{
		 test.log(LogStatus.PASS, "Group description is  visible");
		captureScreenshot(driver);
	}
else {
	test.log(LogStatus.FAIL, "Query is not visible");
       captureScreenshot(driver);       
}
if(txtquery.isEnabled())
	{
		 test.log(LogStatus.PASS, "Query is enabled");
		captureScreenshot(driver);

	}
else {
	test.log(LogStatus.FAIL, "Query is disabled ");
       captureScreenshot(driver);
      
}

txtquery.click();
Thread.sleep(3000);
txtquery.sendKeys(strquerycheck);
txtquery.clear();
Thread.sleep(3000);
txtquery.sendKeys(strquery);
test.log(LogStatus.PASS, "Enter the query");
captureScreenshot(driver);
 
 }
 public void aclBtn_GroupModel()  {
	  	test=report.startTest("PI_click on ACL Button");
	  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	  WebElement btnacl=driver.findElement(By.xpath("//button[text()='ACL']"));
	  if(btnacl.isDisplayed())
			{
		 		 test.log(LogStatus.PASS, "ACL button is  visible");
		 		captureScreenshot(driver);
			}
		else {
			test.log(LogStatus.FAIL, " ACL button is not visible");
		        captureScreenshot(driver);       
		}
	  if(btnacl.isEnabled())
			{
		 		 test.log(LogStatus.PASS, " ACL button is enabled");
		 		captureScreenshot(driver);
		
			}
		else {
			test.log(LogStatus.FAIL, "ACL button is disabled ");
		        captureScreenshot(driver);
		       
		}
	  
	 
	  btnacl.click();
	  test.log(LogStatus.PASS, "Click on acl ");
	  captureScreenshot(driver);
		}
 public void aclLst_GroupModel() throws Throwable {
 test=report.startTest("PI_click on ACL dropdown");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String stracl=getDataFromExcel("Data", 1, 6);
	WebElement lstacl=driver.findElement(By.xpath("//label[text()='Read Access ']/../div/div/following-sibling::div"));
	 if(lstacl.isDisplayed())
		{
	 		 test.log(LogStatus.PASS, "ACL dropdown is  visible");
	 		captureScreenshot(driver);
		}
	else {
		test.log(LogStatus.FAIL, " ACL dropdown is not visible");
	        captureScreenshot(driver);       
	}
if(lstacl.isEnabled())
		{
	 		 test.log(LogStatus.PASS, "ACL dropdown is enabled");
	 		captureScreenshot(driver);
	
		}
	else {
		test.log(LogStatus.FAIL, "ACL dropdown is disabled ");
	        captureScreenshot(driver);
	       
	}
lstacl.click();
	  
List<WebElement> lstacl1 =driver.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show']/div"));
lstacl1.forEach(s->System.out.println(s.getText()));
lstacl1.stream().filter(s->s.getText().equalsIgnoreCase(stracl)).forEach(S->S.click());
test.log(LogStatus.PASS, "Click on private");
captureScreenshot(driver);
//	for(WebElement i : ele) {
//		String data1=i.getText();
//		
//		if(data==data1) {
//			i.click();
//			test.log(LogStatus.FAIL, "Private is  clickable");
//	 		captureScreenshot(driver);
//			break;
//		}
//		else {
//			test.log(LogStatus.FAIL, "Private is not clickable");
//	 		captureScreenshot(driver);
//		}
	//}	
	}
 public void saveBtn_GroupModel() {
 test=report.startTest("PI_click on Save Button");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

WebElement btnsave=driver.findElement(By.xpath("//label[text()='Save']"));
if(btnsave.isDisplayed())
		{
	 		 test.log(LogStatus.PASS, "Save button is  visible");
	 		captureScreenshot(driver);
		}
	else {
		test.log(LogStatus.FAIL, " Save button is not visible");
	        captureScreenshot(driver);       
	}
if(btnsave.isEnabled())
		{
	 		 test.log(LogStatus.PASS, " Save button is enabled");
	 		captureScreenshot(driver);
	
		}
	else {
		test.log(LogStatus.FAIL, "Save button is disabled ");
	        captureScreenshot(driver);
	       
	}


btnsave.click();
test.log(LogStatus.PASS, " Clicks on Save button ");
	captureScreenshot(driver);
	driver.quit();
 }
 
}

