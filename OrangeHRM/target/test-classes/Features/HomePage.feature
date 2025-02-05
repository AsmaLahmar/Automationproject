#Author: AsmaLahmar
Feature: HomePageOrangeHRM

  Scenario Outline: Accès aux pages de chaque menu de la page dacceuil
    Given Admin is connected with the correct username "Admin" and the correct password "admin123"
    When Admin clicks on menu name "<menu>"
    Then Admin is directed to the page that contains the name of the "<menu>"

    Examples: 
      | menu         |
      | Admin        |
      | PIM          |
      | Leave        |
      | Time         |
      | Recruitement |
      | My Info      |
      | Performance  |
      | Dashboard    |
      | Directory    |
      | Maintenance  |
      | Claim        |
      | Buzz         |
