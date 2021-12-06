package steps;

import com.google.inject.Inject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pages.LogInPage;

public class LogInSteps {
    protected static final Logger logger = LogManager.getLogger();
    private final LogInPage logInPage;

    @Inject
    public LogInSteps(LogInPage logInPage) {
        this.logInPage = logInPage;
    }

    public void logInStep(String eMail, String password) {
        logInPage
                .setEMail(eMail)
                .clickSignInButton()
                .setPassword(password)
                .clickSignInButton();

        logger.info("Log In process is successful.");
    }
}
