package com.mycompany.motorph;

import java.io.File;
import java.io.IOException;

public class EmployeeAttendance extends RetrieveEmployeeFile
{
    //THIS OVERRIDEN VERSION OF VALIDATE EMPLOYEE FILE VALIDATES THE EMPLOYEE ATTENDANCE FILE

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
                System.out.printf("%-20s", empArray[i][j]);
            }
            System.out.println();
        }
    }
    //This will change the location path of the attendance file.
    @Override
    public void setFileName()
    {
        setEmployeeFileName("C:\\Users\\Gen Calvez\\Documents\\NetBeansProjects\\MotorPH\\src\\main\\java\\com\\mycompany\\motorph\\Employees Attendance.txt");
    }
}
    
        
    