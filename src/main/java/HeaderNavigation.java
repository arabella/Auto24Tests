import org.openqa.selenium.By;

public class HeaderNavigation {

    public static void SetLang(String lang) {
            Driver.instance.findElement(By.linkText(lang)).click();
    }
}
