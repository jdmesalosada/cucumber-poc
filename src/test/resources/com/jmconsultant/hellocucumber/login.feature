Feature: Login

  Scenario: Login with valid credentials
    Given Jhon Wick is an user that enjoys to travel
    And he wants to log in in order to purchase flights in sales
    When he sends username "wick" and password "pass1"
    Then he should navigate to the url "dahsboard"

  Scenario: Login with no valid credentials
    Given Jhon Wick is an user that enjoys to travel
    And he wants to log in  in order to purchase flights in sales
    When he sends username "wick" and password "wrongpassword"
    And the button to login again should be displayed
    Then he should see the message "no valid user"



#1 no exponemos credenciales ¿Qué pasa si tenemos que ejecutar en otros ambientes?
#2 Debemos crear los casos basados en caracteristicas desacomplandola de datos especificos.
#3 Nos permite modificar facilmente las credenciales sin modificar el escenario. Separaciòn
# de responsabilidades.
# 4 ¿Qué hacemos si tenemos muchos campos por llenar?