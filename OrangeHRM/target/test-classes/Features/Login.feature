#Author: Asma Lahmar

Feature: OrangeHRM Login Page
Scenario: Login with valid credentials
Given Admin is on Login page 
When Admin enters correct username "Admin" and correct password "admin123"
Then Admin is directed to the Homepage that contains message "Dashboard" 

Scenario: Login with invalid crendentials 
Given Admin is on Login page
When Admin enters correct username "Admin" and wrong password "123admin"
Then Admin is not directed to the Homepage and an error message shows containing "Invalid credentials"

