Meta:

Narrative:
As a customer of the bank
I want to perform a loan
So that I can get certain amount of money

GivenStories: stories/Deposit.story

Scenario: User select loan menu
Given User clicks on menu loan page

Scenario: User should make a loan
When User clicks on menu Make Loan
When User select his account <cpfNumber>
When User fill the amountInput <amountValue>
When User clicks on makeLoanButton
Then the system should show the message <message>
Examples:
| cpfNumber   | amountValue | message                                                                              |
| 11111111111 |    6000     | Operation completed with success                                                     |
| 11111111111 |    6000     | There is a pending loan for this account                                             |
| 33333333333 |    65000    | The requested loan ammount exceeds the available credit limit                        |
| 22222222222 |    30000    | Insufficient balance in account for the loan operation. Minimum of $2000 is required |