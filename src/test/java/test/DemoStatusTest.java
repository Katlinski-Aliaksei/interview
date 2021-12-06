package test;

import com.google.inject.Guice;
import com.google.inject.Injector;
import core.TestingModule;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.InterviewPage;
import pages.LogInPage;
import steps.InterviewSteps;
import steps.LogInSteps;

import static constant.ConstantData.*;

public class DemoStatusTest {
    Injector injector = Guice.createInjector(new TestingModule());
    LogInPage logInPage = injector.getInstance(LogInPage.class);
    LogInSteps logInSteps = injector.getInstance(LogInSteps.class);
    InterviewPage interviewPage = injector.getInstance(InterviewPage.class);
    InterviewSteps interviewSteps = injector.getInstance(InterviewSteps.class);

    @Test
    public void demoStatusTest() {
        logInPage
                .openBrowser(URL);
        logInSteps
                .logInStep(USER_LOGIN, USER_PASSWORD);
        interviewSteps
                .fillingDataStep(USER_FIRST_NAME, USER_LOGIN, DATE);
        interviewPage
                .clickCancelButton();

        Assert.assertTrue(interviewPage.getDemoStatus().contains("Data entry started"));
    }

    @AfterTest
    public void afterTest() {
        injector.getInstance(WebDriver.class).quit();
    }
}
