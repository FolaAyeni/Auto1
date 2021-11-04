package Tests;

import HomePage.HomePage1;
import jdk.jfr.Description;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Homepage extends baseTest  {

    @BeforeClass
    public void fleetCheckWebsite(){
        driver.get("https://www.fleetcheck.co.uk/");
    }

    @Test
    @Description("going to login page")
    public void checkLogin(){
        HomePage1 homePage1 = new HomePage1(driver);
        homePage1.login();
    }

    @AfterMethod
            public void reset (){
        driver.get("https://www.fleetcheck.co.uk/");
    }







}
