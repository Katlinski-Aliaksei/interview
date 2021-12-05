package steps;

import pages.LogInPage;


public class LogInSteps {

    private final LogInPage logInPage;

    public LogInSteps(LogInPage logInPage) {
        this.logInPage = logInPage;
    }

    public void logInStep(String eMail, String password) {
        logInPage
                .setEMail(eMail)
                .clickSignInButton()
                .setPassword(password)
                .clickSignInButton();
    }
}
