@Loginfeature
Feature: Testing whether user is able to login and perform actions

  @TC26
  Scenario: Verify that user is able to land on Login Page
    Given The user is on the DS Algo Home Page
    When The user should click the Sign in link
    Then The user should be redirected to Sign in page

  @TC27
  Scenario: Verify that user receives error message for all empty fields during Login
    Given The user is on the DS Algo Sign in Page
    When The user clicks login button after leaving the "Username" textbox and "Password" textbox empty
    Then The error message "Please fill out this field." appears below Username textbox

  @TC28
  Scenario: Verify that user receives error message for empty Password field during Login
    Given The user is on the DS Algo Sign in Page
    When The user clicks login button after entering the "Username" and leaves "Password" textbox empty
    Then The login error message "Please fill out this field." appears below Password textbox

  @TC29
  Scenario: Verify that user receives error message for empty Username field during Login
    Given The user is on the DS Algo Sign in Page
    When The user clicks login button after entering the Password only
    Then The error message "Please fill out this field." appears below Username textbox

  @TC30
  Scenario: Verify that user receives error message for invalid Username field during Login
    Given The user is on the DS Algo Sign in Page
    When The user clicks login button after entering invalid username and valid password
    Then The user should able to see an error message "Invalid username and password".

  @TC31
  Scenario: Verify that user able to land on Home page after entering valid Username and Password fields
    Given The user is on the DS Algo Sign in Page
    When The user clicks login button after entering valid username and valid password
    Then The user should land in Data Structure Home Page with message "You are logged in"

  @TC32
  Scenario: Verify that user able to sign out successfully
    Given The user is in the Home page after Sign in
    When The user clicks "Sign out"
    Then The user should be redirected to home page with message "Logged out successfully"
