
package com.amstech.project;

public class Flat {
    private double area;
    private String ownername;
    private String propertyType;
    public Flat(double area,String ownername)
    {
        this.area=area;
        this.ownername=ownername;
        propertyType="Flat";
    }
    
    public void setFlatArea(double area)
    {
        this.area=area;
    }
    
    public double getFlatArea()
    {
        return area;
    }
    public void setPropertyType(String propertyType)
    {
        this.propertyType=propertyType;
    }
    public String getPropertyType()
    {
        return propertyType;
    }
    
    public String getOwnername()
    {
        return ownername;
    }
    
    public void setOwnername(String ownername)
    {
        this.ownername=ownername;
    }
    
}
