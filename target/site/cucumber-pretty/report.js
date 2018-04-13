$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "LoginFeature",
  "description": "This feature deals with the login functionality of the application",
  "id": "loginfeature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 465971,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Login with correct username and password",
  "description": "",
  "id": "loginfeature;login-with-correct-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I navigate to the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter UserName and Password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.INavigateToTheLoginPage()"
});
formatter.result({
  "duration": 62567955201,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iEnterUserNameAndPassword()"
});
formatter.result({
  "duration": 2512598134,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.iClickOnLoginButton()"
});
formatter.result({
  "duration": 814172272,
  "status": "passed"
});
formatter.after({
  "duration": 100070,
  "status": "passed"
});
});