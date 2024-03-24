package com.mycompany.motorph;

import java.io.IOException;

//Class that calculates all government deductions and taxes.
public class GovtCont extends EmployeeCalculations{
    
//Method to calculate SSS contribution based on the employee's basic salary.
    public double SssContribution(double monthlySalary) {
        double sss = 0;
        if(monthlySalary < 3250)        sss = 135;
        else if(monthlySalary < 3750)   sss = 157.50;
        else if(monthlySalary < 4250)   sss = 180;
        else if(monthlySalary < 4750)   sss = 202.50;
        else if(monthlySalary < 5250)   sss = 225;
        else if(monthlySalary < 5750)   sss = 247.50;
        else if(monthlySalary < 6250)   sss = 270;
        else if(monthlySalary < 6750)   sss = 292;
        else if(monthlySalary < 7250)   sss = 315;
        else if(monthlySalary < 7750)   sss = 337.50;
        else if(monthlySalary < 8250)   sss = 360;
        else if(monthlySalary < 8750)   sss = 382.50;
        else if(monthlySalary < 9250)   sss = 405;
        else if(monthlySalary < 9750)   sss = 427.50;
        else if(monthlySalary < 10250)   sss = 450;
        else if(monthlySalary < 10750)   sss = 472.50;
        else if(monthlySalary < 11250)   sss = 495;
        else if(monthlySalary < 11750)   sss = 517;
        else if(monthlySalary < 12250)   sss = 540;
        else if(monthlySalary < 12750)   sss = 562.50;
        else if(monthlySalary < 13250)   sss = 585;
        else if(monthlySalary < 13750)   sss = 607.50;
        else if(monthlySalary < 14250)   sss = 630;
        else if(monthlySalary < 14750)   sss = 652.50;
        else if(monthlySalary < 15250)   sss = 675.0;
        else if(monthlySalary < 15750)   sss = 697.50;
        else if(monthlySalary < 16250)   sss = 720;
        else if(monthlySalary < 16750)   sss = 742.50;
        else if(monthlySalary < 17250)   sss = 765;
        else if(monthlySalary < 17750)   sss = 787.50;
        else if(monthlySalary < 18250)   sss = 810;
        else if(monthlySalary < 18750)   sss = 832.50;
        else if(monthlySalary < 19250)   sss = 855;
        else if(monthlySalary < 19750)   sss = 877.50;
        else if(monthlySalary < 20250)   sss = 900;
        else if(monthlySalary < 20750)   sss = 922.50;
        else if(monthlySalary < 21250)   sss = 945;
        else if(monthlySalary < 21750)   sss = 967.50;
        else if(monthlySalary < 22250)   sss = 990;
        else if(monthlySalary < 22750)   sss = 1012.50;
        else if(monthlySalary < 23250)   sss = 1035;
        else if(monthlySalary < 23750)   sss = 1057.50;
        else if(monthlySalary < 24250)   sss = 1080;
        else if(monthlySalary < 24750)   sss = 1102.50;
        else if(monthlySalary >= 24750)   sss = 1125;
        return sss;
    } 

    //Method to calculate Philhealth contributions based on the employee's basic salary.
    public double philhealthContribution(double monthlySal) {
        monthlySal = monthlySal * 0.03;
        monthlySal = monthlySal * 0.5;
        return monthlySal;
    }

    //Method to calculate Pag-ibig contributions based on the employees' basic salary.
    public double pagibigContribution(double monthlySal) {
        return monthlySal * 0.03;
    }

    //Method to get the total government contributions.
    public double getTotalGovernmentCont(double sss, double philhealth, double pagibig) {
        return sss + pagibig + philhealth;
    }

    //Method to get the Taxable income by deducting all the government contributions from the gross pay.
    public double getTaxableIncome(String empNumber, String startDate, String endDate) throws IOException {
        double taxableIncome = getGrossPay(empNumber, startDate, endDate) - (getTotalGovernmentCont
        (SssContribution(getGrossPay(empNumber, startDate, endDate)), 
        philhealthContribution(getGrossPay(empNumber, startDate, endDate)),
        pagibigContribution(getGrossPay(empNumber, startDate, endDate))));
        return taxableIncome;
    }
}
