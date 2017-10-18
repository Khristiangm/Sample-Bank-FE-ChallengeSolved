Meta:

Narrative:
As a user
I want to Deposit money


GivenStories: stories/CreateAccount.story

Scenario: Open deposit Page
When User clicks on menu deposit

Scenario: User on deposit Page
When  User clicks on <cpfNumber>
And   User fills the <amount>
And   User clicks on deposit button
Then  The return message for deposit is <message>
Examples:
|cpfNumber		|amount |message   	   				                 |
|11111111111    |200000 |Operation completed with success            |
|22222222222    |200000 |Operation completed with success            |
|123            |200000 |The CPF information is invalid              |
|11111111111    |0      |The ammount is invalid for the operation    |
