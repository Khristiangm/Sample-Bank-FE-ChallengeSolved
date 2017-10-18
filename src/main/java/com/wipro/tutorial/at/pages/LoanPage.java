package com.wipro.tutorial.at.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by KH389659 on 18/10/2017.
 */
public class LoanPage extends AbstractPage {

    @FindBy(xpath = "//*[contains(text(), 'Loans')]")
    private WebElement loanMenu;

    @FindBy(xpath = "//*[contains(text(), 'Make Loan')]")
    private WebElement makeLoanMenu;

    @FindBy(id = "targetAccount")
    private WebElement accountCpf;

    @FindBy(id = "ammount")
    private WebElement loanAmount;

    @FindBy(className = "sb-button")
    private WebElement loanButton;

    @FindBy(id = "sb-return-message")
    private WebElement loanMessage;

    public LoanPage selectCpf(String cpfNumber) {
        Select SourceCpfSelect = new Select(loanMenu);
        SourceCpfSelect.selectByVisibleText(cpfNumber);
        return this;
    }

    public LoanPage makeLoanSelectCpf(String cpfNumber) {
        Select SourceCpfSelect = new Select(makeLoanMenu);
        SourceCpfSelect.selectByVisibleText(cpfNumber);
        return this;
    }

    public LoanPage inputAmount(String amount){
        loanAmount.sendKeys(amount);
        return this;
    }

    public LoanPage clickLoanButton(){
        loanButton.click();
        return this;
    }

    public String getReturnMsg() {
        return loanMessage.getText();
    }

}
