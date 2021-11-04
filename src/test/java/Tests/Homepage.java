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

    @Test (priority = 3)
    @Description("going to login page")
    public void checkLogin(){
        HomePage1 Ayeni= new HomePage1(driver);
        Ayeni.login();
    }
    @Test (priority = 2)
    @Description("going to request a demo")
    public void checkRequestDemo(){
        HomePage1 Ayeni = new HomePage1(driver);
        Ayeni.setRequestADemo();
    }
    @Test (priority = 1)
    @Description("going to request a demo2")
    public void checkRequestDemo2() throws InterruptedException {
        HomePage1 Ayeni = new HomePage1(driver);
        Ayeni.setRequestADemo2();
    }


    @AfterMethod
            public void reset (){
        driver.get("https://www.fleetcheck.co.uk/");
    }







}
