package ejercicio2;

import java.io.*;

public class CrearFichero {
    public static void main(String[] args) {

        String padre="doc/", hijo="AD/";
        recorre(padre,hijo);
    }
    public static void recorre(String padre, String hijo){
        String texto;
        try {
            File fPadre=new File(padre);

            if (fPadre.isDirectory()){
                FileWriter fw = new FileWriter(padre+"/index.html");
            }
        }catch(Exception e){
            System.out.println("Error!"+e.getMessage());
        }
    }
}