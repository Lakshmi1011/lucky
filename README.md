# Laxmi Nagabandi Technical Assesment for QA Enginner role for Iceland :
**Maven**:I have created a maven project from scratch and added all the required dependencies in the pom.xml file.All the dependencies for cucumber,selenium,webdriver manager,Junit,reports were added.
**Framework followed**: The test suite is in BDD framework using cucumber and junit adhering to all BDD best practices.
**Project structure** It has src---main---java and src---test---java
Under **src---main---java** I have created 4 packages for
1)**base**--I have created a class name called BasePage where all the page objects were initialised in this particular class.
2)**conf**--In this package I have created a data.properties file to get the browsername property.
3)**pageObjects**--I have created a package name called pageObjects where I have declared page objects related to different screens of the application.
4)**utils**--I have created utils package under this I have created two classes named DriverFactory and DriverUtils.
5)I have used the concept of driverfatory because I dont want to declare the driver object again and again so there will be one time declaration for the web driver object.
6)Other class inside this utils is DriverUtils where I have maintained some generic utilities.
Under src--test--java --- As I have used cucumber BDD the different components like feature, steps and runner packages are maintained.
**feature files** are maintained under src--test--resources where all the scenarios are converted into BDD using gherkin language.
**steps** has StepDefination class it has selenium code whatever the steps are there in feature file for each and every step there is a mapping.
**Hooks** Hooks class is maintained under steps package.Driver setup and teardown methods are maintained in this class.
**Process for TestExecution**---**runner** runner package has TestRunner class where tests are executable from this class.It contains the location of feature file,steps and cucumber reports this was called inside the plugin.
**Reports**---Whenever the testcases are executed cucumber html report is generated under the target folder--cucumber html report--index.html
**Validations**---There is an attribute with the name checked for that particular toggle,when I validate that checked attribute is set to checked it was returning true.

**Issues Faced**:
There was a synchronisation issue after login, when I click on that welcome laxmi dropdown and then I click on my account at that point I found synchronisation issue.So I tried to resolve it with explicit waits it was not working and I also tried with javascript executor to click on that particular link but none of them worked that is why I have used thread.sleep.
