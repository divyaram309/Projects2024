package entityModels;


import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.relevantcodes.extentreports.LogStatus;

public class BigQueryAssertion extends MyRunner {
	
	//------------------------------------------------------	
	//----------BIG_QUERY_ASSERTIONS---------------------
	//------------------------------------------------------	
		public void bigQueryAddBtn() 
		{
			 	test=report.startTest("PI_Click On Add button");
			 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 	driver.navigate().refresh();
			 	WebElement addbtn = driver.findElement(By.cssSelector("[src='../../../assets/images/add.png']"));
				if (addbtn.isDisplayed())
				{
					test.log(LogStatus.PASS, "Add button is Visible");
					captureScreenshot(driver);																																																																																																																																																																																																																																																																																																																																																																																																																																			
				 	if (addbtn.isEnabled()) 
					{
						test.log(LogStatus.PASS, "Add button is Enabled");				
						captureScreenshot(driver);
		
					} else 
					{
						test.log(LogStatus.FAIL, "Add button is Disabled");				
					 	captureScreenshot(driver);
					}
					
				} else 
				{
					test.log(LogStatus.FAIL, "Add button is Not Visible");				
				 	captureScreenshot(driver);
				}
			 	addbtn.click();		
				test.log(LogStatus.PASS, "Click On Add button");				
			 	captureScreenshot(driver);
		}
		
		public void bigQueryConstructDropdown() throws Throwable
		{
			test=report.startTest("PI_Select Value From Dropdown - Big Query");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
			WebElement constructlist = driver.findElement(By.xpath("(//img[@class='image'])[1]"));
			
			if (constructlist.isDisplayed())
			{
				test.log(LogStatus.PASS, "Dropdown is Visible");
				captureScreenshot(driver);		
				if (constructlist.isEnabled()) 
				{
					test.log(LogStatus.PASS, "Dropdown is Enabled");				
				 	captureScreenshot(driver);	
		
				} else 
				{
					test.log(LogStatus.FAIL, "Dropdown is Disabled");				
				 	captureScreenshot(driver);
				}	
			} else 
			{
				test.log(LogStatus.FAIL, "Dropdown is Not Visible");				
			 	captureScreenshot(driver);
			 	
			}
			constructlist.click();
			//list all elements 
			 List<WebElement> element = driver.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show']/div"));
			 element.forEach(list->System.out.println(list.getText()));
			 String data=getDataFromExcel("BigQueryData", 1, 0);
			 //filter the data and compare the element using equal ignore case
			 element.stream().filter(list->list.getText().equalsIgnoreCase(data)).forEach(list->list.click());
			test.log(LogStatus.PASS, "Select Value From Dropdown - Big Query");
			captureScreenshot(driver);				 	
		
		}
		
		public void bigQueryInfoBtn()
		{
			 	test=report.startTest("PI_Click On Info Button");
			 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				WebElement infobtn = driver.findElement(By.xpath("//button[text()='INFO']"));
				if(infobtn.isDisplayed())
				{
					test.log(LogStatus.PASS, "Info Button is Visible");
					captureScreenshot(driver);
					
					if(infobtn.isEnabled()) 
					{
						test.log(LogStatus.PASS, "Info Button is Enabled");				
					 	captureScreenshot(driver);	
		
					} else 
					{
						test.log(LogStatus.FAIL, "Info Button is Disabled");				
					 	captureScreenshot(driver);
					}	
				} else 
				{
					test.log(LogStatus.FAIL, "Info Button is Not Visible");				
				 	captureScreenshot(driver);
				} 
		}
		
