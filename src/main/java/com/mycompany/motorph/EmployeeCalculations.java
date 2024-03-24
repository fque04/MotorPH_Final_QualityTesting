package com.mycompany.motorph;

import java.io.IOException;

//Class to calculate the worked hours of the employees
public class EmployeeCalculations
{
    EmployeeAttendance empAttendance = new EmployeeAttendance();
    EmployeePersonalDetails empDetails = new EmployeePersonalDetails();
    
   
//Method to get the worked hours based on their attendance.
    public int getHoursOfWork(String empID, String from_date, String to_date) throws IOException
    {
        empAttendance.setFileName();
        empAttendance.setEmployeeBreak(1);

        int fromDate = convertDate(from_date);
        int toDate = convertDate(to_date);

        String EmpAttendance [][] = empAttendance.EmployeeDataArray(empAttendance.getEmployeeFileName(), false);
        int hours = 0;
        for(int i = 0; i<EmpAttendance.length; i++)
        { 
             if(EmpAttendance[i][0].equals(empID))
             {
                if(convertDate(EmpAttendance[i][5]) >= fromDate && convertDate(EmpAttendance[i][5]) <= toDate)
                {   
                    if(convertHour(EmpAttendance[i][3]) - 800 == 0)
                    {
                        hours = hours + (convertHour(EmpAttendance[i][4]) - convertHour(EmpAttendance[i][3]));
                        hours = ((hours / 100) - empAttendance.getEmployeeBreak()) * 100; 
                    }
                    // There will be a 10-minute grace period.
                    else if(convertHour(EmpAttendance[i][3]) - 800 <= 10 && convertHour(EmpAttendance[i][3]) - 800 > 0)  
                    {
                        hours = hours + (convertHour(EmpAttendance[i][4]) - convertHour(EmpAttendance[i][3]) + 100);
                        hours = ((hours / 100) - empAttendance.getEmployeeBreak()) * 100;
                    }
                    
                    // IF THE EMPLOYEE IS AN HOUR LATE, IT WILL BE AN HOUR DEDUCTION. IF THEY WILL BE AN HOUR AND A MINUTE AND UP LATE, 2 HOURS WILL BE DEDUCTED
                    else
                    {
                    hours = (int)hours + convertHour(EmpAttendance[i][4]) - convertHour(EmpAttendance[i][3]);
                    hours = ((hours / 100) - empAttendance.getEmployeeBreak()) * 100; 
                    }
                }
             }
             
        }
        return (hours/100);
    }
    // Method to get the hourly rate of the employee based on the Employee personal details file.
    public double getHourlyRate(String empNumber) throws IOException
    {
        empDetails.setFileName();
        String employeeAttendanceArray[][] = empDetails.EmployeeDataArray(empDetails.getEmployeeFileName(), false); 

        double hourlyRate = 0;
        for(int i = 0; i < employeeAttendanceArray.length; i++)
        {
            for(int j = 0; j < employeeAttendanceArray[0].length; j++)
            {
                if(employeeAttendanceArray[i][0].equals(empNumber))
                {
                    hourlyRate = Double.parseDouble(employeeAttendanceArray[i][18]);
                }
            }
        }
        return hourlyRate;
    }
    
    //Method to get the grosspay based on the worked hours plus total benefits.
    public double getGrossPay(String empNumber, String startDate, String endDate) throws IOException
    {
        double gross = getHoursOfWork(empNumber, startDate, endDate) * getHourlyRate(empNumber);
        return gross + empDetails.getBenefits(empNumber, "rice subsidy") + empDetails.getBenefits(empNumber, "phone allowance") + empDetails.getBenefits(empNumber, "clothing allowance") ;
    }
    
    //Method to read and convert string time into Hour.
    public int convertHour(String Time)
    {
        String time = "";

        for(int i = 0; i < Time.length(); i++)
        {
            if(Time.charAt(i)!= ':')
            {
                time = time + Time.charAt(i);
            }
        }
        return Integer.parseInt(time);
    }

    //Method to read and convert string date into Date format.
    public int convertDate(String Date)
    {
        String dates = "";

        for(int i = 0; i < Date.length(); i++)
        {
            if(Date.charAt(i)!= '/')
            {
                dates = dates + Date.charAt(i);
            }
        }
        return Integer.parseInt(dates);
    }
    
    //Method for calculating the witholdng tax based on the GrossPay.
    public double getWithHoldingTax(double taxableIncome)
    {
        double withHoldingTax = 0;
        if(taxableIncome >= 666667)
        withHoldingTax = 200833.33 + ((taxableIncome - 666667) * 0.35);
        else if(taxableIncome >= 166667)
        withHoldingTax = 40833.33 + ((taxableIncome - 166667) * 0.32);
        else if(taxableIncome >= 66667)
        withHoldingTax = 10833.33 + ((taxableIncome - 66667) * 0.30);
        else if(taxableIncome >= 33333)
        withHoldingTax = 2500 + ((taxableIncome - 33333) * 0.25);
        else if(taxableIncome >= 20833)
        withHoldingTax = (taxableIncome - 20833) * 0.20;
        else if(taxableIncome <= 20832)
        withHoldingTax = 0;
        
        return withHoldingTax;
    }

    //Method to get the Net Pay by deducting all the deductions in gross pay.
    public double getNetPay(String empNumber, String startDate, String endDate) throws IOException
    {
        GovtCont gov = new GovtCont();
        return gov.getTaxableIncome(empNumber, startDate, endDate) - getWithHoldingTax(gov.getTaxableIncome(empNumber, startDate, endDate));
    }
}
