package entityModels;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

public class GroupAssertion extends MyRunner{
	public void addBtn() throws Throwable  {
		
		 test=report.startTest("PI_ add button visible");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		boolean blnaddbtn= driver.findElement(By.cssSelector("[src='../../../assets/images/add.png']")).isDisplayed();
		System.out.println("add button  visible");
		if(blnaddbtn) {
			test.log(LogStatus.PASS, "Add button is visible");
			 captureScreenshot(driver); 

		}else {
			test.log(LogStatus.FAIL, "Add button is not visible");
			 captureScreenshot(driver); 

		}
		
		//assertionMethod(addiconvis, true);
		 //assertEquals(addiconvis, true);
		//test.log(LogStatus.PASS, "visible add icon");
		// captureScreenshot(driver); 
}




public void enableaddBtn() throws Throwable {
	
	
	test=report.startTest("PI_ add button enabled");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	 boolean blnenableadd= driver.findElement(By.cssSelector("[src='../../../assets/images/add.png']")).isEnabled();
  System.out.println("addicon is enable");
 
	if(blnenableadd) {
		test.log(LogStatus.PASS, "Add button is enabled");
		captureScreenshot(driver); 
	}else 
	{
  test.log(LogStatus.FAIL, "Add icon is not enabled");
  captureScreenshot(driver);
	}
 // captureScreenshot(driver); 
}
	
public void clickaddBtn() throws Throwable {
	
	
	test=report.startTest("PI_click on add Button");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	driver.findElement(By.cssSelector("[src='../../../assets/images/add.png']")).click();
  System.out.println("clicks add icon");
  //assertionMethod(enableadd, true);
	test.log(LogStatus.PASS, "Add button is clickable");
	 captureScreenshot(driver); 
}


public void contructLst() throws Throwable {
	 test=report.startTest("PI_ construct list visible");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		boolean dropdown=driver.findElement(By.xpath("//div[@class='selectbutton']/img")).isDisplayed();
		System.out.println("construct dropdown is visible");
		if(dropdown) {
			test.log(LogStatus.PASS, "Construct list is visible");
			captureScreenshot(driver);
		}else {
			test.log(LogStatus.FAIL, "Construct list is visible");
			captureScreenshot(driver);
			
		}
				
}

public void enablecontructLst() throws Throwable {
	 test=report.startTest("PI_  construct list enabled");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	 boolean  blnclickdrop=driver.findElement(By.xpath("//div[@class='selectbutton']/img")).isEnabled();
    System.out.println("construct list is enable");
    if(blnclickdrop) 
    {
  	  test.log(LogStatus.PASS, "Construct list is enabled");
  	  captureScreenshot(driver);
    }else {
  	  test.log(LogStatus.FAIL, "Construct list is  not enabled");
  	  captureScreenshot(driver);
    }

  	  
}

public void clickcontructLst() throws Throwable {
	

test=report.startTest("PI_click construct dropdown");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
String data=getDataFromExcel("Group", 1, 0);
WebElement ele=driver.findElement(By.className("selectbutton"));

if(ele.isDisplayed())
{
test.log(LogStatus.PASS, "Construct list is  visible");
captureScreenshot(driver);
}
else {
test.log(LogStatus.FAIL, " Construct list is not visible");
captureScreenshot(driver);       
}
if(ele.isEnabled())
{
	test.log(LogStatus.PASS, " Construct list is enabled");
	captureScreenshot(driver);
}else{

    


test.log(LogStatus.FAIL, "Construct is disabled ");
captureScreenshot(driver);
}

   ele.click();

  

List<WebElement> ele1 =driver.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show']/div"));
ele1.forEach(s->System.out.println(s.getText()));
ele1.stream().filter(s->s.getText().equalsIgnoreCase(data)).forEach(S->S.click());
}

public void groupconstructVisible() throws Throwable {
	test=report.startTest("PI_ group construct visible");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	boolean group=driver.findElement(By.xpath(" //label[text()=' Group ']")).isDisplayed();
	System.out.println(" group construct is visible");
	if(group) {
		test.log(LogStatus.PASS, "Group construct  is visible");
		captureScreenshot(driver);
	}else {
		test.log(LogStatus.FAIL, "Group construct  is  not visible");
		captureScreenshot(driver);
	}
	//assertionMethod(group, true);
	//test.log(LogStatus.PASS, "group construct  is visible");
	captureScreenshot(driver);
}

public void groupconstruct() throws Throwable {
	test=report.startTest("PI_ group construct is clickable");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	driver.findElement(By.xpath(" //label[text()=' Group ']")).click();
	//System.out.println("group construct is clickable");
	//assertionMethod(group, true);
	test.log(LogStatus.PASS, "Group construct  is clickable");
	captureScreenshot(driver);
}

public void infoBtn() throws Throwable {
	test=report.startTest("PI_ info button visible");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	boolean blninfobtn=driver.findElement(By.xpath(" //button[contains(text(),'INFO')]")).isDisplayed();
	System.out.println("Info button is visible");
	//assertionMethod(info, true);
	if(blninfobtn) {
		test.log(LogStatus.PASS, "Info button is visible");
		captureScreenshot(driver);
	}else {
	
	test.log(LogStatus.FAIL, "Info sesssion is  not visible");
	captureScreenshot(driver);
	}
	//captureScreenshot(driver);
}

public void enableinfoBtn() throws Throwable {
	test=report.startTest("PI_ info button enabled");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	boolean bln_info=driver.findElement(By.xpath(" //button[contains(text(),'INFO')]")).isEnabled();
	System.out.println("info session is visible");
	//assertionMethod(info, true);
	if(bln_info) {
		test.log(LogStatus.PASS, "Info button is enabled");
		captureScreenshot(driver);
	}else {
	
	test.log(LogStatus.FAIL, "Info button is  not enbled");
	captureScreenshot(driver);
	}
	//captureScreenshot(driver);
}




public void selectUniverseLst() throws Throwable {
	test=report.startTest("PI_ select universe dropdown visible");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	boolean bln_universelist=driver.findElement(By.xpath("(//div[@ class='selectbutton'])[2]")).isDisplayed();
	System.out.println("universe dropdown is visible");
	//assertionMethod(universe, true);
	if(bln_universelist) {
		test.log(LogStatus.PASS, "Select universe dropdown is visible");
		captureScreenshot(driver);
	}else {
	test.log(LogStatus.FAIL, "Select universe dropdown is not visible");
	captureScreenshot(driver);
	}
}
public void universeLstEnble() throws Throwable {
	test=report.startTest("PI_ select universe dropdown  enable");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	boolean bln_universedropdown=driver.findElement(By.xpath("(//div[@ class='selectbutton'])[2]")).isEnabled();
	System.out.println("universedropdown is enable");
	//assertionMethod(universefield, true);
	if(bln_universedropdown) 
	{
	test.log(LogStatus.PASS, "Select universe dropdown is enabled");
	captureScreenshot(driver);
	}else {
		test.log(LogStatus.FAIL, "Select universe dropdown is not visible");
		captureScreenshot(driver);
	}


}
public void clickUniverseLst() throws Throwable {
	test=report.startTest("PI_ select universe dropdown  clickable");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	driver.findElement(By.xpath("(//div[@ class='selectbutton'])[2]")).click();
	//System.out.println(universefield);
	//assertionMethod(universefield, true);
	
	test.log(LogStatus.PASS, "Select universe dropdown is clickable");
	captureScreenshot(driver);

}

public void selectschemaLst()  {
	test=report.startTest("PI_ select schema dropdown  visible");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	boolean schema=driver.findElement(By.xpath("(//div[@ class='selectbutton'])[3]")).isDisplayed();
	System.out.println("schema dropdown is visible");
	//assertionMethod(schema, true);
	if(schema) {
	test.log(LogStatus.PASS, "select schema dropdown is visible");
	captureScreenshot(driver);
	}else {
		test.log(LogStatus.FAIL, "Select schema dropdown is not visible");
		captureScreenshot(driver);
	}
}
	public void selectSchemaLstEnable() throws Throwable {
		test=report.startTest("PI_ select schema dropdown  enabled");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		boolean schemadropdown=driver.findElement(By.xpath("(//div[@ class='selectbutton'])[3]")).isEnabled();
		System.out.println("schema dropdown is enable");
		//assertionMethod(schema, true);
		if(schemadropdown) {
		test.log(LogStatus.PASS, "select schema dropdown is enabled");
		captureScreenshot(driver);
		}else {
			test.log(LogStatus.FAIL, "Select schema dropdown is not enable");
			captureScreenshot(driver);
		}
	}
		public void groupNameTxt() throws Throwable {
			test=report.startTest("PI_ group name text field  visible");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
			boolean blngroupnameTxt=driver.findElement(By.xpath("//label[contains(text(),'Group Name')]")).isDisplayed();
			System.out.println("Group name text field is visible ");
			//assertionMethod(schema, true);
			if(blngroupnameTxt) {
			test.log(LogStatus.PASS, "Groupname text field is visible");
			captureScreenshot(driver);
			}else {
				test.log(LogStatus.FAIL, "Group name is not visible");
				captureScreenshot(driver);
			}
		}
			
