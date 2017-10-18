package com.wipro.tutorial.at.steps;

import com.wipro.tutorial.at.pages.DepositPage;
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
public class DepositSteps extends AbstractSteps {

    @Autowired
    private DepositPage depositPage;

    @When("User clicks on <cpfNumber>")
    public void userSelectAccount(@Named("cpfNumber") String cpfNumber) {
        depositPage.depositSelectCpf(cpfNumber);
    }

    @When("User fills the <amount>")
    public void userFillsAmount(@Named("amount") String inputAmount){
        depositPage.depositAmount(inputAmount);
    }

    @When("User clicks on deposit button")
    private void userClickOnDepositButton(){
        depositPage.clickInfoButton();
    }

    @Then("The return message for deposit is $message")
    public void assertCreateAccountReturnMessage(@Named("message") String message) {
        Assert.assertEquals(message, depositPage.getReturnMsg());
    }

}
