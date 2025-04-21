@stackScenario
Feature: Testing Whether user is directed to "Stack" Data Structure Page

  @TC188
  Scenario: Verify that user is able to navigate to "Stack" data structure page
    Given The user is in the Home page after Sign in
    When "The user clicks the ""Getting Started"" button in Stack Panel OR The user select Stack item from the drop down menu"
    Then The user be directed to "Stack" Data Structure Page

  @TC189
  Scenario: Verify that user is able to navigate to "Operations in Stack" page
    Given The user is in the "Stack" page after Sign in
    When The user clicks "Operations in Stack" button
    Then The user should be redirected to "Operations in Stack" page

  @TC190
  Scenario: Verify that user is able to navigate to "try Editor" page for "Operations in Stack" page
    Given The user is on the "Operations in Stack" page
    When The user clicks "Try Here" button in Operations in Stack page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @TC191
  Scenario: Verify that user receives error when click on Run button without entering code for "Operations in Stack" page
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  @TC192
  Scenario: Verify that user receives error for invalid python code for "Operations in Stack" page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run button
    Then The user should able to see an error message in alert window

  @TC193
  Scenario: Verify that user is able to see output for valid python code for "Operations in Stack" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console

  @TC194
  Scenario: Verify that user is able to navigate to "Implementation" page
    Given The user is on the "Operations in Stack" page
    When The user clicks "Implementation" Implementation button
    Then The user should be redirected to "Implementation" Implementation page

  @TC195
  Scenario: Verify that user is able to navigate to "try Editor" page for "Implementation" page
    Given The user is on the "Implementation" page
    When The user clicks "Try Here" button in Implementation page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @TC196
  Scenario: Verify that user receives error when click on Run button without entering code for "Implementation" page
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  @TC197
  Scenario: Verify that user receives error for invalid python code for "Implementation" page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run button
    Then The user should able to see an error message in alert window

  @TC198
  Scenario: Verify that user is able to see output for valid python code for "Implementation" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console

  @TC199
  Scenario: Verify that user is able to navigate to "Applications" page
    Given The user is on the "Applications" page
    When The user clicks "Applications" Applications button
    Then The user should be redirected to "Applications" page

  @TC200
  Scenario: Verify that user is able to navigate to "try Editor" page for "Applications" page
    Given The user is on the "Applications" page
    When The user clicks "Try Here" button in Applications page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @TC201
  Scenario: Verify that user receives error when click on Run button without entering code for "Applications" page
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  @TC202
  Scenario: Verify that user receives error for invalid python code for "Applications" page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run button
    Then The user should able to see an error message in alert window

  @TC203
  Scenario: Verify that user is able to see output for valid python code for "Applications" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console

  @TC204
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Applications" page
    Given The user is on the "Applications" page
    When The user clicks "Practice Questions" button to test
    Then The user should be redirected to "Practice Questions" Practice Questions page

  @TC205
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Implementation" page
    Given The user is on the "Implementation" page
    When The user clicks "Practice Questions" button to test
    Then The user should be redirected to "Practice Questions" Practice Questions page

  @TC206
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Operations in Stack" page
    Given The user is on the "Operations in Stack" page
    When The user clicks "Practice Questions" button to test
    Then The user should be redirected to "Practice Questions" Practice Questions page
