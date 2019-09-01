package controllers;

import data.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void muestraContenido(String archivo) throws IOException {
        try {
            String cadena;
            FileReader f = new FileReader(archivo);
            BufferedReader b = new BufferedReader(f);
            while((cadena = b.readLine())!=null) {
                System.out.println(cadena);
            }
            b.close();
        }catch(IOException fe) {
            System.out.println(fe);    
        }
       
    }


    public static void main(String args[])  throws FileNotFoundException, IOException {
        System.out.println("hello world");
        ReadFile readFile = new ReadFile();
        readFile.muestraContenido("C:/Users/Usuario/Documents/ITM/Laboratorio estructuras/supermarket/sales.txt");

    }
}