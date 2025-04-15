@queueScenario
Feature: Testing Whether user is directed to "Queue" Data Structure Page

@TC207
Scenario: Verify that user is able to navigate to "Queue" data structure page

    Given The user is in the Home page after Sign in
    When The user clicks the "Getting Started" button in Queue Panel OR The user select Queue item from the drop down menu
    Then The user be redirected to "Queue" Data Structure Page

 @TC208
Scenario: Verify that user is able to navigate to "Implementation of Queue in Python" page

    Given The user is in the "Queue" Data Structure Page
    When The user clicks "Implementation of Queue in Python" button in the Queue page
    Then The user be redirected to "Implementation of Queue in Python" page
    
 @TC209
Scenario: Verify that user is able to navigate to "try Editor" page for "Implementation of Queue in Python" page

    Given The user is in the "Implementation of Queue in Python" Data Structure Page
    When The user clicks "Try Here" button in Implementation of Queue in Python page
    Then The user should be redirected to a page having an try Editor with a Run button
    
 @TC210
Scenario: Verify that user receives error when click on Run button without entering code for "Implementation of Queue in Python" page

     Given The user is in the tryEditor page for "Implementation of Queue in Python"
     When The user clicks the Run Button without entering the code in the tryEditor
     Then The user should able to see an error message in alert window for "Implementation of Queue in Python"

@TC211
Scenario: Verify that user receives error for invalid python code for "Implementation of Queue in Python" page

     Given The user is in the tryEditor page for "Implementation of Queue in Python"
     When The user write the invalid code in tryEditor and click the Run Button
     Then The user should able to see an error message in alert window for "Implementation of Queue in Python"
     
 @TC212
Scenario: Verify that user is able to see output for valid python code for "Implementation of Queue in Python" page

     Given The user is in the tryEditor page for "Implementation of Queue in Python"
     When The user write the valid code in tryEditor and click the Run Button
     Then The user should able to see output in console
     
 @TC213
Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Implementation of Queue in Python" page

    Given The user is in the "Queue" Data Structure Page
    When The user clicks "Practice Questions" button in the Queue page
    Then The user be redirected to "Practice Questions" page
    
 @TC214
Scenario: Verify that user is able to navigate to "Implementation using collections.deque" page

    Given The user is in the "Queue" Data Structure Page
    When The user clicks "Implementation using collections.deque" button in the Queue page
    Then The user be redirected to "Implementation using collections.deque" page
    
 @TC215
Scenario: Verify that user is able to navigate to "try Editor" page for "Implementation using collections.deque" page

    Given The user is in the "Implementation using collections.deque" Page
    When The user clicks  "Try Here" button in Implementation using collections.deque page
    Then The user should be redirected to a page having an try Editor with a Run button
    
  @TC216
Scenario: Verify that user receives error when click on Run button without entering code for "Implementation using collections.deque" page

     Given The user is in the tryEditor page for "Implementation using collections.deque"
     When The user clicks the Run Button without entering the code in the tryEditor
     Then The user should able to see an error message in alert window for "Implementation using collections.deque"
     
  @TC217
Scenario: Verify that user receives error for invalid python code for "Implementation using collections.deque" page

     Given The user is in the tryEditor page for "Implementation using collections.deque"
     When The user write the invalid code in tryEditor and click the Run Button
     Then The user should able to see an error message in alert window for "Implementation using collections.deque"
     
   @TC218
Scenario: Verify that user is able to see output for valid python code for "Implementation using collections.deque" page

     Given The user is in the tryEditor page for "Implementation using collections.deque"
     When The user write the valid code in tryEditor and click the Run Button
     Then The user should able to see output in console
     
  @TC219
Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Implementation using collections.deque" page

     Given The user is in the "Queue" Data Structure Page
    When The user clicks "Practice Questions" button in the Queue page
    Then The user be redirected to "Practice Questions" page
    
  @TC220
Scenario: Verify that user is able to navigate to "Implementation using array" page

    Given The user is in the "Queue" Data Structure Page
    When The user clicks "Implementation using array" button in the Queue page
    Then The user be redirected to "Implementation using array" page
    
   @TC221
Scenario: Verify that user is able to navigate to "try Editor" page for "Implementation using array" page

    Given The user is in the "Implementation using array" Page
    When The user clicks  "Try Here" button in Implementation using array page
    Then The user should be redirected to a page having an try Editor with a Run button
    
   @TC222
Scenario: Verify that user receives error when click on Run button without entering code for "Implementation of Queue in Python" page

     Given The user is in the tryEditor page for "Implementation using array"
     When The user clicks the Run Button without entering the code in the tryEditor
     Then The user should able to see an error message in alert window for "Implementation using array"

@TC223
Scenario: Verify that user receives error for invalid python code for "Implementation using array" page

     Given The user is in the tryEditor page for "Implementation using array"
     When The user write the invalid code in tryEditor and click the Run Button
     Then The user should able to see an error message in alert window for "Implementation using array"
     
 @TC224
Scenario: Verify that user is able to see output for valid python code for "Implementation using array" page

     Given The user is in the tryEditor page for "Implementation using array"
     When The user write the valid code in tryEditor and click the Run Button
     Then The user should able to see output in console
     
  @TC225
Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Implementation using array" page

    Given The user is in the "Queue" Data Structure Page
    When The user clicks "Practice Questions" button in the Queue page
    Then The user be redirected to "Practice Questions" page
    
  @TC226
Scenario: Verify that user is able to navigate to "Queue Operations" page

    Given The user is in the "Queue" Data Structure Page
    When The user clicks "Queue Operations" button in the Queue page
    Then The user be redirected to "Queue Operations" page
    
   @TC227
Scenario: Verify that user is able to navigate to "try Editor" page for "Queue Operations" page

    Given The user is in the "Queue Operations" Page
    When The user clicks  "Try Here" button in Queue Operations page
    Then The user should be redirected to a page having an try Editor with a Run button
    
   @TC228
Scenario: Verify that user receives error when click on Run button without entering code for "Queue Operations" page

     Given The user is in the tryEditor page for "Queue Operations"
     When The user clicks the Run Button without entering the code in the tryEditor
     Then The user should able to see an error message in alert window for "Queue Operations"
     
  @TC229
Scenario: Verify that user receives error for invalid python code for "Queue Operations" page

     Given The user is in the tryEditor page for "Queue Operations"
     When The user write the invalid code in tryEditor and click the Run Button
     Then The user should able to see an error message in alert window for "Queue Operations"
     
 @TC230
Scenario: Verify that user is able to see output for valid python code for "Queue Operations" page

     Given The user is in the tryEditor page for "Queue Operations"
     When The user write the valid code in tryEditor and click the Run Button
     Then The user should able to see output in console
     
  @TC231
Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Queue Operations" page

    Given The user is in the "Queue" Data Structure Page
    When The user clicks "Practice Questions" button in the Queue page
    Then The user be redirected to "Practice Questions" page
    

   
  
  
 
 
 
 
     
 

 
  