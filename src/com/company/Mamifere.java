package com.company;

public class Mamifere extends Animale{
    private String specia;
    private String cul_blanii;
    Mamifere(String nume,String clasa,int varsta,float greutate,String specia,String cul_blanii){
        super(nume,clasa,varsta,greutate);
    }
    public String getSpecia(){
        return this.specia;
    }
    public String getCul_blanii(){
        return this.cul_blanii;
    }
    public void setSpecia(String specia){
        this.specia=specia;
    }
    public void setCul_blanii(String cul_blanii){
        this.cul_blanii=cul_blanii;
    }

    public String toString(){
        return getNume()+" este un mamifer din clasa "+getClasa()+" specia "+specia+" el are blana de culoruile "+cul_blanii+" ,el are greutatea de: "+getGreutate()+" kg si varsta de: "+getVarsta()+" ani .";
    }
}