		public void groupdNametxtEnable() throws Throwable {
				test=report.startTest("PI_ group name text field  enabled");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
				boolean blngroupnameTxt=driver.findElement(By.cssSelector("[formcontrolname='name']")).isEnabled();
				System.out.println("group name text field is enabled ");
				//assertionMethod(schema, true);
				if(blngroupnameTxt) {
				test.log(LogStatus.PASS, "Group name text field is enabled");
				captureScreenshot(driver);
				}else {
					test.log(LogStatus.FAIL, "Group name text field is not enabled");
					captureScreenshot(driver);
				}


}
			public void groupdDescriptrionTxt() throws Throwable {
				test=report.startTest("PI_ group description text field  visible");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
				boolean blngroupdesTxt=driver.findElement(By.xpath("//label[contains(text(),'Group Description')]")).isDisplayed();
				System.out.println("group desctiption field is visible ");
				//assertionMethod(schema, true);
				if(blngroupdesTxt) {
				test.log(LogStatus.PASS, "group description text field is visible");
				captureScreenshot(driver);
				}else {
					test.log(LogStatus.FAIL, "group description text field is not visible");
					captureScreenshot(driver);
				}

			}
			public void groupdDescriptrionTxtEnable() throws Throwable {
				test=report.startTest("PI_ group description text field  enabled");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				boolean blngroupdescTxt=driver.findElement(By.cssSelector("[formcontrolname='desc']")).isEnabled();
				System.out.println("Group description field is enable ");
				//assertionMethod(schema, true);
				if(blngroupdescTxt) {
				test.log(LogStatus.PASS, "Group description text field is enabled");
				captureScreenshot(driver);
				}else {
					test.log(LogStatus.FAIL, "Group description text is not enabled");
					captureScreenshot(driver);
				}
	
}
		
			
			
			
			
			
			public void radioBtn() throws Throwable {
				test=report.startTest("PI_ manual condition button is visible");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				boolean blnbtn=driver.findElement(By.xpath("(//input[@type='radio'])[1]")).isDisplayed();
				System.out.println("manual conditions button is visible ");
				//assertionMethod(schema, true);
				if(blnbtn) {
				test.log(LogStatus.PASS, "Manual condition radio button is visible");
				captureScreenshot(driver);
				}else {
					test.log(LogStatus.FAIL, "Manual condition radio button is not visible");
					captureScreenshot(driver);
				}
	
}
				
			
			public void manualconditionsBtn() throws Throwable {
				test=report.startTest("PI_ manual condition button  selected");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
				boolean blnmanualcondition=driver.findElement(By.xpath("(//input[@type='radio'])[1]")).isSelected();
				System.out.println("manual conditions button is selected ");
				//assertionMethod(schema, true);
				if(blnmanualcondition) {
				test.log(LogStatus.PASS, "Manual condition button is selected");
				captureScreenshot(driver);
				}else {
					test.log(LogStatus.FAIL, "Manual condition button is not selected");
					captureScreenshot(driver);
				}
	
			
}
			public void queryBtn() throws Throwable {
				test=report.startTest("PI_query button  visible");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
				boolean blnquerybtn=driver.findElement(By.xpath("//label[text()='Query']")).isDisplayed();
				System.out.println("query button is visible ");
				//assertionMethod(schema, true);
				if(blnquerybtn) {
				test.log(LogStatus.PASS, "query button is visible");
				captureScreenshot(driver);
				}else {
					test.log(LogStatus.FAIL, "query button is not visible");
					captureScreenshot(driver);
				}
			
			
			
			
			
			}
			
			
			
