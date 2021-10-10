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
    private final WebElement home = driver.findElement(By.id("page"));
    private final By RequestADemo = By.className("est-internal-link est-tab-link");
    private final By RequestADemo2= By.xpath ("//*[@id=\"panel-3427-0-0-1\"]/div/div/div/a");
    private final By WatchTheVideo= By.xpath ("//*[@id=\"panel-3427-1-1-0\"]/div/div/div/a");
    private final By FORSFleetOperator = By.xpath("//*[@id=\"panel-3427-2-1-0\"]/div/div/div/a/img");
    private final By DrivingForBetterBusiness = By.xpath("//*[@id=\"panel-3427-4-0-0\"]/div/div/a/img");
    private final By EarnedRecognition= By.xpath("//*[@id=\"panel-3427-4-1-0\"]/div/div/a/img");
    private final By LogisticsUK= By.xpath("//*[@id=\"panel-3427-4-2-0\"]/div/div/a/img");
    private final By VanExcellence= By.xpath("//*[@id=\"panel-3427-4-3-0\"]/div/div/a/img");
    private final By UsingSpreadsheetFindOutMore= By.xpath("//*[@id=\"panel-3427-7-0-1\"]/div/div/div/a");
    private final By ManagingFleetMyRoleFindOutMore= By.xpath("//*[@id=\"panel-3427-9-0-3\"]/div/div/a");
    private final By YouAreAFleetFindOutMore= By.xpath("//*[@id=\"panel-3427-9-1-3\"]/div/div/a");
    private final By TheBusinessOLicenceFindOutMore= By.xpath("//*[@id=\"panel-3427-9-2-3\"]/div/div/a");
    private final By FleetCheckVideo= By.xpath("");
    private final By BeMoreProductiveFindOutMore= By.xpath("//*[@id=\"panel-3427-11-2-2\"]/div/div/div/a");
    private final By ContactUsToday= By.xpath("//*[@id=\"panel-3427-12-0-1\"]/div/div/div/a");
    private final By ViewAllOurCaseStudies= By.xpath("//*[@id=\"panel-3427-14-0-1\"]/div/div/div/a");








}
