package utils;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class  webUtils {
    protected WebDriver driver;
    protected WebDriverWait wait;

    @Contract(pure = true)
    public webUtils(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 1);
    }

    protected void waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));

    }

    protected void click(By elementBy) {
        //waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }

    protected void writeText(By elementBy, String text) {
        //waitVisibility(elementBy);
        driver.findElement(elementBy).sendKeys(text);
    }

    protected String readText(By elementBy) {
        waitVisibility(elementBy);
        return driver.findElement(elementBy).getText();
    }

    public void clearText(By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).clear();
    }

    public void assertEquals(By elementBy, String expectedText) {
        waitVisibility(elementBy);
        Assert.assertEquals(readText(elementBy), expectedText);
    }

    protected boolean isElementPresent(By elementBy) {
        try {
            driver.findElement(elementBy);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    protected void chooseFromDropDownByName(By elementBy, String value) {
        WebElement dropdownUL = driver.findElement(elementBy);
        dropdownUL.findElements(By.tagName("li"));
        List<WebElement> dropdown = dropdownUL.findElements(By.tagName("li"));
        for (WebElement li : dropdown) {
            if (li.getText().equals(value)) {
                li.click();
            }
        }
    }

    protected void selectFromDropDownByVisibleText(By elementBy, String visibleText) {
        Select dropDown = new Select(driver.findElement(elementBy));
        dropDown.selectByVisibleText(visibleText);
    }

    protected void selectFromDropDownByVisibleText2( WebElement element, String visibleText) {
        Select dropDown = new Select(element);
        for (int i = 0; i < dropDown.getOptions().size(); i++) {
            if (dropDown.getOptions().get(i).getText().equalsIgnoreCase(visibleText)) {
                dropDown.selectByVisibleText(visibleText);
                break;
            }
        }
    }

    protected void selectAllItemsFromDropDown(By elementBy) {
        Select dropDown = new Select(driver.findElement(elementBy));
        List<WebElement> items = dropDown.getOptions();
        for (WebElement li : items) {
            try {
                li.click();
            } catch (Exception e) {
                Assert.fail(li.getText() + "is not opened");
                e.printStackTrace();
            }

        }
    }

    protected void chooseAllDropDownItems(By elementBy) {
        WebElement dropdownUL = driver.findElement(elementBy);
        dropdownUL.findElements(By.tagName("li"));
        List<WebElement> dropdown = dropdownUL.findElements(By.tagName("li"));
        for (WebElement li : dropdown) {
            try {
                li.click();
            } catch (Exception e) {
                Assert.fail(li.getText() + "is not opened");
                e.printStackTrace();
            }
        }
    }

    protected void chooseFromCalendar(By elementBy, String date) {
        WebElement calendar = driver.findElement(elementBy);
        calendar.findElements(By.tagName("td"));
        List<WebElement> dropdown = calendar.findElements(By.tagName("td"));
        for (WebElement li : dropdown) {
            if (li.getText().equals(date)) {
                li.click();
                break;
            }
        }
    }

    protected boolean isElementClickable(By elementBy) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 0, 2);
            wait.until(ExpectedConditions.elementToBeClickable(elementBy));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /*browser alert handler: receives the option by string and
    according to given option accepts or cancels the alert pop-up
    Options should be "yes" or "cancel"
     */
    protected void alertHandler(@NotNull String option) {
        if (option.equalsIgnoreCase("yes")) {
            driver.switchTo().alert().accept();
        }

        if (option.equalsIgnoreCase("cancel")) {
            driver.switchTo().alert().dismiss();
        }


    }

    protected boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }


}
