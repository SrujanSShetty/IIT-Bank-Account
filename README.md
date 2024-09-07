# Bank Account Simulator - Bank of IIT

## Project Description

The Bank of IIT has commissioned a project to create a bank account simulator that allows their clients to manage bank account information and execute various transactions. The program offers users the ability to create an initial account balance, make deposits, and process withdrawals. Additionally, it calculates and displays account interest over time at a specified interest rate.

This project uses basic Object-Oriented Programming (OOP) concepts, such as loops, user-defined methods, conditional and relational logic, and error handling. You’ll write clean, well-commented code to ensure readability and functionality.

## Project Structure

The project consists of two Java files:
1. **AccountHolder.java**: Contains the account logic for managing balance, deposits, withdrawals, and interest calculations.
2. **AccountHolderTest.java**: Includes the main method that handles user inputs, executes transactions, and generates a 12-month interest report.

## Class Details

### AccountHolder.java
This class handles the core functionalities for a bank account, such as maintaining the account balance, processing deposits and withdrawals, and calculating monthly interest.

#### Field Members:
| **Field Name**        | **Modifier/Type**   |
|-----------------------|--------------------|
| `annualInterestRate`   | `static double`    |
| `balance`              | `double`           |

#### Methods:
| **Method Name**        | **Type**          | **Arguments**       | **Return Type**  |
|-----------------------|-------------------|---------------------|------------------|
| `AccountHolder`        | Constructor       | `double`            | None             |
| `deposit`              | Instance          | `double`            | `void`           |
| `withdrawal`           | Instance          | `double`            | `void`           |
| `monthlyInterest`      | Instance          | None                | `void`           |

#### Method Details:
1. **AccountHolder Constructor**: Accepts an initial balance as an argument. Balance cannot be negative. If the initial balance is negative, an error message will be displayed.
2. **monthlyInterest**: Updates the account balance based on the formula:
    ```java
    balance += balance * (annualInterestRate / 12.0);
    ```
3. **deposit**: Adds the specified deposit amount to the current balance.
4. **withdrawal**: Subtracts the specified amount from the current balance, ensuring the balance does not drop below $50. If a withdrawal attempt would result in a balance below $50, an error message is shown.

### AccountHolderTest.java
This file contains the main method, which handles the following operations:
1. Sets the bank’s interest rate to 4%.
2. Prompts the user for an initial account balance, passing the value into the `AccountHolder` constructor.
3. Prompts the user for a deposit amount.
4. Prompts the user for a withdrawal amount.
5. Displays the account's ending balance, including the monthly interest update.
6. Generates and displays a 12-month interest report in a tabular format.

## Sample Output
The program will output a report showing the month number and the corresponding account balance for each of the 12 months. The initial balance (referred to as “Base”) will be followed by the updated balance after each month’s interest is applied.

Example of the 12-month report:




## Error Handling
- Negative initial balance is not allowed.
- Withdrawals that would drop the balance below $50 are disallowed, with a message informing the user of the minimum balance requirement.

## How to Run
1. Compile both `AccountHolder.java` and `AccountHolderTest.java`.
2. Run the `AccountHolderTest` class to simulate bank transactions and view the interest report.

## Extra Credit
An additional feature includes the display of a 12-month interest report, showing month-by-month updates to the account balance after interest is applied.



## Acknowledgments

I would like to thank Prof.James Papademas[@https://www.linkedin.com/in/james-papademas-a3446420/) for inspiring me with their work on advance topics of OOPS and approach. Their contributions and ideas were instrumental in shaping this project.
