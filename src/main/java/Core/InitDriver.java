package Core;

import com.google.inject.Inject;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitDriver implements WebDriverFactory {
    @Inject
    private ChromeDriver driver;

    @Inject
    private InitDriver() {
    }

    @Override
    @Provides
    @Singleton
    public ChromeDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
            driver = new ChromeDriver();
        }
        System.out.println("Driver is running");

        return driver;
    }
}
