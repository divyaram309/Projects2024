package entityModels;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.LogStatus;

public class LoginAndDashboardFunctionality extends MyRunner{
	
	public void mobiusLogoVisibility() throws InterruptedException
	{
	    test=report.startTest("PI_mobius logo visiblity");	
	    boolean blnMobiusIcon =driver.findElement(By.xpath("//img[@class='Mobius-logo']")).isDisplayed();
	    System.out.println(blnMobiusIcon);
	    if(blnMobiusIcon)
		{
			test.log(LogStatus.PASS, "Mobius logo is visible");
			captureScreenshot(driver);
		}
	    else 
		{
			test.log(LogStatus.FAIL, "Mobius logo is not visible");
			captureScreenshot(driver);
		}
	}
	
 public void userNameLblVisibility()
 {
	 test=report.startTest("PI_username field visiblity");
	 boolean blnLblUsername = driver.findElement(By.xpath("//input[@placeholder='Enter username']")).isDisplayed();
		System.out.println(blnLblUsername);
		if(blnLblUsername)
		{
			test.log(LogStatus.PASS, "Username field is visible");
			captureScreenshot(driver);
		}else 
		{
			test.log(LogStatus.FAIL, "Username field is not visible");
			captureScreenshot(driver);
		}
 }
 
 public void userNameLblClickability()
 {
	 test=report.startTest("PI_username field enabled");
	 boolean blnLblUsername2 = driver.findElement(By.xpath("//input[@placeholder='Enter username']")).isEnabled();
		System.out.println(blnLblUsername2);
		if(blnLblUsername2)
		{
			test.log(LogStatus.PASS, "Username field is enabled");
			captureScreenshot(driver);
		}else 
		{
			test.log(LogStatus.FAIL, "Username field is not enabled");
			captureScreenshot(driver);
		}
 }
 
 public void passwordLblVisibility()
 {
	 test=report.startTest("PI_password field visiblity");
	 boolean blnLblPassword = driver.findElement(By.xpath("//input[@placeholder='Enter password']")).isDisplayed();
	 System.out.println(blnLblPassword);
	 if(blnLblPassword)
		{
			test.log(LogStatus.PASS, "Password field is visible");
			captureScreenshot(driver);
		}
	 else 
		{
			test.log(LogStatus.FAIL, "Password field is not visible");
			captureScreenshot(driver);
		}
		
 }
 
 public void passwordLblClickability()
 {
	 test=report.startTest("PI_password field enabled");
	 boolean blnLblPassword2 = driver.findElement(By.xpath("//input[@placeholder='Enter password']")).isEnabled();
		System.out.println(blnLblPassword2);
		if(blnLblPassword2)
		{
			test.log(LogStatus.PASS, "Password field is enabled");
			captureScreenshot(driver);
		}else 
		{
			test.log(LogStatus.FAIL, "Password field is not enabled");
			captureScreenshot(driver);
		}
 }
 
 public void rememberMeChkVisibility()
 {
	 test=report.startTest("PI_rememberme checkbox visiblity");
	 boolean blnChkRememberMe = driver.findElement(By.xpath("//span[text()=' Remember me ']")).isDisplayed();
		System.out.println(blnChkRememberMe);
		if(blnChkRememberMe)
		{
			test.log(LogStatus.PASS, "Rememberme checkbox is visible");
			captureScreenshot(driver);
		}
	 else 
		{
			test.log(LogStatus.FAIL, "Rememberme checkbox is not visible");
			captureScreenshot(driver);
		}
 }
 
 public void rememberMeChkClickability()
 {
	 test=report.startTest("PI_rememberme checkbox enabled");
	 boolean blnChkRememberMe2 = driver.findElement(By.xpath("//span[text()=' Remember me ']")).isDisplayed();
		System.out.println(blnChkRememberMe2);
		if(blnChkRememberMe2)
		{
			test.log(LogStatus.PASS, "Rememberme checkbox is enabled");
			captureScreenshot(driver);
		}
	 else 
		{
			test.log(LogStatus.FAIL, "Rememberme checkbox is not enabled");
			captureScreenshot(driver);
		}
 }
 
