@LinkedListfeature
Feature: Testing whether the user is navigating to Linked List Page and perform actions

  Background: 
            The user sign in to dsAlgo Portal
  @TC145
  Scenario: Verify that user is able to navigate to "Linked List" Data Structure page
    Given The user is in the Home page after logged in Linked List
    When The user clicks the "Getting Started" Getting Started button in Linked List panel OR The user select Linked List item from the drop down menu
    Then The user should land in "Linked-List Page"

  @TC146
  Scenario: Verify that user is able to navigate to "Introduction" page
    Given The user is in the "Linked list" page Sign in
    When The user clicks "Introduction" Introduction button
    Then The user should be redirected to "Introduction" Linked List page.

  @TC147
  Scenario: Verify that user is able to navigate to "Practice Questions" page
    Given The user is in the "Introduction"
    When The user clicks the "Practice Questions" Practice Questions button
    Then The user should be redirected to "Practice Questions" Linked List page.

  @TC148
  Scenario: Verify that user is able to navigate to "try Editor" page
    Given The user is in the "Introduction"
    When The user clicks "Try Here" Try Here button
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @TC149
  Scenario: Verify that user receives error when click on Run button without entering code
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  @TC150
  Scenario: Verify that user receives error for invalid python code
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run button
    Then The user should able to see an error message in alert window

  @TC151
  Scenario: Verify that user is able to see output for valid python code
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run button
    Then The user should able to see output in the console

  @TC152
  Scenario: Verify that user is able to navigate to "creating Linked List" page
    Given The user is in the "Introduction"
    When The user clicks "creating Linked List" creating Linked List button
    Then The user should be redirected to "creating Linked List" Linked List page.

  @TC153
  Scenario: Verify that user is able to navigate to "Practice Questions" page
    Given The user is in the "creating Linked List"
    When The user clicks the "Practice Questions" Practice Questions button
    Then The user should be redirected to "Practice Questions" Linked List page.

  @TC154
  Scenario: Verify that user is able to navigate to "try Editor" page
    Given The user is in the "creating Linked List"
    When The user clicks "Try Here" Try Here button
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @TC155
  Scenario: Verify that user receives error when click on Run button without entering code
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  @TC156
  Scenario: Verify that user receives error for invalid python code
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run button
    Then The user should able to see an error message in alert window

  @TC157
  Scenario: Verify that user is able to see output for valid python code
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run button
    Then The user should able to see output in the console

  @TC158
  Scenario: Verify that user is able to navigate to "Types of Linked List" page
    Given The user is in the "creating Linked List"
    When The user clicks "Types of Linked List" types of Linked List button
    Then The user should be redirected to "Types of Linked List" Linked List page.

  @TC159
  Scenario: Verify that user is able to navigate to "Practice Questions" page
    Given The user is in the "Types of Linked List"
    When The user clicks the "Practice Questions" Practice Questions button
    Then The user should be redirected to "Practice Questions" Linked List page.

  @TC160
  Scenario: Verify that user is able to navigate to "try Editor" page
    Given The user is in the "Types of Linked List"
    When The user clicks "Try Here" Try Here button
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @TC161
  Scenario: Verify that user receives error when click on Run button without entering code
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  @TC162
  Scenario: Verify that user receives error for invalid python code
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run button
    Then The user should able to see an error message in alert window

  @TC163
  Scenario: Verify that user is able to see output for valid python code
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run button
    Then The user should able to see output in the console

  @TC164
  Scenario: Verify that user is able to navigate to "Implement Linked List in phyton" page
    Given The user is in the "Types of Linked List"
    When The user clicks "Implement Linked List in phyton" Implement Linked List in phyton button
    Then The user should be redirected to "Implement Linked List in phyton" Linked List page.

  @TC165
  Scenario: Verify that user is able to navigate to "Practice Questions" page
    Given The user is in the "Implement Linked List in phyton"
    When The user clicks the "Practice Questions" Practice Questions button
    Then The user should be redirected to "Practice Questions" Linked List page.

  @TC166
  Scenario: Verify that user is able to navigate to "try Editor" page
    Given The user is in the "Implement Linked List in phyton"
    When The user clicks "Try Here" Try Here button
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @TC167
  Scenario: Verify that user receives error when click on Run button without entering code
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  @TC168
  Scenario: Verify that user receives error for invalid python code
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run button
    Then The user should able to see an error message in alert window

  @TC169
  Scenario: Verify that user is able to see output for valid python code
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run button
    Then The user should able to see output in the console

  @TC170
  Scenario: Verify that user is able to navigate to "Traversal" page
    Given The user is in the "Implement Linked List in phyton"
    When The user clicks "Traversal" Traversal button
    Then The user should be redirected to "Traversal" Linked List page.

  @TC171
  Scenario: Verify that user is able to navigate to "Practice Questions" page
    Given The user is in the "Traversal"
    When The user clicks the "Practice Questions" Practice Questions button
    Then The user should be redirected to "Practice Questions" Linked List page.

  @TC172
  Scenario: Verify that user is able to navigate to "try Editor" page
    Given The user is in the "Traversal"
    When The user clicks "Try Here" Try Here button
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @TC173
  Scenario: Verify that user receives error when click on Run button without entering code
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  @TC174
  Scenario: Verify that user receives error for invalid python code
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run button
    Then The user should able to see an error message in alert window

  @TC175
  Scenario: Verify that user is able to see output for valid python code
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run button
    Then The user should able to see output in the console

  @TC176
  Scenario: Verify that user is able to navigate to "Insertion" page
    Given The user is in the "Traversal"
    When The user clicks "Insertion" Insertion button
    Then The user should be redirected to "Insertion" Linked List page.

  @TC177
  Scenario: Verify that user is able to navigate to "Practice Questions" page
    Given The user is in the "Insertion"
    When The user clicks the "Practice Questions" Practice Questions button
    Then The user should be redirected to "Practice Questions" Linked List page.

  @TC178
  Scenario: Verify that user is able to navigate to "try Editor" page
    Given The user is in the "Insertion"
    When The user clicks "Try Here" Try Here button
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @TC179
  Scenario: Verify that user receives error when click on Run button without entering code
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  @TC180
  Scenario: Verify that user receives error for invalid python code
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run button
    Then The user should able to see an error message in alert window

  @TC181
  Scenario: Verify that user is able to see output for valid python code
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run button
    Then The user should able to see output in the console

  @TC182
  Scenario: Verify that user is able to navigate to "Deletion" page
    Given The user is in the "Insertion"
    When The user clicks "Deletion" Deletion button
    Then The user should be redirected to "Deletion" Linked List page.

  @TC183
  Scenario: Verify that user is able to navigate to "Practice Questions" page
    Given The user is in the "Deletion"
    When The user clicks the "Practice Questions" Practice Questions button
    Then The user should be redirected to "Practice Questions" Linked List page.

  @TC184
  Scenario: Verify that user is able to navigate to "try Editor" page
    Given The user is in the "Deletion"
    When The user clicks "Try Here" Try Here button
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @TC185
  Scenario: Verify that user receives error
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  @TC186
  Scenario: Verify that user receives error for invalid python code
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run button
    Then The user should able to see an error message in alert window

  @TC187
  Scenario: Verify that user is able to see output for valid python code
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run button
    Then The user should able to see output in the console
