package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShoot {
    public static void takeAScreen(WebDriver driver, String testName) {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
        String fileName = String.format("%s.png", testName);

      try {
          FileUtils.copyFile(file, new File("src/main/resources/ScreenShoots/" + fileName));
      } catch (IOException e) {
          System.out.println("Can't create a screen shoot");
      }

    }
}