			public void queryBtnSelected() throws Throwable {
				test=report.startTest("PI_query button  selected");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				boolean blnquerybtn=driver.findElement(By.xpath("//label[text()='Query']")).isSelected();
				System.out.println("query button is selected ");
				//assertionMethod(schema, true);
				if(blnquerybtn) {
				test.log(LogStatus.PASS, "Query button  is selected");
				captureScreenshot(driver);
				}else {
					test.log(LogStatus.FAIL, "Query button is not selected");
					captureScreenshot(driver);
				}
				
	
}
			public void sourceattributeTypeLst() throws Throwable {
				test=report.startTest("PI_source attribute dropdown   visible");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				boolean sourceattribute=driver.findElement(By.xpath("(//div[@ class='selectbutton'])[4]")).isDisplayed();
				System.out.println("source attribute is visible ");
				//assertionMethod(schema, true);
				if(sourceattribute) {
				test.log(LogStatus.PASS, "Source attribute dropdown is visible");
				captureScreenshot(driver);
				}else {
					test.log(LogStatus.FAIL, "Source attribute dropdown is not visible");
					captureScreenshot(driver);
				}
					

}
			public void sourceattributeLstEnable() throws Throwable {
				test=report.startTest("PI_source attribute dropdown  enabled");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
				boolean blnsourceattributeEnable=driver.findElement(By.xpath("(//div[@ class='selectbutton'])[4]")).isEnabled();
				System.out.println("source attribute is enabled ");
				//assertionMethod(schema, true);
				if(blnsourceattributeEnable) {
				test.log(LogStatus.PASS, "Source attribute dropdown is enabled");
				captureScreenshot(driver);
				}else {
					test.log(LogStatus.FAIL, "Source attribute dropdown is not enabled");
					captureScreenshot(driver);
				}
			}
				
