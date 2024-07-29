package entityModels;


	import java.util.List;
	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;

	import com.relevantcodes.extentreports.LogStatus;

	public class ContextCreation extends MyRunner{
		
		//-------------------------------------------------------------------------------
		//--------------------CONTEXT_CREATION------------------------------------------
		//------------------------------------------------------------------------------
			WebElement element;


		public void addBtn_Context() throws Throwable {
			

			test = report.startTest("PI_Context");
			test.log(LogStatus.INFO, "Add Button");

			driver.navigate().refresh();
			// Add Button   Xpath- //div[text()='Add']/../img
			element = driver.findElement(By.cssSelector("[src='../../../assets/images/add.png']"));

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			// If-else for Add Button
			if (element.isDisplayed()) {
				test.log(LogStatus.PASS, "'Add button' is visible");
				captureScreenshot(driver);

				if (element.isEnabled()) {
					test.log(LogStatus.PASS, "'Add button' is enabled");
					
				} else {
					test.log(LogStatus.FAIL, "'Add button' is disabled");
					captureScreenshot(driver);
				}
			} else {
				test.log(LogStatus.FAIL, "'Add button' is not visible");
				captureScreenshot(driver);
			}
			element.click();
			captureScreenshot(driver);
		}

		public void selectConstructDropdown_Context() throws Throwable {
			test.log(LogStatus.INFO, "Select Construct Dropdown");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//div[@class='selectbutton']- Xpath ;  //img[@class='image'][1]]
			element = driver.findElement(By.xpath("//div[@class='selectbutton']/img"));
			
			// Construct dropdown list
			
			// If-else for Construct Dropdown
			if (element.isDisplayed()) {
				test.log(LogStatus.PASS, "'Construct dropdown' is visible");
				captureScreenshot(driver);

				if (element.isEnabled()) {
					test.log(LogStatus.PASS, "'Construct dropdown' is enabled");

				} else {
					test.log(LogStatus.FAIL, "'Construct dropdown' is disabled");
					captureScreenshot(driver);
				}
			} else {
				test.log(LogStatus.FAIL, "'Construct dropdown' is not visible");
				captureScreenshot(driver);

			}
			element.click();
			captureScreenshot(driver);
			List<WebElement> constructList = driver.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show']/div"));
			constructList.forEach(List-> System.out.println(List.getText()));
			// Comparison of data using excel
			String constructData = getDataFromExcel("ContextCreation", 3, 0);
			constructList.stream().filter(List -> List.getText().equalsIgnoreCase(constructData)).forEach(List -> List.click());
			captureScreenshot(driver);
			test.log(LogStatus.PASS, "'Construct dropdown' option is selected");
		}
		public void selectUniverseDropdown_Context() throws Throwable {
			test.log(LogStatus.INFO, "Select Universe Dropdown");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


			// SelectUniverse DropDown
			element = driver.findElement(
					By.xpath("//label[text()='Select Universe']/following-sibling::div/div/following-sibling::div"));
			// If-else for select universe dropdown
			if (element.isDisplayed()) {
				test.log(LogStatus.PASS, "'Select universe dropdown' is visible");
				captureScreenshot(driver);
				if (element.isEnabled()) {
					test.log(LogStatus.PASS, "'Select universe dropdown' is enabled");
					captureScreenshot(driver);
				} else {
					test.log(LogStatus.FAIL, "'SelectUniverse dropdown' is disabled");
					captureScreenshot(driver);
				}
			} else {
				test.log(LogStatus.FAIL, "'Select universe dropdown' is not visible");
				captureScreenshot(driver);
			}
			// Search-input
			test.log(LogStatus.INFO, "PI_Universe DropDown SearhBox");
			element.click();
			String searchData = getDataFromExcel("Data", 7, 1);
			WebElement searchBar = driver.findElement(By.xpath("//input[@placeholder='Search']"));

			if (searchBar.isDisplayed()) {
				test.log(LogStatus.PASS, "'Universe dropDown searchBox' is visible");
				captureScreenshot(driver);
				if (searchBar.isEnabled()) {
					test.log(LogStatus.PASS, "'Universe dropDown searchBox' is enabled");
					captureScreenshot(driver);
				} else {
					test.log(LogStatus.FAIL, "'Universe dropDown searchBox' is disabled");
					captureScreenshot(driver);
				}
			} else {
				test.log(LogStatus.FAIL, "'Universe dropDown searchBox' is not visible");
				captureScreenshot(driver);
			}
			searchBar.sendKeys(searchData);
			List<WebElement> universeList = driver.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show']/div"));
			universeList.forEach(list -> System.out.println(list.getText()));
			String selectOption = getDataFromExcel("ContextCreation", 4, 1);
			universeList.stream().filter(list -> list.getText().equalsIgnoreCase(selectOption)).forEach(list -> list.click());

		}

		public void selectEntityDropdown_Context() throws Throwable {
			test.log(LogStatus.INFO, "Select Entity Dropdown");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


			element = driver.findElement(
					By.xpath("//label[text()='Select Entity']/following-sibling::div/div/following-sibling::div"));

			if (element.isDisplayed()) {
				test.log(LogStatus.PASS, "'Select entity dropdown' is visible");
				captureScreenshot(driver);

				if (element.isEnabled()) {
					test.log(LogStatus.PASS, "'Select entity dropdown' is enabled");
					captureScreenshot(driver);

				} else {
					test.log(LogStatus.FAIL, "Select entity dropdown is disabled");
					captureScreenshot(driver);
				}
			} else {
				test.log(LogStatus.FAIL, "Select entity dropdown is not visible");
				captureScreenshot(driver);
			}

			element.click();
			
			// Search-input
			test.log(LogStatus.INFO, "Select Entity SearhBox");
			WebElement searchbar = driver.findElement(By.xpath("//input[@placeholder='Search']"));

			String searchOption = getDataFromExcel("ContextCreation", 5, 2);
			
			test.log(LogStatus.INFO, "PI_Select Schema SearhBox");
			
			if (searchbar.isDisplayed()) {
				test.log(LogStatus.PASS, "'Select entity searchBox' is visible");
				captureScreenshot(driver);
				if (searchbar.isEnabled()) {
					test.log(LogStatus.PASS, "'Select entity searchBox' is enabled");
					captureScreenshot(driver);
				} else {
					test.log(LogStatus.FAIL, "'Select entity searchBox' is disabled");
					captureScreenshot(driver);
				}
			} else {
				test.log(LogStatus.FAIL, "'Select entity searchBox' is not visible");
				captureScreenshot(driver);
			}


			searchbar.sendKeys(searchOption);
			List<WebElement> entityList = driver
					.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show']/div"));
			entityList.forEach(list -> System.out.println(list.getText()));
			String selectOption = getDataFromExcel("ContextCreation", 2, 2);
			entityList.stream().filter(list -> list.getText().equalsIgnoreCase(selectOption)).forEach(list -> list.click());

		}

		public void contextNameTextBox() throws Throwable {
			test.log(LogStatus.INFO, "Context Name TextBox");
			element = driver.findElement(By.xpath("//input[@formcontrolname='name']"));

			if (element.isDisplayed()) {
				test.log(LogStatus.PASS, "'Context name textbox' is visible");
				captureScreenshot(driver);

				if (element.isEnabled()) {
					test.log(LogStatus.PASS, "'Context name textbox' is enabled");

				} else {
					test.log(LogStatus.FAIL, "'Context name textbox' is disabled");
					captureScreenshot(driver);
				}
			} else {
				test.log(LogStatus.FAIL, "'Context name textbox' is not visible");
				captureScreenshot(driver);
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
			element.click();
			element.clear();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
			String inputData = getDataFromExcel("ContextCreation", 2, 3);
			element.sendKeys(inputData);
		}

		public void contextDescriptionTextBox() throws Throwable {
			test.log(LogStatus.INFO, "Context Description TextBox");
			element = driver.findElement(By.xpath("//input[@formcontrolname='desc']"));
			if (element.isDisplayed()) {
				test.log(LogStatus.PASS, "'Context description textbox' is visible");
				captureScreenshot(driver);

				if (element.isEnabled()) {
					test.log(LogStatus.PASS, "'Context description textbox' is enabled");
					captureScreenshot(driver);

				} else {
					test.log(LogStatus.FAIL, "'Context description textbox' is disabled");
					captureScreenshot(driver);
				}
			} else {
				test.log(LogStatus.FAIL, "'Context description textbox' is not visible");
				captureScreenshot(driver);
			}
			element.click();
			element.clear();
			String inputData = getDataFromExcel("ContextCreation", 3, 3);
			element.sendKeys(inputData);
			test.log(LogStatus.PASS, "Context description is entered in textbox");

		} 

		public void sourceConditionDropdown() throws Throwable {
			test.log(LogStatus.INFO, "SourceCondition DropDown");
			// SourceCondition dropdown
			element = driver.findElement(
					By.xpath("//label[text()='Source Condition']/following-sibling::div/div/following-sibling::div"));

			if (element.isDisplayed()) {
				test.log(LogStatus.PASS, "'Source condition dropdown' is visible");
				captureScreenshot(driver);

				if (element.isEnabled()) {
					test.log(LogStatus.PASS, "'Source condition dropdow' is enabled");
					captureScreenshot(driver);
				} else {
					test.log(LogStatus.FAIL, "'Source condition dropdown' is disabled");
					captureScreenshot(driver);
				}
			} else {
				test.log(LogStatus.FAIL, "'SourceCondition dropdown' is not visible");
				captureScreenshot(driver);
			}

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
			element.click();

			// option
			driver.findElement(By.xpath("//div[@aria-labelledby='selectSchemaCondition']/div']")).click();
			test.log(LogStatus.PASS, "'SourceCondition dropdown' option is selected");

		}

		public void sourceAttributeTypeDropdown() throws Throwable {
			test.log(LogStatus.INFO, "Source Attribute Type DropDown");	

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			element = driver.findElement(
					By.xpath("//label[text()='Source Attrbute Type ']/following-sibling::div/div/following-sibling::div"));
			
			// If-else for sourceAttributeType Dropdown
			if (element.isDisplayed()) {
				test.log(LogStatus.PASS, "'Source attribute type dropdown' is visible");
				captureScreenshot(driver);

				if (element.isEnabled()) {
					test.log(LogStatus.PASS, "'Source attribute type dropdown' is enabled");

				} else {
					test.log(LogStatus.FAIL, "'Source attribute type dropdown' is disabled");
					captureScreenshot(driver);

				}
			} else {
				test.log(LogStatus.FAIL, "'Source attribute type dropdown' is not visible");
				captureScreenshot(driver);

			}
			element.click();
			// sourceAttributeType dropdown list
			List<WebElement> SourceAttributeList = driver.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show'/div]"));
			SourceAttributeList.forEach(list -> System.out.println(list.getText()));
			String attributeData = getDataFromExcel("ContextCreation", 1, 6);
			SourceAttributeList.stream().filter(list -> list.getText().equalsIgnoreCase(attributeData)).forEach(list -> list.click());
			test.log(LogStatus.PASS, "Source attribute type dropdown option is selected");

		}

		public void destinationAttributeTypeDropdown() throws Throwable {
			test.log(LogStatus.INFO, "Destination Attribute Type DropDown");	
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			element = driver.findElement(By.xpath(
					"//label[text()='Destination Attribute Type 1']/following-sibling::div/div/following-sibling::div"));
			element.click();

			// destinationAttributeType1 dropdown list
			List<WebElement> destinationAttributeList = driver
					.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show'/div]"));

//				 // If-else for destinationAttributeType1 Dropdown
			if (element.isDisplayed()) {
				test.log(LogStatus.PASS, "'Destination attribute type dropdown' is visible");
				captureScreenshot(driver);

				if (element.isEnabled()) {
					test.log(LogStatus.PASS, "'Destination attribute type dropdown' is enabled");

				} else {
					test.log(LogStatus.FAIL, "'Destination attribute type dropdown' is disabled");

					captureScreenshot(driver);
				}
			} else {
				test.log(LogStatus.FAIL, "'Destination attribute type dropdown' is not visible");
				captureScreenshot(driver);

			}
			destinationAttributeList.forEach(list -> System.out.println(list.getText()));
			String attributeData = getDataFromExcel("ContextCreation", 1, 8);
			destinationAttributeList.stream().filter(list -> list.getText().equalsIgnoreCase(attributeData))
					.forEach(list -> list.click());
		}

		public void scheduleTypeDropdown() throws Throwable {
			test.log(LogStatus.INFO, "Schedule Type DropDown");	
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			element = driver.findElement(
					By.xpath("//label[text()='Schedule Type ']/following-sibling::div/div/following-sibling::div"));

//				 // If-else for scheduleType Dropdown
			if (element.isDisplayed()) {
				test.log(LogStatus.PASS, "'Schedule type dropdown' is visible");
				captureScreenshot(driver);

				if (element.isEnabled()) {
					test.log(LogStatus.PASS, "'Schedule type dropdown' is enabled");
					captureScreenshot(driver);

				} else {
					test.log(LogStatus.FAIL, "'Schedule type dropdown' is disabled");
					captureScreenshot(driver);
				}
			} else {
				test.log(LogStatus.FAIL, "'Schedule type dropdown' is not visible");
				captureScreenshot(driver);

			}
			element.click();

			// scheduleType dropdown list
			List<WebElement> scheduleList = driver.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show'/div]"));

			scheduleList.forEach(list -> System.out.println(list.getText()));
			String data = getDataFromExcel("ContextCreation", 1, 10);
			scheduleList.stream().filter(list -> list.getText().equalsIgnoreCase(data))
					.forEach(list -> list.click());
		}

		public void addRuleBtn() throws Throwable {
			test.log(LogStatus.INFO, "Add Rule Button");	


			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			element = driver.findElement(
					By.xpath("//label[text()='Schedule Type ']/following-sibling::div/div/following-sibling::div"));
			List<WebElement> ruleList = driver
					.findElements(By.xpath("//div[@class='my-2 ng-star-inserted']/button"));

			if (element.isDisplayed()) {
				test.log(LogStatus.PASS, "'Add rule button' is visible");
				captureScreenshot(driver);
				if (element.isEnabled()) {
					test.log(LogStatus.PASS, "'Add rule button' is enabled");
					captureScreenshot(driver);
				} else {
					test.log(LogStatus.FAIL, "'Add rule button' is not enabled");
					captureScreenshot(driver);
				}
			} else {
				test.log(LogStatus.PASS, "'Add rule button' is not visible");

			}
			element.click();
			// div[@class="my-2 ng-star-inserted"]/button

			ruleList.forEach(list -> System.out.println(list.getText()));
			String ruleData = getDataFromExcel("ContextCreation", 1, 12);
			ruleList.stream().filter(list ->list.getText().equalsIgnoreCase(ruleData)).forEach(list ->list.click());

		}

		public void closeRuleBtn() {
			
			test.log(LogStatus.INFO, "Close rule Button");	

			// div[@class="input ng-star-inserted"]
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			element = driver.findElement(By.cssSelector("[src='./assets/images/cross.svg']"));

			if (element.isDisplayed()) {
				test.log(LogStatus.PASS, "'Close rule button' is visible");
				captureScreenshot(driver);
				if (element.isEnabled()) {
					test.log(LogStatus.PASS, "'Close rule button' is enabled");
					captureScreenshot(driver);
				} else {
					test.log(LogStatus.FAIL, "'Close rule button' is not enabled");
					captureScreenshot(driver);
				}
			} else {
				test.log(LogStatus.PASS, "'Close rule button' is not visible");

			}
			element.click();
		}

		public void infoBtn_Context() {
			test.log(LogStatus.INFO, "Info Button");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			element = driver.findElement(By.xpath("//button[text()='Info']"));

			if (element.isDisplayed()) {
				test.log(LogStatus.PASS, "'Info button' is visible");
				captureScreenshot(driver);

				if (element.isEnabled()) {
					test.log(LogStatus.PASS, "'Info button' is enabled");
					captureScreenshot(driver);
				} else {
					test.log(LogStatus.FAIL, "'Info button' is disabled");
					captureScreenshot(driver);
				}
			} else {
				test.log(LogStatus.FAIL, "'Info button' is not visible");
				captureScreenshot(driver);
			}
		element.click();
		}




		public void aclBtn_Context() throws Exception {
			test.log(LogStatus.INFO, "ACL Button");	

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement aclBtn = driver.findElement(By.xpath("//button[@class='info-acl toggle-button']"));
			// WebElement
			// acl=driver.findElement(By.xpath("//button[normalize-space()='ACL']"));
			if (aclBtn.isDisplayed()) {
				test.log(LogStatus.PASS, "'ACL button' is visible");
				captureScreenshot(driver);
				if (aclBtn.isEnabled()) {
					test.log(LogStatus.PASS, "'ACL button' is enabled");
					captureScreenshot(driver);
				} else {
					test.log(LogStatus.FAIL, "'ACL button' is not enabled");
					captureScreenshot(driver);
				}
			} else {
				test.log(LogStatus.FAIL, "'ACL button' is not displayed");
				captureScreenshot(driver);
			}
			aclBtn.click();
		}

		public void readAccess_Context() throws Exception {
			test.log(LogStatus.INFO, "Read Access Dropdown");	

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			WebElement readAccess = driver
					.findElement(By.xpath("//app-select[@name='schemaReadAccess']//div[@class='selectbutton']"));

			if (readAccess.isDisplayed()) {
				test.log(LogStatus.PASS, "'Read access dropdown' is visible");
				captureScreenshot(driver);
				if (readAccess.isEnabled()) {
					test.log(LogStatus.PASS, "'Read access dropdown' is enabled");
					captureScreenshot(driver);
					readAccess.click();
				} else {
					test.log(LogStatus.FAIL, "'Read access dropdown' is disabled");
					captureScreenshot(driver);
				}
			} else {
				test.log(LogStatus.FAIL, "'Read access dropdown' is not visible");
				captureScreenshot(driver);
			}

			List<WebElement> readAccessList = driver
					.findElements(By.xpath("//div[@class='selectcontent2 dropdown-menu show']/div"));
			readAccessList.forEach(list -> System.out.println(list.getText()));
			String accessdata = getDataFromExcel("ContextCreation", 1, 11);
			readAccessList.stream().filter(list-> list.getText().equalsIgnoreCase(accessdata)).forEach(list->list.click());
		}

		public void saveBtn_Context() throws Exception {
			test.log(LogStatus.INFO, "Save Button");	

			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement saveBtn = driver.findElement(By.xpath("//label[text()='Save']"));
			if (saveBtn.isDisplayed()) {
				test.log(LogStatus.PASS, "'Save button' is visible");
				captureScreenshot(driver);
				if (saveBtn.isEnabled()) {
					test.log(LogStatus.PASS, "'Save button' is enabled");
					captureScreenshot(driver);
				} else {
					test.log(LogStatus.FAIL, "'Save button' is not enabled");
					captureScreenshot(driver);
				}
			} else {
				test.log(LogStatus.FAIL, "'Save button' is disabled");
				captureScreenshot(driver);
			}

		}

		public void discardBtn_Context() throws Exception {
			test.log(LogStatus.INFO, "Discard Button");	

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement discardBtn = driver.findElement(By.xpath("//label[text()='Discard']"));
			if (discardBtn.isDisplayed()) {
				test.log(LogStatus.PASS, "'Discard button' is visible");
				captureScreenshot(driver);
				if (discardBtn.isEnabled()) {
					test.log(LogStatus.PASS, "'Discard button' is enabled");
					captureScreenshot(driver);
				} else {
					test.log(LogStatus.FAIL, "'Discard button' is disabled");
					captureScreenshot(driver);
				}
			} else {
				test.log(LogStatus.FAIL, "'Discard button' is not visible");
				captureScreenshot(driver);
			}
			discardBtn.click();
			driver.quit();

		}


	}



