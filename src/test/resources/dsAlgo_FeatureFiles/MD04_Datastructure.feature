@datastructuresfeature
Feature: Testing whether the user is navigating to DataStructures Page and perform actions

  Background: 
            The user sign in to dsAlgo Portal
  @TC33
  Scenario: Verify that user is able to navigate to "Data Structures - Introduction" page
    Given The user is in the Home page after logged in
    When The user clicks the "Get Started" button in Data Structures - Introduction
    Then The user should land in "Data Structures- Introduction" Data Structures- Introduction page

  @TC34
  Scenario: Verify that user is able to navigate to "Time Complexity" time complexity page
    Given The user is in the Data Structures - Introduction page
    When The user clicks "Time Complexity" Time Complexity button
    Then The user should be redirected to "Time Complexity" Time Complexity of Data structures-Introduction

  @TC35
  Scenario: Verify that user is able to navigate to "Practice Questions" page
    Given The user is in the "Time Complexity" Time Complexity page
    When The user clicks the "Practice Questions"  Practice Questions button
    Then The user should be redirected to "Practice Questions" Practice Questions of Data structures-Introduction

  @TC36
  Scenario: Verify that user is able to navigate to "try Editor" try Editor page
    Given The user is in the "Time Complexity" Time Complexity page
    When The user clicks "Try Here" Try Here button in Time Complexity page
    Then The user should be redirected to a page having an try Editor with a Run button to test in Time Complexity pag

  @TC37
  Scenario: Verify that user receives error when click on Run button without entering code
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  @TC38
  Scenario: Verify that user receives error for invalid python code
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run button
    Then The user should able to see an error message in alert window

  @TC39
  Scenario: Verify that user is able to see output for valid python code
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run button
    Then The user should able to see output in the console