			public void sourceConditionLst() {
		test=report.startTest("PI_source condition dropdown  visible");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		boolean blnsourcecondition=driver.findElement(By.xpath("(//div[@ class='selectbutton'])[5]")).isDisplayed();
		System.out.println("source attribute is visible ");
		//assertionMethod(schema, true);
		if(blnsourcecondition) {
		test.log(LogStatus.PASS, "Source condition dropdown is visible");
		captureScreenshot(driver);
		}else {
			test.log(LogStatus.FAIL, "Source condition dropdown is not visible");
			captureScreenshot(driver);
		}
	
	}
	public void sourceConditionLstEnable() {
		test=report.startTest("PI_source condition dropdown enabled");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		boolean blnsourceconditionEnable=driver.findElement(By.xpath("(//div[@ class='selectbutton'])[5]")).isEnabled();
		System.out.println("source condition dropdown is enabled ");
		//assertionMethod(schema, true);
		if(blnsourceconditionEnable) {
		test.log(LogStatus.PASS, "Source condition dropdown is enabled");
		captureScreenshot(driver);
		}else {
			test.log(LogStatus.FAIL, "Source condition is not enabled");
			captureScreenshot(driver);
		}
	

}


		public void clickSourceCondition() 
		{
			
			test=report.startTest("PI_ Source condition dropdown  clickable");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
			driver.findElement(By.xpath("(//div[@ class='selectbutton'])[5]")).click();
			
			test.log(LogStatus.PASS, "Source condition dropdown is clickable");
			captureScreenshot(driver);
        }

				
		
		
		
		
		public void destinationAttributeLst() {
			test=report.startTest("PI_destination attribute dropdown  visible");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
			boolean blndestinationattribute=driver.findElement(By.xpath("(//div[@ class='selectbutton'])[6]")).isDisplayed();
			System.out.println("destination attribute is visible ");
			//assertionMethod(schema, true);
			if(blndestinationattribute) {
			test.log(LogStatus.PASS, "Destination attribute dropdown is visible");
			captureScreenshot(driver);
			}else {
				test.log(LogStatus.FAIL, "Destination attribute dropdown is not visible");
				captureScreenshot(driver);
		

			}


		}
     public void destinationAttributeLstEnable(){
     
				test=report.startTest("PI_destination attribute dropdown  enabled");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
				boolean blndestinationattributeEnable=driver.findElement(By.xpath("(//div[@ class='selectbutton'])[6]")).isEnabled();
				System.out.println("destination attribute is enabled ");
				//assertionMethod(schema, true);
				if(blndestinationattributeEnable) {
				test.log(LogStatus.PASS, "Destination attribute dropdown is enabled");
				captureScreenshot(driver);
				}else {
					test.log(LogStatus.FAIL, "Destination attribute is not enabled");
					captureScreenshot(driver);
				}


}

