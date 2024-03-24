package com.mycompany.motorph;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public abstract class RetrieveEmployeeFile {

    //CREATE A PRIVATE EMPLOYEE FILE NAME ATTRIBUTE
    private String employeeFileName;    
    private int employeeBreak;

    // APPLYING ENCAPSULATION IN WHICH THIS WILL SET THE VALUE OF THE employeeFileName VARIABLE
    public void setEmployeeFileName(String employeeFileName) 
    {
        this.employeeFileName = employeeFileName;
    }

    // APPLYING ENCAPSULATION IN WHICH THIS WILL GET THE VALUE OF THE employeeFileName VARIABLE. THIS WILL RETURN A STRING VALUE
    public String getEmployeeFileName()
    {
        return employeeFileName;
    }
    // APPLYING ENCAPSULATION IN WHICH THIS WILL SET THE VALUE OF THE employeeBreak VARIABLE
    public void setEmployeeBreak(int employeeBreak) 
    {
        this.employeeBreak = employeeBreak;
    }

    // APPLYING ENCAPSULATION IN WHICH THIS WILL GET THE VALUE OF THE employeeBreak VARIABLE. THIS WILL RETURN A STRING VALUE
    public int getEmployeeBreak()
    {
        return employeeBreak;
    }

    // ABSTRACTION
    // THIS ABSTRACT METHOD WILL CHECK IF THE FILE IS AVAILABLE IN THE EXPECTED LOCATION. 
    public abstract boolean validateEmployeeFile() throws IOException;
    public abstract void displayEmployeeArray() throws IOException;
    public abstract void setFileName() throws IOException;

    //APPLYING POLYMORPHISM 
    public String getEmployeeData(String empNum, int index) throws IOException
    {
        String empData = "empty";
        return empData;
    }

    // CREATING A METHOD THAT RETURNS A 2D STRING ARRAY FOR REUSABILITY THROUGHOUT THE SYSTEM
     public String [][] EmployeeDataArray(String fileName, boolean includeHeaders) throws IOException
    {
        //DECLARING AN INSTANCE OF A NEW FILE
        File employeeFile = new File(fileName);
        //MAKING A NEW 2D ARRAY TO RECEIVE ALL THE DATA FROM THE FILE
        String [][] employeeData = null;
        if(employeeFile.exists())
        {
            //USED TO READ INFORMATION FROM THE FILE
            BufferedReader reader = null;   
            //USED TO STORE TEMPORARY ROWS
            String rowContents = "";
            try 
            {
                // READING THE FILE USING THE BUFFERED READER
                reader = new BufferedReader(new FileReader(employeeFile));
                // USED TO COUNT THE ROWS IN ORDER TO ALLOCATE ENOUGH SPACE FOR THE ARRAY
                int rows = 0;
                int headersAdded = 1;
                if(includeHeaders)
                {
                    headersAdded = 0;
                    rows = countRows(employeeFile, headersAdded); 
                }
                else
                {
                    rows = countRows(employeeFile, headersAdded);
                }
                

                if(rows > 0)
                {
                    // READING THE HEADERS TO AVOID IT STORING INSIDE THE ARRAY
                    rowContents = reader.readLine();
                    
                    // USED TO COUNT THE ROWS IN ORDER TO ALLOCATE ENOUGH SPACE FOR THE ARRAY
                    int columns = countCommas(rowContents);    
                    // INSTANTIATING A NEW ARRAY OF STRINGS USING SIZES THAT ARE ENOUGH SPACE TO STORE THE DATA INSIDE THE ARRAY
                    employeeData = new String[rows][columns];
                    // USED TO INCREMENT THE ROWS IN THE ARRAY AFTER READING EACH ROWS IN THE FILE
                    int rowIndex = 0;
                    if(includeHeaders)
                    {
                        employeeData[0] = rowContents.split("\\|");
                        rowIndex++;
                    }
                    //CONTINUOUSLY READING THE DATA INSIDE THE FILE AND STORE IT INSIDE THE ARRAAY
                    while((rowContents = reader.readLine()) != null)
                    {
                    // TEMPORARILY STORING COLUMNS INSIDE THE ARRAY AFTER SPLITTING IT
                        String [] fileColumn = rowContents.split("\\|");
                        for(int columnIndex = 0; columnIndex < columns; columnIndex++)
                        {
                            if(columnIndex < fileColumn.length)
                            {
                                employeeData[rowIndex][columnIndex] = fileColumn[columnIndex];
                            }
                            else
                            {
                                employeeData[rowIndex][columnIndex] = "";
                            }
                        }
                        rowIndex++;
                    }
                }
            }
             catch (Exception e) 
            {
                System.out.println(e);
            }
            finally{
                if(reader != null)
                reader.close();
            }
        }
        else
        {
            System.out.println("File is either corrupt or it doesn't exist");
        }
        return employeeData;
    }

    protected int countCommas(String line)
    {
        int count = 0;
        for(int i = 0; i < line.length();i++)
        {
            if(line.charAt(i) == '|')
            {
                count++;
            }
        }
        return count + 1;
    }

    protected int countRows(File employeeFile, int headersAdded)
    {
        int rows = 0;
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(employeeFile));
            while(reader.readLine() != null)
            {
                rows++;
            }
            reader.close();
        }
        catch(Exception err){
            System.out.println("Unable to locate File");
        }
        return rows - headersAdded;
    }


}