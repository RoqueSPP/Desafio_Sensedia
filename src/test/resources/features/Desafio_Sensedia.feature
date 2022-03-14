#Author: rsppnet@hotmail.com


Feature: Testr as funcionalidades da API Trello
  Eu como QA Tester, quero realizar os testes da API Trello
  


 @BOARD
   Scenario Outline:Teste  criar Board na API Trello 
   Given que eu acesse a API
   
   
    When eu Criar o Board na Api valido o statuscode <key><token>
    
     Examples:
    | key                                   | token                                                                   |
    |"&key=25457a572e044cb6c87590a29102b6a7"|"&token=735b0a34720094cac35691499e350a5f0db05a3300048c3b248deba8ef1efcaa"|    
   
   
   
   @LIST
   Scenario Outline:Teste  criar list na API Trello 
   
    When eu Criar o List na Api e valido o statuscode <key><token>
    
    Examples:
    | key                                   | token                                                                        |
    |"&key=25457a572e044cb6c87590a29102b6a7"|"&token=735b0a34720094cac35691499e350a5f0db05a3300048c3b248deba8ef1efcaa"|    
   @CARD
  Scenario Outline:Teste  criar Card na API Trello 
   
    When eu Criar o Card na Api valido o statuscode <key><token>
    
   
    Examples:
    | key                                   | token                                                                        |
    |"&key=25457a572e044cb6c87590a29102b6a7"|"&token=735b0a34720094cac35691499e350a5f0db05a3300048c3b248deba8ef1efcaa"|    
   
  @UPDATECARD
  Scenario Outline:Teste  editar Card na API Trello 
   
    When eu editar o Card na Api valido o statuscode <key><token>
    
   
    Examples:
    | key                                   | token                                                                        |
    |"&key=25457a572e044cb6c87590a29102b6a7"|"&token=735b0a34720094cac35691499e350a5f0db05a3300048c3b248deba8ef1efcaa"|    
   
     @DELITE 
  Scenario Outline:Teste  Delete board na API Trello 
   
    When eu deletar o board na Api valido o statuscode <key><token>
    
   
    Examples:
    | key                                   | token                                                                        |
    |"&key=25457a572e044cb6c87590a29102b6a7"|"&token=735b0a34720094cac35691499e350a5f0db05a3300048c3b248deba8ef1efcaa"|    
   
    
   
 