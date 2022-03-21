# Autor: Santiago Hernandez Rojo

@RetoChoucair
Feature: Web Automation Demo Site
  As a web user
  Santiago wants to access the Web Automation Demo Site
  To register on the page

  @RunnerTags
  Scenario: Access the page and registered
    Given Santiago wants to access the Web Automation Demo Site
    When he performs the registration on the page
#      | first_name | last_name | address            | email_address         | phone      | gender | hobbies        | languages      | skills         | country | select_country | year | month   | day | password       | confirm_password |
      | Santiago   | Hernandez | Calle 23 N 24 - 25 | shernandez@prueba.com | 3134569586 | Male   | Hockey, Movies | Arabic,Catalan | Certifications | Albania | Japan          | 1987 | January | 10  | Medellin2022+* | Medellin2022+*   |
    Then he verifies that the screen is loaded with text - Double Click on Edit Icon to EDIT the Table Row.

