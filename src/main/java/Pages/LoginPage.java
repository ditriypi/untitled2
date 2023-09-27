package Pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

import java.util.List;

import BaseDriver.CustomFieldDecorator;
import BaseDriver.Spec.TestCollectionInput;
import BaseDriver.Spec.TestInput;


@Getter
public class LoginPage {
    private WebDriver driver;

    @FindBy(xpath = "//input[@id='user-name']")
    private TestInput loginInput;

    @FindBy(id = "password")
    private List<TestCollectionInput> password;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
         PageFactory.initElements(new CustomFieldDecorator(new DefaultElementLocatorFactory(driver)), this);

    }
}
