/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication091117;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import utilidades.Entrada;

/**
 *
 * @author nocturno
 */
public class JavaApplication091117 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Pattern patron = Pattern.compile("[0-9]{8}[A-Z]");
        Matcher emparejador;
        String dni;

        do {
            System.out.println("Mete dni");
            dni = Entrada.cadena();
            emparejador = patron.matcher(dni);

        } while (!emparejador.matches());

    }

}
