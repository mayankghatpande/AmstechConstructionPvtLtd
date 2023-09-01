
package com.amstech.project;

public class Invoice {
    
    public static void getPlotInvoice(Plot plot)
    {
        double totalprice =Operations.getTotalPrice(plot.getPlotArea(), plot.getPropertyType());
        double registryprice=Operations.getRegistry(totalprice);
        double greentax=Operations.getNagarNigamGreenTax(totalprice);
        double estimatedprice=totalprice+registryprice+greentax+Rate.DevelopmentTax;
        System.out.println("\n--------Plot Invoice----------");
        System.out.println("Owner Name "+plot.getOwnername());
        System.out.println(" Length="+plot.getPlotLength());
        System.out.println(" Breadth="+plot.getPlotBreadth());
        System.out.println(" Price="+totalprice);
        System.out.println(" Registry Price="+registryprice);
        System.out.println(" Green Tax="+greentax);
        System.out.println("Development Tax="+Rate.DevelopmentTax);
        System.out.println("Estimated Price="+estimatedprice);
    }
    
    public static void getFlatInvoice(Flat flat)
    {
        double totalprice =Operations.getTotalPrice(flat.getFlatArea(), flat.getPropertyType());
        double registryprice=Operations.getRegistry(totalprice);
        double greentax=Operations.getNagarNigamGreenTax(totalprice);
        double estimatedprice=totalprice+registryprice+greentax+Rate.DevelopmentTax;
        System.out.println("\n--------Flat Invoice----------");
        System.out.println("Owner Name "+flat.getOwnername());
        System.out.println(" Price="+totalprice);
        System.out.println(" Registry Price="+registryprice);
        System.out.println(" Green Tax="+greentax);
        System.out.println("Development Tax="+Rate.DevelopmentTax);
        System.out.println("Estimated Price="+estimatedprice);
    }
    
    public static void getOfficeInvoice(Office office)
    {
        double totalprice =Operations.getTotalPrice(office.getOfficeArea(), office.getPropertyType());
        double registryprice=Operations.getRegistry(totalprice);
        double greentax=Operations.getNagarNigamGreenTax(totalprice);
        double estimatedprice=totalprice+registryprice+greentax+Rate.DevelopmentTax;
        System.out.println("\n--------Office Invoice----------");
        System.out.println("Owner Name "+office.getOwnername());
        System.out.println(" Length="+office.getLength());
        System.out.println(" Breadth="+office.getBreadth());
        System.out.println(" Price="+totalprice);
        System.out.println(" Registry Price="+registryprice);
        System.out.println(" Green Tax="+greentax);
        System.out.println("Development Tax="+Rate.DevelopmentTax);
        System.out.println("Estimated Price="+estimatedprice);
    }
    
            
    
}
