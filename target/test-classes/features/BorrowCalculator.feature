Feature: Borrow calculator feature

Scenario: check borrowing estimate of $479,000
Given User is on homeloan borrow calculator page
Then User provides details as below to calculate borrow amount
#|Application Type|property|dependant|annual income| other income|living expenses|homeloan repayments|other repayments|other commitment|creditcard limit|
|Single| Home to live in|0|80000        |10000        |500            |0                  |100             |0               |10500           |
And clicks on calculator button to check how much he could borrow
Then estimates for borrow amount are displayed







