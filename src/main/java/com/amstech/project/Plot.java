
package com.amstech.project;

public class Plot {
    private double length;
    private double breadth;
    private String ownername;
    private String propertyType;
    public Plot(double length,double breadth,String ownername)
    {
        this.length=length;
        this.breadth=breadth;
        this.ownername=ownername;
        propertyType="Plot";
    }
//    
    public void setPlotLength(double length)
    {
        this.length=length;
    }
    public double getPlotLength()
    {
        return length;
    }
    public double getPlotBreadth()
    {
        return breadth;
    }
    public void setPlotBreadth(double breadth)
    {
        this.breadth=breadth;
    }
    
    public double getPlotArea()
    {
        return length*breadth;
    }
    
    public double getPlotPerimeter()
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
