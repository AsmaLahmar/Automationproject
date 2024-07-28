#Author: AsmaLahmar
Feature: HomePageXiaomi
Scenario: MouseHover over menus , choose a submenu then redirected to the page of submenu chosen

Given Admin is on Xiaomi HomePage
When Admin clicks on Menu "Smart Home" and on submenu  "Maison Connectée"
Then  Admin is redirected to the page that contains the chosen submenu "Maison Connectée"

Scenario: Click on product

Given Admin is on product page 
When Admin clicks on the chosen product "Mi Door Window Sensor 2" 
Then Admin is directed to the page of the product that contains the title "Mi Door Window Sensor 2"

Scenario: Add product to cart 

Given Admin is on page product 
When Admin adds product to the cart and clicks on cart
Then Admin is on the cart page and the product "Mi Temperature and Humidity Monitor Pro" has been added 