		public void queryNameTxt() throws Throwable 
		{
			 	test=report.startTest("PI_Enter Query Name in TextBox");
			 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				 String data=getDataFromExcel("BigQueryData", 1, 1);
				 WebElement querynametxt = driver.findElement(By.cssSelector("[placeholder='Enter here']"));
				 if(querynametxt.isDisplayed())
				{
					test.log(LogStatus.PASS, "Query Name TextBox is Visible");
					captureScreenshot(driver);
					if(querynametxt.isEnabled()) 
					{
						test.log(LogStatus.PASS, "Query Name TextBox is Enabled");				
					 	
					 	captureScreenshot(driver);	
		
					} else 
					{
						test.log(LogStatus.FAIL, "Query Name TextBox is Disabled");				
					 	captureScreenshot(driver);
					}	
				} else 
				{
					test.log(LogStatus.FAIL, "Query Name TextBox is Not Visible");				
				 	captureScreenshot(driver);
				} 
				querynametxt.clear();
				querynametxt.sendKeys(data);
				test.log(LogStatus.PASS, "Enter Query Name in TextBox");
				captureScreenshot(driver);
		}
		
		public void queryDescriptionTxt() throws Throwable 
		{
			 test=report.startTest("PI_Enter Query Description in TextBox");
			 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				 String data=getDataFromExcel("BigQueryData", 1, 2);
				 WebElement querydestxt = driver.findElement(By.cssSelector("[formcontrolname='desc']"));
				if(querydestxt.isDisplayed())
				{
					test.log(LogStatus.PASS, "Query Description TextBox is Visible");
					captureScreenshot(driver);	
					if(querydestxt.isEnabled()) 
					{
						test.log(LogStatus.PASS, "Query Description TextBox is Enabled");				
					 	
					 	captureScreenshot(driver);	
		
					} else 
					{
						test.log(LogStatus.FAIL, "Query Description TextBox is Disabled");				
					 	captureScreenshot(driver);
					}	
				} else 
				{
					test.log(LogStatus.FAIL, "Query Description TextBox is Not Visible");				
				 	captureScreenshot(driver);
				} 
				querydestxt.clear();
				querydestxt.sendKeys(data);
			 	test.log(LogStatus.PASS, "Enter Query Description in TextBox");
			 	captureScreenshot(driver);
		}
		
		public void queryTxt() throws Throwable 
		{
			 test=report.startTest("PI_Enter Query in TextBox");
			 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				 String data=getDataFromExcel("BigQueryData", 1, 3);
				 WebElement querytxt = driver.findElement(By.cssSelector("[formcontrolname='definition']"));
				 if(querytxt.isDisplayed())
				{
					test.log(LogStatus.PASS, "Query TextBox is Visible");
					captureScreenshot(driver);
					if(querytxt.isEnabled()) 
					{
						test.log(LogStatus.PASS, "Query TextBox is Enabled");				
					 	
					 	captureScreenshot(driver);	
		
					} else 
					{
						test.log(LogStatus.FAIL, "Query TextBox is Disabled");				
					 	captureScreenshot(driver);
					}	
				} else 
				{
					test.log(LogStatus.FAIL, "Query TextBox is Not Visible");				
				 	captureScreenshot(driver);
				} 
				querytxt.clear();
				querytxt.sendKeys(data);
				test.log(LogStatus.PASS, "Enter Query in TextBox");
				captureScreenshot(driver);
		
		}
		
		public void bigQueryUniverseDropdown() throws Throwable 
		{
			test=report.startTest("PI_Select Value From Dropdown - Universe");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			WebElement universelist = driver.findElement(By.xpath("//label[text()='Select Universe']/../div/div/following-sibling::div"));
			if (universelist.isDisplayed())
			{
				test.log(LogStatus.PASS, "Universe Dropdown is Visible");
				captureScreenshot(driver);
				if (universelist.isEnabled()) 
				{
					test.log(LogStatus.PASS, "Universe Dropdown is Enabled");				
				 	
				 	captureScreenshot(driver);	
		
				} else 
				{
					test.log(LogStatus.FAIL, "Universe Dropdown is Disabled");				
				 	captureScreenshot(driver);
				}	
			} else 
			{
				test.log(LogStatus.FAIL, "Universe Dropdown is Not Visible");				
			 	captureScreenshot(driver);
			}
			universelist.click();
			test.log(LogStatus.PASS, "Select Value From Dropdown - Universe");
			captureScreenshot(driver);
		}
		
