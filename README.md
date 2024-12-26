# Selenium E-commerce Testing

This repository contains automated test scripts for testing key functionalities of an e-commerce platform using **Selenium WebDriver**. The tests cover essential workflows, ensuring that the platform's core features work as expected. 

## Features Tested

- **Login**: Verify that users can successfully log into the platform with valid credentials and handle error messages for invalid login attempts.
- **Sign Up**: Test the registration process to ensure new users can create accounts with correct input validations.
- **Forgot Password**: Ensure users can recover their passwords via email.
- **Add Product**: Automate adding products to the shopping cart and verify they appear correctly.
- **Product Search**: Verify the search functionality to ensure users can search for products by name, category, or filters.
- **Checkout Process**: Test the complete checkout flow, including adding products to the cart, entering payment information, and confirming the order.

## Technologies Used

- **Java**: The test scripts are written in Java.
- **Selenium WebDriver**: For automating browser interactions.
- **TestNG**: For test execution, reporting, and managing test cases.

## Setup

1. Clone this repository to your local machine.
   
   ```bash
   git clone https://github.com/yourusername/selenium_ecommerce_testing.git
   Install dependencies using Maven:

2.
bash
mvn install
Ensure you have the correct browser driver (e.g., ChromeDriver) and that it's set up correctly. You can use WebDriverManager to manage the driver automatically.

3. Run the tests using TestNG.
bash
mvn test
