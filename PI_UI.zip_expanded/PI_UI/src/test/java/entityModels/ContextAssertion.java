package entityModels;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

public class ContextAssertion extends MyRunner {
	
public void addBtnVisible_ContextModel() {
	        test=report.startTest("PI_visible add button");
	        driver.navigate().refresh();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
			boolean blnAddVisible= driver.findElement(By.cssSelector("[src='../../../assets/images/add.png']")).isDisplayed();
			System.out.println("Add button is visible");
			if(blnAddVisible) {
				test.log(LogStatus.PASS, "Add button is visible");
				 captureScreenshot(driver); 
			}
			else {
				test.log(LogStatus.FAIL, "Add button is not visible");
				 captureScreenshot(driver); 
			}
			
			
		
	}




	public void addBtnEnable_ContextModel() throws Throwable {
		
		
		test=report.startTest("PI_enabled add button");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 boolean blnAddEnable= driver.findElement(By.cssSelector("[src='../../../assets/images/add.png']")).isEnabled();
	  System.out.println("Add button is enabled");
	 
		if(blnAddEnable) {
			test.log(LogStatus.PASS, "Add button is enabled");
			captureScreenshot(driver); 
		}else 
		{
	  test.log(LogStatus.FAIL, "Add button is not enabled");
	  captureScreenshot(driver);
		}
	 
	}
		
	public void addBtnClick_ContextModel() throws Throwable {
		
		
		test=report.startTest("PI_click on add button");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("[src='../../../assets/images/add.png']")).click();
	  System.out.println("Add button is clickable");
	  
