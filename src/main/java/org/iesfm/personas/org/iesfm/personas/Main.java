package org.iesfm.personas.org.iesfm.personas;


import org.iesfm.personas.*;
import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        Personas p1= new Personas("Ana Luz","Aviles Florentino", "49069455J",29) {
            @Override
            public void saludar() {
                System.out.println("Hola soy " + Nombre + " " +  Apellidos + " y mi Dni es: " + Dni);

            }

            @Override
            public void despedir() {
                System.out.println("Hasta la proxima! Firmado " + Nombre);

            }

        };

        p1.saludar();
        p1.despedir();
    }

}
