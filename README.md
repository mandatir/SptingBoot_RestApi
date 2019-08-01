# SptingBoot_RestApi

TO Run the App:
==============
Prequisites :

Java 8
SpringBoot
IDE(Eclispe/STS)
Postman

Step 1: Download the Application and extract the Zip file.
Step 2: Import the application to IDE(STS) and Run.
Step 3: Open the Postman and test the application.

uri's for RestApi calls:
========================
/app/users [POST call] to save the user.

Sample json code:{
    "id": 1,
    "name": "rajesh",
    "role": {
        "id": 1,
        "name": "worker"
    },
    "group": {
        "id": 1,
        "name": "IT"
    }
}
---------------------------------
{
    "id": 2,
    "name": "raghu",
    "role": {
        "id": 2,
        "name": "pricipal"
    },
    "group": {
        "id": 2,
        "name": "ECE"
    }
}
-----------------------------------
{
    "id": 3,
    "name": "subbu",
    "role": {
        "id": 2,
        "name": "principal"
    },
    "group": {
        "id": 1,
        "name": "IT"
    }
}
/app/users/{groupID} [GET call] to get all Users from particular group.


