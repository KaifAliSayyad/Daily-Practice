Date : 16-01-2025

____________________________________________________________________________________________________________________________________________________________

1) Factory Design Pattern

This pattern is used when we need to implement some logic before deciding whether to create an object or not.
For example I do not want to allow more than 5 Principals to be created.

____________________________________________________________________________________________________________________________________________________________

2) Abstract Factory Pattern

This is factory of factory design pattern

____________________________________________________________________________________________________________________________________________________________

3) Prototype Pattern

When we need to created many objects of the same class, which are same, when we do it using new ClassName(), a lots of memory is required and so much stack memory is consumed. Threrefore we can simply use .clone() method on one object created, this saves us a lots of memory as clone() is just a byte by byte copy any object.

____________________________________________________________________________________________________________________________________________________________

4) Builder Design Pattern

It is used when we need property based object creation, for example, if I only know some property of vehicle like 2 seats, petrol, 4 wheels..It will automatically decide which class's object should be created. 
For Example : Streams api is written using Builder design pattern
____________________________________________________________________________________________________________________________________________________________
