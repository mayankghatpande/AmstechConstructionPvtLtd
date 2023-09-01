

package com.amstech.project;

public class AmstechConstructionPvtLtd {

    public static void main(String[] args) {
        Plot plot=new Plot(40,50,"mayank");
        Invoice.getPlotInvoice(plot);
        Flat flat=new Flat(1500,"mayank");
        Invoice.getFlatInvoice(flat);
        Office office = new Office(30,35,"mayank");
        Invoice.getOfficeInvoice(office);
        
    }
}