		public void bigQueryUniverseSearchBox() throws Throwable
		{
				test=report.startTest("PI_Enter Value in DropDown SearhBox");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				String data=getDataFromExcel("BigQueryData", 1, 5);
				WebElement universelist = driver.findElement(By.xpath("//input[@placeholder='Search']"));
				
				if(universelist.isDisplayed()) {
				 	   test.log(LogStatus.PASS,"Universe DropDown SearchBox is Visible");
				 	   captureScreenshot(driver);
				 	  if(universelist.isEnabled()) {
					 	   test.log(LogStatus.PASS,"Universe DropDown SearchBox is Enabled");
					 	   captureScreenshot(driver);
					 	    }
					    else
					    {
					 	   test.log(LogStatus.FAIL,"Universe DropDown SearchBox is Disabled");
					 	   captureScreenshot(driver);
					    }
				 	    }
				    else
				    {
				 	   test.log(LogStatus.FAIL,"Universe DropDown SearchBox is Not Visible");
				 	   captureScreenshot(driver);
				    }
					universelist.sendKeys(data);
					List<WebElement> element=driver.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show']/div"));
					element.forEach(list->System.out.println(list.getText()));
					String data1=getDataFromExcel("BigQueryData", 1, 4);
					element.stream().filter(list->list.getText().equalsIgnoreCase(data1)).forEach(list->list.click());
				  
		}
		public void bigQuerySchemaDropdown() throws Throwable 
		{
			test=report.startTest("PI_Select Value From Dropdown - Schema");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			WebElement schemalist = driver.findElement(By.xpath("//label[text()='Select Schema']/../div/div/following-sibling::div"));
			if (schemalist.isDisplayed())
			{
				test.log(LogStatus.PASS, "Schema Dropdown is Visible");
				captureScreenshot(driver);
				if (schemalist.isEnabled() ) 
				{
					test.log(LogStatus.PASS, "Schema Dropdown is Enabled");				
				 	
				 	captureScreenshot(driver);	
		
				} else 
				{
					test.log(LogStatus.FAIL, "Schema Dropdown is Disabled");				
				 	captureScreenshot(driver);
				}	
			} else 
			{
				test.log(LogStatus.FAIL, "Schema Dropdown is Not Visible");				
			 	captureScreenshot(driver);
			}
			schemalist.click();
			test.log(LogStatus.PASS, "Select Value From Dropdown - Schema");
			captureScreenshot(driver);
		}
		
		public void bigQuerySchemaSearchBox() throws Throwable
		{
			 test=report.startTest("PI_Enter Value in DropDown SearhBox");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				String data=getDataFromExcel("BigQueryData", 1, 7);
				WebElement schemalist = driver.findElement(By.xpath("(//input[@placeholder='Search'])[2]"));
				
				if(schemalist.isDisplayed()) {
				 	   test.log(LogStatus.PASS,"Schema DropDown SearchBox is Visible");
				 	   captureScreenshot(driver);
				 	  if(schemalist.isEnabled()) {
					 	   test.log(LogStatus.PASS,"Schema DropDown SearchBox is Enabled");
					 	   captureScreenshot(driver);
					 	    }
					    else
					    {
					 	   test.log(LogStatus.FAIL,"Schema DropDown SearchBox is Disabled");
					 	   captureScreenshot(driver);
					    }
				 	    }
				    else
				    {
				 	   test.log(LogStatus.FAIL,"Schema DropDown SearchBox is Not Visible");
				 	   captureScreenshot(driver);
				    }
					schemalist.sendKeys(data);
					List<WebElement> element=driver.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show']/div"));
					element.forEach(list->System.out.println(list.getText()));
					String data1=getDataFromExcel("BigQueryData", 1, 6);
					element.stream().filter(list->list.getText().equalsIgnoreCase(data1)).forEach(list->list.click());
		}
		
