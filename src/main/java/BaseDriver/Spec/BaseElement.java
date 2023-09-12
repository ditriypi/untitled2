package BaseDriver.Spec;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Elements.DefaultWebElementWithParent;
import Elements.WebElementsContainer;

public class BaseElement<I extends BaseElement> extends DefaultWebElementWithParent {
    protected final WebElement element;

    public BaseElement( WebElement webElement ) {
        super(webElement);
        this.element = webElement;

        //PageFactory.initElements(searchContext, this);
    }

    public void click() {
        this.element.click();
    }

    @Override
    public WebElementsContainer getParent() {
        return null;
    }

    @Override
    public SearchContext getSearchContext() {
        return super.getSearchContext();
    }

}
