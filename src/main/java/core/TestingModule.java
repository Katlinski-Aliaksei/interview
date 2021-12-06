package core;

import com.google.inject.AbstractModule;
import org.openqa.selenium.WebDriver;

public class TestingModule extends AbstractModule {
    @Override
    protected void configure() {
        WebDriverFactory webDriverFactory = GoogleDriverFactory.getInstance();
        bind(WebDriver.class).toInstance(webDriverFactory.getDriver());
    }
}
