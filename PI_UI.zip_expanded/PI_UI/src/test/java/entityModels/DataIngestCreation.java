package entityModels;



	import java.awt.AWTException;
	import java.io.File;
	import java.time.Duration;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import com.relevantcodes.extentreports.LogStatus;
		
		public class DataIngestCreation extends MyRunner {
			public void addBtn_DataIngest() throws InterruptedException
			{
				driver.navigate().refresh();
				 test=report.startTest("PI_AddButton");
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					 
					//Add button clicking
			WebElement addbtn =driver.findElement(By.xpath("//div[@class='menu-list']/button"));
			
			if(addbtn.isDisplayed())
			{
				
				 test.log(LogStatus.PASS, "Add button is visibled");
			       captureScreenshot(driver);
			       if(addbtn.isEnabled())
			  	 {	  		
			  		 test.log(LogStatus.PASS, "Add button is Enabled");
			  	        captureScreenshot(driver);
			  	 }
			  	 else
			  	 {
			  		 test.log(LogStatus.FAIL, "Add button is not Enabled");
			  	        captureScreenshot(driver);
			  }
			}
			else
			{
				 test.log(LogStatus.FAIL, "Add button is not visible");
			       captureScreenshot(driver);
			}
			addbtn.click();
			}
			
			/*public void selectConstruct_DataIngest() throws Exception
			{
				 test=report.startTest("PI_Select Data Ingest");
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//WebElement dropDown= driver.findElement(By.xpath("//div[@class='selectbutton']"));
				 WebElement dropDown=driver.findElement(By.xpath("(//img[@class='image'])[1]"));
			if(dropDown.isDisplayed())
			{
				
				 test.log(LogStatus.PASS, "DropDown button is visibled");
			       captureScreenshot(driver);
			       if(dropDown.isEnabled())
			  	 {
			  		
			  		 test.log(LogStatus.PASS, "DropDown button is enabled");
			  	        captureScreenshot(driver);
			  	 }
			  	 else
			  	 {
			  		 test.log(LogStatus.FAIL, "DropDown button is not enabled");
			 	        captureScreenshot(driver);
			  }
			}
			else
			{
				 test.log(LogStatus.FAIL, "DropDown button is not visibled");
			       captureScreenshot(driver);
			}
			//Dropdown clicking
			dropDown.click();
		//Selecting DataIngest
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
			String dataIngestWord= getDataFromExcel("DataIngest",1, 1);
			//List<WebElement> constructList=driver.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show']/div"));		
			
			List<WebElement> constructList=driver.findElements(By.xpath("//div[@data-popper-placement='bottom-start']/div"));
			constructList.forEach(s->System.out.println(s.getText()));
			//Data DataIngest clicking
			constructList.stream().filter(s->s.getText().equalsIgnoreCase(dataIngestWord)).forEach(S->S.click());
			/*for(WebElement i:ele1)
			{
				 System.out.println(data);
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				 if(data1 == data)
				 {
					 ele.click();
				 }
				 else {
					System.out.println("Data Ingest not found");
				}
			}
			   //list all elements 
			test.log(LogStatus.PASS, "DataIngest Selected");
			captureScreenshot(driver);
			}*/
			public void selectConstruct_DataIngest()throws InterruptedException {
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

		public void selectDataIngestDropDown()throws Exception {
			test=report.startTest("PI_Data_Ingest_DropDown");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			List<WebElement> entityModelDropdown=driver.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show']/div"));
			entityModelDropdown.forEach(s->System.out.println(s.getText()));
		String data=getDataFromExcel("DataInjest", 1, 1);
		entityModelDropdown.stream().filter(s->s.getText().equalsIgnoreCase(data)).forEach(S->S.click());
		captureScreenshot(driver);
		}
			public void infoBtn_DataIngest() throws InterruptedException {
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
			/*public void universeDropdown_DataIngest() throws Exception
			{
				 	test=report.startTest("PI_Universe");	
		//		 	driver.findElement(By.xpath("//div[@class='menu-list']/button")).click();
		//		 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//		 	driver.findElement(By.xpath("//div[@class='selectbutton']")).click();
		//		 	List<WebElement> ele1=driver.findElements(By.xpath("//div[@class='dropdown-item ng-star-inserted']"));
		//			ele1.forEach(s->System.out.println(s.getText()));
		//			String data=getDataFromExcel("Data",5, 1);
		//			ele1.stream().filter(s->s.getText().equalsIgnoreCase(data)).forEach(S->S.click());
					//WebElement dropdown= driver.findElement(By.xpath("//label[text()='Ingestion Name']/../../app-search-select/div/div/div/following-sibling::div"));
				
				 	//WebElement dropdown=driver.findElement(By.xpath("//app-search-select[@name='universeName']//div[@class='selectbutton']"));
				 	WebElement dropdown=driver.findElement(By.xpath("//img[@style='outline: none;']/.."));
				 	if(dropdown.isDisplayed())
				 {
					
					 test.log(LogStatus.PASS, "Universe button is visible");
				        captureScreenshot(driver);
				        if(dropdown.isEnabled())
						 {
							
							 test.log(LogStatus.PASS, "Universe button is enabled");
						        captureScreenshot(driver);
								
				 }
						 else
						 {
							 test.log(LogStatus.FAIL, "Universe button is not enabled");
						        captureScreenshot(driver);
				}
			}
				 else
				 {
					 test.log(LogStatus.FAIL, "Universe button is not visible");
				        captureScreenshot(driver);
			}
					WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
				dropdown.click();
				WebElement search=driver.findElement(By.xpath("//input[@class='inputfield ng-star-inserted']"));
				String data=getDataFromExcel("DataIngest", 2, 1);
				search.sendKeys(data);
				List<WebElement> universeList=driver.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show']/div"));
				universeList.forEach(s->System.out.println(s.getText()));
				String universeName=getDataFromExcel("DataIngest",3, 1);
				universeList.stream().filter(s->s.getText().equalsIgnoreCase(universeName)).forEach(S->S.click());
				test.log(LogStatus.PASS, "Universe Selected");
				captureScreenshot(driver);
			}*/
			public void universeDropdown_DataIngest() throws InterruptedException {
				test=report.startTest("PI_Selct_Universe_DataIngest_Dropdown");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				WebElement selectuniverseDropdown=driver.findElement(By.xpath("//label[text()='Select Universe']/../div/div/following-sibling::div"));
				if(selectuniverseDropdown.isDisplayed()) {
				 	   test.log(LogStatus.PASS,"Select Universe DataIngest DropDown is Displayed");
				 	   captureScreenshot(driver);
				if(selectuniverseDropdown.isEnabled()) {
				 	   test.log(LogStatus.PASS,"Select Universe DataIngest  DropDown is Enabled");
				 	   captureScreenshot(driver);
				 	    }
				    else
				    {
				 	   test.log(LogStatus.FAIL,"Select Universe DataIngest DropDown is not Enabled");
				 	   captureScreenshot(driver);
				    }
				}
			else {
				 	   test.log(LogStatus.FAIL,"Select Universe DataIngest DropDown is not Displayed");
				 	   captureScreenshot(driver);
				    }
				selectuniverseDropdown.click();

			}
			public void srchBox() throws InterruptedException, Exception {
				test=report.startTest("PI_Select_Universe_DropDown_SearchBox");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				String data=getDataFromExcel("DataIngest", 2, 1);
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
				String universeNameData=getDataFromExcel("DataIngest", 3, 1);
				universeList.stream().filter(s->s.getText().equalsIgnoreCase(universeNameData)).forEach(S->S.click());
			}
			public void IngestionNameTxtBox() throws Exception
			{
				 test=report.startTest("PI_IngestionName");
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				String data= getDataFromExcel("DataIngest", 4, 1);
				WebElement ingestName= driver.findElement(By.xpath("//input[@class='inputfield ng-untouched ng-pristine ng-invalid']"));
				if(ingestName.isDisplayed())
				 {			
					 test.log(LogStatus.PASS, "Ingestion Name is visibled");
				        captureScreenshot(driver);
				        if(ingestName.isEnabled())
						 {
							
							 test.log(LogStatus.PASS, "Ingestion Name is enabled");
						        captureScreenshot(driver);
						        
						        ingestName.clear();
								test.log(LogStatus.PASS, "Ingestion Name cleared successfully");	
								ingestName.sendKeys(data);	
								test.log(LogStatus.PASS, "Entered IngestionName");
							   captureScreenshot(driver);
				}
						 else
						 {
							 test.log(LogStatus.FAIL, "Ingestion Name is not enabled");
						        captureScreenshot(driver);
				}
			}
				 else
				 {
					 test.log(LogStatus.FAIL, "Ingestion Name is not visibled");
				        captureScreenshot(driver);
			}
				
				
			}
			public void IngestionDescriptionTxtBox() throws Exception
			{
				 test=report.startTest("PI_Click On Add Button");
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				WebElement ingestionDescription= driver.findElement(By.xpath("//label[text()='Ingestion Description']/../div/input"));
				if(ingestionDescription.isDisplayed())
				 {
					
					 test.log(LogStatus.PASS, "Ingestion Description is visibled");
				        captureScreenshot(driver);
				        if(ingestionDescription.isEnabled())
						 {
							
							 test.log(LogStatus.PASS, "Ingestion Description is enabled");
						        captureScreenshot(driver);
						        ingestionDescription.clear();
								test.log(LogStatus.PASS, "Ingestion Description cleared successfully");		
									String data=getDataFromExcel("DataIngest", 5, 1);
									ingestionDescription.sendKeys(data);	
									test.log(LogStatus.PASS, "Entered IngestionDescription");
							       captureScreenshot(driver);
						 }
						 else
						 {
							 test.log(LogStatus.FAIL, "Ingestion Description is not enabled");
						        captureScreenshot(driver);
				}
			}
				 else
				 {
					 test.log(LogStatus.FAIL, "Ingestion Description is not visibled");
				        captureScreenshot(driver);
			}
				
				
			}
			public void configurationNameTxtBox() throws Exception
			{
				 test=report.startTest("PI_Configuration Name");
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				 String data=getDataFromExcel("DataIngest",6, 1);
				 WebElement configurationName=driver.findElement(By.xpath("//input[@class='inputfield ng-untouched ng-pristine ng-invalid']"));
				 if(configurationName.isDisplayed())
				 {
					
					 test.log(LogStatus.PASS, "Configuration Name is visibled");
				        captureScreenshot(driver);
				        if(configurationName.isEnabled())
						 {
							
							 test.log(LogStatus.PASS, "Configuration Name is enabled");
						        captureScreenshot(driver);
						        configurationName.clear();
							 	test.log(LogStatus.PASS, "Configuration Description cleared successfully");	
				
							 	configurationName.sendKeys(data);
								 test.log(LogStatus.PASS, "Entered ConfigurationName");
							       captureScreenshot(driver);
						 }
						 else
						 {
							 test.log(LogStatus.FAIL, "Configuration Name is not enabled");
						        captureScreenshot(driver);
				}
			}
				 else
				 {
					 test.log(LogStatus.FAIL, "Configuration Name is not visibled");
				        captureScreenshot(driver);
			}
				 		 
			}
			public void configurationDescriptionTxtBox() throws Exception
			{
				 test=report.startTest("PI_Configuration Description");
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				 String data=getDataFromExcel("DataIngest",7, 1);
				 WebElement configurationDescription= driver.findElement(By.xpath("//input[@class='inputfield ng-untouched ng-pristine ng-invalid']"));
				 if(configurationDescription.isDisplayed())
				 {
					
					 test.log(LogStatus.PASS, "Select Source button is visibled");
				        captureScreenshot(driver);
		
					 	if(configurationDescription.isEnabled())
						 {
							
							 test.log(LogStatus.PASS, "Select Source button is enabled");
						        captureScreenshot(driver);
						        configurationDescription.clear();
								test.log(LogStatus.PASS, "Configuration Description cleared successfully");
								configurationDescription.sendKeys(data);
								 test.log(LogStatus.PASS, "Entered ConfigurationDescription");
							       captureScreenshot(driver);
				 }
						 else
						 {
							 test.log(LogStatus.FAIL, "Select Source button is not enabled");
						        captureScreenshot(driver);
				}
			}
				 else
				 {
					 test.log(LogStatus.FAIL, "Select Source button is not visibled");
				        captureScreenshot(driver);
			}
				 
				 
			}
			public void selectSourceDropdown() throws Throwable
			{
				 test=report.startTest("PI_Select Source");
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				WebElement selectSource= driver.findElement(By.xpath("//label[text()=' API ']/../../../following-sibling::div"));
				 if(selectSource.isDisplayed())
				 {
					
					 test.log(LogStatus.PASS, "Select Source button is visibled");
				        captureScreenshot(driver);
				        if(selectSource.isEnabled())
						 {
							
							 test.log(LogStatus.PASS, "Select Source button is enabled");
						        captureScreenshot(driver);
				 }
						 else
						 {
							 test.log(LogStatus.FAIL, "Select Source button is not enabled");
						        captureScreenshot(driver);
				}
			}
				 else
				 {
					 test.log(LogStatus.FAIL, "Select Source button is not visibled");
				        captureScreenshot(driver);
			}
				
				driver.findElement(By.xpath("//label[text()=' API ']/../../../following-sibling::div")).click();
				 driver.findElement(By.xpath("//label[text()=' JSON ']")).click();
				 test.log(LogStatus.PASS, "Select Source button is clickable");
			       captureScreenshot(driver);
				 
			}
			public void fileUploadIcon() throws AWTException
			{
				 test=report.startTest("PI_Shedule Job Type");
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				 WebElement fileUpload= driver.findElement(By.cssSelector("#upload_file"));
				 
				 
				if(fileUpload.isDisplayed())
				 {
					
					 test.log(LogStatus.PASS, "File uploading  button is visibled");
				        captureScreenshot(driver);
				        if(fileUpload.isEnabled())
						 {
							
							 test.log(LogStatus.PASS, "File uploading is enabled");
						        captureScreenshot(driver);
				 }
						 else
						 {
						 test.log(LogStatus.FAIL, "File uploading is not enabled");
						        captureScreenshot(driver);
				}
			}
				 else
				 {
					 test.log(LogStatus.FAIL, "File uploading is not visibled");
				        captureScreenshot(driver);
			} 		
				Actions a=new Actions(driver);
				 a.doubleClick(fileUpload).perform();
		//		StringSelection s=new StringSelection("/PI_UI/data/DataIngest.json");
		//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		//		Robot r=new Robot();
		//		r.keyPress(KeyEvent.VK_CONTROL);
		//		r.keyPress(KeyEvent.VK_V);
			//	
		//		r.keyRelease(KeyEvent.VK_CONTROL);
		//		r.keyRelease(KeyEvent.VK_V);
			//r.keyPress(KeyEvent.VK_ENTER);
			//r.keyRelease(KeyEvent.VK_ENTER);
				 File file=new File("D:\\GaianPrograms\\PI_FE-qa\\data\\DataIngest.json");
				 System.out.println(file.getAbsolutePath());
				 fileUpload.sendKeys(file.getAbsolutePath());		
			}
			//After uploading the file it is not closing so that configure_Source_Mapping is not selecting
			public void configureSourceMapping() throws Exception
			{
				 test=report.startTest("PI_Shedule Job Type");
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				WebElement csMapping= driver.findElement(By.xpath("//a[text()='Configure Source Mapping ']"));
				 csMapping.click();
				 if(csMapping.isDisplayed())
				 {
					
					 test.log(LogStatus.PASS, "SheduleJobType  button is visibled");
				        captureScreenshot(driver);
				        if(csMapping.isEnabled())
						 {
							
							 test.log(LogStatus.PASS, "Save button is enabled");
						        captureScreenshot(driver);
				 }
						 else
						 {
							 test.log(LogStatus.FAIL, "Save button is not enabled");
						        captureScreenshot(driver);
				}
			}
				 else
				 {
					 test.log(LogStatus.FAIL, "Save button is not visibled");
				        captureScreenshot(driver);
			} 
				 WebElement csShemaDropdown=driver.findElement(By.xpath("//app-search-select[@class='ng-star-i"));
				 csShemaDropdown.click();
				WebElement csSearchBx= driver.findElement(By.xpath("//input[@class='inputfield ng-untouched ng-pristine ng-valid ng-star-inserted']"));
				String  csSearchBxData=getDataFromExcel("DataIngest", 8, 1);
				csSearchBx.sendKeys(csSearchBxData);
				List<WebElement> allSearchData=driver.findElements(By.xpath("//div[@aria-labelledby='myConditionDestinationAttribute']/div"));
				allSearchData.forEach(s->System.out.println(s.getText()));
				String shemaName=getDataFromExcel("DataIngest",9, 1);
				allSearchData.stream().filter(s->s.getText().equalsIgnoreCase(shemaName)).forEach(S->S.click());
				 driver.findElement(By.xpath("//input[@id='i']")).click();
				 driver.findElement(By.xpath("//select[@aria-label='form-select-sm example']")).click();
				 driver.findElement(By.xpath("//select[@aria-label='form-select-sm example']")).click();
				 driver.findElement(By.xpath("//label[text()='Save']/following-sibling::img")).click();
				 
			}
			public void sheduleJobType()
			{
				 test=report.startTest("PI_Shedule Job Type");
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
				 WebElement sheduleJobType= driver.findElement(By.xpath("//label[text()=' One_time ']/../../../following-sibling::div"));
			if(sheduleJobType.isDisplayed())
				 {
					
					 test.log(LogStatus.PASS, "SheduleJobType  button is visibled");
				        captureScreenshot(driver);
				        if(sheduleJobType.isEnabled())
						 {
							
							 test.log(LogStatus.PASS, "Save button is enabled");
						        captureScreenshot(driver);
				 }
						 else
						 {
							 test.log(LogStatus.FAIL, "Save button is not enabled");
						        captureScreenshot(driver);
				}
			}
				 else
				 {
					 test.log(LogStatus.FAIL, "Save button is not visibled");
				        captureScreenshot(driver);
			} 
				 sheduleJobType.click();
				 driver.findElement(By.xpath("//label[text()=' One_time ']/..")).click();
				 captureScreenshot(driver);
			}
			public void save_DataIngest() throws Throwable
			{
				 test=report.startTest("PI_Save");
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				WebElement ele= driver.findElement(By.xpath("//div[@class='save col-6 d-flex justify-content-center align-items-center']"));
				if(ele.isDisplayed())
				 {
					
					 test.log(LogStatus.PASS, "Save button is visibled");
				        captureScreenshot(driver);
				        if(ele.isEnabled())
						 {
							
							 test.log(LogStatus.PASS, "Save button is enabled");
						        captureScreenshot(driver);
						        ele.click();
						       
				 }
						 else
						 {
							 test.log(LogStatus.FAIL, "Save button is not enabled");
						        captureScreenshot(driver);
				}
			}
				 else
				 {
					 test.log(LogStatus.FAIL, "Save button is not visibled");
				        captureScreenshot(driver);
			}
				driver.quit();
		
			}
		}






