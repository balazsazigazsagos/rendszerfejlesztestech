package com.example.autoker1;

public class Auto {
    public Integer auto_id;
    public String marka;
    public String modell;
    public Integer evjarat;
    public Integer ar;
    public String kep_link;

    //konstruktor létrehozása
    public Auto(Integer auto_id, String marka, String modell, Integer evjarat, Integer ar,
                String kep_link){
        this.auto_id=auto_id;
        this.marka=marka;
        this.modell=modell;
        this.evjarat=evjarat;
        this.ar=ar;
        this.kep_link=kep_link;
    }
}
