Meta:

Narrative:
As a user
want to his account informations




GivenStories: stories/CreateAccount.story

Scenario: Open accountInfo Page
When User clicks on menu Account Information

Scenario: User on Account Information Page
When  User clicks on <cpfNumber>
And  User clicks on get information button
Then The return message for Account Information is <message>
Examples:
|cpfNumber		|message   	   				       |
|11111111111    |Operation completed with success  |
|-1             |The CPF information is invalid    |

