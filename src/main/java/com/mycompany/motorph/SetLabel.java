package com.mycompany.motorph;

import java.io.IOException;

// FORCING A CLASS TO USE THE METHODS INSIDE THE SET LABEL
public interface SetLabel 
{
    public void setDesign(boolean addHeaderSpace, boolean addFooterSpace);
    public void createOptions(boolean login) throws IOException;
    final int maxDesign = 150;
    public boolean LoginPage();
    
}
