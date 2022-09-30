package ejercicio2;

import java.io.*;

public class CrearFichero {
    public static void main(String[] args) {

        try {
            String html="<html>\n" +
                        "   <head>\n" +
                        "      <title> [UA01] </title>\n" +
                        "   </head>\n" +
                        "   <body>\n" +
                        "      <h1>[C:\\Users\\cmartin\\eclipse-workspace\\AccesoDatos1\\AD\\UA01\\ficheroHTML.txt]</h1>\n" +
                        "      <h3>Autor: [Carmen_Martin_Nunez]</h3>\n" +
                        "   </body>\n" +
                        "</html>";
            File fichero = new File("C:\\Users\\cmartin\\eclipse-workspace\\AccesoDatos1\\AD\\UA01\\ficheroHTML.txt");

            fichero.createNewFile();

            if (fichero.exists()){
                FileWriter fw=new FileWriter("C:\\Users\\cmartin\\eclipse-workspace\\AccesoDatos1\\AD\\UA01\\ficheroHTML.txt");
                BufferedWriter bw=new BufferedWriter(fw);
                bw.write(html);
                bw.close();

                System.out.println("El fichero se ha creado con éxito");

            }else {
                System.out.println("El fichero no se ha podido crear");
            }

        } catch (Exception e){
            e.getMessage();
        }
    }
}