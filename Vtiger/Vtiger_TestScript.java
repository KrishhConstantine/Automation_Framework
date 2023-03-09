package Vtiger;

import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Vtiger_TestScript extends Vtiger_BaseClass{

	String Text;
	String email1;
	JavascriptExecutor scroll;
	String KeepText;
	Actions MouseAction;

	//VtHP01
	@Test
	public void Testcase1() {
		Reporter.log("Open Browser is Sucessfull",true);
	}

	//VtHP02
	@Test
	public void Testcase2() {
		pom.VtigerLogo.click();
	}

	//VtHP03
	@Test
	public void Testcase3() {
		PageFactory.initElements(driver, pom);
		Text = pom.CRMtext.getText();
		Reporter.log(Text,true);
	}

	//VtHP04
	@Test
	public void Testcase4() throws InterruptedException {
		scroll = (JavascriptExecutor)driver;
		scroll.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(5000);
		scroll.executeScript("window.scrollTo(0,0);");
	}

	//VtHP05
	@Test
	public void Testcase5() {
		scroll = (JavascriptExecutor)driver;
		scroll.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		pom.Playstoreicon.isDisplayed();

	}
	//VtHP06
	@Test
	public void Testcase6() {
		scroll = (JavascriptExecutor)driver;
		scroll.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		pom.Applestoreicon.isDisplayed();
	}
	//VtHP07
	@Test
	public void Testcase7() {
		KeepText = pom.KeepInTouch.getText();
		Reporter.log(KeepText,true);
	}
	//VtHP08
	@Test
	public void Testcase8() {
		boolean Sm = pom.SocialMediaIcons.isDisplayed();
		if (Sm==true) {
			Reporter.log("All Social Media Icons are visible",true);
		}
		else {
			Reporter.log("All Social Media Icons are not visible",true);
		}
	}
	//VtHP09
	@Test
	public void Testcase9() throws InterruptedException  {
		scroll = (JavascriptExecutor)driver;
		scroll.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		String Parentwindow = driver.getWindowHandle();
		Thread.sleep(5000);
		pom.FacebookIcon.click();
		pom.Twittericon.click();
		pom.Youtubeicon.click();
		pom.Linkedinicon.click();
		pom.Wikitiaicon.click();
		pom.Vtigerblogicon.click();
		Set<String> Multiplewindow = driver.getWindowHandles();
		for (String Mw : Multiplewindow) {
			if (!Parentwindow.equals(Mw)) {
				driver.switchTo().window(Mw);
				Thread.sleep(3000);
				driver.close();
			}
		}
	}
	//VtHP10
	@Test
	public void Testcase10() {
		pom.Vtigerchaticon.click();
	}
	//VtHP11
	@Test
	public void Testcase11() {
		boolean Ptext = pom.Productstext.isDisplayed();
		if (Ptext == true) {
			Reporter.log("Product text is visible",true);
		}
		else {
			Reporter.log("Product text is not visible",true);
		}
	}
	//VtHP12
	@Test
	public void Testcase12() {
		boolean Ptext = pom.Populartext.isDisplayed();
		if (Ptext == true) {
			Reporter.log("POPULAR text is visible",true);
		}
		else {
			Reporter.log("POPULAR text is not visible",true);
		}
	}
	//VtHP13
	@Test
	public void Testcase13() {
		boolean Stext = pom.SolutionText.isDisplayed();
		if (Stext==true) {
			Reporter.log("SOLUTIONS text is visible",true);
		}
		else {
			Reporter.log("SOLUTIONS text is not visible",true);
		}
	}
	//VtHP14
	@Test
	public void Testcase14() {
		boolean Stext = pom.ServicesText.isDisplayed();
		if (Stext==true) {
			Reporter.log("SERVICES text is visible",true);
		}
		else {
			Reporter.log("SERVICES text is not visible",true);
		}
	}
	//VtHP15
	@Test
	public void Testcase15() {
		boolean Rtext = pom.ResoursesText.isDisplayed();
		if (Rtext==true) {
			Reporter.log("RESOURSES text is visible",true);
		}
		else {
			Reporter.log("RESOURSES text is not visible",true);
		} 
	}
	//VtHP16
	@Test
	public void Testcase16() {
		boolean Otext = pom.OpensourceText.isDisplayed();
		if (Otext==true) {
			Reporter.log("OPEN SOURCE text is visible",true);
		}
		else {
			Reporter.log("OPEN SOURCE text is not visible",true);
		}
	}
	//VtHP17
	@Test
	public void Testcase17() {
		boolean Ctext = pom.BlazingfastUIText.isDisplayed();
		if (Ctext==true) {
			Reporter.log("Blazing fast UI text is visible",true);
		}
		else {
			Reporter.log("Blazing fast UI text is not visible",true);	
		}
	}
	//VtHP18
	@Test
	public void Testcase18() {
		boolean Otext = pom.OneviewText.isDisplayed();
		if (Otext==true) {
			Reporter.log("One View text is visible",true);
		}
		else {
			Reporter.log("One View text is not visible",true);
		}
	}
	//VtHP19
	@Test
	public void Testcase19() {
		boolean Ctext = pom.CalculcusAI.isDisplayed();
		if (Ctext==true) {
			Reporter.log("CalculcusAI text is visible",true);
		}
		else {
			Reporter.log("CalculcusAI text is not visible",true);
		}
	}
	//VtHP20
	@Test
	public void Testcase20() {
		boolean Ctext = pom.CompanyText.isDisplayed();
		if (Ctext==true) {
			Reporter.log("COMPANY is visible",true);
		}
		else {
			Reporter.log("COMPANY is not visible",true);
		}
	}
	//VtHP21
	@Test
	public void Testcase21() {
		boolean Ntext = pom.NewtoCRMText.isDisplayed();
		if (Ntext==true) {
			Reporter.log("NEW TO CRM? text is visible",true);
		}
		else {
			Reporter.log("NEW TO CRM? text is not visible",true);
		}
	}
	//VtHP22
	@Test
	public void Testcase22() {
		boolean Gtext = pom.GreatRSHtext.isDisplayed();
		if (Gtext==true) {
			Reporter.log("Great relationships start here text is visible",true);
		}
		else {
			Reporter.log("Great relationships start here text is not visible",true);
		}
	}
	//VtHP23
	@Test
	public void Testcase23() throws InterruptedException {
		scroll = (JavascriptExecutor)driver;
		scroll.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		email1 = prop.getProperty("emailid1");
		pom.Emailtextbox2.sendKeys(email1);
		Thread.sleep(5000);
	}
	//VtHP24
	@Test
	public void Testcase24() throws InterruptedException {
		email1 = prop.getProperty("emailid1");
		pom.Emailtextbox1.sendKeys(email1);
		Thread.sleep(5000);
	}
	//VtHP25
	@Test
	public void Testcase25() {
		String OItext = pom.OpensourceImagetext.getText();
		Reporter.log(OItext,true);
	}
	//VtHP26
	@Test
	public void Testcase26() {
		String WHMFtext = pom.WehavemanyFriendstext.getText();
		Reporter.log(WHMFtext,true);
	}
	//VtHP27
	@Test
	public void Testcase27() {
		String OCLtext = pom.OurclientLovesText.getText();
		Reporter.log(OCLtext,true);
	}
	//VtHP28
	@Test
	public void Testcase28() {
		String RLtext = pom.RecognizedLeadertext.getText();
		Reporter.log(RLtext,true);
	}
	//VtHP29
	//		@Test
	//		public void Testcase29() throws InterruptedException {
	//			MouseAction = new Actions(driver);
	//			Thread.sleep(3000);
	//			WebElement MA1 = driver.findElement(By.xpath("(//div[@class='card card-border shadow-dark shadow-light-lg lift lift-lg'])[1]"));
	//			Thread.sleep(3000);
	//			MouseAction.moveToElement(MA1).perform();
	//		}
	//	//VtHP30
	//		@Test
	//		public void Testcase30() throws InterruptedException {
	//			MouseAction = new Actions(driver);
	//			WebElement MA2 = driver.findElement(By.xpath("//p[contains(.,'G2 Leader - Fall')]"));
	//			Thread.sleep(3000);
	//			MouseAction.moveToElement(MA2).perform();
	//		}
	//	//	//VtHP31
	//		@Test
	//		public void Testcase31() {
	//			MouseAction = new Actions(driver);
	//			WebElement MA3 = driver.findElement(By.xpath("(//div[@class='card card-border shadow-dark shadow-light-lg lift lift-lg'])[3]"));
	//			MouseAction.moveToElement(MA3).perform();
	//		}
	//	//VtHP32
	//		@Test
	//		public void Testcase32() throws InterruptedException {
	//			MouseAction = new Actions(driver);
	//			WebElement MA4 = driver.findElement(By.xpath("//p[contains(.,'Capterra - Shortlist')]"));
	//			Thread.sleep(3000);
	//			MouseAction.moveToElement(MA4).perform();
	//		}
	//VtHP33
	@Test
	public void Testcase33() {
		scroll = (JavascriptExecutor)driver;
		scroll.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		WebElement Car1=pom.CarouselButton1;
	//	WebElement Car2 = pom.CarouselButton2;
		MouseAction.moveToElement(Car1).click().perform();
	}
	//VtHP34
	@Test
	public void Testcase34() throws InterruptedException {
		WebElement FSM = pom.FeaturesSM;
		MouseAction = new Actions(driver);
		MouseAction.moveToElement(FSM).perform();
		String FSM1 = FSM.getText();
		Reporter.log(FSM1,true);
		Thread.sleep(10000);
	}
	//VtHP35
    	@Test
        public void Testcase35() throws InterruptedException {
    		WebElement FSM = pom.FeaturesSM;
    		Actions MouseAction = new Actions(driver);
    		MouseAction.moveToElement(FSM).perform();
    		String FSM1 = FSM.getText();
    		Reporter.log(FSM1,true);
    		Thread.sleep(5000);
        	WebElement Sales = pom.Sales;
        	MouseAction.moveToElement(Sales).perform();
        	Thread.sleep(2000);
    }
    	//VtHP36
    	@Test
        public void Testcase36() throws InterruptedException {
    		WebElement FSM = pom.FeaturesSM;
    		Actions MouseAction = new Actions(driver);
    		MouseAction.moveToElement(FSM).perform();
    		String FSM1 = FSM.getText();
    		Reporter.log(FSM1,true);
    		Thread.sleep(5000);
    		WebElement Sales1 = pom.Sales1;
    		MouseAction.moveToElement(Sales1).perform();
    		Thread.sleep(2000);
    	}
    	//VtHP37
    	@Test
        public void Testcase37() throws InterruptedException {
    		WebElement FSM = pom.FeaturesSM;
    		Actions MouseAction = new Actions(driver);
    		MouseAction.moveToElement(FSM).perform();
    		String FSM1 = FSM.getText();
    		Reporter.log(FSM1,true);
    		Thread.sleep(5000);
    		WebElement Pipeline = pom.Pipeline;
    		MouseAction.moveToElement(Pipeline).perform();
    		Thread.sleep(2000);
    	}
    	//VtHP38
    	@Test
        public void Testcase38() throws InterruptedException {
    		WebElement FSM = pom.FeaturesSM;
    		Actions MouseAction = new Actions(driver);
    		MouseAction.moveToElement(FSM).perform();
    		String FSM1 = FSM.getText();
    		Reporter.log(FSM1,true);
    		Thread.sleep(5000);
    		WebElement Analytics = pom.Analytics;
    		MouseAction.moveToElement(Analytics).perform();
    		Thread.sleep(2000);
    	}
    	//VtHP39
    	@Test
        public void Testcase39() throws InterruptedException {
    		WebElement FSM = pom.FeaturesSM;
    		Actions MouseAction = new Actions(driver);
    		MouseAction.moveToElement(FSM).perform();
    		String FSM1 = FSM.getText();
    		Reporter.log(FSM1,true);
    		Thread.sleep(5000);
    		WebElement Communication = pom.Communication;
    		MouseAction.moveToElement(Communication).perform();
    		Thread.sleep(2000);
    	}
    	//VtHP40
    	@Test
        public void Testcase40() throws InterruptedException {
    		WebElement FSM = pom.FeaturesSM;
    		Actions MouseAction = new Actions(driver);
    		MouseAction.moveToElement(FSM).perform();
    		String FSM1 = FSM.getText();
    		Reporter.log(FSM1,true);
    		Thread.sleep(5000);
    		WebElement Helpdesk = pom.Helpdesk;
    		MouseAction.moveToElement(Helpdesk).perform();
    		Thread.sleep(2000);
    	}
    	//VtHP41
    	@Test
        public void Testcase41() throws InterruptedException {
    		WebElement FSM = pom.FeaturesSM;
    		Actions MouseAction = new Actions(driver);
    		MouseAction.moveToElement(FSM).perform();
    		String FSM1 = FSM.getText();
    		Reporter.log(FSM1,true);
    		Thread.sleep(5000);
    		WebElement Marketing = pom.Marketing;
    		MouseAction.moveToElement(Marketing).perform();
    		Thread.sleep(2000);
    	}
    	//VtHP42
    	@Test
        public void Testcase42() throws InterruptedException {
    		WebElement FSM = pom.FeaturesSM;
    		Actions MouseAction = new Actions(driver);
    		MouseAction.moveToElement(FSM).perform();
    		String FSM1 = FSM.getText();
    		Reporter.log(FSM1,true);
    		Thread.sleep(5000);
    		WebElement Productivity = pom.Productivity;
    		MouseAction.moveToElement(Productivity).perform();
    		Thread.sleep(2000);
    	}
    	//VtHP43
    	@Test
        public void Testcase43() throws InterruptedException {
    		WebElement FSM = pom.FeaturesSM;
    		Actions MouseAction = new Actions(driver);
    		MouseAction.moveToElement(FSM).perform();
    		String FSM1 = FSM.getText();
    		Reporter.log(FSM1,true);
    		Thread.sleep(5000);
    		WebElement Tools = pom.Tools;
    		MouseAction.moveToElement(Tools).perform();
    		Thread.sleep(2000);
    	}
    	//VtHP44
    	@Test
        public void Testcase44() throws InterruptedException {
    		WebElement FSM = pom.FeaturesSM;
    		Actions MouseAction = new Actions(driver);
    		MouseAction.moveToElement(FSM).perform();
    		String FSM1 = FSM.getText();
    		Reporter.log(FSM1,true);
    		Thread.sleep(5000);
    		WebElement Administration = pom.Administration;
    		MouseAction.moveToElement(Administration).perform();
    		Thread.sleep(2000);
    	}
    	//VtHP45
    	@Test
        public void Testcase45() throws InterruptedException {
    		WebElement FSM = pom.FeaturesSM;
    		Actions MouseAction = new Actions(driver);
    		MouseAction.moveToElement(FSM).perform();
    		String FSM1 = FSM.getText();
    		Reporter.log(FSM1,true);
    		Thread.sleep(5000);
    		WebElement Integrations = pom.Integrations;
    		MouseAction.moveToElement(Integrations).perform();
    		Thread.sleep(2000);
    	}
    	
}