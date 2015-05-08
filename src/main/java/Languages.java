import org.openqa.selenium.By;

public enum Languages {
        ENGLISH("In english"),
        RUSSIAN("�� �������"),
        FINNISH("Suomeksi"),
        ESTONIAN("Eesti keeles");

    private String language;

    Languages(String language) {
        this.language = language;
    }

    public String getLanguage() {
        /* TODO: retrieve subdomain from url to get current language */
        return language;
    }


}


