INSTRUCTION TO RUN APPLICATION
-------------------------------
To run through Eclipse :

1. If you are using eclipse to run the program, please run "Client.ClientRequests.java" and input the arguments in "run configuration" -> arguments like "toothbrush 3" or "toothbrush".

2. Same goes with the Unit tests, run "UnitTests.runTests" with no arguments to run unit test cases.

To run through JAR :

1. Run command "java -jar webCrawler.jar toothbrush 3" or "java -jar webCrawler.jar toothbrush" from the path where jar exists.

2. To run Unit tests "java -cp webCrawler.jar UnitTests.runTests"

SAMPLE INPUT/OUTPUT:

C:\Users\abhandari\Desktop>java -jar webCrawler.jar buy 2

Total Number of results for Keyword 'buy' on page number 2 is 40


Note :

Could have used JSOUP library to parse HTML doc but wrote this from scratch to apply design patterns principles.

P.S Response is taking a little longer time than JSOUP.
