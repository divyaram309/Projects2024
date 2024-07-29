package entityModels;


	import java.time.Duration;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver.Navigation;
	import org.openqa.selenium.WebElement;

	import com.relevantcodes.extentreports.LogStatus;

	public class BigQueryCreation extends MyRunner {
	 
			 //Big Query Assertion
			    Navigation nav;
			   
				public void  AddBtn()  throws Throwable
				 {
				
					 	test=report.startTest("PI_Click On Add button");
					 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					    nav=driver.navigate();
					 	nav.refresh();
					 	WebElement addbtn = driver.findElement(By.xpath("//div[text()='Add']"));
						if (addbtn.isDisplayed())
						{
							test.log(LogStatus.PASS, "Add button is Visible");
							captureScreenshot(driver);
						 	if (addbtn.isEnabled()) 
							{
								test.log(LogStatus.PASS, "Add button is Enabled");						
							 	addbtn.click();																																																																																																																																																																																																																																																																																																																																																																																																																																				
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
								
				 }
				
				 public void bigQueryConstructDropdown() throws Throwable
				 {
					test=report.startTest("PI_Select a value from Dropdown");
				 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

					WebElement dropdown = driver.findElement(By.xpath("(//img[@class='image'])[1]"));
					
					if (dropdown.isDisplayed())
					{
						test.log(LogStatus.PASS, "Dropdown is Visible");
						captureScreenshot(driver);
					
						
//					 	List<WebElement> element =driver.findElements(By.xpath("(//img[@class='image'])[1]"));
//						element.forEach(list->System.out.println(list.getText()));
//						String data = getDataFromExcel("BigQuery", 0, 1);
//						element.stream().filter(list->list.getText().equalsIgnoreCase(data)).forEach(list->list.click());
//						
						
						Thread.sleep(3000);
						//driver.findElement(By.xpath("//label[text()=' Big Query ']")).click();
						//captureScreenshot(driver);
						
						if (dropdown.isEnabled()) 
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
						test.log(LogStatus.FAIL, "Dropdown is not Visible");				
					 	captureScreenshot(driver);
					 	
					}
					
					dropdown.click();
					captureScreenshot(driver);
								 	
				 	//list all elements 
					 List<WebElement> element = driver.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show']/div"));
					 
					 element.forEach(list->System.out.println(list.getText()));
					 String data=getDataFromExcel("BigQueryCreation", 1, 0);
					 element.stream().filter(list->list.getText().equalsIgnoreCase(data)).forEach(list->list.click());
					 test.log(LogStatus.PASS, "Selecting a Value From Dropdown - Big Query");

			 }
				 
				 
				 public void bigQueryInfoBtn()
				 {
					 	test=report.startTest("PI_Click On Info Button");
					 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
						WebElement infobtn = driver.findElement(By.xpath("//button[text()='Info']"));
						if(infobtn.isDisplayed())
						{
							test.log(LogStatus.PASS, "Info Button is Visible");
							captureScreenshot(driver);
							
							if(infobtn.isEnabled()) 
							{
								test.log(LogStatus.PASS, "Info Button is Enabled");				
								infobtn.click();
							 	captureScreenshot(driver);	

							} else 
							{
								test.log(LogStatus.FAIL, "Info Button is Disabled");				
							 	captureScreenshot(driver);
							}	
						} else 
						{
							test.log(LogStatus.FAIL, "Info Button is not Visible");				
						 	captureScreenshot(driver);
						} 
				 }
				 public void QueryNameTxt() throws Throwable
				 {
					 test=report.startTest("PI_Enter Query Name in TextBox");
					 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					 	String data=getDataFromExcel("BigQueryCreation", 1, 1);
						WebElement querynametxt = driver.findElement(By.cssSelector("[placeholder='Enter here']"));
						if(querynametxt.isDisplayed())
						{
							test.log(LogStatus.PASS, "Query name text box is visible");
							captureScreenshot(driver);
							if(querynametxt.isEnabled())
							{
								test.log(LogStatus.PASS, "Query name text box is enabled");
								captureScreenshot(driver);
								}
							else
							{
								test.log(LogStatus.FAIL, "Query name text box is disabled");
								captureScreenshot(driver);
								}
							}
						else
						{
							test.log(LogStatus.FAIL, "Query name text box is not visible");
							captureScreenshot(driver);
							}
						querynametxt.clear();
						test.log(LogStatus.PASS, "Configuration Description cleared successfully");
						querynametxt.sendKeys(data);
						test.log(LogStatus.PASS, "Data Entered in the Qyery name field successfully ");
						captureScreenshot(driver);
				 }

				 
				 public void queryDescriptionTxt() throws Throwable
				 {
					 test=report.startTest("PI_Enter Query Description in TextBox");
					 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					 	//String data=getDataFromExcel("BigQueryData", 1, 2);
						WebElement querydescriptiontxt = driver.findElement(By.cssSelector("[formcontrolname='desc']"));
						if(querydescriptiontxt.isDisplayed())
						{
							test.log(LogStatus.PASS, "Query Description TextBox is Visible");
							captureScreenshot(driver);
							
							if(querydescriptiontxt.isEnabled()) 
							{
								test.log(LogStatus.PASS, "Query Description TextBox is Enabled");				
							 	captureScreenshot(driver);
							 	querydescriptiontxt.click();
							 	querydescriptiontxt.clear();
							 	String data=getDataFromExcel("BigQueryCreation", 1, 2);
							 	querydescriptiontxt.sendKeys(data);
							

							} else 
							{
								test.log(LogStatus.FAIL, "Query Description TextBox is Disabled");				
							 	captureScreenshot(driver);
							}	
						} else 
						{
							test.log(LogStatus.FAIL, "Query Description TextBox is not Visible");				
						 	captureScreenshot(driver);
						} 
				 }
				 
				 public void queryTxt() throws Throwable
				 {
					   test=report.startTest("PI_Enter Query in TextBox");
					 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					 	String data=getDataFromExcel("BigQueryCreation", 1, 3);
						WebElement query = driver.findElement(By.cssSelector("[formcontrolname='definition']"));
						if(query.isDisplayed())
						{
							test.log(LogStatus.PASS, "Query TextBox is Visible");
							captureScreenshot(driver);
							if(query.isEnabled()) 
							{
								test.log(LogStatus.PASS, "Query TextBox is Enabled");				
							 	captureScreenshot(driver);	
							 	query.click();
							 	
							 	query.sendKeys(data);
							 	test.log(LogStatus.PASS, "Click on Query TextBox");

							} else 
							{
								test.log(LogStatus.FAIL, "Query TextBox is Disabled");				
							 	captureScreenshot(driver);
							}	
						} else 
						{
							test.log(LogStatus.FAIL, "Query TextBox is not Visible");				
						 	captureScreenshot(driver);
						} 
				 }
				 
				 public void bigQueryUniverseDropdown() throws Throwable 
				 {
					test=report.startTest("PI_Click On Universe Dropdown");
				 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					
				 	WebElement universedropdown = driver.findElement(By.xpath("//label[text()='Select Universe']/../div/div/following-sibling::div"));
					if (universedropdown.isDisplayed())
					{
						test.log(LogStatus.PASS, "Universe Dropdown is Visible");
						captureScreenshot(driver);
					 	universedropdown.click();
						test.log(LogStatus.PASS, "Selecting a Value From Dropdown");
						captureScreenshot(driver);
						if (universedropdown.isEnabled()) 
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
						test.log(LogStatus.FAIL, "Universe Dropdown is not Visible");				
					 	captureScreenshot(driver);
					}
					
				 }
				 
				 public void bigQueryUniverseSearchBox() throws Throwable
				 {
						test=report.startTest("PI_Enter Universe in DropDown SearhBox");
						driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
						String data=getDataFromExcel("BigQueryCreation", 1, 5);
						WebElement universelist =driver.findElement(By.xpath("//input[@placeholder='Search']"));
						
						if(universelist.isDisplayed()) {
						 	   test.log(LogStatus.PASS,"Universe DropDown SearchBox is Visible");
						 	   captureScreenshot(driver);
						 	  if(universelist.isEnabled()) {
							 	   test.log(LogStatus.PASS,"Universe DropDown SearchBox is enabled");
							 	   captureScreenshot(driver);
							 	    }
							    else
							    {
							 	   test.log(LogStatus.FAIL,"Universe DropDown SearchBox is not Enabled");
							 	   captureScreenshot(driver);
							    }
						 	    }
						    else
						    {
						 	   test.log(LogStatus.FAIL,"Universe DropDown SearchBox is not visible");
						 	   captureScreenshot(driver);
						    }
						universelist.sendKeys(data);
							List<WebElement> element2 =driver.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show']/div"));
							 element2.forEach(elementlist->System.out.println(elementlist.getText()));
							 String data1 = getDataFromExcel("BigQueryCreation", 1, 4);
							element2.stream().filter(elementlist->elementlist.getText().equalsIgnoreCase(data1)).forEach(elementlist->elementlist.click());
						  
				}
				 public void bigQuerySchemaDropdown() throws Throwable 
				 {
					 test=report.startTest("PI_Click On Schema Dropdown");
					 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
						
					 	WebElement schemadropdown = driver.findElement(By.xpath("//label[text()='Select Schema']/../div/div/following-sibling::div"));
						if (schemadropdown.isDisplayed())
						{
							test.log(LogStatus.PASS, "Schema Dropdown is Visible");
							captureScreenshot(driver);
							schemadropdown.click();
							test.log(LogStatus.PASS, "Selecting a Value From Dropdown");
							captureScreenshot(driver);
							if (schemadropdown.isEnabled()) 
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
							test.log(LogStatus.FAIL, "Schema Dropdown is not Visible");				
						 	captureScreenshot(driver);
						}
					 
				 }
				 
				 public void bigQuerySchemaSearchBox() throws Exception
				 {
					 test=report.startTest("PI_Enter Schema in DropDown SearhBox");
						driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
						String data2=getDataFromExcel("BigQueryCreation", 1, 7);
						WebElement schemalist=driver.findElement(By.xpath("(//input[@placeholder='Search'])[2]"));
						
						if(schemalist.isDisplayed()) {
						 	   test.log(LogStatus.PASS,"Schema DropDown SearchBox is Visible");
						 	   captureScreenshot(driver);
						 	  if(schemalist.isEnabled()) {
							 	   test.log(LogStatus.PASS,"Schema DropDown SearchBox is enabled");
							 	   captureScreenshot(driver);
							 	    }
							    else
							    {
							 	   test.log(LogStatus.FAIL,"Schema DropDown SearchBox is not Enabled");
							 	   captureScreenshot(driver);
							    }
						 	    }
						    else
						    {
						 	   test.log(LogStatus.FAIL,"Schema DropDown SearchBox is not visible");
						 	   captureScreenshot(driver);
						    }
						    schemalist.sendKeys(data2);
				 
				 
							List<WebElement> element=driver.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show']/div"));
							element.forEach(list->System.out.println(list.getText()));
							String data7=getDataFromExcel("BigQueryCreation", 1, 6);
							element.stream().filter(list->list.getText().equalsIgnoreCase(data7)).forEach(list->list.click());
				 }
					
				 
				 
				 public void bigQueryStartdateDropDown() throws Throwable
				 {
				 	test=report.startTest("Pi_Select Start Date");
				 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				 	
				    WebElement sdate=driver.findElement(By.xpath("(//div[@class='selectbutton'])[4]"));
				    WebElement date1=driver.findElement(By.xpath("//span[text()='9']"));
				    WebElement date2=driver.findElement(By.xpath("//span[text()='Set']"));
				    if(sdate.isDisplayed()) {
					 	   test.log(LogStatus.PASS,"Schema DropDown SearchBox is Visible");
					 	   captureScreenshot(driver);
					 	  if(sdate.isEnabled()) {
						 	   test.log(LogStatus.PASS,"Schema DropDown SearchBox is Visible");
						 	   captureScreenshot(driver);
						 	  sdate.click();
						 	   
						 	    }
						    else
						    {
						 	   test.log(LogStatus.FAIL,"Schema DropDown SearchBox is not Enabled");
						 	   captureScreenshot(driver);
						    }
					 	    }
					    else
					    {
					 	   test.log(LogStatus.FAIL,"Schema DropDown SearchBox is not Disabled");
					 	   captureScreenshot(driver);
					    }
				     date1.click();
				 	  date2.click();
				 }
				 public void bigQueryEnddateDropdown() throws Throwable
				 {
				 	test=report.startTest("Select End Date");
				 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				 	
				 	WebElement edate=driver.findElement(By.xpath("(//div[@class='selectbutton'])[5]"));
				 	WebElement edate1=driver.findElement(By.xpath("//span[text()='16']"));
				 	WebElement edate2=driver.findElement(By.xpath("//span[text()='Set']"));
				 	if(edate.isDisplayed()) {
					 	   test.log(LogStatus.PASS,"Schema DropDown SearchBox is Visible");
					 	   captureScreenshot(driver);
					 	  if(edate.isEnabled()) {
						 	   test.log(LogStatus.PASS,"Schema DropDown SearchBox is Enabled");
						 	   captureScreenshot(driver);
						 	  edate.click();
						 	  
					 	  }
						    else
						    {
						 	   test.log(LogStatus.FAIL,"Schema DropDown SearchBox is not Enabled");
						 	   captureScreenshot(driver);
						    }
					 	    }
					    else
					    {
					 	   test.log(LogStatus.FAIL,"Schema DropDown SearchBox is Disabled");
					 	   captureScreenshot(driver);
					    }
				 	edate1.click();
				 	 edate2.click();
			 	
				 }
				 
				 public void bigQueryTimeZoneDropdown() throws Throwable
				 {
				 	test=report.startTest("Click on TimeZone Dropdown");
				 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				 	
				 	WebElement timezone = driver.findElement(By.xpath("//label[text()='Time Zone']/../div/div/following-sibling::div"));
				 
					if (timezone.isDisplayed())
					{
						test.log(LogStatus.PASS, "Timezone dropdown is visible");
						captureScreenshot(driver);
						timezone.click();
						test.log(LogStatus.PASS, "Selecting a value from dropdown");
						captureScreenshot(driver);
						if (timezone.isEnabled()) 
						{
							test.log(LogStatus.PASS, "Timezone dropdown is enabled");				
						 	captureScreenshot(driver);	

						} else 
						{
							test.log(LogStatus.FAIL, "Timezone dropdown is not enabled");				
						 	captureScreenshot(driver);
						}	
					} else 
					{
						test.log(LogStatus.FAIL, "Timezone dropdown is not visible");				
					 	captureScreenshot(driver);
					}
					
				 }
				 
				 public void bigQueryTimeZoneSearchBox() throws Throwable
				 {
					 test=report.startTest("PI_Enter timezone in DropDown SearhBox");
						driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
						String data=getDataFromExcel("BigQueryCreation", 1, 9);
						WebElement timezonelist =driver.findElement(By.xpath("(//input[@placeholder='Search'])[3]"));
						
						if(timezonelist.isDisplayed()) {
						 	   test.log(LogStatus.PASS,"Timezone dropDown searchBox is visible");
						 	   captureScreenshot(driver);
						 	  if(timezonelist.isEnabled()) {
							 	   test.log(LogStatus.PASS,"Timezone dropDown searchBox is enabled");
							 	   captureScreenshot(driver);
							 	    }
							    else
							    {
							 	   test.log(LogStatus.FAIL,"Timezone dropDown searchBox is not enabled");
							 	   captureScreenshot(driver);
							    }
						 	    }
						    else
						    {
						 	   test.log(LogStatus.FAIL,"Timezone dropDown searchBox is disabled");
						 	   captureScreenshot(driver);
						    }
						timezonelist.sendKeys(data);
							List<WebElement> element2 =driver.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show']/div"));
							 element2.forEach(elementlist->System.out.println(elementlist.getText()));
							 String data1 = getDataFromExcel("BigQueryCreation", 1, 8);
							element2.stream().filter(elementlist->elementlist.getText().equalsIgnoreCase(data1)).forEach(elementlist->elementlist.click());
						  
				 }
				 public void bigQueryFrequencyDropdown() throws Throwable
				 {
					    test=report.startTest("PI_Click On Frequency Dropdown");
					 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					    String data=getDataFromExcel("BigQueryCreation", 1, 10);
					 	WebElement frequencydropdown = driver.findElement(By.xpath("//label[text()='Frequency']/../div/div/following-sibling::div"));
						if (frequencydropdown.isDisplayed())
						{
							test.log(LogStatus.PASS, "Frequency Dropdown is Visible");
							captureScreenshot(driver);
							
							if (frequencydropdown.isEnabled()) 
							{
								test.log(LogStatus.PASS, "Frequency Dropdown is Enabled");				
							 	captureScreenshot(driver);	
							 	frequencydropdown.click();

							} else 
							{
								test.log(LogStatus.FAIL, "Frequency Dropdown is Disabled");				
							 	captureScreenshot(driver);
							}	
						} else 
						{
							test.log(LogStatus.FAIL, "Frequency Dropdown is not Visible");				
						 	captureScreenshot(driver);
						}
						//frequencydropdown.click();
						frequencydropdown.sendKeys(data);
						captureScreenshot(driver);
						
						List<WebElement> element3 =driver.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show']/div"));
						element3.forEach(elementlist1->System.out.println(elementlist1.getText()));
						element3.stream().filter(elementlist1->elementlist1.getText().equalsIgnoreCase(data)).forEach(elementlist1->elementlist1.click());
						test.log(LogStatus.PASS, "Click on private");
						captureScreenshot(driver);
			}
					 
			
				 
		 
				 public void bigQueryAclBtn()  {
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
				 
				 
				 public void bigQueryReadAccessDropDown() throws Exception {
					 test=report.startTest("PI_Selecting Value from Read Access Dropdown");
						driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
						WebElement raccess=driver.findElement(By.xpath("//app-select[@name='readAccess']//div[@class='selectbutton']"));
						

						if(raccess.isDisplayed()) {
						 	   test.log(LogStatus.PASS,"Read access dropdown is visible");
						 	   captureScreenshot(driver);
						 	  if(raccess.isEnabled()) {
							 	   test.log(LogStatus.PASS,"Read access dropdown is Enabled");
							 	   captureScreenshot(driver);
							 	   
							 	   
							 	   
							 	  raccess.click();
									List<WebElement> raccess1=driver.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show']/div"));
									raccess1.forEach(s->System.out.println(s.getText()));
									String data=getDataFromExcel("BigQueryCreation",1, 11);
									raccess1.stream().filter(s->s.getText().equalsIgnoreCase(data)).forEach(S->S.click());
									test.log(LogStatus.PASS,"Read access dropdown is selected");
								 	   captureScreenshot(driver);
							 	    }
							    else
							    {
							 	   test.log(LogStatus.FAIL,"Read access dropdown is not enabled");
							 	   captureScreenshot(driver);
							    }
						}
						    else
						    {   test.log(LogStatus.FAIL,"Read access dropdown is not visible");
						    captureScreenshot(driver);
						    }
						     
					    }
				 public void bigQueryVisibilityAccess() throws Exception {
					 test=report.startTest("PI_Selecting Value from Visibility Access Dropdown");
						driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
						WebElement vaccess=driver.findElement(By.xpath("//app-select[@name='visibility']//div[@class='selectbutton']"));
						

						if(vaccess.isDisplayed()) {
						 	   test.log(LogStatus.PASS,"Visibility access dropdown is visible");
						 	   captureScreenshot(driver);
						 	  if(vaccess.isEnabled()) {
							 	   test.log(LogStatus.PASS,"Visibility access dropdown is Enabled");
							 	   captureScreenshot(driver);
							 	   
							 	   
							 	   
							 	   vaccess.click();
									List<WebElement> vaccess1=driver.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show']/div"));
									vaccess1.forEach(s->System.out.println(s.getText()));
									String data=getDataFromExcel("BigQueryCreation",1, 12);
									vaccess1.stream().filter(s->s.getText().equalsIgnoreCase(data)).forEach(S->S.click());
									test.log(LogStatus.PASS,"Visibility access dropdown is selected");
								 	   captureScreenshot(driver);
							 	    }
							    else
							    {
							 	   test.log(LogStatus.FAIL,"Visibility access dropdown is enabled");
							 	   captureScreenshot(driver);
							    }
						}
						    else
						    {   test.log(LogStatus.FAIL,"Visibility access dropdown is not visible");
						    captureScreenshot(driver);
						    }
					 
					    }
				 public void bigQuerySaveBtn() {
					 test=report.startTest("PI_Click on Save Button");
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
					test.log(LogStatus.PASS, "Click on Save button");
					 captureScreenshot(driver);
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
						//discardbtn.click();
					 	//test.log(LogStatus.PASS,"Click On Discard Button");
					 	//captureScreenshot(driver);
						driver.quit();
						}
				 
				 
		}	 



