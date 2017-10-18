package com.wipro.tutorial.at.pages;

import com.wipro.tutorial.at.configuration.pageobjects.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by KH389659 on 17/10/2017.
 */
@PageObject
public class DepositPage extends AbstractPage {

    @FindBy(id = "targetAccount")
    private WebElement OwnerCpfElement;

    @FindBy(id = "ammount")
    private WebElement depositAmount;

    @FindBy(className = "sb-button")
    private WebElement depositButton;

    @FindBy(id = "sb-return-message")
    private WebElement returnMsg;


    public DepositPage depositSelectCpf(String cpfNumber) {
        Select ownerCpfSelect = new Select(OwnerCpfElement);
        ownerCpfSelect.selectByVisibleText(cpfNumber);
        ownerCpfSelect.deselectAll();
        return this;
    }

    public DepositPage depositAmount(String inputDeposit){
        depositAmount.sendKeys(inputDeposit);
        return this;
    }

    public DepositPage clickInfoButton(){
        depositButton.click();
        return this;
    }

    public String getReturnMsg() {
        return returnMsg.getText();
    }
}
