package com.example.telefoanele;

public class TelefonMobil extends Telefon {
    private String sanatateBaterie = "nicio baterie";
    private String culoareTelefon = "nicio culoare";
    private String dimensiuniTelefon = "nicio dimensiune";
    private String procesorTelefon = "fara procesor";

    public TelefonMobil(String sanatateBaterie, String culoareTelefon, String dimensiuniTelefon, String procesorTelefon) {
        this.sanatateBaterie = sanatateBaterie;
        this.culoareTelefon = culoareTelefon;
        this.dimensiuniTelefon = dimensiuniTelefon;
        this.procesorTelefon = procesorTelefon;
    }

    public TelefonMobil() {
    }

    public TelefonMobil(TelefonMobil telefon){
        this.pret = telefon.pret;
        this.model = telefon.model;
        this.calitateFoto = telefon.calitateFoto;
        this.sistemDeOperare = telefon.sistemDeOperare;
        this.sanatateBaterie = telefon.sanatateBaterie;
        this.culoareTelefon = telefon.culoareTelefon;
        this.dimensiuniTelefon = telefon.dimensiuniTelefon;
        this.procesorTelefon = telefon.procesorTelefon;
    }

    @Override
    void pretAbonament() {
        System.out.println("Pretul abonament pentru telefon mobil");

    }

    @Override
    void incarcareBaterie() {
        System.out.println("Incarcare baterie pentru telefon mobil");

    }

    public String getSanatateBaterie() {
        return sanatateBaterie;
    }

    public void setSanatateBaterie(String sanatateBaterie) {
        this.sanatateBaterie = sanatateBaterie;
    }

    public String getCuloareTelefon() {
        return culoareTelefon;
    }

    public void setCuloareTelefon(String culoareTelefon) {
        this.culoareTelefon = culoareTelefon;
    }

    public String getDimensiuniTelefon() {
        return dimensiuniTelefon;
    }

    public void setDimensiuniTelefon(String dimensiuniTelefon) {
        this.dimensiuniTelefon = dimensiuniTelefon;
    }

    public String getProcesorTelefon() {
        return procesorTelefon;
    }

    public void setProcesorTelefon(String procesorTelefon) {
        this.procesorTelefon = procesorTelefon;
    }
    @Override
    public String toString(){
        String mesaj;
        mesaj = "Telefonul mobil are urmatoarele specificatii: " +
                "culoarea - " + this.culoareTelefon +
                ",dimensiuni - " + this.dimensiuniTelefon +
                ",procesor - " + this.procesorTelefon +
                ",sanatate baterie - " + this.sanatateBaterie +
                ",sistem de operare - " + this.sistemDeOperare +
                ",calitate foto - " + this.calitateFoto +
                ",model - " + this.model +
                ",pret - " + this.pret;

        return mesaj;
    }
}