 public void forgotPasswordlnkVisibility()
 {
	 test=report.startTest("PI_forgot password link visiblity");
	 boolean blnLnkForgotPassword = driver.findElement(By.xpath("//a[text()='Forgot password']")).isDisplayed();
		System.out.println(blnLnkForgotPassword);
		if(blnLnkForgotPassword)
		{
			test.log(LogStatus.PASS, "Forgot password link is visible");
			captureScreenshot(driver);
		}
	 else 
		{
			test.log(LogStatus.FAIL, "Forgot password link is not visible");
			captureScreenshot(driver);
		}
 }
 
 public void forgotPasswordlnkClickability()
 {
	 test=report.startTest("PI_forgot password link enabled");
	 boolean blnLnkForgotPassword2 = driver.findElement(By.xpath("//a[text()='Forgot password']")).isDisplayed();
		System.out.println(blnLnkForgotPassword2);
		if(blnLnkForgotPassword2)
		{
			test.log(LogStatus.PASS, "Forgot password link is enabled");
			captureScreenshot(driver);
		}
	 else 
		{
			test.log(LogStatus.FAIL, "Forgot password link is not enabled");
			captureScreenshot(driver);
		}
 }
 
 public void loginBtnVisibility()
 {
	 test=report.startTest("PI_login button visiblity");
	 boolean blnBtnLogin = driver.findElement(By.xpath("//input[@value='Login']")).isDisplayed();
		System.out.println(blnBtnLogin);
		if(blnBtnLogin)
		{
			test.log(LogStatus.PASS, "Login button is visible");
			captureScreenshot(driver);
		}
	 else 
		{
			test.log(LogStatus.FAIL, "Login button is not visible");
			captureScreenshot(driver);
		}

 }
 
 public void loginBtnClickability()
 {
	 test=report.startTest("PI_login button enabled");
	 boolean blnBtnLogin2 = driver.findElement(By.xpath("//input[@value='Login']")).isDisplayed();
		System.out.println(blnBtnLogin2);
		if(blnBtnLogin2)
		{
			test.log(LogStatus.PASS, "Login button is enabled");
			captureScreenshot(driver);
		}
	 else 
		{
			test.log(LogStatus.FAIL, "Login button is not enabled");
			captureScreenshot(driver);
		}
 }
 
 public void registerNowLnkVisibility()
 {
	 test=report.startTest("PI_registernow_visiblity");
	 boolean blnLnkRegisterNow = driver.findElement(By.xpath("//a[text()='Register Now']")).isDisplayed();
		System.out.println(blnLnkRegisterNow);
		if(blnLnkRegisterNow)
		{
			test.log(LogStatus.PASS, "Register now link is visible");
			captureScreenshot(driver);
		}
	 else 
		{
			test.log(LogStatus.FAIL, "Register now link is not visible");
			captureScreenshot(driver);
		}
 }
 
 public void registerNowLnkClickability()
 {
	 test=report.startTest("PI_registernow enabled");
	 boolean blnLnkRegisterNow2 = driver.findElement(By.xpath("//a[text()='Register Now']")).isDisplayed();
		System.out.println(blnLnkRegisterNow2);
		if(blnLnkRegisterNow2)
		{
			test.log(LogStatus.PASS, "Register now link is enabled");
			captureScreenshot(driver);
		}
	 else 
		{
			test.log(LogStatus.FAIL, "Register now link is not enabled");
			captureScreenshot(driver);
		}
 }
 
 public void numberOfLinks()
 {
	 test=report.startTest("PI_links available");
	 int intLinks =driver.findElements(By.tagName("a")).size();
	 System.out.println(intLinks);
	test.log(LogStatus.PASS, "Number of links fetched successfully");
	captureScreenshot(driver);
 }
 
