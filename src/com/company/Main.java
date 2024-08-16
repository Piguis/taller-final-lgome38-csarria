package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){





        System.out.println("------------------Menu Taller--------------------");
        System.out.println("1. Datos primitivos");
        System.out.println("2. String");
        System.out.println("3. Constante");
        System.out.println("4. Tipo de Operadores");
        System.out.println("5. Condicional IF, ELSE, IF ELSE");





        System.out.println("-------------------------------------------------");
        System.out.println("Ingresa un numero para ver el contenido: ");
        Scanner valorMenu = new Scanner(System.in);
        byte numeroValor = valorMenu.nextByte();

        do {
            switch (numeroValor){

                case (1):
                    System.out.println("------------------Datos primitivos--------------------");
                    System.out.println("");
                    break;
                case (2):
                    break;



            }

        } while (numeroValor == 10);










    }

}
