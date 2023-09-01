
package com.amstech.project;

public class Office {
    private double length;
    private double breadth;
    private String ownername;
    private String propertyType;
    
    public Office(double length,double breadth,String ownername)
    {
        this.length=length;
        this.breadth=breadth;
        this.ownername=ownername;
        propertyType="Office";
        
    }
    
    public void setLength(double length)
    {
        this.length=length;
    }
    
    public double getLength()
    {
        return length;
    }
    
    public void setBreadth(double breadth)
    {
        this.breadth=breadth;
    }
    
    public double getBreadth()
    {
        return breadth;
    }
    
    public double getOfficeArea()
    {
        return length*breadth;
    }
    
    public double getOfficePerimeter()
    {
        return 2*(length+breadth);
    }
   public String getPropertyType()
   {
       return propertyType;
   }
   
   public void setPropertyType(String propertyType)
   {
       this.propertyType=propertyType;
   }
   
   public String getOwnername()
    {
        return ownername;
    }
}
