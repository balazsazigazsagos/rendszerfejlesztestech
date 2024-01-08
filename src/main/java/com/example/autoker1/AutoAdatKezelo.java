package com.example.autoker1;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class AutoAdatKezelo {
    public ArrayList<Auto> osszesAuto=new ArrayList<>();
    public ArrayList<String[]> sorokAdatai=new ArrayList<>();
    public String filename;
    int nextIndex=1;


    //Autó keresés ID alapján
    public Auto getAutoByID(String autoID){
        System.out.println("Searching for auto with ID: "+autoID);
        for(int i = 0; i<osszesAuto.size(); i++){
            if(autoID.equals(osszesAuto.get(i).auto_id.toString())){
                return osszesAuto.get(i);
            }
        }
        System.out.println("Adatbázis hiba!");
        return osszesAuto.get(0);
    }


    public AutoAdatKezelo(){
        filename="src/main/resources/autok.csv";
        File file=new File(filename);

        try {
            Scanner inputStream = new Scanner(file);
            inputStream.nextLine(); //ignores first line

            //DATAROWS SIZE IS 0 HERE

            while (inputStream.hasNext()){
                String data = inputStream.nextLine(); //gets whole line
                String[] values = data.split(","); //splits by commas
                sorokAdatai.add(values); //adds the line to an arraylist (dataRows)
            }
            inputStream.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        //Autó példányok kiválasztása - létrehozása
        for(int i=0; i<sorokAdatai.size();i++){
            Auto tempAuto = new Auto (Integer.parseInt(sorokAdatai.get(i)[0]),sorokAdatai.get(i)[1],sorokAdatai.get(i)[2],
                    Integer.parseInt(sorokAdatai.get(i)[3]),Integer.parseInt(sorokAdatai.get(i)[4]),
                    sorokAdatai.get(i)[5]);
            osszesAuto.add(tempAuto);
        }
    }
}
