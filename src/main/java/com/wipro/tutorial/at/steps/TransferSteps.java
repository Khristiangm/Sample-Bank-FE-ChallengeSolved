package com.wipro.tutorial.at.steps;

import com.wipro.tutorial.at.pages.TransferPage;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransferSteps extends AbstractSteps {

    @Autowired
    private TransferPage transferPage;


    @Then("User select his account to transfer <cpfNumber>")
    public void userSelectAccount(@Named("cpfNumber") String cpfNumber){
        transferPage.sourceSelectCpf(cpfNumber);
    }

    @When("User select his target account <targetCpf>")
    public void userSelectTargetAccount(@Named("targetCpfElement") String cpfNumber){
        transferPage.TargetSelectCpf(cpfNumber);
    }

    @When("User fill the transfer amount field that his want to transfer <transferAmount>")
    public void userFillAmountInput(@Named("transferAmount") String amount){
        transferPage.inputAmount(amount);
    }

    @When("User click on transfer button")
    public void userClickTransfer(){
        transferPage.clickTransferButton();
    }

    @Then("The return message for transfer is <message>")
    public void returnMessage(@Named("message") String message){
        Assert.assertEquals(transferPage.getReturnMsg(), message);
    }

}
