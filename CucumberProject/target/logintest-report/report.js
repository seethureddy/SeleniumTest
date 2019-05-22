$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:loginpage.feature");
formatter.feature({
  "name": "To check the login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on wordpress.org website",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_wordpress_org_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter some text and click enter",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.user_enter_some_text_and_click_enter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button in the new screen",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.click_on_login_button_in_the_new_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on Login Screen and enter Valid Username and Password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_Login_Screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click Submit to Validate",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.click_Submit_to_Validate()"
});
formatter.result({
  "status": "passed"
});
});