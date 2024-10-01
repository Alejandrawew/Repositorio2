package org.example;

import java.util.Scanner;

public class Atividad3 {
    public void votante()


    {

        Scanner entrada = new Scanner(System.in);


        System.out.println("¿Cómo te llamas?");
        String nombre = entrada.next();

        System.out.println("Mi nombre es " + nombre);
        System.out.println(nombre + " ¿Qué edad tienes?");

        int edad =  entrada.nextInt();
        if (edad >= 18)
        {
            System.out.println(" Puedes votar");
        } else {

            System.out.println("No puedes votar");

        int resultado = 18 - edad;
         System.out.println("Te faltan " + resultado + " años para poder votar");

        }
    }
    }