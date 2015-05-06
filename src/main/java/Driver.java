import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    public static WebDriver instance;
    public static String baseUrl;

    public static void initialize() {
        instance = new FirefoxDriver();
        instance.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void goTo(String baseUrl) {
        instance.navigate().to(baseUrl);
    }

    public static void close() {
        instance.close();
    }
}
