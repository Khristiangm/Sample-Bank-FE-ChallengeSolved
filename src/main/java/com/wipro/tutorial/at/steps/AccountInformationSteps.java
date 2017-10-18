package com.wipro.tutorial.at.steps;

import com.wipro.tutorial.at.pages.AccountInformationPage;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by KH389659 on 17/10/2017.
 */
@Component
public class AccountInformationSteps extends AbstractSteps {

    @Autowired
    private AccountInformationPage accountInfoPage;

    @When("User clicks on <cpfNumber>")
    public void userSelectAccount(@Named("cpfNumber") String cpfNumber) {
        accountInfoPage.selectCpf(cpfNumber);
    }

    @When("User clicks on get information button")
    public void userClickOnGetInfoButton() {
        accountInfoPage.clickInfoButton();
    }

    @Then("The return message for Account Information $message")
    public void assertCreateAccountReturnMessage(@Named("message") String message) {
        Assert.assertEquals(message, accountInfoPage.getReturnMsg());
    }


}
