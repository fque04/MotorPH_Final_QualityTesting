package com.mycompany.motorph;

import java.io.IOException;
import java.util.*;

import javax.swing.JOptionPane;

//Class 
public class MotorPH_Contents extends ErrorTest implements SetLabel{
    EmployeeAttendance empAttendance = new EmployeeAttendance();
    EmployeePersonalDetails empDetails = new EmployeePersonalDetails();
    EmployeeCalculations calc = new EmployeeCalculations();
    GovtCont governmentPays = new GovtCont();

    Scanner input = new Scanner(System.in);
    public void setDesign(boolean addFooterSpace, boolean addHeaderSpace){
        if(addHeaderSpace)
        System.out.println();
        for(int i = 0; i < maxDesign; i++)
        {
            System.out.print("#");
        }
        System.out.println();
        if(addFooterSpace)
        System.out.println();
    }    

    //A log-in display box that will directs to the MotorPH portal.
    public boolean LoginPage(){
        boolean user = false, pass = false, result = false;
        while(result == false){
            if(JOptionPane.showInputDialog("Enter Username").equals("admin"))
            user = true;
            if(JOptionPane.showInputDialog("Enter Password").equals("admin"))
            pass = true;
            if(user && pass)
            result = true;
            else
            JOptionPane.showMessageDialog(null, "Invalid Credentials, Please try again!");
        }
        return result;
    }
    
    //A log-out display box that will exits the program.
    public void logout() {
    // Set the user and password variables to false to indicate that the user is logged out
        boolean user = false;
        boolean pass = false;

        // Display a message to confirm that the user has been logged out
        JOptionPane.showMessageDialog(null, "You have been logged out.");

        // Set the result variable to false to indicate that the user is on the login page again
        boolean result = false;
    }

    //Method that displays the informations needed to vew the payroll.
    public void displayInformation() throws IOException{
        ErrorTest errorTest = new ErrorTest();
        boolean validateEmpNum = false, validateStartDate = false, validateEndDate = false;
        String empNumber = "", startDate = "", endDate = "";

        while(validateEmpNum == false){
            empNumber = setInput("Enter Employee Number: ");  
            validateEmpNum = errorTest.checkEmployeeExistence(empNumber);
            if(validateEmpNum == false)
            JOptionPane.showMessageDialog(null, "Employee Not Found");
        }

        while(validateStartDate == false){
            startDate = setInput("Enter Starting Date: ");
            validateStartDate = errorTest.checkDateValidity(startDate);
            if(validateStartDate == false)
            JOptionPane.showMessageDialog(null, "Invalid Date Format. Please follow MM-DD-YYYY format");
        }

        while(validateEndDate == false){
            endDate = setInput("Enter End Date: ");  
            validateEndDate = errorTest.checkDateValidity(endDate);
            if(validateStartDate == false)
            JOptionPane.showMessageDialog(null, "Invalid Date Format. Please follow MM-DD-YYYY format");
        }
               
        setDesign(true, false);
        System.out.println("Employee Number: " + empNumber + "\nLast Name: " + empDetails.getEmployeeData(empNumber, 1) + 
        "\nFirst Name: " + empDetails.getEmployeeData(empNumber, 2) +
        "\nStatus: " + empDetails.getEmployeeData(empNumber, 10) + 
        "\nPosition: " + empDetails.getEmployeeData(empNumber, 11) +
        "\nRice Subsidy: " + empDetails.getBenefits(empNumber, "Rice Subsidy") +
        "\nPhone Allowance: " + empDetails.getBenefits(empNumber, "Phone Allowance") +
        "\nClothing Allowance: " + empDetails.getBenefits(empNumber, "Clothing Allowance") +
        "\nSSS Contribution: " + governmentPays.SssContribution(calc.getGrossPay(empNumber, startDate, endDate)) +
        "\nPhilHealth Contribution: " + governmentPays.philhealthContribution(calc.getGrossPay(empNumber, startDate, endDate)) +
        "\nPag-ibig Contribution: " + governmentPays.pagibigContribution(calc.getGrossPay(empNumber, startDate, endDate)) +
        "\nBasic Salary: " + empDetails.getEmployeeData(empNumber, 13) + 
        "\nHourly Rate: " + empDetails.getEmployeeData(empNumber, 18) +
        "\nHours Worked: " + calc.getHoursOfWork(empNumber, startDate, endDate) + 
        "\nGross Pay: " + calc.getGrossPay(empNumber, startDate, endDate) + 
        "\nTaxable Income: " + governmentPays.getTaxableIncome(empNumber, startDate, endDate) + 
        "\nWithholding Tax: " + calc.getWithHoldingTax(governmentPays.getTaxableIncome(empNumber, startDate, endDate)) + 
        "\nNet Pay: " + calc.getNetPay(empNumber, startDate, endDate));
    }

    public String setInput(String userInput){
        System.out.print(userInput);
        String Input = input.next();
        System.out.println();
        return Input;
    }

   
    //Method to call for selecting options on the main menu.
    public void createOptions(boolean login) throws IOException{
        if(login){
            char choice = ' ';
            while(choice != '0'){
                setDesign(false, true);
                System.out.println("                        \t\t\t\t\tWELCOME TO MOTOR PH");
                setDesign(false, false);
                System.out.println();
                System.out.print("CHOOSE ACTION TO EXECUTE:\n[0] EXIT PROGRAM\n[1] VIEW PAYROLL\n[2] VIEW EMPLOYEE ATTENDANCE\n[3] VIEW BASIC EMPLOYEE DETAIL\n>>>>>> ");
                choice = input.next().charAt(0);
                if(choice == '0')
                    logout();

                else if(choice == '1')
                    displayInformation();

                else if(choice == '2')
                    empAttendance.displayEmployeeArray();

                else if(choice == '3')
                    empDetails.displayEmployeeArray();

                else
                    System.out.println("Invalid choice! Please enter only 0, 1, 2, or 3");
                
            }
        }  
    }
}