		public void bigQueryStartDate()
		{
			test=report.startTest("PI_Select Start Date From DropDown");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			WebElement startdate =  driver.findElement(By.xpath("//label[text()='Start Date']/../div/div/following-sibling::div"));
			
			if(startdate.isDisplayed()) {
			 	   test.log(LogStatus.PASS,"Start Date DropDown is Visible");
			 	   captureScreenshot(driver);
			 	  startdate.click();
			 	   test.log(LogStatus.PASS,"Start Date DropDown is Visible");
			 	  if(startdate.isEnabled()) {
				 	   test.log(LogStatus.PASS,"Start Date DropDown is Enabled");
				 	   captureScreenshot(driver);
				 	    }
				    else
				    {
				 	   test.log(LogStatus.FAIL,"Start Date DropDown is Disabled");
				 	   captureScreenshot(driver);
				    }
			 	    }
			    else
			    {
			 	   test.log(LogStatus.FAIL,"Start Date DropDown is Not Visible");
			 	   captureScreenshot(driver);
			    }
			 	Calendar cal= Calendar.getInstance();
				java.util.Date d = cal.getTime();
				SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
				String modifiedDate =sdf.format(d);
				ChromeOptions options =new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				WebDriver driver =new ChromeDriver(options);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.findElement(By.xpath("//input[@type='text']")).sendKeys(modifiedDate);
		
		}
		
		public void bigQueryEndDate()
		{
			test=report.startTest("PI_Select End Date From DropDown");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			WebElement startdate =  driver.findElement(By.xpath("//label[text()='End Date']/../div/div/following-sibling::div"));
			
			if(startdate.isDisplayed()) {
			 	   test.log(LogStatus.PASS,"End Date DropDown is Visible");
			 	   captureScreenshot(driver);
			 	  startdate.click();
			 	   test.log(LogStatus.PASS,"End Date DropDown is Visible");
			 	  if(startdate.isEnabled()) {
				 	   test.log(LogStatus.PASS,"End Date DropDown is Enabled");
				 	   captureScreenshot(driver);
				 	    }
				    else
				    {
				 	   test.log(LogStatus.FAIL,"End Date DropDown is Disabled");
				 	   captureScreenshot(driver);
				    }
			 	    }
			    else
			    {
			 	   test.log(LogStatus.FAIL,"End Date DropDown is Not Visible");
			 	   captureScreenshot(driver);
			    }
			 	Calendar cal= Calendar.getInstance();
				java.util.Date d = cal.getTime();
				SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
				String modifiedDate =sdf.format(d);
				ChromeOptions options =new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				WebDriver driver =new ChromeDriver(options);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.findElement(By.xpath("//input[@type='text']")).sendKeys(modifiedDate);
		
		}
		public void bigQueryTimeZoneDropdown() throws Throwable
		 {
		 	test=report.startTest("Select TimeZone From Dropdown");
		 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 	
		 	WebElement timezone = driver.findElement(By.xpath("//label[text()='Time Zone']/../div/div/following-sibling::div"));
		 
			if (timezone.isDisplayed())
			{
				test.log(LogStatus.PASS, "Timezone Dropdown is visible");
				captureScreenshot(driver);
				if (timezone.isEnabled()) 
				{
					test.log(LogStatus.PASS, "Timezone Dropdown is Enabled");				
				 	captureScreenshot(driver);	

				} else 
				{
					test.log(LogStatus.FAIL, "Timezone Dropdown is Disabled");				
				 	captureScreenshot(driver);
				}	
			} else 
			{
				test.log(LogStatus.FAIL, "Timezone Dropdown is Not Visible");				
			 	captureScreenshot(driver);
			}
			timezone.click();
			test.log(LogStatus.PASS, "Select Value From Dropdown");
			captureScreenshot(driver);
			
		 }
		 public void bigQueryTimeZoneSearchBox() throws Throwable
		 {
			 test=report.startTest("PI_Enter Timezone in DropDown SearhBox");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				String data=getDataFromExcel("BigQueryData", 1, 9);
				WebElement timezonelist =driver.findElement(By.xpath("(//input[@placeholder='Search'])[3]"));
				
				if(timezonelist.isDisplayed()) {
				 	   test.log(LogStatus.PASS,"Timezone DropDown SearchBox is visible");
				 	   captureScreenshot(driver);
				 	  if(timezonelist.isEnabled()) {
					 	   test.log(LogStatus.PASS,"Timezone DropDown SearchBox is Enabled");
					 	   captureScreenshot(driver);
					 	    }
					    else
					    {
					 	   test.log(LogStatus.FAIL,"Timezone DropDown SearchBox is Disabled");
					 	   captureScreenshot(driver);
					    }
				 	    }
				    else
				    {
				 	   test.log(LogStatus.FAIL,"Timezone DropDown SearchBox is Not Visible");
				 	   captureScreenshot(driver);
				    }
					timezonelist.sendKeys(data);
					List<WebElement> element2 =driver.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show']/div"));
					 element2.forEach(elementlist->System.out.println(elementlist.getText()));
					 String data1 = getDataFromExcel("BigQueryData", 1, 8);
					element2.stream().filter(list->list.getText().equalsIgnoreCase(data1)).forEach(list->list.click());
				  
		 }
		public void bigQueryFrequencyDropdown() throws Throwable
		{
			    test=report.startTest("PI_Click On Frequency Dropdown");
			 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			    String data=getDataFromExcel("BigQueryData", 1, 10);
			 	WebElement frequencylist = driver.findElement(By.xpath("//label[text()='Frequency']/../div/div/following-sibling::div"));
				if (frequencylist.isDisplayed())
				{
					test.log(LogStatus.PASS, "Frequency Dropdown is Visible");
					captureScreenshot(driver);
					
					if (frequencylist.isEnabled()) 
					{
						test.log(LogStatus.PASS, "Frequency Dropdown is Enabled");				
					 	captureScreenshot(driver);	
		
					} else 
					{
						test.log(LogStatus.FAIL, "Frequency Dropdown is Disabled");				
					 	captureScreenshot(driver);
					}	
				} else 
				{
					test.log(LogStatus.FAIL, "Frequency Dropdown is Not Visible");				
				 	captureScreenshot(driver);
				}
				frequencylist.click();
				frequencylist.sendKeys(data);
				captureScreenshot(driver);
				
				List<WebElement> element =driver.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show']/div"));
				element.forEach(list->System.out.println(list.getText()));
				element.stream().filter(list->list.getText().equalsIgnoreCase(data)).forEach(list->list.click());
				test.log(LogStatus.PASS, "Click On Frequency Dropdown");
				captureScreenshot(driver);
		}
			 