    /* public void clickDestinationattribute() 
		{
			
			test=report.startTest("PI_ destination attribute dropdown is clickable");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
			driver.findElement(By.xpath("(//div[@ class='selectbutton'])[6]")).click();
			//System.out.println(universefield);
			//assertionMethod(universefield, true);
			
			test.log(LogStatus.PASS, "Source condition dropdown is clickable");
			captureScreenshot(driver);
     
		
			
			}*/
		
     public void addRuleBtn(){
         
			test=report.startTest("PI_Add rule button  visible");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
			boolean blnaddrulebtn=driver.findElement(By.xpath("(//button[@class='addRuleButton mb-4 ng-star-inserted'])")).isDisplayed();
			System.out.println("add rule button is visible ");
			//assertionMethod(schema, true);
			if(blnaddrulebtn) {
			test.log(LogStatus.PASS, "Add rule button is visible");
			captureScreenshot(driver);
			}else {
				test.log(LogStatus.FAIL, "Add rule button is not visible");
				captureScreenshot(driver);
			}



     }

     public void addRuleBtnEnable(){
         
			test=report.startTest("PI_add rule button  enabled");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			boolean blnaddruleEnable=driver.findElement(By.xpath("(//button[@class='addRuleButton mb-4 ng-star-inserted'])")).isEnabled();
			System.out.println("add rule button is enable ");
			//assertionMethod(schema, true);
			if(blnaddruleEnable) {
			test.log(LogStatus.PASS, "Add rule button is enabled");
			captureScreenshot(driver);
			}else {
				test.log(LogStatus.FAIL, "Add rule button is not enable");
				captureScreenshot(driver);
			}



    }

     public void clcikaddRuleBtn(){
         
			test=report.startTest("PI_click add rule button");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath("(//button[@class='addRuleButton mb-4 ng-star-inserted'])")).click();
			System.out.println("Add rule button is clickable ");
			//assertionMethod(schema, true);
				test.log(LogStatus.PASS, "Add rule button is clickable");
				captureScreenshot(driver);
  }




 public void aclBtn(){
  
	test=report.startTest("PI_acl button is visible");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	boolean blnaclbtn=driver.findElement(By.xpath("//button[text()='ACL']")).isDisplayed();
	System.out.println("add rule button is visible ");
	//assertionMethod(schema, true);
	if(blnaclbtn) {
	test.log(LogStatus.PASS, "Acl button is visible");
	captureScreenshot(driver);
	}else {
		test.log(LogStatus.FAIL, "Acl  button is not visible");
		captureScreenshot(driver);
	}
}
 public void aclBtnEnable(){
	    
		test=report.startTest("PI_acl button  enabled");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		boolean balaclbtn=driver.findElement(By.xpath("//button[text()='ACL']")).isEnabled();
		System.out.println("acl button is enable ");
		//assertionMethod(schema, true);
		if(balaclbtn) {
		test.log(LogStatus.PASS, "Acl button is enabled");
		captureScreenshot(driver);
		}else {
			test.log(LogStatus.FAIL, "Acl  button is not enabled");
			captureScreenshot(driver);
		}
	}


 public void clickAclBtn(){
     
		test=report.startTest("PI_click acl button");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='ACL']")).click();
		System.out.println("acl button is clickable ");
		
			test.log(LogStatus.PASS, "Acl button is clickable");
			captureScreenshot(driver);
}

 public void readAcessLst(){
     
	   test=report.startTest("PI_read access dropdown  visible");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		boolean balreadaccessdropdown=driver.findElement(By.xpath("//label[contains(text(),'Read Access')]")).isDisplayed();
		System.out.println("read access dropdown is visible");
		//assertionMethod(schema, true);
		if(balreadaccessdropdown) {
		test.log(LogStatus.PASS, "Read access dropdown is visible");
		captureScreenshot(driver);
		}else {
			test.log(LogStatus.FAIL, "Read access  dropdown is not visible");
			captureScreenshot(driver);
		}
	}	
