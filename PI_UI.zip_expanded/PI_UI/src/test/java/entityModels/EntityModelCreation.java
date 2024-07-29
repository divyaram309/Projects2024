package entityModels;



	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.sql.Driver;
	import java.time.Duration;
	import java.util.LinkedList;
	import java.util.List;

	import javax.swing.text.TabableView;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.DataFormatter;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.WebDriver.Navigation;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	import com.relevantcodes.extentreports.LogStatus;

	import groovyjarjarantlr4.v4.codegen.model.Action;

	public class EntityModelCreation extends MyRunner {
		
		//info
		 Navigation nav;
		public void addBtn_EntityModel() throws InterruptedException {
			//Add Button
			
			  test=report.startTest("Click on add button");
			
			
			
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
	    //driver.navigate().refresh();
	    nav=driver.navigate();
	 	nav.refresh();
	    WebElement btnAdd =driver.findElement(By.cssSelector("[src='../../../assets/images/add.png']"));
		  
			  if(btnAdd.isDisplayed()) {
			
				  test.log(LogStatus.PASS, "Add button is visible");
				  captureScreenshot(driver);	
				
				  if(btnAdd.isEnabled()) {
					  
					  test.log(LogStatus.PASS, "Add button  is enabled"); 
					  captureScreenshot(driver);
					  test.log(LogStatus.PASS, "Click on Add Button");
					  btnAdd.click();		
					  captureScreenshot(driver);
			  }
				  else {
					
					  test.log(LogStatus.FAIL, "Add button is not enabled");
					  captureScreenshot(driver);
				  }
		     }
			  else {
				  test.log(LogStatus.FAIL,"Add button is not visible");
				  captureScreenshot(driver);
			  }
			  
		}
		public void selectConstruct_EntityModel() throws Exception {

	// construct dropDown validation and selection
			
			test=report.startTest("Select construct as a entity model");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			
		WebElement btnConstructDropdown=driver.findElement(By.xpath("//div[@class='selectbutton']/."));
			 
			  if(btnConstructDropdown.isDisplayed()) {
				  test.log(LogStatus.PASS,"Construct dropDown  is visible");  
				  captureScreenshot(driver);
				  
				  if(btnConstructDropdown.isEnabled()) {
				
					  test.log(LogStatus.PASS, "Construct dropDown is enable");  
					  captureScreenshot(driver);
					  btnConstructDropdown.click();
					  
					  test.log(LogStatus.PASS,"Click on arrow button");
					  captureScreenshot(driver);
					  
					  driver.findElement(By.xpath("//div[@class='selectbutton']/.")).click();
					
						test.log(LogStatus.PASS, "Select construct as a entity model");
						 captureScreenshot(driver);
						 
			
			//	List<WebElement> elementsList= driver.findElements(By.xpath("//div[@class='dropdown-item ng-star-inserted']"));

						 List<WebElement> ListofconstructDropdown = driver.findElements(By.xpath("//div[@class='dropdown-item ng-star-inserted']"));
						 ListofconstructDropdown.forEach(s->System.out.println(s.getText()));
						 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
						 String data=getDataFromExcel("Sheet1",1,0);
						 ListofconstructDropdown.stream().filter(s->s.getText().equalsIgnoreCase(data)).forEach(S->S.click());
						 
						 System.out.println(data);
						 test.log(LogStatus.PASS, "Select construct as a entity model is matched"+"-"+data);
						 captureScreenshot(driver);
						 
						 
						 
//				 identify dropdown
						 
						 
//						  WebElement d = driver.findElement(By.xpath("//div[@class='dropdown-item ng-star-inserted']"));
//		     Select class to get options in dropdown
//	                                 Select l = new Select(d);
//						  List<WebElement> m = l.getOptions();
//						  System.out.println("Drodown list items are: ");
						 
//			 iterate through options till list size
						 
//	                            for (int j = 0; j < m.size(); j++) {
//						 String s = m.get(j).getText();
//	                              System.out.println(s);
//	                              
//	                              }
				  }
								 
				  else {
				  test.log(LogStatus.FAIL, "constructs dropDown  is not enable");
				  captureScreenshot(driver);
			  }
		            }
		          else {
			  
				  test.log(LogStatus.FAIL, "constructs dropDown  is not visible");
				  captureScreenshot(driver);
			  }
			  
	}
	  public void selectUniverse_EntityModel() throws Exception {
		  
		  //select universe
		  
		  test=report.startTest("Select Universe");
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		  
		   WebElement lstSelectUniverse= driver.findElement(By.xpath("//app-search-select[@name='universeName']//div[@class='selectbutton']"));
		  if(lstSelectUniverse.isDisplayed())
		       {
		  
		 test.log(LogStatus.PASS, "Select universe arrow button is visible");
		   captureScreenshot(driver);
		   if(lstSelectUniverse.isEnabled())
		   {
		    test.log(LogStatus.PASS, "Select universe arrow button is enabled");
		   captureScreenshot(driver);
		   
		   
		   lstSelectUniverse.click();
		   WebElement search=driver.findElement(By.xpath("//input[@placeholder='Search']"));
		  	          String data1=getDataFromExcel("Sheet1", 14, 0);
		  	  search.sendKeys(data1);
		  	  List<WebElement> multipleElement=driver.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show']/div"));
		  	  multipleElement.forEach(s->System.out.println(s.getText()));
		  	   String data2=getDataFromExcel("Sheet1",15, 0);
		  	  multipleElement.stream().filter(s->s.getText().equalsIgnoreCase(data2)).forEach(S->S.click());
		  //	driver.findElement(By.xpath("//div[normalize-space()='Gaian-freshers']"));
		  	          test.log(LogStatus.PASS, "Universe Selected");
		  	           captureScreenshot(driver);
		       }
		 else {
			 test.log(LogStatus.FAIL, "Select universe arrow button is not enabled");
		   captureScreenshot(driver);
		  }
	  }
	            else
	           {
	                test.log(LogStatus.FAIL, "Select universe arrow button is not visible");
	                    captureScreenshot(driver);
		  }
	               
	}

		public void txtboxEnterEntityModelName() throws InterruptedException, EncryptedDocumentException, IOException {
			
			// Write Entity Module Name 
			
			test=report.startTest("Enter a name of an entity model");
			
			
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
			
			 
			 WebElement textboxEntityModelName =driver.findElement(By.cssSelector("input[placeholder='Enter here']"));
			  if(textboxEntityModelName .isDisplayed()) {
			
				  test.log(LogStatus.PASS, "Enter entity model name textbox is visible");
				  captureScreenshot(driver);	
				 
				  if(textboxEntityModelName .isEnabled()) {
					  
					  test.log(LogStatus.PASS, "Enter entity model name textbox  is enabled"); 
					  captureScreenshot(driver);
					  
					  
					//  driver.findElement(By.cssSelector("input[placeholder='Enter here']")).clear();
					  
					  
					  driver.findElement(By.cssSelector("input[placeholder='Enter here']")).click();
					  test.log(LogStatus.PASS, "Click on enter entity model name textbox");
					  captureScreenshot(driver);
					  
				
					  FileInputStream fsi = new FileInputStream("data\\testData.xlsx");
					  
						Workbook book = WorkbookFactory.create(fsi);
						
						Sheet sh = book.getSheet("Sheet2");
						
						DataFormatter df = new DataFormatter();
						
						String entityname = df.formatCellValue((sh.getRow(0).getCell(1)));
						
						driver.findElement(By.cssSelector("input[placeholder='Enter here']")).sendKeys(entityname);
						
						
						test.log(LogStatus.PASS, "Enter a name of an entity model");
						 captureScreenshot(driver);
					 
			  }
				  else {
					  
					  test.log(LogStatus.FAIL, "Enter entity model name textbox is not enabled");
					  captureScreenshot(driver);
				  }
		     }
			  else {
				
				  test.log(LogStatus.FAIL, "Enter entity model name textbox not enabled");
				  captureScreenshot(driver);
			  }
			 
			}
			
			public void txtboxEnterEntityModelDescription_EntityModel() throws InterruptedException, EncryptedDocumentException, IOException {
				
				// Enter entity model name Description
				
				test=report.startTest(" Enter entity model name Description ");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
			
			 
			 WebElement txtboxEntityModuleNameDescription =driver.findElement(By.xpath("//textarea[@placeholder='Enter here']"));
			 
			  if(txtboxEntityModuleNameDescription.isDisplayed()) {
			
				  test.log(LogStatus.PASS, "Enter entity model name description textbox  is visible");
				  captureScreenshot(driver);	
				  
				  if(txtboxEntityModuleNameDescription.isEnabled()) {
					  
					  
					  test.log(LogStatus.PASS, "Enter entity model name description textbox  enabled"); 
					  captureScreenshot(driver);
					  
					  
					  
					  driver.findElement(By.cssSelector("input[placeholder='Enter here']")).click();	
					  
					  test.log(LogStatus.PASS, "Click on enter entity model name description textbox ");
					  captureScreenshot(driver);
					  
					  
					  driver.findElement(By.cssSelector("input[placeholder='Enter here']")).clear();
					  
					  FileInputStream fsi = new FileInputStream("data\\testData.xlsx");
					  
						Workbook book = WorkbookFactory.create(fsi);
						
						Sheet sh = book.getSheet("Sheet2");
						
						DataFormatter df = new DataFormatter();
						
						String entityDescription = df.formatCellValue((sh.getRow(1).getCell(1)));
						
						driver.findElement(By.xpath("//textarea[@placeholder='Enter here']")).sendKeys(entityDescription);
						
						test.log(LogStatus.PASS, "Enter entity model name description"); 
						 captureScreenshot(driver);
						 	 
			  }
				  else {
					 
					  test.log(LogStatus.FAIL, "Enter entity model name description textbox is not enabled");
					  captureScreenshot(driver);
				  }
		     }
			  else {
				
				  test.log(LogStatus.FAIL, "Enter entity model name description textbox is not visible");
				  captureScreenshot(driver);
			  }	 
			 
			}
			
				
		  public void iconUplodefile() throws InterruptedException {
			  
			  //Upload File
			  
			  test=report.startTest(" Upload File ");
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
			  
			WebElement iconUpload=driver.findElement(By.id("upload_file"));
			  if(iconUpload.isDisplayed())
			  {
				  test.log(LogStatus.PASS, "Upload element icon is visible"); 
				  captureScreenshot(driver);
				  
				  
				  if(iconUpload.isEnabled()) {
					  
					  
					  test.log(LogStatus.PASS, "upload file select icon is enabled"); 
					  captureScreenshot(driver);
					
					  
					  driver.findElement(By.id("upload_file")).click();	
					  test.log(LogStatus.PASS, " click on uplode file select icon");
					  
					  captureScreenshot(driver);
		  WebElement uploadFile=driver.findElement(By.id("upload_file"));
						
						 File file = new File("/PI_UI/data/Q1.png");
						 
						 System.out.println(file.getAbsolutePath());
						 
				         uploadFile.sendKeys(file.getAbsolutePath());
						
				         test.log(LogStatus.PASS, "file uploaded");
						captureScreenshot(driver); 
						
//					  String file = System.getProperty("user.dir");
//					  test.log(LogStatus.PASS, " file selected "+ file);
//					  
					  
//				       String file = getClass().getClassLoader().getResource("Q1.png").getFile();
//				       UploadElement.sendKeys(file);
//					  
						  
						  
						  
			  }
				  else {
					  
					  test.log(LogStatus.FAIL, "upload file select icon is enabled");
					  captureScreenshot(driver);
				  }
				  
		  }
			  else {
				  
				  test.log(LogStatus.FAIL, "Upload element icon is not visible");
				  captureScreenshot(driver);
			  }
			  
		  }
			
		  public void txtboxEnterAttributeName() throws InterruptedException, EncryptedDocumentException, IOException {

			  //Write Atribute Name 
			  
				test=report.startTest("Enter a atrribute name");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			  
			  
				WebElement txtboxAttributeName=driver.findElement(By.xpath("//input[@formcontrolname='name']"));
				  if(txtboxAttributeName.isDisplayed()) {
				
					  test.log(LogStatus.PASS, "Enter attribute textbox is visible");
					  captureScreenshot(driver);	
					 
					  if(txtboxAttributeName.isEnabled()) {
						  test.log(LogStatus.PASS, "Enter attribute name textbox  is enabled"); 
						  captureScreenshot(driver);
						  test.log(LogStatus.PASS, "Click on enter attribute name textbox");
						  driver.findElement(By.xpath("//input[@formcontrolname='name']")).click();	
						  captureScreenshot(driver);
						  driver.findElement(By.xpath("//input[@formcontrolname='name']")).clear();
						  FileInputStream fsi = new FileInputStream("data\\testData.xlsx");
						  
							Workbook book = WorkbookFactory.create(fsi);
							
							Sheet sh = book.getSheet("Sheet2");
							
							DataFormatter df = new DataFormatter();
							
							String entityname = df.formatCellValue((sh.getRow(2).getCell(1)));
							
							driver.findElement(By.xpath("//input[@formcontrolname='name']")).sendKeys(entityname);
						
							test.log(LogStatus.PASS, "Enter a attribute name");
							 captureScreenshot(driver);
						  
					  }
					  else {
						  test.log(LogStatus.FAIL, "Enter atrribute name textbox is not enabled");
						  captureScreenshot(driver);
					  }
			     }
				  else {
					  test.log(LogStatus.FAIL, "Enter atrribute name textbox is not visible");
					  captureScreenshot(driver);
				  }	 
				 
				
				  }
			  
		 
		  
		  public void txtboxEnterDefaultValue() throws InterruptedException, EncryptedDocumentException, IOException {

			  
			  //Enter Default value
			  
				test=report.startTest("Enter a default value");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			  
			  
				WebElement txtDefaultvalue=driver.findElement(By.xpath("//label[normalize-space()='Default Value']"));
				  if(txtDefaultvalue.isDisplayed()) {
				
					  test.log(LogStatus.PASS, "Enter default value field is visible");
					  captureScreenshot(driver);	
					 
					  if(txtDefaultvalue.isEnabled()) {
						  
					  
						  
						  test.log(LogStatus.PASS, "Enter default value  field is enabled"); 
						  captureScreenshot(driver);
						  test.log(LogStatus.PASS, "Click on default name  field");
						  driver.findElement(By.xpath("//input[@formcontrolname='name']")).click();	
						  captureScreenshot(driver);
						  driver.findElement(By.xpath("//input[@formcontrolname='default']")).clear();
						  
						  
						  FileInputStream fsi = new FileInputStream("data\\testData.xlsx");
						  
							Workbook book = WorkbookFactory.create(fsi);
							
							Sheet sh = book.getSheet("Sheet2");
							
							DataFormatter df = new DataFormatter();
							
							String entityname = df.formatCellValue((sh.getRow(3).getCell(1)));
							
							driver.findElement(By.xpath("//input[@formcontrolname='default']")).sendKeys(entityname);
							
							
							test.log(LogStatus.PASS, "Enter a default value");
							 captureScreenshot(driver);
						  
					  }
					  else {
						 
						  test.log(LogStatus.FAIL, " Enter  default value field is not enabled ");
						  captureScreenshot(driver);
					  }
		  }
				  else {
					 
					  test.log(LogStatus.FAIL, " Enter default name value is not visible");
					  captureScreenshot(driver);
				  }
				  
			//	  Implementation for Scrolling
				  
				 // WebElement source = driver.findElement(By.xpath("//input[@formcontrolname='name']"));
				//  WebElement Destination = driver.findElement(By.xpath("//input[@formcontrolname='default']"));
				 // Actions action = new Actions(driver);
				//  action.dragAndDropBy(source, 100,0).build().perform();
				  
				  test.log(LogStatus.FAIL, " Enter default value field is not visible");
				  
				  JavascriptExecutor js = (JavascriptExecutor) driver;
				  js.executeScript("window.scrollBy(0,300);");
				  captureScreenshot(driver);
		  
		  }
		  
		  public  void dropdownRequiredValue() throws Exception
		  {
			  // Selection of Required Dropdown
			  
			  test=report.startTest("Select required value");
		  
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			  
			  
			WebElement lstRequiredValue = driver.findElement(By.xpath("//app-select[@name='required']//div[@class='selectbutton']"));
			  if(lstRequiredValue.isDisplayed()) {
			
				  test.log(LogStatus.PASS, "Enter required value button is visible");
				  captureScreenshot(driver);	
				  
				  if(lstRequiredValue.isEnabled()) {
					  
				  
					  
					  test.log(LogStatus.PASS, "Select required value button is enabled"); 
					  captureScreenshot(driver);
					  lstRequiredValue.click();	
					  test.log(LogStatus.PASS, "Click on required value button");
					  captureScreenshot(driver);
					  
						
						 driver.findElement(By.xpath("//div[@class='selectcontent2 dropdown-menu show']//div[1]")).click();
						
						 test.log(LogStatus.PASS, "required value is Selected  ");
						 captureScreenshot(driver);
					  		
				  }
				  else {
					 
					  test.log(LogStatus.FAIL, " Enter required value button is not enabled ");
					  captureScreenshot(driver);
				  }
	}
			  else {
				 
				  test.log(LogStatus.FAIL, "Enter required value button  is not visible");
				  captureScreenshot(driver);
			  }  
		  
		  }
		  
		  public  void dropdownDataType() throws Exception
		  {
			  // Data Type Selection
			  
			  test=report.startTest("Select data type");
		  
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			  
			  
			WebElement lstDatatype = driver.findElement(By.xpath("//app-select[@name='type']//div[@class='selectbutton']"));
			  if(lstDatatype.isDisplayed()) {
			
				  test.log(LogStatus.PASS, "Select data type arrow button is visible");
				  captureScreenshot(driver);	
				  
				  if(lstDatatype.isEnabled()) {
					  
				  
					  
					  test.log(LogStatus.PASS, "Select a data type arrow button is enable"); 
					  captureScreenshot(driver);
					  
					 lstDatatype.click();	
					  test.log(LogStatus.PASS, "Click on Select a data type arrow button");
					  captureScreenshot(driver);
					  
				//		List<WebElement> elementsList= driver.findElements(By.xpath("//app-select[@name='type']//div[@class='selectbutton']"));
						
						 List<WebElement>  listofDatatype = driver.findElements(By.xpath("//app-select[@name='type']//div[@class='selectbutton']"));
						 listofDatatype.forEach(s->System.out.println(s.getText()));
						 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
						 String data=getDataFromExcel("Sheet1",23,0);
						 listofDatatype.stream().filter(s->s.getText().equalsIgnoreCase(data)).forEach(S->S.click());
						 
						
						 
						 test.log(LogStatus.PASS, " Data type is Selected");
						 captureScreenshot(driver);			
						
				  }
				  else {
					 
					  test.log(LogStatus.FAIL, " Select a data type arrow button is not enabled ");
					  captureScreenshot(driver);
				  }
	}
			  else {
				 
				  test.log(LogStatus.FAIL, "Select a data type arrow button is not visible");
				  captureScreenshot(driver);
			  }  
		  
		  } 
		  
		  
		  public  void dropdownPrimaryKey() throws Exception{
			  
			  // primary Key Selection
			  
			  test=report.startTest("Primary key selection");
			  
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			  
			  
			 
			//WebElement dropdownPrimarykeyselection=  driver.findElement(By.xpath("//img[@class='imagerotated']"));
			WebElement lstPrimarykey =driver.findElement(By.xpath("//div[@aria-expanded='false']//img[@class='image']"));
			
			if(lstPrimarykey.isDisplayed()) {
				
				  test.log(LogStatus.PASS, "Primary key selection dropDown is visible");
				  captureScreenshot(driver);	
				  
				  if(lstPrimarykey.isEnabled()) {
					  lstPrimarykey.click();
					  
					  test.log(LogStatus.PASS, "Primary key selection dropDown is enable"); 
					  captureScreenshot(driver);
						 WebElement chkboxPrimarykey = driver.findElement(By.xpath("//input[@type='checkbox']"));
						 chkboxPrimarykey.click();

					  if(chkboxPrimarykey.isSelected()) { 
					 
					 test.log(LogStatus.PASS, "Primary key selected"); 
					  captureScreenshot(driver);
					  }
				  
					  else 
						  test.log(LogStatus.PASS, "Primary key is not  selected"); 
						  captureScreenshot(driver);  
					  }  
				  
				  else 
					 
					  test.log(LogStatus.FAIL, "Primary key selection dropDown is not enabled ");
					  captureScreenshot(driver);
				  
					  }
			  else 
				 
				  test.log(LogStatus.FAIL, "Primary key selection dropDown is not visible");
				  captureScreenshot(driver);
			}  
		  
		  
		  
		 
		  //ACL
		  
		  public void btnACL() throws InterruptedException {
			  test=report.startTest("click on ACL button");
				
		// click on ACL button	  
			  
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
		   
		    WebElement btnACL =driver.findElement(By.xpath("//button[normalize-space()='ACL']"));
			  
				  if( btnACL.isDisplayed()) {
				
					  test.log(LogStatus.PASS, "ACL button  is visible");
					  captureScreenshot(driver);	
					
					  if( btnACL.isEnabled()) {
						  
						  test.log(LogStatus.PASS, "ACL button  is enabled"); 
						  captureScreenshot(driver);
						  test.log(LogStatus.PASS, "Click on ACL button");
						  btnACL.click();		
						  captureScreenshot(driver);
				  }
					  else {
						  test.log(LogStatus.FAIL, "ACL button is not enable");
						  captureScreenshot(driver);
					  }
			     }
				  else {
					  test.log(LogStatus.FAIL, "ACL button is not visible");
					  captureScreenshot(driver);
				  }
				  
			}

		  public void entityModelReadAccess() throws Exception {
			  
			  // Entity model read access selection
			  
				test=report.startTest("Entity model read access");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				WebElement lstEntityReadAccess=driver.findElement(By.xpath("//app-select[@name='schemaReadAccess']//div[@class='selectbutton']"));
				

				if(lstEntityReadAccess.isDisplayed()) {
				 	   test.log(LogStatus.PASS,"Entity model read access is visible");
				 	   captureScreenshot(driver);
				 	  if(lstEntityReadAccess.isEnabled()) {
					 	   test.log(LogStatus.PASS,"Entity model read access is enabled");
					 	   captureScreenshot(driver);
					 	   
					 	   
					 	   
					 	  driver.findElement(By.xpath("//app-select[@name='schemaReadAccess']//div[@class='selectbutton']")).click();
							List<WebElement> EntityReadAccesslist=driver.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show']/div"));
							EntityReadAccesslist.forEach(s->System.out.println(s.getText()));
							String data=getDataFromExcel("Sheet1",29, 0);
							EntityReadAccesslist.stream().filter(s->s.getText().equalsIgnoreCase(data)).forEach(S->S.click());
							test.log(LogStatus.PASS,"Data Read access is visible");
							
					 	    }
					    else
					    {
					 	   test.log(LogStatus.FAIL," Selected access for entity model");
					 	   captureScreenshot(driver);
					    }
				}
				    else
				    {   test.log(LogStatus.FAIL,"Entity model read access  is not visible");
				    captureScreenshot(driver);
				    }
				     
			
			 
			    }
		 
		  
		  
		  public void dropDownDataReadAccess() throws Exception {
			  
			  //Data Read Access selection
			  
				test=report.startTest("Data read access");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				WebElement lstDataReadAccess=driver.findElement(By.xpath("//app-select[@name='schemaReadAccess']//div[@class='selectbutton']"));
				

				if(lstDataReadAccess.isDisplayed()) {
				 	   test.log(LogStatus.PASS,"Data read access is visible");
				 	   captureScreenshot(driver);
				 	  if(lstDataReadAccess.isEnabled()) {
					 	   test.log(LogStatus.PASS,"Data  read access is enabled");
					 	   captureScreenshot(driver);
					 	   
					 	   
					 	   
					 	  driver.findElement(By.xpath("//app-select[@name='schemaReadAccess']//div[@class='selectbutton']")).click();
							List<WebElement> DataReadAccesslist=driver.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show']/div"));
							DataReadAccesslist.forEach(s->System.out.println(s.getText()));
							String data=getDataFromExcel("Sheet1",29, 0);
							DataReadAccesslist.stream().filter(s->s.getText().equalsIgnoreCase(data)).forEach(S->S.click());
							test.log(LogStatus.PASS,"Data read access is selected");
						 	   captureScreenshot(driver);
					 	    }
					    else
					    {
					 	   test.log(LogStatus.FAIL,"Data Read read Access is not enabled");
					 	   captureScreenshot(driver);
					    }
				}
				    else
				    {   test.log(LogStatus.FAIL,"Data Read read access  is not visible");
				    captureScreenshot(driver);
				    }
				     
			
			 
		  }
		 
		  public void dataWriteAccess() throws Exception {
			  
			  // Data Write Access selection
			  
				test=report.startTest("Data write access");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				WebElement lstDataWriteAccess=driver.findElement(By.xpath("//app-select[@name='dataWriteAccess']//img[@class='image']"));
				

				if(lstDataWriteAccess.isDisplayed()) {
				 	   test.log(LogStatus.PASS,"Data read access is visible");
				 	   captureScreenshot(driver);
				 	  if(lstDataWriteAccess.isEnabled()) {
					 	   test.log(LogStatus.PASS,"Data  read access is enabled");
					 	   captureScreenshot(driver);
					 	   
					 	   
					 	   
					 	  driver.findElement(By.xpath("//app-select[@name='dataWriteAccess']//img[@class='image']")).click();
							List<WebElement> dataWriteAccesslist=driver.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show']/div"));
							dataWriteAccesslist.forEach(s->System.out.println(s.getText()));
							String data=getDataFromExcel("Sheet1",29, 0);
							dataWriteAccesslist.stream().filter(s->s.getText().equalsIgnoreCase(data)).forEach(S->S.click());
							test.log(LogStatus.PASS,"data write access is selected");
						 	   captureScreenshot(driver);
					 	    }
					    else
					    {
					 	   test.log(LogStatus.FAIL,"Data write read access is not enabled");
					 	   captureScreenshot(driver);
					    }
				}
				    else
				    {   test.log(LogStatus.FAIL,"Data read read access  is not visible");
				    captureScreenshot(driver);
				    }
				     
			
			 
			    }

		  
		  
		  public void visiblityAccess__EntityModel() throws Exception {
			  
			  // Visibility Access selection
			  
				test=report.startTest("PI_visiblity access ");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				WebElement lstVisiblityAccess=driver.findElement(By.xpath("//app-select[@name='visibility']//div[@class='selectbutton']"));
				

				if(lstVisiblityAccess.isDisplayed()) {
				 	   test.log(LogStatus.PASS,"Visiblity access is visible");
				 	   captureScreenshot(driver);
				 	  if(lstVisiblityAccess.isEnabled()) {
					 	   test.log(LogStatus.PASS,"Visiblity access is enabled");
					 	   captureScreenshot(driver);
					 	   
					 	   
					 	   
					 	  driver.findElement(By.xpath("//app-select[@name='visibility']//div[@class='selectbutton']")).click();
							List<WebElement> VisiblityAccesslist =driver.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show']/div"));
							VisiblityAccesslist.forEach(s->System.out.println(s.getText()));
							String data=getDataFromExcel("Sheet1",29, 0);
							VisiblityAccesslist.stream().filter(s->s.getText().equalsIgnoreCase(data)).forEach(S->S.click());
							test.log(LogStatus.PASS,"Visiblity access is selected");
						 	   captureScreenshot(driver);
					 	    }
					    else
					    {
					 	   test.log(LogStatus.FAIL,"Visiblity access is not enabled");
					 	   captureScreenshot(driver);
					    }
				}
				    else
				    {   test.log(LogStatus.FAIL,"Visiblity access is not visible");
				    captureScreenshot(driver);
				    }
		  }
		  
		  public void saveBtn_EntityModel() throws Exception {
			  
			  // for Save 
			  
				 test=report.startTest("Entity model save");
				  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				  
				  
				 WebElement btnSave=driver.findElement(By.xpath("//div[@class='save col-6 d-flex justify-content-center align-items-center']"));
				 if(btnSave.isDisplayed()) {
				     test.log(LogStatus.PASS,"Save button is visible");
				     captureScreenshot(driver);
				    if(btnSave.isEnabled()) {
				    test.log(LogStatus.PASS,"Save button is enabled");
				   captureScreenshot(driver);
				   
				   
				   btnSave.click();
				   
				  }
				  else
				  {
				     test.log(LogStatus.FAIL,"Save button is not enabled");
				   captureScreenshot(driver);
				  }
				 }
				  else
				  {
				     test.log(LogStatus.FAIL,"Save button is not visible");
				     captureScreenshot(driver);
				  }
				 driver.quit();
		  }
//				 public void BtnDiscard() throws Exception 
//					{
//						test=report.startTest("Click On Discard Button");
//						driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//						WebElement discardbtn = driver.findElement(By.xpath("//label[text()='Discard']"));
//						if(discardbtn.isDisplayed()) 
//						{
//						 	   test.log(LogStatus.PASS,"Discard button is visible");
//						 	   captureScreenshot(driver);
//						 	  //discard.click();
//						 	  if(discardbtn.isEnabled()) 
//						 	  {
//							 	   test.log(LogStatus.PASS,"Discard button is enabled");
//							 	   captureScreenshot(driver);
//						 	  }
//							    else
//							    {
//							 	   test.log(LogStatus.FAIL,"Discard button is disabled");
//							 	   captureScreenshot(driver);
//							    }
//						}
//						else
//						 {
//						 	 test.log(LogStatus.FAIL,"Discard button is Not visible");
//						 	  captureScreenshot(driver);
//						 
						//discardbtn.click();
					 	//test.log(LogStatus.PASS,"Click On Discard Button");
					 	//captureScreenshot(driver);
						
				 
				 
		 
				// driver.close();	
		  
				 }
		 
		  
		  

		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		
		  
		  

		  
		  
		  
		  
		  
		  




