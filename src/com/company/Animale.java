package com.company;

public class Animale {
    private String nume;
    private String clasa;
    private int varsta;
    private float greutate;

    Animale(String nume, String clasa, int varsta, float greutate) {
        this.nume = nume;
        this.clasa = clasa;
        this.varsta = varsta;
        this.greutate = greutate;

    }

    public String getNume() {
        return this.nume = nume;
    }

    public String getClasa() {
        return this.clasa;
    }

    public int getVarsta() {
        return this.varsta;
    }

    public float getGreutate() {
        return this.greutate;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setClasa(String clasa) {
        this.clasa = clasa;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setGreutate(float greutate) {
        this.greutate = greutate;
    }


}