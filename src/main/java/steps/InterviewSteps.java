package steps;

import pages.InterviewPage;
import com.google.inject.Inject;


public class InterviewSteps {
    protected InterviewPage interviewPage;
    @Inject
    public InterviewSteps(InterviewPage interviewPage){
        this.interviewPage=interviewPage;
    }

    public void fillingDataStep(String firstName, String eMail, String date) {
        interviewPage
                .setUserFirstName(firstName)
                .setEMail(eMail)
                .chooseGender()
                .chooseYesOrNo()
                .setDate(date)
                .openDropdownAndChoose();
    }
}
