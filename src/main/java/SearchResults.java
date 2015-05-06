import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class SearchResults {
    public static String getFirstResultPrice() {
        WebElement priceValue = Driver.instance.findElement(By.xpath("//*[@id='usedVehiclesSearchResult']/tbody/tr[1]/td[8]"));
        return priceValue.getText();
    }

    public static void sortBy(String price) {
        WebElement priceFilter = Driver.instance.findElement(By.linkText("Price"));
        priceFilter.click();
    }
}
