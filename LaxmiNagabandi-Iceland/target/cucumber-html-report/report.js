$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "Login to iceland application",
  "description": "  In order to login to application\n  As a valid user\n  I should provide valid email and password",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to url \"https://www.iceland.co.uk/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.i_navigate_to_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be navigated to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.i_should_be_navigated_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on signin link",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.i_click_on_signin_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter email as \"lnagabandi@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.i_enter_email_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter password as \"Lakshmi505\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.i_enter_password_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on signinsecurely button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.i_click_on_signinsecurely_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be logged in successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.i_should_be_logged_in_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on welcome back link",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.i_click_on_welcome_back_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on my account link",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.i_click_on_my_account_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be navigated to account details page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.i_should_be_navigated_to_account_details_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on communication preferences link",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.i_click_on_communication_preferences_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be navigated to update communication preferences page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.i_should_be_navigated_to_update_communication_preferences_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Iceland marketing toggler should be set to true",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.iceland_marketing_toggler_should_be_set_to_true()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});