import org.openqa.selenium.By;

public class HeaderNavigation {

    public static void changeLanguage(Languages language) {

        switch(language) {
            case ENGLISH:
                Driver.instance.findElement(By.linkText("In english")).click();
                break;
            case RUSSIAN:
                Driver.instance.findElement(By.linkText("На русском")).click();
                break;
            case FINNISH:
                Driver.instance.findElement(By.linkText("Suomeksi")).click();
                break;
            case ESTONIAN:
                Driver.instance.findElement(By.linkText("Eesti keeles")).click();
                break;
        }
    }
}