		public void bigQueryAclBtn()
		{
			 	test=report.startTest("PI_Click On ACL Button");
			 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				WebElement ACLbtn = driver.findElement(By.xpath("//button[text()='ACL']"));
				if(ACLbtn.isDisplayed())
				{
					test.log(LogStatus.PASS, "ACL Button is Visible");
					captureScreenshot(driver);
					
					if(ACLbtn.isEnabled()) 
					{
						test.log(LogStatus.PASS, "ACL Button is Enabled");				
					 	captureScreenshot(driver);	
		
					} else 
					{
						test.log(LogStatus.FAIL, "ACL Button is Disabled");				
					 	captureScreenshot(driver);
					}	
				} else 
				{
					test.log(LogStatus.FAIL, "ACL Button is Not Visible");				
				 	captureScreenshot(driver);
				} 
				ACLbtn.click();
		}
		public void bigQueryReadAccessDropdown() throws Throwable
		{
				test=report.startTest("PI_Select Read Access From DropDown");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				WebElement read_accesslist = driver.findElement(By.xpath("//label[text()='Read Access ']/../div/div/following-sibling::div"));
				
				if(read_accesslist.isDisplayed()) {
				 	   test.log(LogStatus.PASS,"Read Access DropDown is Visible");
				 	   captureScreenshot(driver);
				 	  if(read_accesslist.isEnabled()) {
					 	   test.log(LogStatus.PASS,"Read Access DropDown is Enabled");
					 	   captureScreenshot(driver);
					 	    }
					    else
					    {
					 	   test.log(LogStatus.FAIL,"Read Access DropDown is Disabled");
					 	   captureScreenshot(driver);
					    }
				 	    }
				    else
				    {
				 	   test.log(LogStatus.FAIL,"Read Access DropDown is Not Visible");
				 	   captureScreenshot(driver);
				    }
				read_accesslist.click();
				List<WebElement> element=driver.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show']/div"));
				element.forEach(list->System.out.println(list.getText()));	
				String data=getDataFromExcel("BigQueryData", 1, 11);
				element.stream().filter(list->list.getText().equalsIgnoreCase(data)).forEach(list->list.click());
			  
		}
		