public void readaccessLstEnable() {
	test=report.startTest("PI_read access dropdown enabled");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	boolean blnreadaccessdropdownEnable=driver.findElement(By.xpath("(//div[@ class='selectbutton'])[7]")).isEnabled();
	System.out.println("read access dropdown is enabled");
	//assertionMethod(schema, true);
	if(blnreadaccessdropdownEnable) {
	test.log(LogStatus.PASS, "Read access dropdown is enabled");
	captureScreenshot(driver);
	}else {
		test.log(LogStatus.FAIL, "Read access  dropdown is not enable");
		captureScreenshot(driver);
	}
}	
public void discardBtn() {
	test=report.startTest("PI_discard  button  visible");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	boolean blndiscardbtn=driver.findElement(By.xpath("(//div[@class='discard col-6 d-flex justify-content-center align-items-center'])")).isDisplayed();
	System.out.println("Discard button is visible");
	//assertionMethod(schema, true);
	if(blndiscardbtn) {
	test.log(LogStatus.PASS, "Discard button is visible");
	captureScreenshot(driver);
	}else {
		test.log(LogStatus.FAIL, "Discard button is not visible");
		captureScreenshot(driver);
	}
}	
public void discardBtnEnable() {
	test=report.startTest("PI_discard  button  enabled");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	boolean blndiscardbtn=driver.findElement(By.xpath("(//div[@class='discard col-6 d-flex justify-content-center align-items-center'])")).isEnabled();
	System.out.println("discard button is enable");
	//assertionMethod(schema, true);
	if(blndiscardbtn) {
	test.log(LogStatus.PASS, "Discard button is enabled");
	captureScreenshot(driver);
	}else {
		test.log(LogStatus.FAIL, "Discard button is not enable");
		captureScreenshot(driver);

}
}
public void saveBtn() {
	test=report.startTest("PI_save  button is visible");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	boolean blnsavebutton=driver.findElement(By.xpath("(//div[@class='save col-6 d-flex justify-content-center align-items-center'])")).isDisplayed();
	System.out.println("save button is visible");
	//assertionMethod(schema, true);
	if(blnsavebutton) {
	test.log(LogStatus.PASS, "Save button is visible");
	captureScreenshot(driver);
	}else {
		test.log(LogStatus.FAIL, "Save button is not visible");
		captureScreenshot(driver);
	}
}

	public void saveBtnEnable() {
		test=report.startTest("PI_save  button  enabled");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		boolean savebuttonEnable=driver.findElement(By.xpath("(//div[@class='save col-6 d-flex justify-content-center align-items-center'])")).isEnabled();
		System.out.println("save button is enabled");
		//assertionMethod(schema, true);
		if(savebuttonEnable) {
		test.log(LogStatus.PASS, "Save button is enabled");
		captureScreenshot(driver);
		}else {
			test.log(LogStatus.FAIL, "Save button is not enabled");
			captureScreenshot(driver);


		}
		driver.quit();

}
}




