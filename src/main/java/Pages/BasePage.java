package Pages;

import com.google.inject.Inject;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BasePage{
    private ChromeDriver driver;

    @Inject
    public BasePage(ChromeDriver driver) {
        this.driver = driver;
    }

    public LogInPage openBrowser(String url) {
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        return new LogInPage(driver);
    }
}
