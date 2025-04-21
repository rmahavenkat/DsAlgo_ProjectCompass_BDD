@Treefeature
Feature: Testing whether the user is navigating to Trees Page and perform actions

  @TC245
  Scenario: Verify that user is able to navigate to "Tree" data structure page
    Given The user is in the Home page after Sign in
    When The user clicks the "Getting Started" button in Tree Panel OR the user select Tree item from the drop down menu
    Then The user be redirected to "Tree" Tree Data Structure Page

  @TC246
  Scenario: Verify that user is able to navigate to "Overview of Trees" page
    Given The user is in the Tree page
    When The user clicks "Overview of Trees" Overview of Trees button
    Then The user should be redirected to "Overview of Trees" Tree page

  @TC247
  Scenario: Verify that user is able to navigate to "try Editor" page for "Overview of Trees" page
    Given The user is on the "Overview of Trees" Tree page
    When The user clicks "Try Here" Try Here button
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @TC248
  Scenario: Verify that user receives error when click on Run button without entering code for "Overview of Trees" page
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  @TC249
  Scenario: Verify that user receives error for invalid python code for "Overview of Trees" page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run button
    Then The user should able to see an error message in alert window

  @TC250
  Scenario: Verify that user is able to see output for valid python code for "Overview of Trees" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run button
    Then The user should able to see output in the console

  @TC251
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Overview of Trees" page
    Given The user is on the "Overview of Trees" Tree page
    When The user clicks "Practice Questions" Practice Questions button
    Then The user should be redirected to "Practice" Tree page

  @TC252
  Scenario: Verify that user is able to navigate to "Terminologies" page
    Given The user is on the "Overview of Trees" Tree page
    When The user clicks "Terminologies" Terminologies button
    Then The user should be redirected to "Terminologies" Tree page

  @TC253
  Scenario: Verify that user is able to navigate to "try Editor" page for "Terminologies" page
    Given The user is on the "Terminologies" Tree page
    When The user clicks "Try Here" Try Here button
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @TC254
  Scenario: Verify that user receives error when click on Run button without entering code for "Terminologies" page
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  @TC255
  Scenario: Verify that user receives error for invalid python code for "Terminologies" page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run button
    Then The user should able to see an error message in alert window

  @TC256
  Scenario: Verify that user is able to see output for valid python code for "Terminologies" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run button
    Then The user should able to see output in the console

  @TC257
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Terminologies" page
    Given The user is on the "Terminologies" Tree page
    When The user clicks "Practice Questions" Practice Questions button
    Then The user should be redirected to "Practice" Tree page

  @TC258
  Scenario: Verify that user is able to navigate to "Types of Trees" page
    Given The user is on the "Terminologies" Tree page
    When The user clicks "Types of Trees" Types of Trees button
    Then The user should be redirected to "Types of Trees" Tree page

  @TC259
  Scenario: Verify that user is able to navigate to "try Editor" page for "Types of Trees" page
    Given The user is on the "Types of Trees" Tree page
    When The user clicks "Try Here" Try Here button
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @TC260
  Scenario: Verify that user receives error when click on Run button without entering code for "Types of Trees" page
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  @TC261
  Scenario: Verify that user receives error for invalid python code for "Types of Trees" page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run button
    Then The user should able to see an error message in alert window

  @TC262
  Scenario: Verify that user is able to see output for valid python code for "Types of Trees" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run button
    Then The user should able to see output in the console

  @TC263
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Types of Trees" page
    Given The user is on the "Types of Trees" Tree page
    When The user clicks "Practice Questions" Practice Questions button
    Then The user should be redirected to "Practice" Tree page

  @TC264
  Scenario: Verify that user is able to navigate to "Tree Traversals" page
    Given The user is on the "Types of Trees" Tree page
    When The user clicks "Tree Traversals" Tree Traversals button
    Then The user should be redirected to "Tree Traversals" Tree page

  @TC265
  Scenario: Verify that user is able to navigate to "try Editor" page for "Tree Traversals" page
    Given The user is on the "Tree Traversals" Tree page
    When The user clicks "Try Here" Try Here button
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @TC266
  Scenario: Verify that user receives error when click on Run button without entering code for "Tree Traversals" page
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  @TC267
  Scenario: Verify that user receives error for invalid python code for "Tree Traversals" page	Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run button
    Then The user should able to see an error message in alert window

  @TC268
  Scenario: Verify that user is able to see output for valid python code for "Tree Traversals" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run button
    Then The user should able to see output in the console

  @TC269
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Tree Traversals" page
    Given The user is on the "Tree Traversals" Tree page
    When The user clicks "Practice Questions" Practice Questions button
    Then The user should be redirected to "Practice" Tree page

  @TC270
  Scenario: Verify that user is able to navigate to "Traversals-Illustration" page
    Given The user is on the "Tree Traversals" Tree page
    When The user clicks "Traversals-Illustration" Traversals-Illustration button
    Then The user should be redirected to "Traversals-Illustration" Tree page

  @TC271
  Scenario: Verify that user is able to navigate to "try Editor" page for "Traversals-Illustration" page
    Given The user is on the "Traversals-Illustration" Tree page
    When The user clicks "Try Here" Try Here button
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @TC272
  Scenario: Verify that user receives error when click on Run button without entering code for "Traversals-Illustration" page
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  @TC273
  Scenario: Verify that user receives error for invalid python code for "Traversals-Illustration" page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run button
    Then The user should able to see an error message in alert window

  @TC274
  Scenario: Verify that user is able to see output for valid python code for "Traversals-Illustration" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run button
    Then The user should able to see output in the console

  @TC275
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Traversals-Illustration" page
    Given The user is on the "Traversals-Illustration" Tree page
    When The user clicks "Practice Questions" Practice Questions button
    Then The user should be redirected to "Practice" Tree page

  @TC276
  Scenario: Verify that user is able to navigate to "Binary Trees" page
    Given The user is on the "Traversals-Illustration" Tree page
    When The user clicks "Binary Trees" Binary Trees button
    Then The user should be redirected to "Binary Trees" Tree page

  @TC277
  Scenario: Verify that user is able to navigate to "try Editor" page for "Binary Trees" page
    Given The user is on the "Binary Trees" Tree page
    When The user clicks "Try Here" Try Here button
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @TC278
  Scenario: Verify that user receives error when click on Run button without entering code for "Binary Trees" page
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  @TC279
  Scenario: Verify that user receives error for invalid python code for "Binary Trees" page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run button
    Then The user should able to see an error message in alert window

  @TC280
  Scenario: Verify that user is able to see output for valid python code for "Binary Trees" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run button
    Then The user should able to see output in the console

  @TC281
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for " Binary Trees" page
    Given The user is on the "Binary Trees" Tree page
    When The user clicks "Binary Trees" Binary Trees button
    Then The user should be redirected to "Practice" Tree page

  @TC282
  Scenario: Verify that user is able to navigate to "Types of Binary Trees" page
    Given The user is on the "Traversals-Illustration" Tree page
    When The user clicks "Types of Binary Trees" Types of Binary Trees button
    Then The user should be redirected to "Types of Binary Trees" Tree page

  @TC283
  Scenario: Verify that user is able to navigate to "try Editor" page for "Types of Binary Trees" page
    Given The user is on the "Binary Trees" Tree page
    When The user clicks "Try Here" Try Here button
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @TC284
  Scenario: Verify that user receives error when click on Run button without entering code for "Types of Binary Trees" page
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  @TC285
  Scenario: Verify that user receives error for invalid python code for "Types of Binary Trees" page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run button
    Then The user should able to see an error message in alert window

  @TC286
  Scenario: Verify that user is able to see output for valid python code for "Types of Binary Trees" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run button
    Then The user should able to see output in the console

  @TC287
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Types of Binary Trees" page
    Given The user is on the "Types of Binary Trees" Tree page
    When The user clicks "Practice Questions" Practice Questions button
    Then The user should be redirected to "Practice" Tree page

  @TC288
  Scenario: Verify that user is able to navigate to "Implementation in python" page
    Given The user is on the "Types of Binary Trees" Tree page
    When The user clicks "Implementation in python" Implementation in python button
    Then The user should be redirected to "Implementation in python" Tree page

  @TC289
  Scenario: Verify that user is able to navigate to "try Editor" page for "Implementation in python" page
    Given The user is on the "Implementation in python" Tree page
    When The user clicks "Try Here" Try Here button
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @TC290
  Scenario: Verify that user receives error when click on Run button without entering code for "Implementation in python" page
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  @TC291
  Scenario: Verify that user receives error for invalid python code for "Implementation in python" page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run button
    Then The user should able to see an error message in alert window

  @TC292
  Scenario: Verify that user is able to see output for valid python code for"Implementation in python" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run button
    Then The user should able to see output in the console

  @TC293
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Implementation in python" page
    Given The user is on the "Implementation in python" Tree page
    When The user clicks "Practice Questions" Practice Questions button
    Then The user should be redirected to "Practice" Tree page

  @TC-294
  Scenario: Verify that user is able to navigate to "Binary Tree Traversals" page
    Given The user is on the "Implementation in python" Tree page
    When The user clicks "Binary Tree Traversals" Binary Tree Traversals button
    Then The user should be redirected to "Binary Tree Traversals" Tree page

  @TC-295
  Scenario: Verify that user is able to navigate to "try Editor" page for  "Binary Tree Traversals" page
    Given The user is on the "Binary Tree Traversals" Tree page
    When The user clicks "Try Here" Try Here button
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @TC-296
  Scenario: Verify that user receives error when click on Run button without entering code for  "Binary Tree Traversals" page
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  @TC-297
  Scenario: Verify that user receives error for invalid python code for  "Binary Tree Traversals" page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run button
    Then The user should able to see an error message in alert window

  @TC-298
  Scenario: Verify that user is able to see output for valid python code for "Binary Tree Traversals" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run button
    Then The user should able to see output in the console

  @TC-299
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for  "Binary Tree Traversals" page
    Given The user is on the "Binary Tree Traversals" Tree page
    When The user clicks "Practice Questions" Practice Questions button
    Then The user should be redirected to "Practice" Tree page

  @TC-300
  Scenario: Verify that user is able to navigate to "Implementation of Binary Trees" page
    Given The user is on the "Binary Tree Traversals" Tree page
    When The user clicks "Implementation of Binary Trees" Implementation of Binary Trees button
    Then The user should be redirected to "Implementation of Binary Trees" Tree page

  @TC-301
  Scenario: Verify that user is able to navigate to "try Editor" page for  "Implementation of Binary Trees" page
    Given The user is on the "Implementation of Binary Trees" Tree page
    When The user clicks "Try Here" Try Here button
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @TC-302
  Scenario: Verify that user receives error when click on Run button without entering code for "Implementation of Binary Trees" page
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  @TC-303
  Scenario: Verify that user receives error for invalid python code for "Implementation of Binary Trees" page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run button
    Then The user should able to see an error message in alert window

  @TC-304
  Scenario: Verify that user is able to see output for valid python code for "Implementation of Binary Trees" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run button
    Then The user should able to see output in the console

  @TC-305
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for  "Implementation of Binary Trees" page
    Given The user is on the "Implementation of Binary Trees" Tree page
    When The user clicks "Practice Questions" Practice Questions button
    Then The user should be redirected to "Practice" Tree page

  @TC-306
  Scenario: Verify that user is able to navigate to "Application of Binary Trees" page
    Given The user is on the "Implementation of Binary Trees" Tree page
    When The user clicks "Application of Binary Trees" Application of Binary Trees button
    Then The user should be redirected to "Application of Binary Trees" Tree page

  @TC-307
  Scenario: Verify that user is able to navigate to "try Editor" page for  "Application of Binary Trees" page
    Given The user is on the "Application of Binary Trees" Tree page
    When The user clicks "Try Here" Try Here button
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @TC-308
  Scenario: Verify that user receives error when click on Run button without entering code for  "Application of Binary Trees" page
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  @TC-309
  Scenario: Verify that user receives error for invalid python code for "Application of Binary Trees" page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run button
    Then The user should able to see an error message in alert window

  @TC-310
  Scenario: Verify that user is able to see output for valid python code for  "Application of Binary Trees" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run button
    Then The user should able to see output in the console

  @TC-311
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for  "Application of Binary Trees" page
    Given The user is on the "Application of Binary Trees" Tree page
    When The user clicks "Practice Questions" Practice Questions button
    Then The user should be redirected to "Practice" Tree page

  @TC-312
  Scenario: Verify that user is able to navigate to "Binary Search Trees" page
    Given The user is on the "Application of Binary Trees" Tree page
    When The user clicks "Binary Search Trees" Binary Search Trees button
    Then The user should be redirected to "Binary Search Trees" Tree page

  @TC-313
  Scenario: Verify that user is able to navigate to "try Editor" page for "Binary Search Trees" page
    Given The user is on the "Binary Search Trees" Tree page
    When The user clicks "Try Here" Try Here button
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @TC-314
  Scenario: Verify that user receives error when click on Run button without entering code for "Binary Search Trees" page
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  @TC-315
  Scenario: Verify that user receives error for invalid python code for "Binary Search Trees" page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run button
    Then The user should able to see an error message in alert window

  @TC-316
  Scenario: Verify that user is able to see output for valid python code for "Binary Search Trees" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run button
    Then The user should able to see output in the console

  @TC-317
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Binary Search Trees" page
    Given The user is on the "Application of Binary Trees" Tree page
    When The user clicks "Binary Search Trees" Binary Search Trees button
    Then The user should be redirected to "Practice" Tree page

  @TC318
  Scenario: Verify that user is able to navigate to "Implementation of BST" page
    Given The user is on the "Binary Search Trees" Tree page
    When The user clicks "Implementation of BST" Implementation of BST button
    Then The user should be redirected to "Implementation of BST" Tree page

  @TC319
  Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Implementation of BST" page
    Given The user is on the "Implementation of BST" Tree page
    When The user clicks "Practice Questions" Practice Questions button
    Then The user should be redirected to "Practice" Tree page

  @TC320
  Scenario: Verify that user is able to navigate to "try Editor" page for "Implementation of BST" page
    Given The user is on the "Implementation of BST" Tree page
    When The user clicks "Try Here" Try Here button
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @TC321
  Scenario: Verify that user receives error when click on Run button without entering code for"Implementation of BST" page
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  @TC322
  Scenario: Verify that user receives error for invalid python code for "Implementation of BST" page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run button
    Then The user should able to see an error message in alert window

  @TC323
  Scenario: Verify that user is able to see output for valid python code for "Implementation of BST" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run button
    Then The user should able to see output in the console
