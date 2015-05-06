import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Selector {

    public static Select make;
    public static Select model;
    public static Select sort;
    public static Select fuel;

    public static void selectMake(String makeSelection) {
        make = new Select(Driver.instance.findElement(By.id("searchParam-cmm-1-make")));
        make.selectByVisibleText(makeSelection);
    }

    public static void selectModel (String modelSelection) {
        model = new Select(Driver.instance.findElement(By.id("searchParam-cmm-1-model_id")));
        model.selectByVisibleText(modelSelection);
    }

    public static void enterPrice(String price1, String price2) {
        WebElement priceInput1 = Driver.instance.findElement(By.xpath("//input[@type='text' and @name='g1']"));
        priceInput1.clear();
        priceInput1.sendKeys(price1);

        WebElement priceInput2 = Driver.instance.findElement(By.xpath("//input[@type='text' and @name='g2']"));
        priceInput2.clear();
        priceInput2.sendKeys(price2);
    }

    public static void sortBy(String filter) {
        sort = new Select(Driver.instance.findElement(By.id("searchParam-sort")));
        sort.selectByVisibleText(filter);
    }

    public static void search() {
        WebElement searchBtn = Driver.instance.findElement(By.xpath("//input[@type='submit' and @name='otsi']"));
        searchBtn.click();
    }

    public static void selectFuel(String diesel) {
        fuel = new Select(Driver.instance.findElement(By.id("searchParam-fuel")));
        fuel.selectByVisibleText(diesel);
    }

    public static void saveSearch(String searchQuery) {
        WebElement saveSearchInput = Driver.instance.findElement(By.id("save-search-name"));
        saveSearchInput.clear();
        saveSearchInput.sendKeys(searchQuery);
        WebElement saveSearchBtn = Driver.instance.findElement(By.name("save_current_search"));
        saveSearchBtn.click();
    }

    public static int getSavedSearchesNumber() {
        int rowSize = Driver.instance.findElements(By.xpath("//*[@id='saveSearchForm']//table/tbody/tr")).size();
        return rowSize;
    }
}
