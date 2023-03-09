package Vtiger;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Vtiger_POM {
	
	
	@FindBy (xpath = "//img[@alt='vtiger crm']")
	public WebElement VtigerLogo;
	
	@FindBy(xpath ="//h1[.=' CRM made easy ']")
	public WebElement CRMtext;
	
	@FindBy(xpath="(//img[@alt='play store icon'])[1]")
	public WebElement Playstoreicon;
	
	@FindBy(xpath="(//img[@alt='play store icon'])[2]")
	public WebElement Applestoreicon; 
	
	@FindBy(xpath="(//p[1])[109]")
	public WebElement KeepInTouch;
	
	@FindBy(xpath="//ul[@class='list-unstyled list-inline list-social mb-6 mb-md-0']")
	public WebElement SocialMediaIcons;
	
	@FindBy(xpath="(//a[@class='text-decoration-none'])[1]")
	public WebElement FacebookIcon;
	
	@FindBy(xpath = "(//a[@class='text-decoration-none'])[2]")
	public WebElement Twittericon;
	
	@FindBy(xpath = "(//a[@class='text-decoration-none'])[3]")
	public WebElement Youtubeicon;
	
	@FindBy(xpath = "(//a[@class='text-decoration-none'])[4]")
	public WebElement Linkedinicon;
	
	@FindBy(xpath = "(//a[@class='text-decoration-none'])[5]")
	public WebElement Wikitiaicon;
	
	@FindBy(xpath = "(//a[@class='text-decoration-none'])[6]")
	public WebElement Vtigerblogicon;
    
	@FindBy(xpath = "//li[@class='list-inline-item list-social-item mr-3']")
	public List<WebElement> AllsocialmediaICon;
			
	@FindBy(xpath = "//img[@id='websense-chat-icon']")
	public WebElement Vtigerchaticon;
	
	@FindBy(xpath = "(//h6[.])[29]")
	public WebElement Productstext;
	
	@FindBy(xpath = "(//h6[.])[30]")
	public WebElement Populartext;
	
	@FindBy(xpath = "//h6[contains(.,'SOLUTIONS')]")
	public WebElement SolutionText;
	
	@FindBy(xpath = "//h4[contains(.,'Blazing fast UI')]")
	public WebElement BlazingfastUIText;
	
	@FindBy(xpath = "//h4[.='One View']")
	public WebElement OneviewText;
	
	@FindBy(xpath = "//h4[.='Calculus AI']")
	public WebElement CalculcusAI;
	
	@FindBy(xpath = "//h6[contains(.,'COMPANY')]")
	public WebElement CompanyText;
	
	@FindBy(xpath = "//h6[contains(.,'NEW TO CRM?')]")
	public WebElement NewtoCRMText;
	
	@FindBy(xpath = "//h6[contains(.,'SERVICES')]")
	public WebElement ServicesText;
	
	@FindBy(xpath = "//h6[contains(.,'RESOURCES')]")
	public WebElement ResoursesText;
	
	@FindBy(xpath = "//h6[contains(.,'OPEN SOURCE')]")
	public WebElement OpensourceText;
	
	@FindBy(xpath = "//h2[contains(.,'Great relationships start here')]")
	public WebElement GreatRSHtext;
	
	@FindBy(xpath = "(//input[@placeholder='Your work email'])[2]")
	public WebElement Emailtextbox2;
	
	@FindBy(xpath="(//input[@placeholder='Your work email'])[1]")
	public WebElement Emailtextbox1;
	
	@FindBy(xpath = "(//div[@class='card-body pt-lg-9 pb-lg-5'])[1]")
	public WebElement OpensourceImagetext;
	
	@FindBy(xpath = "(//div[@class='card-body pt-lg-9 pb-lg-5'])[2]")
	public WebElement WehavemanyFriendstext;
	
	@FindBy(xpath = "(//div[@class='card-body pt-lg-9 pb-lg-5'])[3]")
	public WebElement OurclientLovesText;
	
	@FindBy(xpath = "//h2[.='A recognized leader and top-rated CRM for years']")
	public WebElement RecognizedLeadertext;
	
	@FindBy(xpath = "(//img[@class='m-3  img-fluid rounded'])[1]")
	public WebElement SoftwareAdvice;
	
	@FindBy(xpath = "(//button[@type='button'])[5]")
	public WebElement CarouselButton1;
	
	@FindBy(xpath = "(//button[@type='button'])[6]")
	public WebElement CarouselButton2;
	
	@FindBy(xpath = "(//a[@class='nav-link dropdown-toggle text-dark'])[2]")
	public WebElement FeaturesSM;
	
	@FindBy(xpath = "(//a[@class='nav-link dropdown-toggle text-dark mt-0 pt-md-1'])[1]")
	public WebElement Sales;
	
	@FindBy(xpath = "(//a[@class='nav-link dropdown-toggle text-dark mt-0 pt-md-1'])[2]")
	public WebElement Sales1;
	
	@FindBy(xpath = "(//a[@class='nav-link dropdown-toggle text-dark mt-0 pt-md-1'])[3]")
	public WebElement Pipeline;
	
	@FindBy(xpath = "(//a[@class='nav-link dropdown-toggle text-dark mt-0 pt-md-1'])[4]")
	public WebElement Sales2;
	
	@FindBy(xpath = "(//a[@class='nav-link dropdown-toggle text-dark mt-0 pt-md-1'])[5]")
	public WebElement Analytics;
	
	@FindBy(xpath = "(//a[@class='nav-link dropdown-toggle text-dark mt-0 pt-md-1'])[6]")
	public WebElement Communication;
	
	@FindBy(xpath = "(//a[@class='nav-link dropdown-toggle text-dark mt-0 pt-md-1'])[7]")
	public WebElement Helpdesk;
	
	@FindBy(xpath = "(//a[@class='nav-link dropdown-toggle text-dark mt-0 pt-md-1'])[8]")
	public WebElement Marketing;
	
	@FindBy(xpath = "(//a[@class='nav-link dropdown-toggle text-dark mt-0 pt-md-1'])[9]")
	public WebElement Productivity;
	
	@FindBy(xpath = "(//a[@class='nav-link dropdown-toggle text-dark mt-0 pt-md-1'])[10]")
	public WebElement Tools;
	
	@FindBy(xpath = "(//a[@class='nav-link dropdown-toggle text-dark mt-0 pt-md-1'])[11]")
	public WebElement Administration;
	
	@FindBy(xpath = "(//a[@class='nav-link dropdown-toggle text-dark mt-0 pt-md-1'])[12]")
	public WebElement Integrations;
}
