package com.mycompany.motorph;

import java.io.File;
import java.io.IOException;

public class EmployeePersonalDetails extends RetrieveEmployeeFile
{
    //THIS OVERRIDEN VERSION OF VALIDATE EMPLOYEE FILE VALIDATES THE EMPLOYEE DATA FILE
    @Override
    public boolean validateEmployeeFile() 
    {
        setFileName();

        File employeeData = new File(getEmployeeFileName());
        boolean found = false;
        if(employeeData.exists())
        {
            found = true;
        }
        else
        {
            found = false;
        }
        return found;
    } 

    @Override
    public String getEmployeeData(String empNum, int index) throws IOException
    {
        String data = null;
        
        setFileName();
        String [][] empArray = EmployeeDataArray(getEmployeeFileName(), false); 

        for(int i = 0; i < empArray.length; i++)
        {
            if(empArray[i][0].equals(empNum))
            data = empArray[i][index];
        }

        return data;
    }

    @Override
    public void displayEmployeeArray() throws IOException
    {
        setFileName();
        String [][] empArray = EmployeeDataArray(getEmployeeFileName(), true);
        for(int i = 0; i < empArray.length; i++)    
        {
            for(int j = 0; j < empArray[1].length; j++)
            {
                //SKIPPING 4 6 7 8 9 12 AND UP
                if(j == 4 || (j >= 6 && j <= 9) || (j >= 12))
                {
                    continue;
                }
                else
                {
                    System.out.printf("%-20s", empArray[i][j]);
                }
            }
            System.out.println();
        }
    }

    //This will change the location path of the employeee details file.
    @Override
    public void setFileName()
    {
        setEmployeeFileName("C:\\Users\\Gen Calvez\\Documents\\NetBeansProjects\\MotorPH\\src\\main\\java\\com\\mycompany\\motorph\\Employee Details.txt");
    }

    //Method to get all the total benefits.
    public double getBenefits(String employeeID, String benefitName) throws IOException
    {
        benefitName = benefitName.toLowerCase().trim();
        int index = 0;
        if(benefitName.equals("rice subsidy"))  index = 14;
        else if(benefitName.equals("phone allowance"))   index = 15;
        else if(benefitName.equals("clothing allowance"))   index = 16;
        return Double.parseDouble(getEmployeeData(employeeID, index));
    }

   
}
