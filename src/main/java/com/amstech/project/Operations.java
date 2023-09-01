
package com.amstech.project;

public class Operations {
    
    public static double getTotalPrice(double area,String propertyType)
    {
       if(propertyType.equalsIgnoreCase("Plot"))
       {
           return Rate.plotRate*area;
       }
       else if(propertyType.equalsIgnoreCase("Office"))
       {
           return Rate.officeRate*area;
       }
       else
       {
           return Rate.flatRate*area;
       }
    }
    public static double getRegistry(double TotalPrice)
    {
        return (TotalPrice*Rate.RegistryPercent)/100;
    }
    
    public static double getNagarNigamGreenTax(double TotalPrice)
    {
        return TotalPrice*Rate.GreenTax/100;
    }
    
    public static double getSocietyDevMaintainance()
    {
        return Rate.DevelopmentTax;
    }
    
    public static double getTotalEstimatedPrice(double TotalPrice)
    {
        return (TotalPrice+(TotalPrice*Rate.RegistryPercent)/100+TotalPrice*Rate.GreenTax/100+Rate.DevelopmentTax);
    }
}
