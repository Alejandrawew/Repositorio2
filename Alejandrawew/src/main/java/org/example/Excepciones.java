package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {

    public void control_excepciones() {


        Scanner entrada = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        float resultado;
        int aux = 0;

        while (aux==0) {

            try {

                System.out.println(" Introduce el dividendo de...");
                num1 = entrada.nextInt();
                System.out.println(" Introduce el dividendo de...");
                num2 = entrada.nextInt();
                aux = 1;

            } catch (InputMismatchException er) {
                System.out.println(" ERROR. Introduce valor valido...");
                entrada.nextLine();

            }

            int numero;
            boolean error = true;

            while (error == true) {

                try {
                    System.out.println("introduce un numero .....");
                    numero = entrada.nextInt();
                    error = false;
                } catch (InputMismatchException er) {
                    System.out.println("Error. Introduce un valor valido ");
                    entrada.nextLine();

                }
            }
            if (num2==0){
                System.out.println("El dividor no puede ser 0.");

            }else{
                resultado =  (num1 / num2);
                System.out.println(" El resultado es" + resultado);

            }
            resultado = (num1/num2);

        }
    }
}
