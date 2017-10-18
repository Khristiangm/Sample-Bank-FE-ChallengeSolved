Meta:

Narrative:
As a user
I want to transfer money


GivenStories: stories/Deposit.story

Scenario: Open transfer Page
When User clicks on menu Transfer

Scenario: User is on transfer page
Then User select his account to transfer <cpfNumber>
When User select his target account <targetCpf>
When User fill the transfer amount field that his want to transfer <transferAmount>
When User click on transfer button
Then The return message for transfer is <message>
Examples:
|cpfNumber  |targetCpf  |transferAmount|message                                 |
|11111111111|22222222222|10            |Operation completed with success        |
|11111111111|22222222222|0             |The ammount is invalid for the operation|
