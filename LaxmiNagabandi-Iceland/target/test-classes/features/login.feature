Feature:   Login to iceland application
  In order to login to application
  As a valid user
  I should provide valid email and password

  @login
  Scenario:   Verify login with valid credentials

    Given    I navigate to url "https://www.iceland.co.uk/"
    Then     I should be navigated to home page
    When     I click on signin link
    And      I enter email as "lnagabandi@gmail.com"
    And      I enter password as "Lakshmi505"
    And      I click on signinsecurely button
    Then     I should be logged in successfully
    When     I click on welcome back link
    And      I click on my account link
    Then     I should be navigated to account details page
    When     I click on communication preferences link
    Then     I should be navigated to update communication preferences page
    And      Iceland marketing toggler should be set to true

