package com.wipro.tutorial.at.steps;

import com.wipro.tutorial.at.pages.WithdrawPage;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class WithdrawSteps extends AbstractSteps {

    @Autowired
    private WithdrawPage withdrawPage;

    @When("User clicks on <cpfNumber>")
    public void userSelectAccount(@Named("cpfNumber") String cpfNumber) {
        withdrawPage.withdrawSelectCpf(cpfNumber);
    }

    @When("User fills the <amount>")
    public void userFillsAmount(@Named("amount") String inputAmount) {
        withdrawPage.withdrawAmount(inputAmount);
    }

    @When("User clicks on withdraw button")
    private void userClickWithdrawButton() {
        withdrawPage.userClickWithdrawButton();
    }

    @Then("The return message for withdraw is $message")
    public void assertCreateAccountReturnMessage(@Named("message") String message) {
        Assert.assertEquals(message, withdrawPage.getReturnMsg());

    }
}
