# intive-FDV-TechnicalExercise
TechnicalExercise for intive-FDV

-------------------------Description of the project design.---------------------------------
An MVC pattern was followed, so the packages are: Controller, Model and View.

In the View package we have the main class of the "TechnicalExercise" project, which is what the user uses to interact with the system.
In the Controller package we have the "RentService" class, which applies to the business logic and manages the classes with access to data according to the user's requests.
In the Model packages we have the classes that answer to the possible scenarios specified. "Rental" class, is the abstract class that covers the principal characteristics and behavior of the rents. The classes "RentPerDay", "RentPerHour" and "RentPerWeek" inherit from Rental. The "FamilyRental" class represents the offer for families.
The purpose of having these classes with this distribution is to have a scalable and robust architecture as the project grows.

In the Util package we have the class "MathematicalOperations" in which we keep the mathematical operations that may be needed.

-------------------------Now I explain how to do the unit tests.----------------------------------------

In the "RentServiceTest" class, the testCalculateRents method is tested. For this we create as many rents as we want (of any kind), as well as the insertions in the list "plst_rents". Later we have the list "expResult" in which we will put the values with which we will buy the result of the method.

