# intive-FDV-TechnicalExersice
TechnicalExersice for intive-FDV

-------------------------I continue to explain the design of the project.---------------------------------
An MVC pattern was followed, so the packages are: Controller, Model and View.

In View we have the main class of the "TechnicalExercise" project, which is what the user uses to interact with the system.
In Controller we fear the "RentService" class, which applies the business logic and manages the classes with access to data according to the user's requests.
In Model there are the classes that respond to the possible scenarios specified "Rental", abstract class that covers the pricipale characteristics and behavior of the rents, the classes "RentPerDay", "RentPerHour" and "RentPerWeek" inherit from Rental. the "FamilyRental" class represents the offer for families.
The purpose of having these classes with this distribution is to have a scalable and robust architecture as the project grows.

In the Util package we have the class "MathematicalOperations" in which I keep the mathematical operations that I may need.

-------------------------Now I explain how to do the unit tests.----------------------------------------

In the "RentServiceTest" class, the testCalculateRents method is tested. For this we create as many incomes as we want (of any kind), as well as the insertions in the list "plst_rents". Later we have the list "expResult" in which we will put the values with which we will buy the result of the method.
