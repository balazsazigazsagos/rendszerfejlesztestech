package com.example.autoker1;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class AutoAdatKezelo {
    public ArrayList<Auto> osszesAuto=new ArrayList<>();
    public ArrayList<String[]> sorokAdatai=new ArrayList<>();
    public String filename;
    int nextIndex=1;

    public AutoAdatKezelo(){
        filename="src/main/resources/autok.csv";
        File file=new File(filename);



    }

}
