package com.wipro.tutorial.at.pages;

import com.wipro.tutorial.at.configuration.pageobjects.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by KH389659 on 17/10/2017.
 */

@PageObject
public class AccountInformationPage extends AbstractPage {

    @FindBy(id = "ownerCpfSelect")
    private WebElement ownerCpfElement;

    @FindBy(className = "sb-button")
    private WebElement getInfoButton;

    @FindBy(id = "sb-return-message")
    private WebElement returnMsg;


    public AccountInformationPage selectCpf(String cpfNumber) {
        Select ownerCpfSelect = new Select(ownerCpfElement);
        ownerCpfSelect.selectByValue(cpfNumber);
        return this;
    }

    public AccountInformationPage clickInfoButton(){
    getInfoButton.click();
    return this;
    }

    public String getReturnMsg() {
        return returnMsg.getText();
    }
}
