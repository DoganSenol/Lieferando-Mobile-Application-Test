@deneme
Feature: Lieferando Funtionality Test

  Scenario: Lieferando Test

    When The User select the Location on the Select your Location Button
    And  The User enter the Location in the Search Input
    Then The User select the first Restaurant
    And  The User select the plus Button for the first food
    Then The User press on the price Button
    And  The User go in to Basket
    Then The User press on the checkout Button
    And  The User enter the delivery Address and Personal details
    And  The User press on the pay with Button
    Then The User select Paypal as payment method
    Then The User complete the Order