 public void loginSuccessMsg() throws InterruptedException
 {
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 test=report.startTest("PI_login success message visiblity");
	 boolean blnMsgLoginSuccess = driver.findElement(By.xpath("//body/app-root[1]/app-toaster[1]/div[1]/div[1]/app-toast[1]/div[1]/div[1]/div[1]/p[2]")).isDisplayed();
	 if(blnMsgLoginSuccess)
	 {
	 test.log(LogStatus.PASS, "Login success message is displayed");
	 captureScreenshot(driver);
	 }
	 else
	 {
		 test.log(LogStatus.FAIL, "Login success message is not displayed");
		 captureScreenshot(driver);
	 }

 }
 
 public void piLogoVisibility()
	{
	    test=report.startTest("PI_logo visiblity");
		boolean blnPiLogo =driver.findElement(By.xpath("//img[@class='pi-img']")).isDisplayed();
		System.out.println(blnPiLogo);
		if(blnPiLogo)
		{
			test.log(LogStatus.PASS, "PI logo is visible");
			captureScreenshot(driver);
		}
	 else 
		{
			test.log(LogStatus.FAIL, "PI logo is not visible");
			captureScreenshot(driver);
		}
	} 
 
 public void piTextVisibility()
	{
	    test=report.startTest("PI_logo visiblity");
		boolean blnPiText =driver.findElement(By.xpath("//span[text()='PI']")).isDisplayed();
		System.out.println(blnPiText);
		if(blnPiText)
		{
			test.log(LogStatus.PASS, "PI text is visible");
			captureScreenshot(driver);
		}
	 else 
		{
			test.log(LogStatus.FAIL, "PI text is not visible");
			captureScreenshot(driver);
		}
	}
 
 public void universeBtnVisibility()
 {
	 test=report.startTest("PI_universe button visiblity");
		boolean blnBtnUniverse = driver.findElement(By.xpath("//span[text()='Universe']")).isDisplayed();
		System.out.println(blnBtnUniverse);
		if(blnBtnUniverse)
		{
			test.log(LogStatus.PASS, "Universe button is visible");
			captureScreenshot(driver);
		}
	    else 
		{
			test.log(LogStatus.FAIL, "Universe button is not visible");
			captureScreenshot(driver);
		}
 }
 
