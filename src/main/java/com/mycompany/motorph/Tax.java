package com.mycompany.motorph;

public class Tax extends EmployeeCalculations {

    // Method to calculate withholding tax based on employee number
    public double getWithholdingTax(String empNumber) {
        // Assuming a simple calculation based on employee number length
        // Example: withholding tax is $100 for employees with 6-digit employee numbers
        double withholdingTax = 0;

        // Checking if employee number is not null and has a valid length
        if (empNumber != null && empNumber.length() > 0) {
            // Example calculation: $100 withholding tax for 6-digit employee numbers
            if (empNumber.length() == 6) {
                withholdingTax = 100;
            } else {
                // For other cases, withholding tax is 0
                withholdingTax = 0;
            }
        }

        return withholdingTax;
    }
}
