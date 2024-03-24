package com.mycompany.motorph;

import java.io.IOException;

// FORCING A CLASS TO USE THE METHODS INSIDE THE SET LABEL
public interface SetLabel {
    // Method to set design with options to add header and footer space
    public void setDesign(boolean addHeaderSpace, boolean addFooterSpace);
    
    // Method to create options
    public void createOptions(boolean login) throws IOException;
    
    // Constant defining maximum design value
    final int maxDesign = 150;
    
    // Method related to login page, returns true if successful
    public boolean LoginPage();
}
