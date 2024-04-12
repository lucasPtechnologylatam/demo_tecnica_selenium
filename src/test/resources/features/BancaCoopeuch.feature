Feature: Navigation

Scenario: I go to url to the website coopeuch
    Given I go to the website to Coopeuch

Scenario: I do a login in Coopeuch en Linea
    Given I click on input username
    And I send my username to input Ingresa tu Rut
    And I click on input password
    And I send my password to input Ingresa tu clave internet
    Then I cick on button Ingresar

Scenario: I choose a simulate credits on my products
    Given I click on button Credito Consumo
    And I click on Simular
    And I click on amount input
    And I write the amount to simulate
    And I click on the installments
    And I write the number of installments
    Then I click on Simular credits