package com.wipro.tutorial.at.pages;


import com.wipro.tutorial.at.configuration.pageobjects.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

@PageObject
public class TransferPage extends AbstractPage {

    @FindBy(id = "sourceAccount")
    private WebElement sourceCpfElement;

    @FindBy(id = "targetAccount")
    private WebElement targetCpfElement;

    @FindBy(id = "ammount")
    private WebElement transferAmount;

    @FindBy(className = "sb-button")
    private WebElement transferButton;

    @FindBy(id = "sb-return-message")
    private WebElement returnMsg;

    public TransferPage sourceSelectCpf(String cpfNumber) {
        Select SourceCpfSelect = new Select(sourceCpfElement);
        SourceCpfSelect.selectByVisibleText(cpfNumber);
        return this;
    }
    public TransferPage TargetSelectCpf(String cpfNumber) {
        Select TargetCpfSelect = new Select(targetCpfElement);
        TargetCpfSelect.selectByVisibleText(cpfNumber);
        return this;
    }

    public TransferPage inputAmount(String amount){
        transferAmount.sendKeys(amount);
        return this;
    }

    public TransferPage clickTransferButton(){
        transferButton.click();
        return this;
    }

    public String getReturnMsg() {
        return returnMsg.getText();
    }




}
