Feature: Borrow calculator feature

Scenario: check borrowing error displayed
Given User is on homeloan borrow calculator page
Then User provides details as below to calculate borrow amount
#|Application Type|property        |dependant|annual income| other income|living expenses|homeloan repayments|other repayments|other commitment|creditcard limit|
|Single           | Home to live in|0        |0            |0            |1              |0                  |0               |0               |0           |
And clicks on calculator button
Then error message is dislayed over page