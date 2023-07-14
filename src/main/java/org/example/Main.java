package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // declarando datos de entrada del problema
        String ubicacionUsuario;
        String destino;
        String nombreUsuario;
        String telefonoUsuario;

        //declarar dato especial para recibir informacion desde el teclado

        Scanner teclado =  new Scanner (System.in);

        // espacio para inicializar las variables
        System.out.print("\033[36mPor favor ingrese su nombre😁 --> ");
        nombreUsuario=teclado.nextLine();
        System.out.println(" \033[35m⭐⭐⭐⭐⭐Hola señor usuario " + nombreUsuario + "👋🏼 ⭐⭐⭐⭐");
        System.out.print("\033[36mPor favor ingrese su ubicacioin acctual 📍--> ");
        ubicacionUsuario=teclado.nextLine();
        System.out.print("\033[36mPor favor ingrese su destino 🛸--> ");
        destino=teclado.nextLine();
        System.out.print("\033[36mPor favor ingrese su numero telefonico 📱-->  ");
        telefonoUsuario=teclado.nextLine();

        // proceso del problema

        String distancia = "20"; // esto es un texto
        //debo hacer parseo de la variable distancia
        //parseo --> modificar el tipo de dato de una variable

        Integer distanciaEntero = Integer.parseInt(distancia);

        Integer costoPorKilometro = 6800;
        Integer cobroTotal=  distanciaEntero*costoPorKilometro;
        System.out.println("\033[36m\033[40mSeñor@ " + nombreUsuario + " su total a pagar es --> " + cobroTotal + "pesos😁");





    }
}