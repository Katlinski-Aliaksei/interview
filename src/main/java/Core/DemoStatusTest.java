package Core;

import Pages.BasePage;
import Pages.LogInPage;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.testng.annotations.Test;

import static constant.ConstantData.*;

public class DemoStatusTest {
    Injector injector = Guice.createInjector(new TestingModule());
    BasePage basePage=injector.getInstance(BasePage.class);
    LogInPage logInPage=injector.getInstance(LogInPage.class);
   // InitDriver initDriver = injector.getInstance(InitDriver.class);

//    @Inject
//    ChromeDriver driver= initDriver.getDriver();
//    protected LogInPage logInPage=PageFactory.initElements(driver,LogInPage.class);

    @Test
    public void demoStatusTest() throws InterruptedException {
        basePage
                .openBrowser(URL);
        logInPage
                .setEMail(USER_LOGIN)
                .clickSignInButton()
                .setPassword(USER_PASSWORD)
                .clickSignInButton();
    }
}



