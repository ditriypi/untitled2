package Elements;

import org.openqa.selenium.SearchContext;

public abstract class DefaultWebElementsContainer implements WebElementsContainer {

    @Override
    public SearchContext getSearchContext() {
        return searchContext;
    }

    private  final SearchContext searchContext;

    public DefaultWebElementsContainer(SearchContext searchContext) {
        this.searchContext = searchContext;
    }

}
