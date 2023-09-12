package BaseDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class BaseDriver {

    public ChromeDriver getChromeDriver(){
        new ChromeDriverManager().setup();
        return new ChromeDriver();
    }

    static {
        String hello = "Hello";
        String bye = "Bye";
    }
   public static String name = "";
}
