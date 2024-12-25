# BDDCucumber
Prerequisites

Before you begin, ensure you have the following installed:

Java (JDK 11 or higher)
Maven (for dependency management)
ChromeDriver (or any WebDriver of your choice)

Additionally, make sure you have the following software installed:

IntelliJ IDEA, Eclipse, or any other IDE that supports Java development.(I have personally used Eclipse for this project)
Git (to clone the project)

Project Setup

Clone the Repository

git clone https://github.com/your-username/cucumber-selenium-bdd-java.git cd cucumber-selenium-bdd-java

Install Dependencies
mvn clean install

Configure WebDriver
Make sure chromeDriver is installed and set in your path.
you can manually configure path in your TestBase.java file(i have done that)
System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

Dependencies in pom.xml
Add-Cucumber JVM, Cucumber-Java,Selenium, Cucumber pico container, Cucumber TestNG.

BDDCucumber 
├── pom.xml
├── src/
│   ├── test/
│   │   ├── java/
│   │   │   ├── stepdefinitions/
│   │   │   │   ├── LandingPageStepDefinition.java
│   │   │   ├── utils/
│   │   │   │   ├── TestBase.java
		├── TestContextSetup.java
		├── GenericUtils.java
	├── pageObjects/
		├── LandingPage.java
		├── OffersPage.java
		├── PageObjectManager.java
│   │   │   ├── CucumberOptions
│   │   │   │   ├── TestNGRunnerTest.java
│   │   │ 
│   │   │   └── features/
│   │   │       └── searchProduct.feature
└── target/

Reporting
TestNG HTML report is generated after execution

Execution
Run the CucumberOptions file as Run As—> TestNG for execution
