package com.wipro.tutorial.at.steps;

import com.wipro.tutorial.at.pages.LoanPage;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by KH389659 on 18/10/2017.
 */
public class LoanSteps extends AbstractSteps {

    @Autowired
    private LoanPage loanPage;

    @When("User clicks on <cpfNumber>")
    public void userSelectAccount(@Named("cpfNumber") String cpfNumber) {
        loanPage.makeLoanSelectCpf(cpfNumber);
    }

    @When("User fills the <amount>")
    public void userFillsAmount(@Named("amount") String loanAmount){
        loanPage.inputAmount(loanAmount);
    }

    @When("User clicks on loan button")
    private void userClickOnLoanButton(){
        loanPage.clickLoanButton();
    }

    @Then("The return message for loan is <message>")
    public void assertmakeLoanReturnMessage(@Named("message") String message) {
        Assert.assertEquals(message, loanPage.getReturnMsg());
    }
}
