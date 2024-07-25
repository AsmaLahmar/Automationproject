#Author: AsmaLahmar
Feature: Dell HomePage

Scenario: selection de produit 
Given Admin is on Dell Homepage 
When Admin mousehovers on menu "Ordinateurs et accessoires" and submenu "Ordinateurs portables"
And Admin clicks on product "Ordinateurs portables XPS"
Then 	Admin is directed to the product page that contains the message "Ordinateurs portables XPS"
