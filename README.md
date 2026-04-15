# ST10347225_PROG5121_POE_PART1
YouTube Link : https://youtu.be/EKP72MIa6iA


 POE Part 1 – Registration and Login System (Java)

 Project Overview

This project is a console-based Java application** developed for the PROG5121 Programming 1A POE (Part 1).

The application allows users to:

 Register an account using a username, password, and South African cell phone number
 Validate input using specific rules
 Log in using registered credentials
Receive appropriate success or error messages

The project also includes **JUnit unit tests** to verify that all functionality works correctly.



 Features Implemented

 1. User Registration

The system prompts the user to enter:

 First name
 Last name
 Username
 Password
 Cell phone number

 Validation Rules:

Username

   Must contain an underscore (_)
   Must not exceed 5 characters

 Password

   Minimum 8 characters
   At least one uppercase letter
   At least one number
   At least one special character

Cell Phone Number**

   Must start with +27
   Must be followed by 9 digits



 2. Login System

 User logs in using the registered username and password
 System checks if credentials match stored values

 Output Messages:

* Success:

  
  Welcome <First Name>, <Last Name> it is great to see you again.
  
Failure:

  Username or password incorrect, please try again.
  

 3. Input Validation Methods

The following methods are implemented in the `Login` class:

| Method                      | Description                         |
| --------------------------- | ----------------------------------- |
| `checkUserName()`           | Validates username format           |
| `checkPasswordComplexity()` | Validates password rules            |
| `checkCellPhoneNumber()`    | Validates SA phone number           |
| `registerUser()`            | Returns registration result message |
| `loginUser()`               | Verifies login credentials          |
| `returnLoginStatus()`       | Returns login message               |


 4. Unit Testing (JUnit)

JUnit tests are included to verify:

 Username validation (valid & invalid)
 Password validation (valid & invalid)
 Cell phone validation (valid & invalid)
 Login success and failure
 Registration success and failure messages
 Login status messages



 Technologies Used

 Java (JDK 8 or higher)
 NetBeans / IntelliJ IDE
 JUnit 4
 Regular Expressions (Regex)


 How to Run the Project

1. Open the project in NetBeans or IntelliJ
2. Compile the project
3. Run `POE_Part1.java`
4. Follow the console prompts


 Running Unit Tests

1. Open `LoginTest.java`
2. Right-click → Run Tests
3. Ensure all tests pass 


 Project Structure

poe_part1

-Login.java          # Main logic class
- POE_Part1.java      # Main program (user interaction)
-LoginTest.java      # Unit tests



 Important Notes

* This is a **console application only** (no GUI used)
* All validation messages match POE requirements exactly
* Regex for phone validation is adapted from online sources and referenced in code
* Code is written following clean coding practices and OOP principles



 Author

Maanda Mahuwa


 Status
 Part 1 Complete
Fully functional
Unit tested
 Ready for submission


 Next Steps

* Implement **Part 2: Messaging System**
* Add message storage and processing
* Extend functionality using loops and arrays

