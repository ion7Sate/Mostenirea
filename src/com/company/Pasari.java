package com.company;

public class Pasari extends Animale {
    private String cul_penelor;
    private String forma_cioc;
    Pasari(String nume,String clasa,int varsta,float greutate,String cul_penelor,String forma_cioc){
        super(nume,clasa,varsta,greutate);
    }
    public String getCul_penelor() {
        return this.cul_penelor;
    }
    public String getForma_cioc(){
        return this.forma_cioc;
    }
    public void setCul_penelor(String cul_penelor){
        this.cul_penelor=cul_penelor;
    }
    public void setForma_cioc(String forma_cioc){
        this.forma_cioc=forma_cioc;
    }

    public String toString(){
        return getNume()+" este o pasare din clasa "+getClasa()+" ea  are penele de culoarea  "+cul_penelor+" ,  greutatea de: "+getGreutate()+"  g ,varsta de: "+getVarsta()+" ani "+" si ciocul de forma "+forma_cioc;
    }
}

