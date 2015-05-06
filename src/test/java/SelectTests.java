import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SelectTests {

    @BeforeClass
    public static void init() {
        Driver.initialize();
        Driver.goTo("http://www.auto24.ee");
        HeaderNavigation.SetLang("In english");
    }



    @Test()
    public void userCanSelectMake() {
        Selector.selectMake("BMW");
        Selector.selectModel("530");
        Selector.selectMake("Audi");

        String modelValue = Selector.model.getFirstSelectedOption().getText();

        assertEquals(modelValue, "all", "Make is reset to all");
    }

    @Test
    public void userCanSearch() {
        Selector.selectMake("BMW");
        Selector.enterPrice("5000", "7000");
        Selector.sortBy("by price");
        Selector.search();

        String price1 = SearchResults.getFirstResultPrice();
        SearchResults.sortBy("price");
        String price2 = SearchResults.getFirstResultPrice();

        assertTrue(Integer.parseInt(price1) >= 5000);
        assertTrue(Integer.parseInt(price2) <= 7000);
    }

    @Test
    public void saveSearch(){
        Selector.selectMake("Audi");
        Selector.enterPrice("5000", "7000");
        Selector.selectFuel("diesel");
        Selector.search();
        Selector.saveSearch("affordable Audi");

        assertEquals(Selector.getSavedSearchesNumber(), 1, "There is only one saved search");
    }

    @AfterClass
    public void clearUp() {
        Driver.instance.close();
    }

}