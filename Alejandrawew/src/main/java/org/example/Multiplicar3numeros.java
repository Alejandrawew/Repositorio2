package org.example;

import java.util.Scanner;

public class Multiplicar3numeros {

    public void multiplicaciones() {

        Scanner scanner = new Scanner(System.in);


        {
            System.out.println("Introduce un numero de tres cifras");
            int num1 = scanner.nextInt();

            System.out.println("Escribe otro numero");
            int num2 = scanner.nextInt();

            int resultado = num1 * num2;
            System.out.println("El resultado es " + resultado);

            System.out.println("La multiplicación es la siguiente     ");
            System.out.println("    " + num1);
            System.out.println("*   " + num2);
            System.out.println("------------");


            if (num1 >= 100 && num1 <= 999) {
                // Usamos operaciones matemáticas para obtener los dígitos
                int primerDigito = num1 / 100; int segundoDigito = (num1 / 10) % 10; int tercerDigito = num1 % 10;

                System.out.println(primerDigito);
                System.out.println(segundoDigito);
                System.out.println(tercerDigito);

                if (num2 >= 100 && num2 <= 999) {
                    // Usamos operaciones matemáticas para obtener los dígitos
                    int primerDigito= num2 / 100; int segundoDigito = (num2 / 10) % 10; int tercerDigito = num2 % 10;

                    System.out.println(primerDigito);
                    System.out.println(segundoDigito);
                    System.out.println(tercerDigito);







                        }


                    }
                }
            }
        }


