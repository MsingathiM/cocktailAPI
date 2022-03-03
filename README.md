# Cocktaildb API Automated Tests 

* This automation test project performs various Functional Requirement tasks as follows:


* `The application makes a calls to the cocktaildb api mapped onto the cucumber feature files,
to automate rest api services`

* `The project runs on a cucumber based framework to leverage on BDD in order to translate api requirments for 
easy understanding and running with Java rest-assured to test APIs through functions.`

`Functional Requirement 1`: searches ingredients by name and return result set; and also validate alcohol 
contents through a function that evaluates if the drink ingredients contain alcohol.

`Functional Requirement 2`: searches for cocktails with a name parametre and returns values according to the cocktail
schema with all required properties; and if a cocktail does not exist a null value is returned for the drinks array.

`Functional Requirement 3`: Makes an api call to the cocktail images database where if a valid alcohol name exists, a
valid status message is evaluated and when an alcohol type does not have an image existing in the database, then an 
error message is evaluated to reflect this finding.

`Functional Requirement 4`: Performs an indexed call using characters to the cocktail drinks api, where each filter key
character value is stored in an array to make the api call by randomly selecting key value and return a result.



`Non-Functional Requirements`:
 * Below we make suggestions to the non-functional requirements of the cocktaildb as follows:

1. We would need to test the availability of the cocktaildb as frequently as possible, to ensure that when users are making 
api calls they are able to ensure that they get a result if the system is up and running.
2. Another test we would need to factor in, would be the bulk posting of api calls, this will help ensure that the 
system does not crash when a volume of users are capturing transactions on the cocktaildb.
   
* This non-functional test would make use of Jmeter as a tooling framework, to process bulk transactions by simulating 
a large number of users,also to to ensure system availability by having a test case with exploratory tests that covers 
all api calls made to the cocktaildb.
    

``INSTRUCTIONS``
* In order for anyone to run this api automation project, they would first need to clone this git repository into their 
local machine or via an IDE of choice.
* Then once the project is available locally, a user would need to open this project from their IDE of choice, ideally 
you might want to use IntelliJ for ease of usage, so that all dependencies can be downloaded easily.
* This project runs as a Maven project, and no Jar files would be required, apart from an internet connection to 
download all files.
* Once all files are ready and project is open via an an IDE, the user can navigate to the TestRunnerNew.java file which
can be found under `src >> test >> java >> runner`. When this file is opened the user would just need to run/debug the 
file, which should run all feature files and step definitions.
* When the project has completed running, the user can find a simple execution *Serenity Report* under 
  `home folder >> target >> cucumber-reports` and just open the index.html file on the browser.
