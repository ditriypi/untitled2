import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

import BaseDriver.BaseDriver;
import Pages.LoginPage;
import Utils.ResourceReader;

public class LoginTests {
    @Test
    public void loginTest() throws IOException {
         var driver = new BaseDriver().getChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage()
              .timeouts()
              .implicitlyWait(3, TimeUnit.SECONDS);
        LoginPage loginPage = new LoginPage(driver);


         loginPage.getLoginInput().click();
        ResourceReader reader = new ResourceReader();
        var name = reader.getPropertyByName("LOGIN");
        System.out.println(name);

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        Set<String> set2 = new HashSet<>(Arrays.asList("apple", "banana", "cherry", "date"));

        WebDriverWait wait = new WebDriverWait(driver, 3);
        driver.quit();

    }

   @Test
    public void test() throws Exception {
        throw new Exception();
   }
}




