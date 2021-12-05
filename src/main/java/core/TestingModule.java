package core;

import com.google.inject.AbstractModule;

public class TestingModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(WebDriverFactory.class).to(InitDriver.class);
    }
}
