package core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDriverFactory implements WebDriverFactory {
    protected static final Logger logger = LogManager.getLogger();
    private static GoogleDriverFactory instanceOfInitDriverClass = null;

    public synchronized static WebDriverFactory getInstance() {
        if (instanceOfInitDriverClass == null) {
            instanceOfInitDriverClass = new GoogleDriverFactory();

            return instanceOfInitDriverClass;
        }

        return instanceOfInitDriverClass;
    }

    private WebDriver driver;

    private GoogleDriverFactory() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();

        logger.info("New driver created");
    }

    @Override
    public WebDriver getDriver() {
        return driver;
    }
}
