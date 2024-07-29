package entityModels;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.mail.EmailException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class MyRunner {
	public static String report1;
	public static WebDriver driver;
	@Test
	public void PI_UI() throws Throwable {
		
		Login keys= new Login();
		
		LoginAndDashboardFunctionality keys2 = new LoginAndDashboardFunctionality();
		
		//Assertions
		EntityModelAssertion keys3=new EntityModelAssertion();
		GroupAssertion keys4 = new GroupAssertion();
		BigQueryAssertion keys5 = new BigQueryAssertion();	
		ContextAssertion keys6 = new ContextAssertion();
		DataIngestAssertion keys7 = new DataIngestAssertion();
		
		//Creations
		EntityModelCreation keys8 = new EntityModelCreation();
		Groupcreation keys9 = new Groupcreation();
		BigQueryCreation keys10 = new BigQueryCreation();
		ContextCreation keys11 = new ContextCreation();
		DataIngestCreation keys12=new DataIngestCreation();
		
		//to specify Keywords file location
		FileInputStream fi= new FileInputStream("data/testData.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Runner");
		
		//to find number of rows
		int rowCount=ws.getLastRowNum();
		for(int i=1; i<= rowCount; i++) {
			XSSFRow row=ws.getRow(i);
			//to read Run mode 
			String runMode=row.getCell(4).getStringCellValue();
			System.out.println(runMode);
			if (runMode.equals("Y")) {
			
//to read Step DEscription
				String keyWord=row.getCell(2).getStringCellValue();
				System.out.println(keyWord);
				switch (keyWord) {
				case "Launch Browser":
					keys.launchBrowser();
					break;
				case "Navigate to Url":
					keys.navigateURL();
					break;	
				case "Verify Mobius Logo Visiblity" :
					keys2.mobiusLogoVisibility();
					break;
				case "Verify Username Field Visibility" :
					keys2.userNameLblVisibility();
					break;
				case "Verify Username Field Clickable" :
					keys2.userNameLblClickability();
					break;
				case "Verify Password Field Visibility" :
					keys2.passwordLblVisibility();
					break;
				case "Verify Password Field Clickable" :
					keys2.passwordLblClickability();
					break;
				case "Verify Rememberme Checkbox Visibility" :
					keys2.rememberMeChkVisibility();
					break;
				case "Verify Rememberme Checkbox Clickable" :
					keys2.rememberMeChkClickability();
					break;
				case "Verify Forgot Password Link Visibility" :
					keys2.forgotPasswordlnkVisibility();
					break;
				case "Verify Forgot Password Link Clickable" :
					keys2.forgotPasswordlnkClickability();
					break;
				case "Verify Login Button Visible" :
					keys2.loginBtnVisibility();
					break;
				case "Verify Login Button Clickable" :
					keys2.loginBtnClickability();
					break;
				case "Verify Register Now Link Visibility" :
					keys2.registerNowLnkVisibility();
					break;
				case "Verify Register Now Link Clickable" :
					keys2.registerNowLnkClickability();
					break;
				case "Verify Number of Links" :
					keys2.numberOfLinks();
					break;
				case "Enter the Username":
					keys.enterUsername();
					break;
				case "Enter the Password":
					keys.enterPassword();
					break;
				case "Click on Login button":
					keys.clickLogin();
					break;	
				case "Verify Login Success Toast" :
					keys2.loginSuccessMsg();
					break;
				case "Verify Page Title":
					keys.pageTitle();
					break;
				case "Verify PI logo" :
					keys2.piLogoVisibility();
					break;
				case "Verify Universe Button Visibility" :
					keys2.universeBtnVisibility();
					break;
				case "Verify Universe Button Clickable" :
					keys2.universeBtnClickability();
					break;
				case "Verify Entity Button Visibility" :
					keys2.entityBtnVisibility();
					break;
				case "Verify Entity Button Clickable" :
					keys2.entityBtnClickability();
					break;
				case "Verify Groups Button Visibility" :
					keys2.groupsBtnVisibility();
					break;
				case "Verify Groups Button Clickable" :
					keys2.groupsBtnClickability();
					break;
				case "Verify Big Queries Button Visibility" :
					keys2.bigQueriesBtnVisibility();
					break;
				case "Verify Big Queries Button Clickable" :
					keys2.bigQueriesBtnClickability();
					break;
				case "Verify Visualisations Button Visibility" :
					keys2.visualisationsBtnVisibility();
					break;
				case "Verify Visualisations Button Clickable" :
					keys2.visualisationsBtnClickability();
					break;
				case "Verify Contexts Button Visibility" :
					keys2.contextsBtnVisibility();
					break;
				case "Verify Contexts Button Clickable" :
					keys2.contextsBtnClickability();
					break;
				case "Verify Engagements Button Visibility" :
					keys2.engagaementsBtnVisibility();
					break;
				case "Verify Engagements Button Clickable" :
					keys2.engagaementsBtnClickability();
					break;
				case "Verify Data Ingests Button Visibility" :
					keys2.dataIngestsBtnVisibility();
					break;
				case "Verify Data Ingests Button Clickable" :
					keys2.dataIngestsBtnClickability();
					break;
				case "Verify Log Out Button Visibility" :
					keys2.logoutBtnVisibility();
					break;
				case "Verify Log Out Button Clickable" :
					keys2.logoutBtnClickability();
					break;
				case "Verify Annotate Button Visibility" :
					keys2.annotateBtnVisibility();
					break;
				case "Verify Annotate Button Clickable" :
					keys2.annotateBtnClickability();
					break;
				case "Verify Data Button Visibility" :
					keys2.dataBtnVisibility();
					break;
				case "Verify Data Button Clickable" :
					keys2.dataBtnClickability();
					break;
				case "Verify Play Button Visibility" :
					keys2.playBtnVisibility();
					break;
				case "Verify Play Button Clickable" :
					keys2.playBtnClickability();
					break;
				case "Verify Timeline Button Visibility" :
					keys2.timelineBtnVisibility();
					break;
				case "Verify Timeline Button Clickable" :
					keys2.timelineBtnClickability();
					break;
				case "Verify OpenAI Button Visibility" :
					keys2.openAiBtnVisibility();
					break;
				case "Verify OpenAI Button Clickable" :
					keys2.openAiBtnClickability();
					break;
				case "Verify Serendipity Button Visibility" :
					keys2.serendipityBtnVisibility();
					break;
				case "Verify Serendipity Button Clickable" :
					keys2.serendipityBtnClickability();
					break;
				case "Verify Infinity Logo Visibility" :
					keys2.infinityLogoVisibility();
					break;
				case "Verify Infinity DropDown Clickable" :
					keys2.infinitylstClickability();
					break;
				case "Verify Fit To View Button Visibility" :
					keys2.fitToViewBtnVisibility();
					break;
				case "Verify Fit To View Button Clickable" :
					keys2.fitToViewBtnClickability();
					break;
				case "Verify 2D3D Button Visibility" :
					keys2.twoDOrThreeDBtnVisibility();
					break;
				case "Verify 2D3D Button Clickable" :
					keys2.twoDOrThreeDBtnClickability();
					break;
				case "Verify Drag Button Visibility" :
					keys2.dragOpenBtnVisibility();
					break;
				case "Verify Drag Button Clickable" :
					keys2.dragOpenBtnClickability();
					break;
					
				case "Verify Add Button":
					keys3.addBtnEntityModel();
					break;
				case "Click DropDown":
					keys3.selectConstructDrpdwnEntityModel();
					break;
				case "Entity Model":
					keys3.selectEntityModelDropDown();
					break;
				case "Click Info Button":
					keys3.infoBtnEntityModel();
					break;
				case "Select Universe DropDown":
					keys3.selectuniverseDropdownEntityModel();
					break;
				case "Select Universe DropDown SearchBox":
					keys3.srchBox();
					break;
				case "Entity Model Name":
					keys3.EntityModelNameTxtBox();
					break;
				case "Entity Model Description":
					keys3.EntityModelDescriptionTxtBox();
					break;
				case "Upload Files":
					//em.uploadFiles();
					keys3.selectIcon();
					break;
				case "Attributes":
					keys3.attributes();
					break;
				case "Attribute Name":
					keys3.AttributeNameTxtBox();
					break;
				case "Default Value":
					keys3.DefaultValueTxtBox();
					break;
				case "Required":
					keys3.requiredDrpdwn();
					break;
				case "Data Type":
					keys3.dataTypeDrpdwn();
					break;
				case "Close Button":
					keys3.closeBtn();
					break;
				case "Add attribute":
					keys3.addAttribute();
					break;
				case "Primary Key":
					keys3.primaryKeyDrpdwn();
					break;
				case "ACL":
					keys3.aclBtnEntityModel();
					break;
				case "Entity Model Read Access":
					keys3.entityModelReadAccessDrpdwn();
					break;
				case "Data Read Access":
					keys3.dataReadAccessDrpdwn();
					break;
				case "Data Write Access":
					keys3.dataWriteAccessDrpdwn();
					break;
				case "Visibility Access":
					keys3.visibilityAccessDrpdwn();
					break;
				case "Discard":
					keys3.discardBtnEntityModel();
					break;
				case "Save - Entity Assertion":
					keys3.saveBtnEntityModel();
					break;
					
				case "addBtn":
					keys4.addBtn();
					break;
				case"enableaddBtn":
					keys4.enableaddBtn();
					break;
				case "clickaddBtn":
					keys4.clickaddBtn();
					break;
				case "contructLst":
					keys4.contructLst();
					break;
				
				case "enablecontructLst":
					keys4.enablecontructLst();
					break;
				
				//case"clickconstructdropdown":
					//keys1.clickcontructdropdown();
					//break;
				//case"contructsdropdown":
					//keys1.contructsdropdown();
					//break;
				//case"grouppresent":
					//keys1.grouppresent();
					//break;
				case "clickcontructLst":
					keys4.clickcontructLst();
					break;
				case"groupconstructvisible":
					keys4.groupconstructVisible();
					break;
				case"groupconstruct":
					keys4.groupconstruct();
					break;
				case"infoBtn":
					keys4.infoBtn();
					break;
				case"enableinfoBtn":
					keys4.enableinfoBtn();
					break;
				case"selectUniverseLst":
					keys4.selectUniverseLst();
					break;
				case"universeLstEnble":
					keys4.universeLstEnble();
					break;
				case"clickUniverseLst":
					keys4.clickUniverseLst();
					break;
				case"selectschemaLst":
					keys4.selectschemaLst();
					break;
				case"selectSchemaLstEnable":
					keys4.selectSchemaLstEnable();
					break;
				case"groupNameTxt":
					keys4.groupNameTxt();
					break;
				case"groupdNametxtEnable":
					keys4.groupdNametxtEnable();
					break;
				
				case"groupdDescriptrionTxt":
					keys4.groupdDescriptrionTxt();
					break;
				
				case"groupdDescriptrionTxtEnable":
					keys4.groupdDescriptrionTxtEnable();
					break;
				case"radioBtn":
					keys4.radioBtn();
					break;
				case"manualconditionsBtn":
					keys4.manualconditionsBtn();
					break;
				case"queryBtn":
					keys4.queryBtn();
					break;
				case"queryBtnSelected":
					keys4.queryBtnSelected();
					break;
				case"sourceattributeTypeLst":
					keys4.sourceattributeTypeLst();
					break;
				case"sourceattributeLstEnable":
					keys4.sourceattributeLstEnable();
					break;
				case"sourceConditionLst":
					keys4.sourceConditionLst();
					break;
				case"sourceConditionLstEnable":
					keys4.sourceConditionLstEnable();
					break;
				case"clickSourceCondition":
					keys4.clickSourceCondition();
					break;
				//case"clickSourceattribute":
					//keys1.clickSourceattribute();
					//break;
					
				case"destinationAttributeLst":
					keys4.destinationAttributeLst();
					break;
				case"destinationAttributeLstEnable":
					keys4.destinationAttributeLstEnable();
					break;
				
				//case"clickDestinationattribute":
					//keys1.clickDestinationattribute();
					//break;
				
				case"addRuleBtn":
					keys4.addRuleBtn();
					break;
				case"addRuleBtnEnable":
					keys4.addRuleBtnEnable();
					break;
				case"clcikaddRuleBtn":
					keys4.clcikaddRuleBtn();
					break;
				case"aclBtn":
					keys4.aclBtn();
					break;
				case"aclBtnEnable":
					keys4.aclBtnEnable();
					break;
				case"clickAclBtn":
					keys4.clickAclBtn();
					break;
				case"readAcessLst":
					keys4.readAcessLst();
					break;
				case"readaccessLstEnable":
					keys4.readaccessLstEnable();
					break;
				case"discardBtn":
					keys4.discardBtn();
					break;
				
				case"discardbuttonEnable":
					keys4.discardBtnEnable();
					break;
				case"saveBtn":
					keys4.saveBtn();
					break;
				case"saveBtnEnable":
					keys4.saveBtnEnable();
					
				case "Click On Add Button":
					 keys5.bigQueryAddBtn();
					break;
					
				case "Click On Dropdown":
					keys5.bigQueryConstructDropdown();
					break;
								
				case "Click On Info Button":
					keys5.bigQueryInfoBtn();
					break;
					
				case "Enter Query Name in TextBox":
					keys5.queryNameTxt();
					break;
					
				case "Enter Query Description in TextBox":
					keys5.queryDescriptionTxt();
					break;
					
				case "Enter Query in TextBox":
					keys5.queryTxt();
					break;
									
				case "Select Universe From Dropdown":
					keys5.bigQueryUniverseDropdown();
					break;
					
				case "Enter a Value in Universe DropDown SearhBox":
					keys5.bigQueryUniverseSearchBox();
					break;
					
				case "Select Schema From Dropdown":
					keys5.bigQuerySchemaDropdown();
					break;
					
				case "Enter a Value in Schema DropDown SearhBox" :
					keys5.bigQuerySchemaSearchBox();
					break;
				
				case "Select Start Date from DropDown":
					keys5.bigQueryStartDate();
					break;
					
				case "Select End Date from DropDown":
					keys5.bigQueryEndDate();
					break;
					
				case "Select Time Zone From DropDown":
					keys5.bigQueryTimeZoneDropdown();
					break;
					
				case "Enter Time Zone in DropDown SearhBox":
					keys5.bigQueryTimeZoneSearchBox();
					break;
					
				case "Select Frequency From DropDown":
					keys5.bigQueryFrequencyDropdown();
					break;
				
				case "Click On ACL Button":
					keys5.bigQueryAclBtn();
					break;
					
				case "Select Read Access From DropDown":
					keys5.bigQueryReadAccessDropdown();
					break;
					
				case "Select Visibility Access From Dropdown":
					keys5.bigQueryVisibilityAccessDropdown();
					break;
					
				case "Click On Save Button":
					keys5.bigQuerySaveBtn();
					break;
					
				case "Click On Discard Button":
					keys5.bigQueryDiscardBtn();
					break;
					
				case "addBtnVisible_ContextModel":
					keys6.addBtnVisible_ContextModel();
					break;
				case"addBtnEnable_ContextModel":
					keys6.addBtnEnable_ContextModel();
					break;
				case "addBtnClick_ContextModel":
					keys6.addBtnClick_ContextModel();
					break;
				case"contructLstClick_ContextModel":
					keys6.contructLstClick_ContextModel();
						
				//case"contextpresent":
					//keys2.contextpresent1();
					//break;
				
				case"contextConstructVisible_ContextModel":
					keys6.contextConstructVisible_ContextModel();
					break;
				case"contextConstructEnable_ContextModel":
					keys6.contextConstructEnable_ContextModel();
					break;
				case"infoBtnVisible_ContextModel":
					keys6.infoBtnVisible_ContextModel();
					break;
				case"selectuniverseLstVisible_ContextModel":
					keys6.selectuniverseLstVisible_ContextModel();
					break;
				case"selectUniverseLstEnable_ContextModel":
					keys6.selectUniverseLstEnable_ContextModel();
					break;
				case"selectUniverseClick_ContextModel":
					keys6.selectUniverseClick_ContextModel();
					break;
				case"selectSchemaLstVisible_ContextModel":
					keys6.selectSchemaLstVisible_ContextModel();
					break;
				case"selectSchemaLstEnable_ContextModel":
					keys6.selectSchemaLstEnable_ContextModel();
					break;
				case"contextNameTxtVisible_ContextModel":
					keys6.contextNameTxtVisible_ContextModel();
					break;
				case"contextNameTxtEnable_ContextModel":
					keys6.contextNameTxtEnable_ContextModel();
				case"contextDescriptionTxtVisible_ContextModel":
					keys6.contextDescriptionTxtVisible_ContextModel();
					break;
				
				case"contextDescriptionTxtEnable_ContextModel":
					keys6.contextDescriptionTxtEnable_ContextModel();
					break;
				case"sourceAttributeTypeLstVisible_ContextModel":
					keys6.sourceAttributeTypeLstVisible_ContextModel();
					break;
				case"sourceAttributeTypeLstEnable_ContextModel":
					keys6.sourceAttributeTypeLstEnable_ContextModel();
					break;
				//case"clickSourceattribute1":
					//keys2.clickSourceattribute1();
					//break;
				case"sourceConditionTypeLstVisible_ContextModel":
					keys6.sourceConditionTypeLstVisible_ContextModel();
					break;
				case"sourceConditiontypeLstEnable_ContextModel":
					keys6.sourceConditiontypeLstEnable_ContextModel();
					break;
				case"clickSourceCondition1":
					keys6.sourceConditionClick_ContextModel();
					break;
				case"destinationAttributeTypeLstVisible_ContextModel":
					keys6.destinationAttributeTypeLstVisible_ContextModel();
					break;
				case"destinationAttributeTypeLstEnable_ContextModel":
					keys6.destinationAttributeTypeLstEnable_ContextModel();
					break;
				//case"clickDestinationattribute1":
					//keys2.clickDestinationattribute1();
					//break;
				case"scheduleTypeLstVisible_ContextModel":
					keys6.scheduleTypeLstVisible_ContextModel();
					break;
				case"schudleTypeLstEnable_ContextModel":
					keys6.schudleTypeLstEnable_ContextModel();
					break;
				case"aclButtonVisible_ContextModel":
					keys6.aclButtonVisible_ContextModel();
					break;
				case"aclButtonEnable_ContextModel":
					keys6.aclButtonEnable_ContextModel();
					break;
				case"aclBtnClick_ContextModel":
					keys6.aclBtnClick_ContextModel();
					break;
				
				case"readAcessLstVisible_ContextType":
					keys6.readAcessLstVisible_ContextType();
					break;
				case"readAccessLstEnable_ContextModel":
					keys6.readAccessLstEnable_ContextModel();
					break;
				case"discardBtnVisible_ContextModel":
					keys6.discardBtnVisible_ContextModel();
					break;
				
				case"discardBtnEnable_ContextModel":
					keys6.discardBtnEnable_ContextModel();
					break;
				case"saveBtnVisible_ContextModel":
					keys6.saveBtnVisible_ContextModel();
					break;
				case"saveBtnEnable_ContextModel":
					keys6.saveBtnEnable_ContextModel();
					break;
				case "IngestAdd":
					keys7.addBtnVisible_DataIngest();
					break;
				case "EnableIngestAdd":
					keys7.addBtnEnable_DataIngest();
					break;
				case "IngestClickAdd":
					keys7.addBtnClick_DataIngest();
					break;
				case "constructdropdown":
					keys7.constructLstVisible_DataIngest();
					break;
				case "enableconstuctdropdown":
					keys7.constuctLstEnable_DataIngest();
					break;
				case "clickconstructdropdown":
					keys7.constructLstClick_DataIngest();
					break;
				/*case "contructsdropdown":
					inject.contructsdropdown();
					break;
				case "DataIngestpresent":
					inject.DataIngestpresent();
					break;*/
				case "dropdownclick":
					keys7.lstClick_DataIngest();
					break;
				/*case "DataIngestconstructvisible":
					inject.DataIngestconstructvisible();
					break;
				case "ClickDataIngestconstruct":
					inject.ClickDataIngestconstruct();
					break;*/
				case "Infovisible":
					keys7.infoBtnVisible_DataIngest();
					break;
				case "Infoenable":
					keys7.infoBtnEnable_DataIngest() ;
					break;
				case "Selectuniversevisible":
					keys7.selectUniverseVisible_DataIngest();
					break;
				case "enableuniverse":
					keys7.selectUniverseEnable_DataIngest();
					break;
				case "Clickselectuniverse":
					keys7.selectUniverseClick_DataIngest();
					break;
				case "IngestionNamevisible":
					keys7.ingestionNameTxtVisible_DataInjest();
					break;
				case "enableIngestionName":
					keys7.ingestionNameTxtEnable_DataIngest();
					break;
				case "IngestionDescriptionvisible":
					keys7.ingestionDescriptionTxtVisible_DataIngest();
					break;
				case "enableIngestionDescription":
					keys7.ingestionDescriptionTxtEnable_DataIngest();
					break;
				case "ConfigurationNamevisible":
					keys7.configurationNameTxtVisible_DataIngest();
					break;
				case "enableConfigurationName":
					keys7.configurationNameTxtEnable_DataIngest();
					break;
				case "ConfigurationDescriptionvisible":
					keys7.configurationDescriptionTxtVisible_DataIngest() ;
					break;
				case "enableConfigurationDescription":
					keys7.configurationDescriptionTxtEnable_DataIngest();
					break;
				case "SelectSourcevisible":
					keys7.selectSourceVisible_DataIngest();
					break;
				case "enableselectsource":
					keys7.selectSourceEnable_DataIngest();
					break;
				case "Clickselectsource":
					keys7.selectSourceClick_DataIngest();
					break;
				case "ConfigureSourceMappingvisible":
					keys7.configureSourceMappingvisible_DataIngest();
					break;
				case "ConfigureSourceMappingselected":
					keys7.configureSourceMappingSelected_DataIngest();
					break;
				case "CreateNewEnityvisible":
					keys7.createNewEnityVisible_DataIngest();
					break;
				case "CreateNewEnityselected":
					keys7. createNewEnitySelected_DataIngest();
					break;
				case "ConfigureSourceMappingLinkvisible":
					keys7.configureSourceMappingLinkVisible_DataIngest();
					break;
				case "ConfigureSourceMappingLinkenable":
					keys7.configureSourceMappingLinkEnable_DataIngest();
					break;
				case "ScheduleJobTypevisible":
					keys7.scheduleJobTypeVisible_DataIngest();
					break;
				case "enableScheduleJobType":
					keys7.scheduleJobTypeEnable_DataIngest();
					break;
				case "ClickScheduleJobType":
					keys7.scheduleJobTypeClick_DataIngest();
					break;
				case "ACLvisible":
					keys7.aclvisible_DataIngest();
					break;
				case "ACLenable":
					keys7.aclEnable_DataIngest() ;
					break;
				case "DiscardButtonVisible":
					keys7. discardBtnVisible_DataIngest();
					break;
				case "DiscardButtonEnable":
					keys7.discardBtnEnable_DataIngest();
					break;
				case "SaveButtonVisible":
					keys7.saveBtnVisible_DataIngest();
					break;
				case "SaveButtonEnable":
					keys7.saveBtnEnable_DataIngest();
					break;
					
				case "Click on add button":
				    keys8.addBtn_EntityModel();
					break;	
				case "Click on EntityModel":
					keys8.selectConstruct_EntityModel();
					break;	
				case "Select Universe__Entity Model Creation":
					keys8.selectUniverse_EntityModel();
					break;	
				case "Enter a name of  an Entity Model":
					keys8.txtboxEnterEntityModelName();
					break;
				case "Enter entity description":
					keys8.txtboxEnterEntityModelDescription_EntityModel();
					break;
				case "Upload File":
					keys8.iconUplodefile();
					break;
				case "Enter a atrribute name":
					keys8.txtboxEnterAttributeName();
					break;
					
				case "Enter a default value":
					keys8 .txtboxEnterDefaultValue();
					break;
				case "Select required value":
					keys8.dropdownRequiredValue();
					break;
				
				case "Select data type":
					keys8.dropdownDataType();
					break;
				case "Primary key selection":
					keys8.dropdownPrimaryKey();
					break;
				case "click on ACL button":
					keys8.btnACL();
					break;
					
				case "Entity model read access ":
					keys8.entityModelReadAccess();
					break;
					
				case "Data read access":
					keys8.dropDownDataReadAccess();
					break;
				case "Data write access":
					keys8.dataWriteAccess();
					
					break;
				case "visiblity access":
					keys8.dataWriteAccess();
					break;
				case "Click on Save Button":
					keys8.saveBtn_EntityModel();
					break;
//				case "Click On Discard Button":
//					Ec.BtnDiscard();
//					break;
					
				
				case "Add Button":
					keys9.addBtn_GroupModel();
					break;
				
				case "Constructor Dropdown":
					keys9.constructorLst_GroupModel();
					break;
				case "Info Button":
					keys9.infoBtn_GroupModel();
					break;
				case"srchSelectUniverse_GroupModel":
					keys9.srchSelectUniverse_GroupModel();
					break;
				case "selectUniverseLst_GroupModel":
					keys9.selectUniverseLst_GroupModel();
					break;
				case"srchSelectSchema_GroupModel":
					keys9.srchSelectSchema_GroupModel();
					break;
				case "select Schema":
					keys9.selectSchemaLst_GroupModel();
				break;
			
				case "Group Name":
					keys9.groupNameTxt_GroupModel();
					break;
				case "Group Description":
					keys9.groupDescriptionTxt_GroupModel();
					break;
				case "Query Radiobutton":
					keys9.queryRadioBtn_GroupModel();
					break;
				case "Query":
					keys9.queryTxt_GroupModel();
					break;
				case "ACL Button":
					keys9.aclBtn_GroupModel();
					break;
				case "ACL dropdown":
					keys9.aclLst_GroupModel();
					break;
				case "Save":
					keys9.saveBtn_GroupModel();
					break;

					
				case"Click On Add Button-Big Query Creation":
					keys10.AddBtn();
					break;
					
				case "Click On Dropdown-Big Query Creation":
					keys10.bigQueryConstructDropdown();
					break;
				case"Click On Info Button-Big Query Creation":
					keys10.bigQueryInfoBtn();
					break;
					
				case "Click On Query Name TextBox":
					keys10.QueryNameTxt();
					break;
					
				case "Click On Query Description TextBox":
					keys10.queryDescriptionTxt();
					break;
					
				case "Click On Query TextBox":
					keys10.queryTxt();
					break;
					
				case "Click On Universe Dropdown":
					keys10.bigQueryUniverseDropdown();
					break;
				case "Enter Universe in DropDown SearhBox":
					keys10.bigQueryUniverseSearchBox();
					break;
				case "Click On Schema Dropdown":
					keys10.bigQuerySchemaDropdown();
					break;
				case "Select Schema in DropDown SearhBox":
					keys10.bigQuerySchemaSearchBox();
					break;
				case"Select Start Date DropDown":
					keys10.bigQueryStartdateDropDown();
					break;
				case"Select End Date Dropdown":
					keys10.bigQueryEnddateDropdown();
					break;
					
				case"Click on TimeZone Dropdown":
					keys10.bigQueryTimeZoneDropdown();
					break;
				
				case"Enter timezone in DropDown SearhBox":
					keys10.bigQueryTimeZoneSearchBox();
					break;
				
				case "Click On Frequency Dropdown":
					keys10.bigQueryFrequencyDropdown();
					break;
				
				case "Click on ACL Button":
					keys10.bigQueryAclBtn();
					break;
					
				case"Click on ReadAccess dropdown":
					keys10.bigQueryReadAccessDropDown();
					break;
				case "click on Visibility Access dropdown":
					keys10.bigQueryVisibilityAccess();
					break;
					
				case "Click On Save Button1":
					keys10.bigQuerySaveBtn();
					break;
					
				case "Click On Discard Button1":
					keys10.bigQueryDiscardBtn();
					break;
				
				case "Click On Add Button - Context":
					keys11.addBtn_Context();
					break;	
				case "Select construct dropdown - Context":
					keys11.selectConstructDropdown_Context();
					break;
				case "Select universe dropdown - Context":
					keys11.selectUniverseDropdown_Context();
					break;
				case "Info button - Context":
					keys11.infoBtn_Context();
					break;
				case "Select Entity - Context":
					keys11.selectEntityDropdown_Context();
					break;
				case "Context Name":
					keys11.contextNameTextBox();
					break;
				case "Context Description":
					keys11.contextDescriptionTextBox();
					break;	
				case "Source Condition Dropdown":
					keys11.sourceConditionDropdown();
					break;	
				case "Source Attribute Type Dropdown":
					keys11.sourceAttributeTypeDropdown();
					break;
					
				case "Destination Attribute Type Dropdown":
					keys11.destinationAttributeTypeDropdown();
					break;
				case "Schedule Type Dropdown":
					keys11.scheduleTypeDropdown();
					break;
				case "Add Rule Button":
					keys11.addRuleBtn();
					break;
				case "Close Rule Button":
					keys11.closeRuleBtn();
					break;
				case "ACL Button_Context Creation":
					keys11.aclBtn_Context();
					break;
				case "Read Access":
					keys11.readAccess_Context();
					break;
				case "Save Button":
					keys11.saveBtn_Context();
					break;
					
				case "Discard Button":
					keys11.discardBtn_Context();
					break;	
				
				case "Click on add":
					keys12.addBtn_DataIngest();
						break;
					case "Data Ingest":
						keys12.selectConstruct_DataIngest();
						break;
					case "SelectDataIngestDropDown":
						keys12.selectDataIngestDropDown();
						break;
					case "Info Button_Data Ingest Creation":
						keys12.infoBtn_DataIngest();
						break;
					case "Universe clicking":
						keys12.universeDropdown_DataIngest();
						break;
						
					case "searchBox":
						keys12.srchBox();
						break;


					case "Ingestion Name":
						keys12.IngestionNameTxtBox();
						break;
					case "Ingestion Description":
						keys12.IngestionDescriptionTxtBox();
						break;
					case "Configuration Name":
						keys12.configurationNameTxtBox();
						break;
					case "Configuration Description":
						keys12.configurationDescriptionTxtBox();
						break;
					case "Select Source":
						keys12.selectSourceDropdown();
						break;
					case "Upload File_Data Ingest Creation":
						keys12.fileUploadIcon();
						break;
					case "Shedule Job Type":
						keys12.sheduleJobType();
						break;
					case "Save Data Ingest Creation":
						keys12.save_DataIngest();
						break;
				}
		
			
		 }
	   }
	}
	
	public static void captureScreenshot(WebDriver driver) {
        // Capture the screenshot and add it to the ExtentReports log
        if (driver instanceof TakesScreenshot) {
            TakesScreenshot screenshotDriver = (TakesScreenshot) driver;
            String screenshotBase64 = screenshotDriver.getScreenshotAs(OutputType.BASE64);
            test.log(LogStatus.INFO, "Screenshot:",
                    test.addBase64ScreenShot("data:image/png;base64," + screenshotBase64));
        }
    } 
	
	 public static String getDataFromExcel(String sheetName, int rowNum, int colNum) throws Exception
	  {
		FileInputStream fi= new FileInputStream("data/testData.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet(sheetName);
		DataFormatter df=new DataFormatter();
		String data=df.formatCellValue(ws.getRow(rowNum).getCell(colNum));
		return data;
	  }



	static ExtentTest test;
	static ExtentReports report;

	@BeforeClass
	public static void startTest() {
		Date d = new Date();
		String fileName = d.toString().replace(":", "_").replace(" ", "_") + ".html";
		report1 = "PI UI Automation test report_" + fileName;
		System.out.println(report1);
		report = new ExtentReports(System.getProperty("user.dir") + "" + report1);

		report = new ExtentReports(System.getProperty("user.dir") + "/" + report1);

	}

	@AfterClass
	public static void endTest() throws IOException {
		// End the test and generate the report
		report.endTest(test);
		report.flush();

		//try {
			//Sendmail.sendTestReportEmail();

		//} catch (EmailException e) {
		//	e.printStackTrace();
		//}

	}
}


