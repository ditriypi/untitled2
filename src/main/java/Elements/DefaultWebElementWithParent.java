package Elements;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

abstract public class DefaultWebElementWithParent extends DefaultWebElementsContainer implements ElementWithParent{
    public DefaultWebElementWithParent(SearchContext searchContext) {
        super(searchContext);
    }

}
