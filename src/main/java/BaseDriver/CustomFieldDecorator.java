package BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.DefaultFieldDecorator;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

import java.lang.reflect.Field;
import java.util.List;

import BaseDriver.Spec.BaseElement;
import BaseDriver.Spec.TestCollectionInput;
import BaseDriver.Spec.TestInput;

public class CustomFieldDecorator extends DefaultFieldDecorator {

    public CustomFieldDecorator(ElementLocatorFactory factory) {
        super(factory);
    }

    @Override
    public Object decorate(ClassLoader loader, Field field) {
        if (field.getType() == TestInput.class) {
            WebElement wrappedElement = factory.createLocator(field).findElement();
            return new TestInput(wrappedElement);
        }
        else if (field.getType() == TestCollectionInput.class){
            List <WebElement> wrappedElement = factory.createLocator(field).findElements();
            return new TestCollectionInput(wrappedElement);
        }

        else {
            return super.decorate(loader, field);
        }
    }
}
