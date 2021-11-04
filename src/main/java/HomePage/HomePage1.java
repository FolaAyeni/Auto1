package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.webUtils;

public class HomePage1 extends webUtils {
    public HomePage1(WebDriver driver) {
        super(driver);
    }
    private final WebElement homepage = driver.findElement(By.id("page"));
    private final By home = By.xpath("//*[@id=\"mega-menu-item-3455\"]/a");
    private final By login = By.xpath("//*[@id=\"masthead\"]/div[1]/div/div/div[2]/ul/li[3]/a");
    private final By requestADemo = By.xpath("//a[@class='est-internal-link est-tab-link']");
    private final By requestADemo2= By.xpath("//*[@id=\"panel-3427-0-0-1\"]/div/div/div/a");
    private final By watchTheVideo= By.xpath ("//*[@id=\"panel-3427-1-1-0\"]/div/div/div/a");
    private final By fORSFleetOperator = By.xpath("//*[@id=\"panel-3427-2-1-0\"]/div/div/div/a/img");
    private final By drivingForBetterBusiness = By.xpath("//*[@id=\"panel-3427-4-0-0\"]/div/div/a/img");
    private final By earnedRecognition= By.xpath("//*[@id=\"panel-3427-4-1-0\"]/div/div/a/img");
    private final By logisticsUK= By.xpath("//*[@id=\"panel-3427-4-2-0\"]/div/div/a/img");
    private final By vanExcellence= By.xpath("//*[@id=\"panel-3427-4-3-0\"]/div/div/a/img");
    private final By usingSpreadsheetFindOutMore= By.xpath("//*[@id=\"panel-3427-7-0-1\"]/div/div/div/a");
    private final By managingFleetMyRoleFindOutMore= By.xpath("//*[@id=\"panel-3427-9-0-3\"]/div/div/a");
    private final By youAreAFleetFindOutMore= By.xpath("//*[@id=\"panel-3427-9-1-3\"]/div/div/a");
    private final By theBusinessOLicenceFindOutMore= By.xpath("//*[@id=\"panel-3427-9-2-3\"]/div/div/a");
    private final By fleetCheckVideo= By.xpath("");
    private final By beMoreProductiveFindOutMore= By.xpath("//*[@id=\"panel-3427-11-2-2\"]/div/div/div/a");
    private final By contactUsToday= By.xpath("//*[@id=\"panel-3427-12-0-1\"]/div/div/div/a");
    private final By viewAllOurCaseStudies= By.xpath("//*[@id=\"panel-3427-14-0-1\"]/div/div/div/a");
    private final By homepageText= By.xpath("//*[@id=\"panel-3427-0-0-0\"]/div/div/h1");
    private final By signIn = By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtUsername\"]");
    private final By getYourFreeDemoOfFc= By.xpath("//h3[contains(text(),'Get your free demo of FleetCheck')]");




    public void login(){
       click(home);
       assertEquals(homepageText,"The UKs most recommended fleet management software");
       click(login);
       isElementClickable(signIn);
    }

    public void setRequestADemo () {
        click(requestADemo);
        assertEquals(getYourFreeDemoOfFc, "Get your free demo of FleetCheck");
    }

    public void setRequestADemo2 () throws InterruptedException {
        Thread.sleep(3000);
        click(requestADemo2);
        assertEquals(getYourFreeDemoOfFc, "Get your free demo of FleetCheck");
    }





}
