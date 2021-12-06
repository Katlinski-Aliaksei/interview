package steps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pages.InterviewPage;
import com.google.inject.Inject;

public class InterviewSteps {
    protected static final Logger logger = LogManager.getLogger();
    private final InterviewPage interviewPage;

    @Inject
    public InterviewSteps(InterviewPage interviewPage) {
        this.interviewPage = interviewPage;
    }

    public void fillingDataStep(String firstName, String eMail, String date) {
        interviewPage
                .startDemo()
                .setUserFirstName(firstName)
                .setEMail(eMail)
                .chooseGender()
                .chooseYesOrNo()
                .setDate(date)
                .openDropdownAndChoose();

        logger.info("All data of the questionnaire is filled in.");
    }
}
