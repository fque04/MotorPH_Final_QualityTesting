package com.mycompany.motorph;

import java.io.IOException;

// This class serves as an entry point to the program
public class MotorPH {
    // The main method, starting point of the program
    public static void main(String[] args) throws IOException {
        // Creating an instance of MotorPH_Contents class
        MotorPH_Contents contents = new MotorPH_Contents();
        
        // Calling createOptions method of MotorPH_Contents class
        // and passing the result of LoginPage method as argument
        contents.createOptions(contents.LoginPage());
    }
}
