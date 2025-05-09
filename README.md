Description

---

I have built a basic automation framework for a ticket booking website to simulate and process an order.

**Technologies Used:**

* Selenium
* Java
* TestNG
* Page Object Model (POM)
* Git

I implemented the **Page Object Model** design pattern, where test cases are organized in a dedicated folder, and web page elements are managed in separate page classes. Using Java’s inheritance concept, both the test case classes and page object classes extend a common base class.

The **base class** contains shared utility methods such as `launchApplication` and `dataExtractionFromExcel`. I have also added a custom method to support **PDF file reading**.

Utility functions that assist test execution, like capturing screenshots and downloading files, are grouped under a separate utility file.

For reporting, I integrated the **Allure Report** library to generate detailed test execution reports.


