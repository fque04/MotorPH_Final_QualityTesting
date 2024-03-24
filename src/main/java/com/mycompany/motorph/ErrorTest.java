package com.mycompany.motorph;

import java.io.IOException;

//A class to call for an error message for incorrect inputs for employee number and date format.
public class ErrorTest extends EmployeePersonalDetails{
    
    //Method to check the correct employee number. Incorrect employee number will show an error message.
     public boolean checkEmployeeExistence(String employeeID) throws IOException
    {
        boolean result = false;
       if(getEmployeeData(employeeID, 0) == null)
       {
            result = false;
       }
       
       else
       result = true;

       return result;
    }

    //Method to check the correct format of the date (MM/dd/yyyy)
    public boolean checkDateValidity(String date) throws IOException
    {
       boolean checkFormat = false, checkFormat2 = false, finalCheck = false;
       int temp = 0;
       if(date.contains("/") || date.length()==10)
       checkFormat = true;
       
       date = date.toLowerCase();
       for(int i = 0; i < date.length(); i++)
       {
        
        if(date.charAt(i) >= 47 || date.charAt(i) <= 57)
        temp++;

        if(temp == 10)
        checkFormat2 = true;
       }

       if(checkFormat && checkFormat2)
       finalCheck = true;

       return finalCheck;
    
    }
}