		public void bigQueryVisibilityAccessDropdown() throws Exception {
			test=report.startTest("PI_Select Visibility Access From Dropdown");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement visibility_accesslist = driver.findElement(By.xpath("//label[text()='Visibility Access ']/following-sibling::div/div/following-sibling::div"));
			
			if(visibility_accesslist.isDisplayed()) {
			 	   test.log(LogStatus.PASS,"Visibility Access is Visible");
			 	   captureScreenshot(driver);
			 	  if(visibility_accesslist.isEnabled()) {
				 	   test.log(LogStatus.PASS,"Visibility Access is Enabled");
				 	   captureScreenshot(driver);
				 	    }
				    else
				    {
				 	   test.log(LogStatus.FAIL,"Visibility Access is Disabled");
				 	   captureScreenshot(driver);
				 	  visibility_accesslist.click();
				    }
			}
			    else
			    {
			 	   test.log(LogStatus.FAIL,"Visibility Access is Not Visible");
			 	   captureScreenshot(driver);
			    }
			visibility_accesslist.click();
			List<WebElement> element = driver.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show']/div"));
			element.forEach(list->System.out.println(list.getText()));
			String data=getDataFromExcel("BigQueryData", 1, 12);
			element.stream().filter(list->list.getText().equalsIgnoreCase(data)).forEach(list->list.click());
		
		   }
		public void bigQuerySaveBtn() throws Exception {
			test=report.startTest("PI_Click On Save Button");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement savebtn = driver.findElement(By.xpath("//label[text()='Save']"));
			if(savebtn.isDisplayed()) {
			 	   test.log(LogStatus.PASS,"Save Button is Visible");
			 	   captureScreenshot(driver);
			 	  if(savebtn.isEnabled()) {
				 	   test.log(LogStatus.PASS,"Save Button is Enabled");
				 	   captureScreenshot(driver);
				 	    }
				    else
				    {
				 	   test.log(LogStatus.FAIL,"Save Button is Disabled");
				 	   captureScreenshot(driver);
				    }
			}
			else
			 {
				test.log(LogStatus.FAIL,"Save Button is Not Visible");
			 	captureScreenshot(driver);
			 }
			//savebtn.click();
			//test.log(LogStatus.PASS,"Click On Save Button");
		 	//captureScreenshot(driver);
		}
		
		public void bigQueryDiscardBtn() throws Exception 
		{
			test=report.startTest("PI_Click On Discard Button");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement discardbtn = driver.findElement(By.xpath("//label[text()='Discard']"));
			if(discardbtn.isDisplayed()) 
			{
			 	   test.log(LogStatus.PASS,"Discard Button is Visible");
			 	   captureScreenshot(driver);
			 	  //discard.click();
			 	  if(discardbtn.isEnabled()) 
			 	  {
				 	   test.log(LogStatus.PASS,"Discard Button is Enabled");
				 	   captureScreenshot(driver);
			 	  }
				    else
				    {
				 	   test.log(LogStatus.FAIL,"Discard Button is Disabled");
				 	   captureScreenshot(driver);
				    }
			}
			else
			 {
			 	 test.log(LogStatus.FAIL,"Discard Button is Not Visible");
			 	  captureScreenshot(driver);
			 }
			discardbtn.click();
		 	//test.log(LogStatus.PASS,"Click On Discard Button");
		 	//captureScreenshot(driver);
			driver.quit();
			}


}



