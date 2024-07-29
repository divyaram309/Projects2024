package entityModels;

import static org.testng.Assert.assertEquals;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;


public class DataIngestAssertion extends MyRunner{
	public void addBtnVisible_DataIngest() throws Throwable
	 {
		 driver.navigate().refresh();
		 test=report.startTest("PI_Visible Add Button");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 boolean blnaAddBtn= driver.findElement(By.cssSelector("[src='../../../assets/images/add.png']")).isDisplayed();
		 System.out.println("Add button is visible");
		 //assertEquals(addicon, true);
		 //test.log(LogStatus.PASS, "visible add icon");
		 //captureScreenshot(driver);
		 if(blnaAddBtn)
		 {
			 test.log(LogStatus.PASS, "Add button is visible");
			 captureScreenshot(driver);
		 }
		 else
		 {
			 test.log(LogStatus.FAIL, "Add button is not visible"); 
			 captureScreenshot(driver);
		 }

	}
	 
	 public void addBtnEnable_DataIngest()throws Throwable
	 {
		 test=report.startTest("PI_Enable Add Button");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 boolean blnaAddBtn= driver.findElement(By.cssSelector("[src='../../../assets/images/add.png']")).isEnabled();
		 System.out.println("Add button is enable");
		 //assertEquals(addicon, true);
		 //test.log(LogStatus.PASS, "Enable add icon");
		 //captureScreenshot(driver);
		 if(blnaAddBtn)
		 {
			 test.log(LogStatus.PASS, "Add button is enabled");
			 captureScreenshot(driver);
			 
		 }
		 else
		 {
			 test.log(LogStatus.FAIL, "Add button is not enabled");
			 captureScreenshot(driver);
		 }
		 
	}
	 public void addBtnClick_DataIngest()throws Throwable
	 {
		 test=report.startTest("PI_Click on Add Button");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.cssSelector("[src='../../../assets/images/add.png']")).click();
		 System.out.println("Click on add button");
		 test.log(LogStatus.PASS, "Add button is clickable");
		 captureScreenshot(driver);
		 
		 
		 
		 
	 }
	  
	  public void constructLstVisible_DataIngest()throws Throwable  
	 {
		  
		 test=report.startTest("PI_Visible Construct List");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 boolean blnDropdown= driver.findElement(By.cssSelector(".construct-select > .ng-untouched > .mb-2 > .d-flex > .selectbutton")).isDisplayed();
		 System.out.println("Construct list is visible");
		 if(blnDropdown)
		 {
			 test.log(LogStatus.PASS, "Construct list is visible");
			 captureScreenshot(driver);
		 }
		 else
		 {
			 test.log(LogStatus.FAIL, "Construct list is not visible");
			 captureScreenshot(driver);
		 }
	 
		 
		 
		 //assertEquals(dropdown, true);
		 //test.log(LogStatus.PASS, "Add icon shows construct dropdown");
		 //captureScreenshot(driver);

	}
	 public void constuctLstEnable_DataIngest()throws Throwable  
	 {
		 test=report.startTest("PI_Enable Construct List");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 boolean blnClickdrop= driver.findElement(By.cssSelector(".construct-select > .ng-untouched > .mb-2 > .d-flex > .selectbutton")).isEnabled();
		 System.out.println("Construct list is enable");
		 if(blnClickdrop)
		 {
			 test.log(LogStatus.PASS, "Construct list is enabled");
			 captureScreenshot(driver);
		 }
		 else
		 {
			 test.log(LogStatus.FAIL, "Construct list is not enabled"); 
			 captureScreenshot(driver);
		 }
		 
		 
		 //assertEquals(dropdown, true);
		 //test.log(LogStatus.PASS, "Construct dropdown is enabled");
		 //captureScreenshot(driver);

	}
	 public void constructLstClick_DataIngest()throws Throwable 
	 {
		 test=report.startTest("PI_Click Construct List");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.cssSelector(".construct-select > .ng-untouched > .mb-2 > .d-flex > .selectbutton")).click();
		 //System.out.println(addicon);
		 //assertEquals(addicon, true);
		 test.log(LogStatus.PASS, "Construct list is clickable");
		 captureScreenshot(driver);

		 }
	 public void lstClick_DataIngest() throws Exception
	 {
	 test=report.startTest("PI_Click on List");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 String data=getDataFromExcel("DataIngest", 1, 0);
	 List<WebElement> ele1 =driver.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show']/div"));
	 ele1.forEach(s->System.out.println(s.getText()));
	 ele1.stream().filter(s->s.getText().equalsIgnoreCase(data)).forEach(S->S.click());
	 test.log(LogStatus.PASS, "DataInject list is clickable");
	 captureScreenshot(driver);
	 
	 }
	/* public void Searchdropdown() throws Exception
	 {
	 test=report.startTest("PI_click on Searchbox");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	 WebElement search=driver.findElement(By.xpath("//input[@class='inputfield ng-star-inserted']"));
	 String data1=getDataFromExcel("Data", 6, 1);
	 search.sendKeys(data1);
	 List<WebElement> multipleElement=driver.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show']/div"));
	 multipleElement.forEach(s->System.out.println(s.getText()));
	 String data2=getDataFromExcel("Data",7, 1);
	 multipleElement.stream().filter(s->s.getText().equalsIgnoreCase(data2)).forEach(S->S.click());
	 
	 }*/
	 
	 
	 public void infoBtnVisible_DataIngest() throws Throwable 
	 {
		 test=report.startTest("PI_Visible Info Button");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 boolean blnInfoBtn= driver.findElement(By.xpath("//button[text()='INFO']")).isDisplayed();
		 System.out.println("Info button is visible");
		 //assertEquals(Info, true);
		 //test.log(LogStatus.PASS, "Info is visible ");
		 //captureScreenshot(driver);
		 if(blnInfoBtn)
		 {
			 test.log(LogStatus.PASS, "Info button is visible");
			 captureScreenshot(driver);
		 }
		 else
		 {
			 test.log(LogStatus.FAIL, "Info button is not visible");
			 captureScreenshot(driver);
		 }
		 }
	 public void infoBtnEnable_DataIngest() throws Throwable 
	 {
		 test=report.startTest("PI_Enable Info Button");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 boolean blnInfoBtn= driver.findElement(By.xpath("//button[text()='INFO']")).isEnabled();
		 System.out.println("Info button is enabled");
		 //assertEquals(Info, true);
		 //test.log(LogStatus.PASS, "Info is visible ");
		 //captureScreenshot(driver);
		 if(blnInfoBtn)
		 {
			 test.log(LogStatus.PASS, "Info button is enabled");
			 captureScreenshot(driver);
		 }
		 else
		 {
			 test.log(LogStatus.FAIL, "Info button is not enabled");
			 captureScreenshot(driver);
		 }
		 

	}
	 public void selectUniverseVisible_DataIngest() throws Throwable 
	 {
		 test=report.startTest("PI_Visible Select Universe List");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 boolean blnUniverse= driver.findElement(By.xpath("(//div[@class='selectbutton'])[2]")).isDisplayed();
		 System.out.println("universe list is visible");
		 //assertEquals(universe, true);
		 //test.log(LogStatus.PASS, "Select universe is visible ");
		 //captureScreenshot(driver);
		 if (blnUniverse) 
		 {
			 test.log(LogStatus.PASS, "Select universe list is visible");	
			 captureScreenshot(driver);
		} 
		 else
		 {
			 test.log(LogStatus.FAIL, "Select universe list is  not visible");	
			 captureScreenshot(driver);
		}

	}
	 public void selectUniverseEnable_DataIngest()throws Throwable
	 {
		 test=report.startTest("PI_Enable Select Universe List"); 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 boolean blnUniversedropdown= driver.findElement(By.xpath("(//div[@class='selectbutton'])[2]")).isEnabled();
		 System.out.println("Universe list is enable");
		 if (blnUniversedropdown) 
		 {
			 test.log(LogStatus.PASS, "Select universe list is enabled");
			 captureScreenshot(driver);
		} 
		 else
		 {
			 test.log(LogStatus.FAIL, "Select universe list is not enabled");
			 captureScreenshot(driver);
		}
	 }
	 public void selectUniverseClick_DataIngest() throws Throwable
	 {
		 test=report.startTest("PI_ Select Universe List ");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		 driver.findElement(By.xpath("(//div[@class='selectbutton'])[2]")).click();
		 //System.out.println(addicon);
		 //assertEquals(addicon, true);
		 test.log(LogStatus.PASS, "Select universe list is clickable");
		 captureScreenshot(driver);

		 }
	 
		 public void ingestionNameTxtVisible_DataInjest() throws Throwable 
		 {
			 test=report.startTest("PI_Visible Ingestion Name TextBox");
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			 boolean blnIngestion= driver.findElement(By.cssSelector("input[formcontrolname='name']")).isDisplayed();
			 System.out.println("Ingestion name textbox is visible");
			 //assertEquals(universe, true);
			 //test.log(LogStatus.PASS, "Select universe is visible ");
			 //captureScreenshot(driver);
			 if (blnIngestion) 
			 {
				 test.log(LogStatus.PASS, "Ingestion name textbox is visible");	
				 captureScreenshot(driver);
			} 
			 else
			 {
				 test.log(LogStatus.FAIL, "Ingestion name textbox is  not visible");	
				 captureScreenshot(driver);
			}

		}
		 public void ingestionNameTxtEnable_DataIngest()throws Throwable
		 {
			 test=report.startTest("PI_Enable Ingestion Name TextBox"); 
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 boolean blnIngestionname= driver.findElement(By.cssSelector("input[formcontrolname='name']")).isEnabled();
			 System.out.println("Ingestion name textbox is enable");
			 if (blnIngestionname) 
			 {
				 test.log(LogStatus.PASS, "Ingestion name textbox is enabled");
				 captureScreenshot(driver);
			} 
			 else
			 {
				 test.log(LogStatus.FAIL, "Ingestion name textbox is not enabled");
				 captureScreenshot(driver);
			}
		 }
		 
		 public void ingestionDescriptionTxtVisible_DataIngest() throws Throwable 
		 {
			 test=report.startTest("PI_Visible Ingestion Description TextBox");
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			 boolean blnDesc= driver.findElement(By.cssSelector("input[formcontrolname='description']")).isDisplayed();
			 System.out.println("Ingestion description textbox is visible");
			 //assertEquals(universe, true);
			 //test.log(LogStatus.PASS, "Select universe is visible ");
			 //captureScreenshot(driver);
			 if (blnDesc) 
			 {
				 test.log(LogStatus.PASS, "Ingestion description textbox is visible");	
				 captureScreenshot(driver);
			} 
			 else
			 {
				 test.log(LogStatus.FAIL, "Ingestion description textbox is  not visible");	
				 captureScreenshot(driver);
			}

		}
		 public void ingestionDescriptionTxtEnable_DataIngest()throws Throwable
		 {
			 test=report.startTest("PI_Enable Ingestion Description TextBox"); 
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 boolean blnIngestiondesc= driver.findElement(By.cssSelector("input[formcontrolname='description']")).isEnabled();
			 System.out.println("Ingestion description textbox is enable");
			 if (blnIngestiondesc) 
			 {
				 test.log(LogStatus.PASS, "Ingestion description textbox is enabled");
				 captureScreenshot(driver);
			} 
			 else
			 {
				 test.log(LogStatus.FAIL, "Ingestion description textbox is not enabled");
				 captureScreenshot(driver);
			}
		 }
		 
		 public void configurationNameTxtVisible_DataIngest() throws Throwable 
		 {
			 test=report.startTest("PI_Visible Configuration Name TextBox");
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			 boolean blnConfig= driver.findElement(By.cssSelector("input[formcontrolname='configName']")).isDisplayed();
			 System.out.println("Configuration name textbox is visible");
			 //assertEquals(universe, true);
			 //test.log(LogStatus.PASS, "Select universe is visible ");
			 //captureScreenshot(driver);
			 if (blnConfig) 
			 {
				 test.log(LogStatus.PASS, "Configuration name textbox is visible");	
				 captureScreenshot(driver);
			} 
			 else
			 {
				 test.log(LogStatus.FAIL, "Configuration name textbox is  not visible");	
				 captureScreenshot(driver);
			}

		}
		 public void configurationNameTxtEnable_DataIngest()throws Throwable
		 {
			 test=report.startTest("PI_Enable Configuration Name TextBox"); 
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 boolean blnConfigure= driver.findElement(By.cssSelector("input[formcontrolname='configName']")).isEnabled();
			 System.out.println("Configuration name textbox is enable");
			 if (blnConfigure) 
			 {
				 test.log(LogStatus.PASS, "Configuration name textbox is enabled");
				 captureScreenshot(driver);
			} 
			 else
			 {
				 test.log(LogStatus.FAIL, "Configuration name textbox is not enabled");
				 captureScreenshot(driver);
			}
		 }
			 public void configurationDescriptionTxtVisible_DataIngest() throws Throwable 
		 {
			 test=report.startTest("PI_Visible Configuration Description TextBox");
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			 boolean blnDescri= driver.findElement(By.cssSelector("input[formcontrolname='configDesc']")).isDisplayed();
			 System.out.println("Configuration description textbox is visible");
			 //assertEquals(universe, true);
			 //test.log(LogStatus.PASS, "Select universe is visible ");
			 //captureScreenshot(driver);
			 if (blnDescri) 
			 {
				 test.log(LogStatus.PASS, "Configuration description textbox is visible");	
				 captureScreenshot(driver);
			} 
			 else
			 {
				 test.log(LogStatus.FAIL, "Configuration description textbox is not visible");	
				 captureScreenshot(driver);
			}

		}
		 public void configurationDescriptionTxtEnable_DataIngest()throws Throwable
		 {
			 test=report.startTest("PI_Enable Configuration Description TextBox"); 
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 boolean blnConfigurationdescri= driver.findElement(By.cssSelector("input[formcontrolname='configDesc']")).isEnabled();
			 System.out.println("Configuration description textbox is enable");
			 if (blnConfigurationdescri) 
			 {
				 test.log(LogStatus.PASS, "Configuration description textbox is enable");
				 captureScreenshot(driver);
			} 
			 else
			 {
				 test.log(LogStatus.FAIL, "Configuration description textbox is not enable");
				 captureScreenshot(driver);
			}
		 }
		 
		 public void selectSourceVisible_DataIngest() throws Throwable 
		 {
			 test=report.startTest("PI_Visible Select Source List");
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 boolean blnSource= driver.findElement(By.xpath("(//div[@class='selectbutton'])[3]")).isDisplayed();
			 
			 System.out.println("Select source list is visible");
			 //assertEquals(universe, true);
			 //test.log(LogStatus.PASS, "Select universe is visible ");
			 //captureScreenshot(driver);
			 if (blnSource) 
			 {
				 test.log(LogStatus.PASS, "Select source list is visible");	
				 captureScreenshot(driver);
			} 
			 else
			 {
				 test.log(LogStatus.FAIL, "Select source list is not visible");	
				 captureScreenshot(driver);
			}

		}
		 public void selectSourceEnable_DataIngest()throws Throwable
		 {
			 test=report.startTest("PI_Enable Select Source List"); 
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 boolean blnSources= driver.findElement(By.xpath("(//div[@class='selectbutton'])[3]")).isEnabled();
			 System.out.println("Select source list is enable");
			 if (blnSources) 
			 {
				 test.log(LogStatus.PASS, "Select source list is enabled ");
				 captureScreenshot(driver);
			} 
			 else
			 {
				 test.log(LogStatus.FAIL, "Select source list is not enabled ");
				 captureScreenshot(driver);
			}
		 }
		 public void selectSourceClick_DataIngest() throws Throwable
		 {
			 test=report.startTest("PI_Click Select Source List");
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			 driver.findElement(By.xpath("(//div[@class='selectbutton'])[3]")).click();
			 //System.out.println(addicon);
			 //assertEquals(addicon, true);
			 test.log(LogStatus.PASS, "Select source list is clickable");
			 captureScreenshot(driver);

			 }
			 public void configureSourceMappingvisible_DataIngest()throws Throwable
			 {
				 test=report.startTest("PI_Visible Configure Source Mapping Button"); 
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				 boolean blnMapping= driver.findElement(By.xpath("//label[text()='Configure Source Mapping']")).isDisplayed();
				 System.out.println("Configure Source Mapping button is visible");
				 if (blnMapping) 
				 {
					 test.log(LogStatus.PASS, "Configure source mapping button is visible");
					 captureScreenshot(driver);
				} 
				 else
				 {
					 test.log(LogStatus.FAIL, "Configure source mapping button is not visible");
					 captureScreenshot(driver);
				}
			 
		 }
			 public void configureSourceMappingSelected_DataIngest()throws Throwable
			 {
				 test=report.startTest("PI_Select Configure Source Mapping Button"); 
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				 boolean blnMap= driver.findElement(By.xpath("//label[text()='Configure Source Mapping']")).isSelected();
				 System.out.println("Configure source mapping button is selected");
				 if (blnMap) 
				 {
					 test.log(LogStatus.PASS, "Configure source mapping button is selected");
					 captureScreenshot(driver);
				} 
				 else
				 {
					 test.log(LogStatus.FAIL, "Configure source mapping button is not selected");
					 captureScreenshot(driver);
				}
			 
		 }
			 public void createNewEnityVisible_DataIngest()throws Throwable
			 {
				 test=report.startTest("PI_Visible Create New Enity Button"); 
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				 boolean blnMapping= driver.findElement(By.xpath("//label[text()='Create New Enity']")).isDisplayed();
				 System.out.println("Create new enity button is visible");
				 if (blnMapping) 
				 {
					 test.log(LogStatus.PASS, "Create new enity button is visible");
					 captureScreenshot(driver);
				} 
				 else
				 {
					 test.log(LogStatus.FAIL, "Create new enity button is not visible");
					 captureScreenshot(driver);
				}
			 
		 }
			 public void createNewEnitySelected_DataIngest()throws Throwable
			 {
				 test=report.startTest("PI_Select Create New Enity Button"); 
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				 boolean blnMap= driver.findElement(By.xpath("//label[text()='Create New Enity']")).isSelected();
				 System.out.println("Create new enity button is selected");
				 if (blnMap) 
				 {
					 test.log(LogStatus.PASS, "Create new enity button is selected");
					 captureScreenshot(driver);
				} 
				 else
				 {
					 test.log(LogStatus.FAIL, "Create new enity button is not selected");
					 captureScreenshot(driver);
				}
			 
		 }
			 public void configureSourceMappingLinkVisible_DataIngest()throws Throwable
		 {
			 test=report.startTest("PI_Visible Configure Source Mapping Link"); 
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 boolean blnMappingLink= driver.findElement(By.xpath("//a[text()='Configure Source Mapping ']")).isDisplayed();
			 System.out.println("Configure source mapping link is visible");
			 if (blnMappingLink) 
			 {
				 test.log(LogStatus.PASS, "Configure source mapping link is visible");
				 captureScreenshot(driver);
			} 
			 else
			 {
				 test.log(LogStatus.FAIL, "Configure source mapping link is not visible");
				 captureScreenshot(driver);
			}
		 
	 }
			 public void configureSourceMappingLinkEnable_DataIngest()throws Throwable
			 {
				 test=report.startTest("PI_Enable Configure Source Mapping Link"); 
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				 boolean blnMap= driver.findElement(By.xpath("//a[text()='Configure Source Mapping ']")).isEnabled();
				 System.out.println("Configure source mapping link is enabled");
				 if (blnMap) 
				 {
					 test.log(LogStatus.PASS, "Configure source mapping link is enabled");
					 captureScreenshot(driver);
				   } 
				 else
				 {
					 test.log(LogStatus.FAIL, "Configure source mapping link is not enabled");
					 captureScreenshot(driver);
			   }
		}
	   public void scheduleJobTypeVisible_DataIngest() throws Throwable 
	{
		 test=report.startTest("PI_Visible Schedule Job Type List");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 boolean blnJob= driver.findElement(By.xpath("(//div[@class='selectbutton'])[4]")).isDisplayed();
		 
		 System.out.println("Schedule job type list is visible");
		 //assertEquals(universe, true);
		 //test.log(LogStatus.PASS, "Select universe is visible ");
		 //captureScreenshot(driver);
		 if (blnJob) 
		 {
			 test.log(LogStatus.PASS, "Schedule job type list is visible");	
			 captureScreenshot(driver);
		} 
		 else
		 {
			 test.log(LogStatus.FAIL, "Schedule job type list is not visible");	
			 captureScreenshot(driver);
		}

	}
	   public void scheduleJobTypeEnable_DataIngest()throws Throwable
		 {
			 test=report.startTest("PI_Enable Schedule Job Type List"); 
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 boolean blnJobtype= driver.findElement(By.xpath("(//div[@class='selectbutton'])[4]")).isEnabled();
			 System.out.println("Schedule job type list is enable");
			 if (blnJobtype) 
			 {
				 test.log(LogStatus.PASS, "Schedule job type list is enabled");
				 captureScreenshot(driver);
			} 
			 else
			 {
				 test.log(LogStatus.FAIL, "Schedule job type list is not enabled");
				 captureScreenshot(driver);
			}
		 }
	   public void scheduleJobTypeClick_DataIngest() throws Throwable
	   {
	  	 test=report.startTest("PI_Click Schedule Job Type List");
	  	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	  	 driver.findElement(By.xpath("(//div[@class='selectbutton'])[4]")).click();
	  	 //System.out.println(addicon);
	  	 //assertEquals(addicon, true);
	  	 test.log(LogStatus.PASS, "Schedule job type list is clickable");
	  	 captureScreenshot(driver);

	  	 }
	   
	   public void aclvisible_DataIngest() throws Throwable 
	   {
	  	 test=report.startTest("PI_Visible ACL Button ");
	  	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  	 boolean blnAcl= driver.findElement(By.xpath("//button[text()='ACL']")).isDisplayed();
	  	 System.out.println("ACL Button is visible");
	  	 //assertEquals(Info, true);
	  	 //test.log(LogStatus.PASS, "Info is visible ");
	  	 //captureScreenshot(driver);
	  	 if(blnAcl)
	  	 {
	  		 test.log(LogStatus.PASS, "ACL Button is visible");
	  		 captureScreenshot(driver);
	  	 }
	  	 else
	  	 {
	  		 test.log(LogStatus.FAIL, "ACL Button is not visible");
	  		 captureScreenshot(driver);
	  	 }
	  	 }
	  	public void aclEnable_DataIngest() throws Throwable 
	    {
	   	 test=report.startTest("PI_Enable ACL Button");
	   	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   	 boolean blnAc= driver.findElement(By.xpath("//button[text()='ACL']")).isEnabled();
	   	 System.out.println("ACL Button is enabled");
	   	 //assertEquals(Info, true);
	   	 //test.log(LogStatus.PASS, "Info is visible ");
	   	 //captureScreenshot(driver);
	   	 if(blnAc)
	   	 {
	   		 test.log(LogStatus.PASS, "ACL Button is enabled");
	   		 captureScreenshot(driver);
	   	 }
	   	 else
	   	 {
	   		 test.log(LogStatus.FAIL, "ACL Button is not enabled");
	   		 captureScreenshot(driver);
	   	 }
	    }
	  	public void discardBtnVisible_DataIngest() throws Throwable 
	    {
	   	 test=report.startTest("PI_Visible Discard Button ");
	   	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   	 boolean blnDiscard= driver.findElement(By.xpath("//img[@src='./assets/images/discard.svg']")).isDisplayed();
	   	 System.out.println("Discard button is visible");
	   	 //assertEquals(Info, true);
	   	 //test.log(LogStatus.PASS, "Info is visible ");
	   	 //captureScreenshot(driver);
	   	 if(blnDiscard)
	   	 {
	   		 test.log(LogStatus.PASS, "Discard button is visible");
	   		 captureScreenshot(driver);
	   	 }
	   	 else
	   	 {
	   		 test.log(LogStatus.FAIL, "Discard button is not visible");
	   		 captureScreenshot(driver);
	   	 }
	   	 }
	  	public void discardBtnEnable_DataIngest() throws Throwable 
	    {
	   	 test=report.startTest("PI_Enable Discard Button");
	   	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   	 boolean blnDis= driver.findElement(By.xpath("//img[@src='./assets/images/discard.svg']")).isEnabled();
	   	 System.out.println("Discard button is enabled");
	   	 //assertEquals(Info, true);
	   	 //test.log(LogStatus.PASS, "Info is visible ");
	   	 //captureScreenshot(driver);
	   	 if(blnDis)
	   	 {
	   		 test.log(LogStatus.PASS, "Discard button is enabled");
	   		 captureScreenshot(driver);
	   	 }
	   	 else
	   	 {
	   		 test.log(LogStatus.FAIL, "Discard button is not enabled");
	   		 captureScreenshot(driver);
	   	 }
	    }
	  	public void saveBtnVisible_DataIngest() throws Throwable 
	    {
	   	 test=report.startTest("PI_Visible Save Button ");
	   	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   	 boolean blnSave= driver.findElement(By.xpath("//img[@src='./assets/images/save.svg']")).isDisplayed();
	   	 System.out.println("Save button is visible");
	   	 //assertEquals(Info, true);
	   	 //test.log(LogStatus.PASS, "Info is visible ");
	   	 //captureScreenshot(driver);
	   	 if(blnSave)
	   	 {
	   		 test.log(LogStatus.PASS, "Save button is visible");
	   		 captureScreenshot(driver);
	   	 }
	   	 else
	   	 {
	   		 test.log(LogStatus.FAIL, "Save button is not visible");
	   		 captureScreenshot(driver);
	   	 }
	   	 }
	  	public void saveBtnEnable_DataIngest() throws Throwable 
	    {
	   	 test=report.startTest("PI_Enable Save Button");
	   	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   	 boolean blnDis= driver.findElement(By.xpath("//img[@src='./assets/images/save.svg']")).isEnabled();
	   	 System.out.println("Save button is enabled");
	   	 //assertEquals(Info, true);
	   	 //test.log(LogStatus.PASS, "Info is visible ");
	   	 //captureScreenshot(driver);
	   	 if(blnDis)
	   	 {
	   		 test.log(LogStatus.PASS, "Save button is enabled");
	   		 captureScreenshot(driver);
	   	 }
	   	 else
	   	 {
	   		 test.log(LogStatus.FAIL, "Save button is not enabled");
	   		 captureScreenshot(driver);
	   	 }
	   	driver.quit();
	    }
		
	}


