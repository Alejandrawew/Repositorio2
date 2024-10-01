package org.example;

import java.util.Scanner;

public class Ejercicio1{
    public void pedir_numero (){

        Scanner entrada = new Scanner(System.in);

        int a=0;

        System.out.println("Introduce un numero");
        a = entrada.nextInt();

        if(a>0){
            System.out.println("Es positivo");

        }if(a<0){
            System.out.println("Es negativo");

        }if(a==0){
            System.out.println("Es natural");

        }





    }

}
