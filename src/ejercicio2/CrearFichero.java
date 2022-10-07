package ejercicio2;

import java.io.*;

public class CrearFichero {
    public static void main(String[] args) {
/**
 * Declaro padre como ruta raíz e hijo como primera carpeta
 */
        String padre="doc/", hijo="AD/";
        recorre(padre,hijo);	// Recorre de forma recursiva todas las carpetas que encuentre
    };

    public static void recorre(String padre,String hijo) {
        String texto;	// Declaro texto para el contenido del HTML
        try {
            File fPadre = new File(padre);	// fPadre contiene la ruta actual

            /**
             * Si es directorio,
             * 	Preparará el archivo index.html para escribir en él mediante fw,
             * 	Preparará también el texto con la ruta (padre) y el título (hijo),
             * 	Escribirá el texto mostrándolo por pantalla en la línea siguiente,
             * Finalmente cerrará el fichero fw
             */
            if(fPadre.isDirectory()) {
                FileWriter fw = new FileWriter(padre+"/index.html");
                texto="<html><head><title>"+hijo+"</title></head>"
                        + "<body><h1>"+padre+"</h1><h3>Autor: David Bermúdez</h3></body>"
                        + "</html>";
                fw.write(texto);
                System.out.println(texto);
                fw.close();

                String[] lista = fPadre.list(); 			// Como es directorio, se carga la lista de su contenido ...
                for (int i = 0; i < lista.length; i++) {	// ... se recorre mediante un bucle y ...
                    recorre(padre+lista[i]+"/",lista[i]);	// ... se comienza de nuevo indicando que HIJO es la carpeta actual ...
                    // ... y padre será la anterior PADRE + el actual HIJO
                }
            }
        }catch(Exception e) {
            System.out.println(e.getMessage());
        };
    }
}