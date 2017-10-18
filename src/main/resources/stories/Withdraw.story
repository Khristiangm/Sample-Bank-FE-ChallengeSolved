Meta:

Narrative:
As a user
want to withdraw some money


GivenStories: stories/Deposit.story

Scenario: Open withdraw Page
When User clicks on menu withdraw

Scenario: User on withdraw Page
When  User clicks on <cpfNumber>
And   User fills the <amount>
And   User clicks on withdraw button
Then  The return message for withdraw is <message>
Examples:
|cpfNumber   |amount |message                                 |
|11111111111 |10     |Operation completed with success        |
|11111111111 |0      |The ammount is invalid for the operation|
|123         |0      |The CPF information is invalid          |