 public void universeBtnClickability()
 {
	 test=report.startTest("PI_universe button enabled");
		boolean blnBtnUniverse2 = driver.findElement(By.xpath("//span[text()='Universe']")).isEnabled();
		System.out.println(blnBtnUniverse2);
		if(blnBtnUniverse2)
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
 
 public void entityBtnVisibility()
 {
	 test=report.startTest("PI_entity button visiblity");
		boolean blnBtnEntity = driver.findElement(By.xpath("//span[text()='Universe']")).isDisplayed();
		System.out.println(blnBtnEntity);
		if(blnBtnEntity)
		{
			test.log(LogStatus.PASS, "Entity button is visible");
			captureScreenshot(driver);
		}
	    else 
		{
			test.log(LogStatus.FAIL, "Entity button is not visible");
			captureScreenshot(driver);
		}
 }
 
 public void entityBtnClickability()
 {
	 test=report.startTest("PI_entity button enabled");
		boolean blnBtnEntity2 = driver.findElement(By.xpath("//span[text()='Universe']")).isEnabled();
		System.out.println(blnBtnEntity2);
		if(blnBtnEntity2)
		{
			test.log(LogStatus.PASS, "Entity button is enabled");
			captureScreenshot(driver);
		}
	    else 
		{
			test.log(LogStatus.FAIL, "Entity button button is not enabled");
			captureScreenshot(driver);
		}
 }
 
 public void groupsBtnVisibility()
 {
	 test=report.startTest("PI_groups button visiblity");
		boolean blnBtnGroups = driver.findElement(By.xpath("//span[text()='Groups']")).isDisplayed();
		System.out.println(blnBtnGroups);
		if(blnBtnGroups)
		{
			test.log(LogStatus.PASS, "Groups button is visible");
			captureScreenshot(driver);
		}
	    else 
		{
			test.log(LogStatus.FAIL, "Groups button is not visible");
			captureScreenshot(driver);
		}
 }
 
 public void groupsBtnClickability()
 {
	 test=report.startTest("PI_entity button enabled");
		boolean blnBtnGroups2 = driver.findElement(By.xpath("//span[text()='Groups']")).isEnabled();
		System.out.println(blnBtnGroups2);
		if(blnBtnGroups2)
		{
			test.log(LogStatus.PASS, "Entity button is enabled");
			captureScreenshot(driver);
		}
	    else 
		{
			test.log(LogStatus.FAIL, "Enity button is not enabled");
			captureScreenshot(driver);
		}
 }
 
 public void bigQueriesBtnVisibility()
 {
	 test=report.startTest("PI_big queries button visiblity");
		boolean blnBtnBigQueries = driver.findElement(By.xpath("//span[text()='Big Queries']")).isDisplayed();
		System.out.println(blnBtnBigQueries);
		if(blnBtnBigQueries)
		{
			test.log(LogStatus.PASS, "Big queries button is visible");
			captureScreenshot(driver);
		}
	    else 
		{
			test.log(LogStatus.FAIL, "Big queries button is not visible");
			captureScreenshot(driver);
		}
 }
 
 public void bigQueriesBtnClickability()
 {
	 test=report.startTest("PI_big queries button enabled");
		boolean blnBtnBigQueries2 = driver.findElement(By.xpath("//span[text()='Big Queries']")).isEnabled();
		System.out.println(blnBtnBigQueries2);
		if(blnBtnBigQueries2)
		{
			test.log(LogStatus.PASS, "Big queries button is enabled");
			captureScreenshot(driver);
		}
	    else 
		{
			test.log(LogStatus.FAIL, "Big queries button is not enabled");
			captureScreenshot(driver);
		}
 }
 
 public void visualisationsBtnVisibility()
 {
	 test=report.startTest("PI_visualisations button visiblity");
		boolean blnBtnVisualisations = driver.findElement(By.xpath("//span[text()='Visualisations']")).isDisplayed();
		System.out.println(blnBtnVisualisations);
		if(blnBtnVisualisations)
		{
			test.log(LogStatus.PASS, "Visualisations button is visible");
			captureScreenshot(driver);
		}
	    else 
		{
			test.log(LogStatus.FAIL, "Visualisations button is not visible");
			captureScreenshot(driver);
		}
 }
 
 public void visualisationsBtnClickability()
 {
	 test=report.startTest("PI_visualisation button enabled");
		boolean blnBtnvisualisations2 = driver.findElement(By.xpath("//span[text()='Visualisations']")).isEnabled();
		System.out.println(blnBtnvisualisations2);
		if(blnBtnvisualisations2)
		{
			test.log(LogStatus.PASS, "Visualisations button is enabled");
			captureScreenshot(driver);
		}
	    else 
		{
			test.log(LogStatus.FAIL, "Visualisations button is not enabled");
			captureScreenshot(driver);
		}
 }
 
 public void contextsBtnVisibility()
 {
	 test=report.startTest("PI_contexts button visiblity");
		boolean blnBtnContext = driver.findElement(By.xpath("//span[text()='Contexts']")).isDisplayed();
		System.out.println(blnBtnContext);
		if(blnBtnContext)
		{
			test.log(LogStatus.PASS, "Contexts button is visible");
			captureScreenshot(driver);
		}
	    else 
		{
			test.log(LogStatus.FAIL, "Contexts button is not visible");
			captureScreenshot(driver);
		}
 }
 
 public void contextsBtnClickability()
 {
	 test=report.startTest("PI_contexts button enabled");
		boolean blnBtnContext2 = driver.findElement(By.xpath("//span[text()='Contexts']")).isEnabled();
		System.out.println(blnBtnContext2);
		if(blnBtnContext2)
		{
			test.log(LogStatus.PASS, "Contexts button is enabled");
			captureScreenshot(driver);
		}
	    else 
		{
			test.log(LogStatus.FAIL, "Contexts button is not enabled");
			captureScreenshot(driver);
		}
 }
 
 public void engagaementsBtnVisibility()
 {
	 test=report.startTest("PI_engagements button visiblity");
		boolean blnBtnEngagements = driver.findElement(By.xpath("//span[text()='Engagements']")).isDisplayed();
		System.out.println(blnBtnEngagements);
		if(blnBtnEngagements)
		{
			test.log(LogStatus.PASS, "Engagements button is visible");
			captureScreenshot(driver);
		}
	    else 
		{
			test.log(LogStatus.FAIL, "Engagements button is not visible");
			captureScreenshot(driver);
		}
 }
 
 public void engagaementsBtnClickability()
 {
	 test=report.startTest("PI_engagements button enabled");
		boolean blnBtnEngagements2 = driver.findElement(By.xpath("//span[text()='Engagements']")).isEnabled();
		System.out.println(blnBtnEngagements2);
		if(blnBtnEngagements2)
		{
			test.log(LogStatus.PASS, "Engagements button is enabled");
			captureScreenshot(driver);
		}
	    else 
		{
			test.log(LogStatus.FAIL, "Engagements button is not enabled");
			captureScreenshot(driver);
		}
 }
 
 public void dataIngestsBtnVisibility()
 {
	 test=report.startTest("PI_data ingests button visiblity");
		boolean blnBtnDataIngests = driver.findElement(By.xpath("//span[text()='Data Ingests']")).isDisplayed();
		System.out.println(blnBtnDataIngests);
		if(blnBtnDataIngests)
		{
			test.log(LogStatus.PASS, "Data ingests button is visible");
			captureScreenshot(driver);
		}
	    else 
		{
			test.log(LogStatus.FAIL, "Data ingests button is not visible");
			captureScreenshot(driver);
		}
 }
 
 public void dataIngestsBtnClickability()
 {
	 test=report.startTest("PI_data ingests button enabled");
		boolean blnBtnDataIngests2 = driver.findElement(By.xpath("//span[text()='Data Ingests']")).isEnabled();
		System.out.println(blnBtnDataIngests2);
		if(blnBtnDataIngests2)
		{
			test.log(LogStatus.PASS, "Data ingests button is enabled");
			captureScreenshot(driver);
		}
	    else 
		{
			test.log(LogStatus.FAIL, "Data ingests button is not enabled");
			captureScreenshot(driver);
		}
 }
 
 public void logoutBtnVisibility()
 {
	 test=report.startTest("PI_logout button visiblity");
	  Actions act = new Actions(driver);
	    WebElement moveToPiLogo = driver.findElement(By.xpath("//span[text()='PI']"));
	    act.moveToElement(moveToPiLogo).perform();
		boolean blnBtnLogout = driver.findElement(By.xpath("//span[text()=' Logout ']")).isDisplayed();
		System.out.println(blnBtnLogout);
		if(blnBtnLogout)
		{
			test.log(LogStatus.PASS, "Logout button is visible");
			captureScreenshot(driver);
		}
	    else 
		{
			test.log(LogStatus.FAIL, "Logout button is not visible");
			captureScreenshot(driver);
		}
 }
 
 public void logoutBtnClickability()
 {
	 test=report.startTest("PI_Logout button enabled");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		boolean blnBtnLogout2 = driver.findElement(By.xpath("//span[@class='logout']")).isEnabled();
		System.out.println(blnBtnLogout2);
		if(blnBtnLogout2)
		{
			test.log(LogStatus.PASS, "Logout button is enabled");
			captureScreenshot(driver);
		}
	    else 
		{
			test.log(LogStatus.FAIL, "Logout button is not enabled");
			captureScreenshot(driver);
		}
 }
		
		public void annotateBtnVisibility()
		 {
			 test=report.startTest("PI_annotate button visiblity");
				boolean blnBtnAnnotate = driver.findElement(By.xpath("//img[@src='../../assets/images/anotate.svg']")).isDisplayed();
				System.out.println(blnBtnAnnotate);
				if(blnBtnAnnotate)
				{
					test.log(LogStatus.PASS, "Annotate button is visible");
					captureScreenshot(driver);
				}
			    else 
				{
					test.log(LogStatus.FAIL, "Annotate button is not visible");
					captureScreenshot(driver);
				}
		 }
		
		 public void annotateBtnClickability()
		 {
			 test=report.startTest("PI_annotate button enabled");
				boolean blnBtnAnnotate2 = driver.findElement(By.xpath("//img[@src='../../assets/images/anotate.svg']")).isEnabled();
				System.out.println(blnBtnAnnotate2);
				if(blnBtnAnnotate2)
				{
					test.log(LogStatus.PASS, "Annotate button is enabled");
					captureScreenshot(driver);
				}
			    else 
				{
					test.log(LogStatus.FAIL, "Annotate button is not enabled");
					captureScreenshot(driver);
				}
		 }
		 
		 public void dataBtnVisibility()
		 {
			 test=report.startTest("PI_data/metadata preview button visiblity");
				boolean blnBtnData = driver.findElement(By.xpath("//img[@src='../../assets/images/Book Close 4.svg']")).isDisplayed();
				System.out.println(blnBtnData);
				if(blnBtnData)
				{
					test.log(LogStatus.PASS, "Data/metadata preview button is visible");
					captureScreenshot(driver);
				}
			    else 
				{
					test.log(LogStatus.FAIL, "Data/metadata preview button is not visible");
					captureScreenshot(driver);
				}
		 }
		 
		 public void dataBtnClickability()
		 {
			 test=report.startTest("PI_data/metadata preview button enabled");
				boolean blnBtnData2 = driver.findElement(By.xpath("//img[@src='../../assets/images/Book Close 4.svg']")).isEnabled();
				System.out.println(blnBtnData2);
				if(blnBtnData2)
				{
					test.log(LogStatus.PASS, "Data/metadata preview button is enabled");
					captureScreenshot(driver);
				}
			    else 
				{
					test.log(LogStatus.FAIL, "Data/metadata preview button is not enabled");
					captureScreenshot(driver);
				}
		 }
		 
		 public void playBtnVisibility()
		 {
			 test=report.startTest("PI_play button visiblity");
				boolean blnBtnPlay = driver.findElement(By.xpath("//div[@class='pauseplay clear']")).isDisplayed();
				System.out.println(blnBtnPlay);
				if(blnBtnPlay)
				{
					test.log(LogStatus.PASS, "Play button is visible");
					captureScreenshot(driver);
				}
			    else 
				{
					test.log(LogStatus.FAIL, "Play button is not visible");
					captureScreenshot(driver);
				}
		 }
		 
		 
		 public void playBtnClickability()
		 {
			 test=report.startTest("PI_play button enabled");
				boolean blnBtnPlay2 = driver.findElement(By.xpath("//div[@class='pauseplay clear']")).isEnabled();
				System.out.println(blnBtnPlay2);
				if(blnBtnPlay2)
				{
					test.log(LogStatus.PASS, "Play button is enabled");
					captureScreenshot(driver);
				}
			    else 
				{
					test.log(LogStatus.FAIL, "Play button is not enabled");
					captureScreenshot(driver);
				}
		 }
		 
		 public void timelineBtnVisibility()
		 {
			 test=report.startTest("PI_timeline view button visiblity");
				boolean blnBtntimeline = driver.findElement(By.xpath("//img[@src='../../assets/images/timerlogo.svg']")).isDisplayed();
				System.out.println(blnBtntimeline);
				if(blnBtntimeline)
				{
					test.log(LogStatus.PASS, "Timeline view button is visible");
					captureScreenshot(driver);
				}
			    else 
				{
					test.log(LogStatus.FAIL, "Timeline view button is not visible");
					captureScreenshot(driver);
				}
		 }
		 
		 public void timelineBtnClickability()
		 {
			 test=report.startTest("PI_timeline view button enabled");
				boolean blnBtntimeline2 = driver.findElement(By.xpath("//img[@src='../../assets/images/timerlogo.svg']")).isEnabled();
				System.out.println(blnBtntimeline2);
				if(blnBtntimeline2)
				{
					test.log(LogStatus.PASS, "Timeline view button is enabled");
					captureScreenshot(driver);
				}
			    else 
				{
					test.log(LogStatus.FAIL, "Timeline view button is not enabled");
					captureScreenshot(driver);
				}
		 }
		 
		 public void openAiBtnVisibility()
		 {
			 test=report.startTest("PI_openAI button visiblity");
				boolean blnBtnopenai = driver.findElement(By.xpath("//img[@src='../../assets/images/ai.svg']")).isDisplayed();
				System.out.println(blnBtnopenai);
				if(blnBtnopenai)
				{
					test.log(LogStatus.PASS, "OpenAI button is visible");
					captureScreenshot(driver);
				}
			    else 
				{
					test.log(LogStatus.FAIL, "OpenAI button is not visible");
					captureScreenshot(driver);
				}
		 }
		 
		 public void openAiBtnClickability()
		 {
			 test=report.startTest("PI_openAI button enabled");
				boolean blnBtnopenai2 = driver.findElement(By.xpath("//img[@src='../../assets/images/ai.svg']")).isEnabled();
				System.out.println(blnBtnopenai2);
				if(blnBtnopenai2)
				{
					test.log(LogStatus.PASS, "OpenAI button is enabled");
					captureScreenshot(driver);
				}
			    else 
				{
					test.log(LogStatus.FAIL, "OpenAI button is not enabled");
					captureScreenshot(driver);
				}
		 }
		 
		 public void serendipityBtnVisibility()
		 {
			 test=report.startTest("PI_serendipity button visiblity");
				boolean blnBtnSerendipity = driver.findElement(By.xpath("//img[@src='../../assets/images/visual.svg']")).isDisplayed();
				System.out.println(blnBtnSerendipity);
				if(blnBtnSerendipity)
				{
					test.log(LogStatus.PASS, "Serendipity button is visible");
					captureScreenshot(driver);
				}
			    else 
				{
					test.log(LogStatus.FAIL, "Serendipity button is not visible");
					captureScreenshot(driver);
				}
		 }
		 
		 public void serendipityBtnClickability()
		 {
			 test=report.startTest("PI_serendipity button enabled");
				boolean blnBtnSerendipity2 = driver.findElement(By.xpath("//img[@src='../../assets/images/visual.svg']")).isEnabled();
				System.out.println(blnBtnSerendipity2);
				if(blnBtnSerendipity2)
				{
					test.log(LogStatus.PASS, "Serendipity button is enabled");
					captureScreenshot(driver);
				}
			    else 
				{
					test.log(LogStatus.FAIL, "Serendipity button is not enabled");
					captureScreenshot(driver);
				}
		 }
		 
		 public void twoDOrThreeDBtnVisibility()
		 {
			 test=report.startTest("PI_2D/3D button visiblity");
				boolean blnBtnTwod = driver.findElement(By.xpath("//img[@src='../../assets/images/2dlogo.svg']")).isDisplayed();
				System.out.println(blnBtnTwod);
				if(blnBtnTwod)
				{
					test.log(LogStatus.PASS, "2D/3D button is visible");
					captureScreenshot(driver);
				}
			    else 
				{
					test.log(LogStatus.FAIL, "2D/3D button is not visible");
					captureScreenshot(driver);
				}
		 }
		 
		 public void twoDOrThreeDBtnClickability()
		 {
			 test=report.startTest("PI_2D/3D button enabled");
				boolean blnBtnTwod2 = driver.findElement(By.xpath("//img[@src='../../assets/images/2dlogo.svg']")).isEnabled();
				System.out.println(blnBtnTwod2);
				if(blnBtnTwod2)
				{
					test.log(LogStatus.PASS, "2D/3D button is enabled");
					captureScreenshot(driver);
				}
			    else 
				{
					test.log(LogStatus.FAIL, "2D/3D button is not enabled");
					captureScreenshot(driver);
				}
		 }
		 
		 public void infinityLogoVisibility()
		 {
			 test=report.startTest("PI_infinity button visiblity");
				boolean blnBtnInfinity = driver.findElement(By.xpath("//div[@class='listViews clear2']")).isDisplayed();
				System.out.println(blnBtnInfinity);
				if(blnBtnInfinity)
				{
					test.log(LogStatus.PASS, "Infinity button is visible");
					captureScreenshot(driver);
				}
			    else 
				{
					test.log(LogStatus.FAIL, "Infinity button is not visible");
					captureScreenshot(driver);
				}
		 }
		 
		 public void infinitylstClickability()
		 {
			 test=report.startTest("PI_infinity button enabled");
				boolean blnLstInfinity = driver.findElement(By.xpath("//div[@class='listViews clear2']")).isEnabled();
				System.out.println(blnLstInfinity);
				if(blnLstInfinity)
				{
					test.log(LogStatus.PASS, "Infinity button is enabled");
					captureScreenshot(driver);
				}
			    else 
				{
					test.log(LogStatus.FAIL, "Infinity button is not enabled");
					captureScreenshot(driver);
				}
		 }
		 
		 
		 public void fitToViewBtnVisibility()
		 {
			 test=report.startTest("PI_fit to view button visiblity");
				boolean blnBtnFitToView = driver.findElement(By.xpath("//img[@src='../../assets/images/capture.svg']")).isDisplayed();
				System.out.println(blnBtnFitToView);
				if(blnBtnFitToView)
				{
					test.log(LogStatus.PASS, "Fit to view button is visible");
					captureScreenshot(driver);
				}
			    else 
				{
					test.log(LogStatus.FAIL, "Fit to view button is not visible");
					captureScreenshot(driver);
				}
		 }
		 
		 public void fitToViewBtnClickability()
		 {
			 test=report.startTest("PI_fit to view button enabled");
				boolean blnBtnFitToView2 = driver.findElement(By.xpath("//img[@src='../../assets/images/capture.svg']")).isEnabled();
				System.out.println(blnBtnFitToView2);
				if(blnBtnFitToView2)
				{
					test.log(LogStatus.PASS, "Fit to view button is enabled");
					captureScreenshot(driver);
				}
			    else 
				{
					test.log(LogStatus.FAIL, "Fit to view button is not enabled");
					captureScreenshot(driver);
				}
		 }
		 
		 public void dragOpenBtnVisibility()
		 {
			 test=report.startTest("PI_drag button visiblity");
				boolean blnBtnDragOpen = driver.findElement(By.xpath("(//img[@class='drag-logoopen'])[1]")).isDisplayed();
				System.out.println(blnBtnDragOpen);
				if(blnBtnDragOpen)
				{
					test.log(LogStatus.PASS, "Drag button is visible");
					captureScreenshot(driver);
				}
			    else 
				{
					test.log(LogStatus.FAIL, "Drag button is not visible");
					captureScreenshot(driver);
				}
		 }
		 
		 public void dragOpenBtnClickability()
		 {
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 test=report.startTest("PI_drag button enabled");
			 
				boolean blnBtnDragOpen2 = driver.findElement(By.xpath("(//img[@class='drag-logoopen'])[1]")).isEnabled();
				System.out.println(blnBtnDragOpen2);
				if(blnBtnDragOpen2)
				{
					test.log(LogStatus.PASS, "Drag button is enabled");
					captureScreenshot(driver);
				}
			    else 
				{
					test.log(LogStatus.FAIL, "Drag button is not enabled");
					captureScreenshot(driver);
				}
				driver.quit();
		 }
		 
		
		 
}
