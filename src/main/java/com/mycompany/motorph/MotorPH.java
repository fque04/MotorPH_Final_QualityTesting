package com.mycompany.motorph;

import java.io.IOException;

public class MotorPH 
{
    public static void main(String[] args) throws IOException
    {
        MotorPH_Contents contents = new MotorPH_Contents();
        contents.createOptions(contents.LoginPage());
    }
}