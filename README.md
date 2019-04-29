# Quiz API
### Quiz API is a ​RESTful API ​platform offers 4 different services that can be easily used

Our 4 services are : 
- To add quiz
  Take quiz ID and its name and its type. 
- To add question
   Take some parameter to store the right answer and 4 choices the right answer one of them , take also the question itself.
- To get quiz
   You choose a type you want a quiz of it then we shuffle all quizes of this type in our program and return a random quiz of that type 
- To evaluate a score of someone (success or fail)
   You choose the answers of the quiz , and then if you pass a specific score you pass
   
 ### Endpoints
   
*To add quiz*:
  - **POST** : 
    ``` localhost:8080/quiz/addquiz ```
  - Request parameters (Body) :
       - ID : string
       - name : string
       - type : string
      
*To add question*:
  - **POST** :  ``` localhost:8080/quiz/addquestion ```
  - Request parameters (Body) :
    - QUIZID : ​string
    - question : ​string
    - choice1 : ​string
    - choice2 : ​string
    - choice3 : ​string
    -  choice4 : ​string
    - rightanswer : ​string
    
*To get quiz*:
  - **GET** : ``` localhost:8080/quiz/getquiz ``` 
  - Request parameters :
    - type : ​string ​(ex. “/quiz/getquiz?type=java”)
    
*To solve the quiz and to know if you pass* :
  - **GET** : ​``` localhost:8080/quiz/evaluate ```
  - Request parameters :
    - values : ​string[]​ (ex. “/quiz/evaluate?values=choice1,choice2,etc”)
