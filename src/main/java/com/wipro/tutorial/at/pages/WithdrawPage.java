package com.wipro.tutorial.at.pages;

import com.wipro.tutorial.at.configuration.pageobjects.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


@PageObject
public class WithdrawPage extends AbstractPage {


    @FindBy(id = "targetAccount")
    private WebElement OwnerCpfElement;

    @FindBy(id = "ammount")
    private WebElement withdrawAmount;

    @FindBy(className = "sb-button")
    private WebElement  withdrawButton;

    @FindBy(id = "sb-return-message")
    private WebElement returnMsg;


    public WithdrawPage withdrawSelectCpf(String cpfNumber) {
        Select ownerCpfSelect = new Select(OwnerCpfElement);
        ownerCpfSelect.selectByVisibleText(cpfNumber);
        ownerCpfSelect.deselectAll();
        return this;
    }

    public WithdrawPage withdrawAmount(String inputWithdraw) {
        withdrawAmount.sendKeys(inputWithdraw);
        return this;
    }

    public WithdrawPage userClickWithdrawButton() {
        withdrawButton.click();
        return this;
    }

    public String getReturnMsg() {
        return returnMsg.getText();
    }

}