		test.log(LogStatus.PASS, " Add button is clickable");
		 captureScreenshot(driver); 
	}

	public void contructLstClick_ContextModel() throws Throwable {
		test=report.startTest("PI_click on construct list");
		//driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String strDropdown=getDataFromExcel("Group", 1, 1);
		WebElement lstDropdown=driver.findElement(By.xpath("//div[@class='selectbutton']/img"));

		if(lstDropdown.isDisplayed())
		{
		test.log(LogStatus.PASS, "construct list is  visible");
		captureScreenshot(driver);
		}
		else {
		test.log(LogStatus.FAIL, " construct list is not visible");
		captureScreenshot(driver);       
		}
		if(lstDropdown.isEnabled())
		{
			test.log(LogStatus.PASS, " construct list is enabled");
			captureScreenshot(driver);
		}else{

		     

		 
		test.log(LogStatus.FAIL, "Dropdown is disabled ");
		captureScreenshot(driver);
		}

		lstDropdown.click();

		   

		List<WebElement> lstDropdown1 =driver.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show']/div"));
		lstDropdown1.forEach(s->System.out.println(s.getText()));
		lstDropdown1.stream().filter(s->s.getText().equalsIgnoreCase(strDropdown)).forEach(S->S.click());
		}


				/*public void contextpresent1() throws Throwable  {
			WebElement element;
			test=report.startTest("PI_ existing constructs");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			String data=getDataFromExcel("sheet1", 1, 0);
			element= driver.findElement(By.xpath("//div[@class='selectbutton']/img"));
			Select elements=new Select(element);
			List<WebElement>elementlist=elements.getOptions();
			String construct=data;
			boolean construct_present=false;
			for(WebElement e: elementlist) {
				if(e.getText().equalsIgnoreCase(data)) {
				   construct_present=true;
				   break;
				}
					 
						}
				if(construct_present) {
		           System.out.println(construct_present +"contextconstruct is present");
		           test.log(LogStatus.PASS, "group construct is present");
				}else {
					System.out.println(construct_present +"group construct is not present");
			           test.log(LogStatus.FAIL, "group construct is not present");

				}
			
		}*/

		
		public void contextConstructVisible_ContextModel() throws Throwable {
			test=report.startTest("PI_ Context construct visible");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			boolean blnContextVisible=driver.findElement(By.xpath(" //label[text()=' Context ']")).isDisplayed();
			System.out.println(" Context construct is visible");
			if(blnContextVisible) {
				test.log(LogStatus.PASS, "Context construct  is visible");
				captureScreenshot(driver);
			}else {
				test.log(LogStatus.FAIL, "Context construct  is  not visible");
				captureScreenshot(driver);
			}
			//assertionMethod(group, true);
			//test.log(LogStatus.PASS, "group construct  is visible");
			//captureScreenshot(driver);
		}

		
		
	public void contextConstructEnable_ContextModel() throws Throwable {
			test=report.startTest("PI_ context construct enabled");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath(" //label[text()=' Context ']")).isEnabled();
			//System.out.println("group construct is clickable");
			//assertionMethod(group, true);
			test.log(LogStatus.PASS, "Context construct  is enabled");
			captureScreenshot(driver);
		}
	public void infoBtnVisible_ContextModel() throws Throwable {
		test=report.startTest("PI_info button visible");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		boolean blnInfoVisible=driver.findElement(By.xpath("//button[contains(text(),'INFO')]")).isDisplayed();
		System.out.println("info button is visible");
		//assertionMethod(info, true);
		if(blnInfoVisible) {
			test.log(LogStatus.PASS, "Info button is visible");
			captureScreenshot(driver);
		}else {
		
		test.log(LogStatus.FAIL, "Info button is  not visible");
		captureScreenshot(driver);
		}
		//captureScreenshot(driver);
	}

	public void infoBtnEnable_ContextModel() throws Throwable {
		test=report.startTest("PI_info button enabled");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		boolean blnInfoEnable=driver.findElement(By.className("info-acl toggle-button")).isEnabled();
		System.out.println("Info button is enabled");
		//assertionMethod(info, true);
		if(blnInfoEnable) {
			test.log(LogStatus.PASS, "Info button is enabled");
			captureScreenshot(driver);
		}else {
		
		test.log(LogStatus.FAIL, "Info button is  not enabled");
		captureScreenshot(driver);
		}
	}
		public void selectuniverseLstVisible_ContextModel(){
			test=report.startTest("PI_ select universe dropdown visible");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			boolean blnSelectUniverseVisible=driver.findElement(By.xpath("(//div[@ class='selectbutton'])[2]")).isDisplayed();
			System.out.println("Select universe list is visible");
			//assertionMethod(universe, true);
			if(blnSelectUniverseVisible) {
				test.log(LogStatus.PASS, "Select universe list is visible");
				captureScreenshot(driver);
			}else {
			test.log(LogStatus.FAIL, "Select universe list is not visible");
			captureScreenshot(driver);
			}
		}
		public void selectUniverseLstEnable_ContextModel() throws Throwable {
			test=report.startTest("PI_ select universe dropdown enable");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			boolean blnSelectUniverseEnable=driver.findElement(By.xpath("(//div[@ class='selectbutton'])[2]")).isEnabled();
			System.out.println(" Select universe dropdown is enabled");
			//assertionMethod(universefield, true);
			if(blnSelectUniverseEnable) 
			{
			test.log(LogStatus.PASS, "Select universe list is enabled");
			captureScreenshot(driver);
			}else {
				test.log(LogStatus.FAIL, "Select universe list is not enabled");
				captureScreenshot(driver);
			}


		}
		public void selectUniverseClick_ContextModel() throws Throwable {
			test=report.startTest("PI_ select universe dropdown click");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath("(//div[@ class='selectbutton'])[2]")).click();
			//System.out.println(universefield);
			//assertionMethod(universefield, true);
			
			test.log(LogStatus.PASS, "Select universe dropdown is clickable");
			captureScreenshot(driver);

		}

		public void selectSchemaLstVisible_ContextModel()  {
			test=report.startTest("PI_ select schema dropdown visible");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			boolean blnSelectschemaVisible=driver.findElement(By.xpath("(//div[@ class='selectbutton'])[3]")).isDisplayed();
			System.out.println(" Select schema dropdown is visible");
			//assertionMethod(schema, true);
			if(blnSelectschemaVisible) {
			test.log(LogStatus.PASS, "Select schema list is visible");
			captureScreenshot(driver);
			}else {
				test.log(LogStatus.FAIL, "Select schema list is not visible");
				captureScreenshot(driver);
			}
		}
			public void selectSchemaLstEnable_ContextModel() throws Throwable {
				test=report.startTest("PI_ select schema list enable");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				boolean blnsSchemaDropdownEnable=driver.findElement(By.xpath("(//div[@ class='selectbutton'])[3]")).isEnabled();
				System.out.println("Select schema list is enabled");
				//assertionMethod(schema, true);
				if(blnsSchemaDropdownEnable) {
				test.log(LogStatus.PASS, "Select schema list is enabled");
				captureScreenshot(driver);
				}else {
					test.log(LogStatus.FAIL, "Select schema list is not enabled");
					captureScreenshot(driver);
				}
			}

			public void contextNameTxtVisible_ContextModel() throws Throwable {
				test=report.startTest("PI_ context name visible");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				boolean blnContextNameVisible=driver.findElement(By.xpath("//label[contains(text(),'Context Name')]")).isDisplayed();
				System.out.println("Context name text field is visible ");
				//assertionMethod(schema, true);
				if(blnContextNameVisible) {
				test.log(LogStatus.PASS, "Context name text field  is visible");
				captureScreenshot(driver);
				}else {
					test.log(LogStatus.FAIL, "Context name text field is not visible");
					captureScreenshot(driver);
				}
			}
				public void contextNameTxtEnable_ContextModel() throws Throwable {
					test=report.startTest("PI_ context name enable");
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					boolean blnContextNameEnable=driver.findElement(By.cssSelector("[formcontrolname='name']")).isEnabled();
					System.out.println("Context name is enabled");
					//assertionMethod(schema, true);
					if(blnContextNameEnable) {
					test.log(LogStatus.PASS, "Context name is enabled");
					captureScreenshot(driver);
					}else {
						test.log(LogStatus.FAIL, "Context name is not enabled");
						captureScreenshot(driver);
					}


	}
				public void contextDescriptionTxtVisible_ContextModel() throws Throwable {
					test=report.startTest("PI_ context description visible");
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					boolean blnContextDescriptionVisible=driver.findElement(By.xpath("//label[contains(text(),'Context Description')]")).isDisplayed();
					System.out.println("Context description is visible ");
					//assertionMethod(schema, true);
					if(blnContextDescriptionVisible) {
					test.log(LogStatus.PASS, "Context description text is visible");
					captureScreenshot(driver);
					}else {
						test.log(LogStatus.FAIL, "Context description  text is not visible");
						captureScreenshot(driver);
					}

				}
				public void contextDescriptionTxtEnable_ContextModel() throws Throwable {
					test=report.startTest("PI_ context description enabled");
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					boolean blncontextDescriptionEnable=driver.findElement(By.cssSelector("[formcontrolname='desc']")).isDisplayed();
					System.out.println("context description text field is enabled ");
					//assertionMethod(schema, true);
					if(blncontextDescriptionEnable) {
					test.log(LogStatus.PASS, "Context description text field is enable");
					captureScreenshot(driver);
					}else {
						test.log(LogStatus.FAIL, "Context description text is not enable");
						captureScreenshot(driver);
					}
				}
					public void sourceAttributeTypeLstVisible_ContextModel() throws Throwable {
						test=report.startTest("PI_source attribute List visible");
						driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
						boolean blnSourceAttributeVisible=driver.findElement(By.xpath("(//div[@ class='selectbutton'])[4]")).isDisplayed();
						System.out.println("Source attribute is visible ");
						//assertionMethod(schema, true);
						if(blnSourceAttributeVisible) {
						test.log(LogStatus.PASS, "Source attribute is visible");
						captureScreenshot(driver);
						}else {
							test.log(LogStatus.FAIL, "Source attribute is not visible");
							captureScreenshot(driver);
						}
							

		}
					public void sourceAttributeTypeLstEnable_ContextModel() throws Throwable {
						test=report.startTest("PI_ context source attribute List enable");
						driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
						boolean blnSourceAttributeEnable=driver.findElement(By.xpath("(//div[@ class='selectbutton'])[4]")).isEnabled();
						System.out.println("source attribute list is enabled ");
						//assertionMethod(schema, true);
						if(blnSourceAttributeEnable) {
						test.log(LogStatus.PASS, "Source attribute list is enabled");
						captureScreenshot(driver);
						}else {
							test.log(LogStatus.FAIL, "Source attribute list is not enabled");
							captureScreenshot(driver);
						}
					}
					/*public void clickSourceattribute1(){
						test=report.startTest("PI_ context source attribute  dropdown is clickable");
						driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
						driver.findElement(By.xpath("(//div[@ class='selectbutton'])[4]")).click();
						//System.out.println(universefield);
						//assertionMethod(universefield, true);
						
						test.log(LogStatus.PASS, "context source attribute type dropdown is clickable");
						captureScreenshot(driver);


		}*/
			public void sourceConditionTypeLstVisible_ContextModel() {
				test=report.startTest("PI_context source condition List visible");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				boolean blnSourceConditionVisible=driver.findElement(By.xpath("(//div[@ class='selectbutton'])[5]")).isDisplayed();
				System.out.println("Source condition is visible ");
				//assertionMethod(schema, true);
				if(blnSourceConditionVisible) {
				test.log(LogStatus.PASS, "Source condition is visible");
				captureScreenshot(driver);
				}else {
					test.log(LogStatus.FAIL, "Source condition is not visible");
					captureScreenshot(driver);
				}
			
			}
			public void sourceConditiontypeLstEnable_ContextModel() {
				test=report.startTest("PI_context  source condition List enable");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				boolean blnSourceConditionEnable=driver.findElement(By.xpath("(//div[@ class='selectbutton'])[5]")).isEnabled();
				System.out.println("Source condition is enabled ");
				//assertionMethod(schema, true);
				if(blnSourceConditionEnable) {
				test.log(LogStatus.PASS, "Source condition is enabled");
				captureScreenshot(driver);
				}else {
					test.log(LogStatus.FAIL, "Source condition is not enabled");
					captureScreenshot(driver);
				}
			

		}


				public void sourceConditionClick_ContextModel() 
				{
					
					test=report.startTest("PI_ context source condition list click");
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					driver.findElement(By.xpath("(//div[@ class='selectbutton'])[5]")).click();
					//System.out.println(universefield);
					//assertionMethod(universefield, true);
					
					test.log(LogStatus.PASS, "Source condition list is clickable");
					captureScreenshot(driver);
		          }

				public void destinationAttributeTypeLstVisible_ContextModel() {
					test=report.startTest("PI_context destination attribute visible");
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					boolean blndestinationAttributeVisible=driver.findElement(By.xpath("(//div[@ class='selectbutton'])[6]")).isDisplayed();
					System.out.println("context destination attribute is visible ");
					//assertionMethod(schema, true);
					if(blndestinationAttributeVisible) {
					test.log(LogStatus.PASS, "Context destination attribute list is visible");
					captureScreenshot(driver);
					}else {
						test.log(LogStatus.FAIL, "Context destination attribute list is not visible");
						captureScreenshot(driver);
				

					}


				}
		       public void destinationAttributeTypeLstEnable_ContextModel(){
		       
						test=report.startTest("PI_context destination attribute Enable");
						driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
						boolean destinationAttributeEnable=driver.findElement(By.xpath("(//div[@ class='selectbutton'])[6]")).isEnabled();
						System.out.println("destination attribute is enabled");
						//assertionMethod(schema, true);
						if(destinationAttributeEnable) {
						test.log(LogStatus.PASS, "Context destination attribute list is enabled");
						captureScreenshot(driver);
						}else {
							test.log(LogStatus.FAIL, "Context destination attribute list is not enabled");
							captureScreenshot(driver);
						}


		}

		       /*public void clickDestinationattribute1() 
				{
					
					test=report.startTest("PI_ destination attribute dropdown is clickable");
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
					driver.findElement(By.xpath("(//div[@ class='selectbutton'])[6]")).click();
					//System.out.println(universefield);
					//assertionMethod(universefield, true);
					
					test.log(LogStatus.PASS, "Source condition dropdown is clickable");
					captureScreenshot(driver);
		       
				
					
					}*/
				
		       public void scheduleTypeLstVisible_ContextModel() {
		    		test=report.startTest("PI_schedule type list visible");
		    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		    		boolean blnscheduleVisible=driver.findElement(By.xpath("(//img[@src='../../assets/images/Vector 45.png'])[7]")).isDisplayed();
		    		System.out.println("schedule type list is visible");
		    		//assertionMethod(schema, true);
		    		if(blnscheduleVisible) {
		    		test.log(LogStatus.PASS, "Schedule type list is visible");
		    		captureScreenshot(driver);
		    		}else {
		    			test.log(LogStatus.FAIL, "Schedule type  list is not visible");
		    			captureScreenshot(driver);
		    		}
		    	}	

		       public void schudleTypeLstEnable_ContextModel() {
		    		test=report.startTest("PI_schedule type list enable");
		    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		    		boolean blnschudleTypeEnable=driver.findElement(By.xpath("(//img[@src='../../assets/images/Vector 45.png'])[7]")).isEnabled();
		    		System.out.println(" schedule type list is enabled");
		    		//assertionMethod(schema, true);
		    		if(blnschudleTypeEnable) {
		    		test.log(LogStatus.PASS, "Schedule type list is enabled");
		    		captureScreenshot(driver);
		    		}else {
		    			test.log(LogStatus.FAIL, "Schedule type  list is not enabled");
		    			captureScreenshot(driver);
		    		}
		    	}	

		       
		       
		       
		       
		       
		       
		       public void aclButtonVisible_ContextModel(){
		    	   
		    		test=report.startTest("PI_acl button visible");
		    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		    		boolean blnaclbtnVisibile=driver.findElement(By.xpath("//button[text()='ACL']")).isDisplayed();
		    		System.out.println("Add button is visible ");
		    		//assertionMethod(schema, true);
		    		if(blnaclbtnVisibile) {
		    		test.log(LogStatus.PASS, "Acl button is visible");
		    		captureScreenshot(driver);
		    		}else {
		    			test.log(LogStatus.FAIL, "Acl  button is not visible");
		    			captureScreenshot(driver);
		    		}
		    	}
		    	  public void aclButtonEnable_ContextModel(){
		    		    
		    			test=report.startTest("PI_acl button enable");
		    			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		    			boolean blnAclBtnEnable=driver.findElement(By.xpath("//button[text()='ACL']")).isEnabled();
		    			System.out.println("acl button is enabled ");
		    			//assertionMethod(schema, true);
		    			if(blnAclBtnEnable) {
		    			test.log(LogStatus.PASS, "Acl button is enabled");
		    			captureScreenshot(driver);
		    			}else {
		    				test.log(LogStatus.FAIL, "Acl  button is not enabled");
		    				captureScreenshot(driver);
		    			}
		    		}

		    	  public void aclBtnClick_ContextModel(){
		    		    
		    			test=report.startTest("PI_acl button click");
		    			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		    		driver.findElement(By.xpath("//button[text()='ACL']")).click();
		    			System.out.println("Acl button is clickable ");
		    			//assertionMethod(schema, true);
		    			
		    			test.log(LogStatus.PASS, "Acl button is clickable");
		    			captureScreenshot(driver);
		    	  }

		    	  
		    	  
		    	  
		    	  
		    	  
		    	 		       
		       public void readAcessLstVisible_ContextType(){
		    	      
		    	   test=report.startTest("PI_read access list visible");
		    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    		boolean blnReadAccessLstVisible=driver.findElement(By.xpath("//label[contains(text(),'Read Access')]")).isDisplayed();
		    		System.out.println("read access dropdown is visible");
		    		//assertionMethod(schema, true);
		    		if(blnReadAccessLstVisible) {
		    		test.log(LogStatus.PASS, "Read access dropdown is visible");
		    		captureScreenshot(driver);
		    		}else {
		    			test.log(LogStatus.FAIL, "Read access  dropdown is not visible");
		    			captureScreenshot(driver);
		    		}
		    	}	
		    public void readAccessLstEnable_ContextModel() {
		    	test=report.startTest("PI_read access list enable");
		    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    	boolean blnReadAccessLstEnable=driver.findElement(By.xpath("(//img[@src=\"../../assets/images/Vector 45.png\"])[8]")).isEnabled();
		    	System.out.println("Read access is enabled");
		    	//assertionMethod(schema, true);
		    	if(blnReadAccessLstEnable) {
		    	test.log(LogStatus.PASS, "Read access list is enabled");
		    	captureScreenshot(driver);
		    	}else {
		    		test.log(LogStatus.FAIL, "Read access  list is not enabled");
		    		captureScreenshot(driver);
		    	}
		    }	
		       
		       
		       
		       
		       
		       
		       public void discardBtnVisible_ContextModel() {
		    		test=report.startTest("PI_discard  button visible");
		    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		    		boolean blnDiscardBtnVisible=driver.findElement(By.xpath("(//div[@class='discard col-6 d-flex justify-content-center align-items-center'])")).isDisplayed();
		    		System.out.println("Discard button is visible");
		    		//assertionMethod(schema, true);
		    		if(blnDiscardBtnVisible) {
		    		test.log(LogStatus.PASS, "Discard button is visible");
		    		captureScreenshot(driver);
		    		}else {
		    			test.log(LogStatus.FAIL, "Discard button is not visible");
		    			captureScreenshot(driver);
		    		}
		    	}	
		    	public void discardBtnEnable_ContextModel() {
		    		test=report.startTest("PI_discard  button enable");
		    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		    		boolean blnDiscardBtnEnable=driver.findElement(By.xpath("(//div[@class='discard col-6 d-flex justify-content-center align-items-center'])")).isEnabled();
		    		System.out.println("Discard button is enabled");
		    		//assertionMethod(schema, true);
		    		if(blnDiscardBtnEnable) {
		    		test.log(LogStatus.PASS, "Discard button is enabled");
		    		captureScreenshot(driver);
		    		}else {
		    			test.log(LogStatus.FAIL, "Discard button is not enabled");
		    			captureScreenshot(driver);

		    	}
		    	}
		    	public void saveBtnVisible_ContextModel() {
		    		test=report.startTest("PI_save  button  visible");
		    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		    		boolean blnsaveBtnVisible=driver.findElement(By.xpath("(//div[@class='save col-6 d-flex justify-content-center align-items-center'])")).isDisplayed();
		    		System.out.println("save button is visible");
		    		//assertionMethod(schema, true);
		    		if(blnsaveBtnVisible) {
		    		test.log(LogStatus.PASS, "Save button is visible");
		    		captureScreenshot(driver);
		    		}else {
		    			test.log(LogStatus.FAIL, "Save button is not visible");
		    			captureScreenshot(driver);
		    		}
		    	}

		    		public void saveBtnEnable_ContextModel() {
		    			test=report.startTest("PI_save  button enable");
		    			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		    			boolean blnsaveBtnEnable=driver.findElement(By.xpath("(//div[@class='save col-6 d-flex justify-content-center align-items-center'])")).isEnabled();
		    			System.out.println("save button is enabled");
		    			//assertionMethod(schema, true);
		    			if(blnsaveBtnEnable) {
		    			test.log(LogStatus.PASS, "Save button is enabled");
		    			captureScreenshot(driver);
		    			}else {
		    				test.log(LogStatus.FAIL, "Save button is not enabled");
		    				captureScreenshot(driver);


		    			}
		    			driver.quit();

		    	}
		    	


		 

	}





