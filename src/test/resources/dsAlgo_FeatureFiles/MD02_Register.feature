@registerScenario
Feature: Testing whether user is able to Registered into dsAlgo portal

  @TC17
  Scenario: Verify that user is able to land on Register Page
    Given The user is on the home page
    When The user clicks "Register" link on the Home page
    Then The user should be redirected to Register form

  @TC18
  Scenario: Verify that user receives error message for all empty fields during registration
    Given The user is on the user registration page
    When The user clicks Register button with all fields empty
    Then The error "Please fill out this field." appears below Username textbox

  @TC19
  Scenario: Verify that user receives error message for empty Password field during registration
    Given The user is on the user registration page
    When The user clicks Register button after entering Username with other fields empty
    Then The error message "Please fill out this field." appears below Password textbox

  @TC20
  Scenario: Verify that user receives error message for empty Password Confirmation field during registration
    Given The user is on the user registration page
    When The user clicks Register button after entering Password and Username with Password Confirmation empty
    Then The error message "Please fill out this field." appears below Password Confirmation textbox

  @TC21
  Scenario: Verify that user receives error message for invalid username field during registration
    Given The user is on the user registration page
    When The user clicks Register button after entering a username with spacebar characters other than digits and Special Characters
    Then The user is not able to see error msg after entering invalid data

  @TC22
  Scenario: Verify that user receives error message for invalid password field during registration
    Given The user is on the user registration page
    When The user clicks Register button after entering a password with numeric data
    Then The user is not able to see error msg after entering invalid password

  @TC23
  Scenario: Verify that user receives error message for mismatched Password and Password Confirmation field during registration
    Given The user is on the user registration page
    When The user clicks Register button after entering different passwords in Password and Password Confirmation fields
    Then The user should able to see an password warning message "password_mismatch:The two password fields didn’t match."

  @TC24
  Scenario: Verify that user is able to land on Homepage after registration with valid fields
    Given The user is on the user registration page
    When The user clicks Register button after entering with valid username, password and password confirmation in related textboxes
    Then The user should be redirected to Home Page of DS Algo with message "New Account Created. You are logged in as <ID>"

  @TC25
  Scenario: Verify that user is able to land in login page
    Given The user is on the home page
    When The user clicks "Sign out" Sign out link on the Home page
    Then The user should be redirected to home page with message "Logged out successfully"Logged out successfully
