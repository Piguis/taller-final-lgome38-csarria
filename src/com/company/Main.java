package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        byte numeroMenuPrimitivo;
        byte numeroValor;

        do {

            System.out.println("------------------Menu Taller--------------------");
            System.out.println("1. Datos primitivos.");
            System.out.println("2. String.");
            System.out.println("3. Constante.");
            System.out.println("4. Tipo de Operadores.");
            System.out.println("5. Condicional IF, ELSE, IF ELSE.");
            System.out.println("6. Condicional Switch.");
            System.out.println("7. Condicional ternaria.");
            System.out.println("8. Bucle Do WHILE.");
            System.out.println("9. Bucle WHILE.");
            System.out.println("10. Bucle FOR.");
            System.out.println("11. Salir");


            System.out.println("-------------------------------------------------");
            System.out.println("Ingresa un numero para ver el contenido: ");

<<<<<<< HEAD
        System.out.println("------------------Menu Taller--------------------");
        System.out.println("1. Datos primitivos.");
        System.out.println("2. String.");
        System.out.println("3. Constante.");
        System.out.println("4. Tipo de Operadores.");
        System.out.println("5. Condicional IF, ELSE, IF ELSE.");
        System.out.println("6. Condicional Switch.");
        System.out.println("7. Condicional ternaria.");
        System.out.println("8. Bucle Do WHILE.");
        System.out.println("9. Bucle WHILE.");
        System.out.println("10. Bucle FOR.");
        System.out.println("0. Salir");


        System.out.println("-------------------------------------------------");
        System.out.println("Ingresa un numero para ver el contenido: ");
        Scanner valorMenu = new Scanner(System.in);
        byte numeroValor = valorMenu.nextByte();

=======
            Scanner valorMenu = new Scanner(System.in);
            numeroValor = valorMenu.nextByte();

            switch (numeroValor) {

                case (1):
>>>>>>> 8a3d07c3554361fb268e2358341d244ab39ac790


                    do {
                    System.out.println("------------------Datos primitivos--------------------");
                    System.out.println("------------------------------------------------------");
                    System.out.println("1. ¿Qué es un dato tipo Byte?");
                    System.out.println("2. ¿Qué es un dato tipo Short?");
                    System.out.println("3. ¿Qué es un dato tipo Int?");
                    System.out.println("4. ¿Qué es un dato tipo Long?");
                    System.out.println("5. ¿Qué es un dato tipo Float?");
                    System.out.println("6. ¿Qué es un dato tipo Double?");
                    System.out.println("7. ¿Qué es un dato tipo Char");
                    System.out.println("8. ¿Qué es un dato tipo Boolean?");
                    System.out.println("9. Volver al menu principal");

                    System.out.println("------------------------------------------------------");
                    System.out.println("Ingresa el valor que quieras consultar: ");

                    Scanner numeroValorDatosPrimitivo = new Scanner(System.in);
                     numeroMenuPrimitivo = numeroValorDatosPrimitivo.nextByte();

                    switch (numeroMenuPrimitivo){
                        case (1):
                            System.out.println("------------------¿Qué es un dato tipo Byte?--------------------");
                            System.out.println("------------------------------------------------------");
                            System.out.println("El dato Byte es para utilizar valores enteros que no pasen de 3 cifras");
                            System.out.println("Ejemplo:");
                            System.out.println("byte edad = 13;");
                            System.out.println("------------------------------------------------------");
                            System.out.println("Presione Enter para continuar...");

                            valorMenu.nextLine(); // Captura el salto de línea restante
                            valorMenu.nextLine(); // Espera a que el usuario presione Enter

                        case(2):
                            System.out.println("------------------¿Qué es un dato tipo Int?--------------------");
                            System.out.println("------------------------------------------------------");
                            System.out.println("El tipo de dato entero mas comunmente usado, su rango es de -2^31 a 2^31-1");
                            System.out.println("Esto hace un total de 65.536 valores diferentes para poder usar, con un peso de 16 bits");
                            System.out.println("Ejemplo:");
                            System.out.println("Short año = 2019;");
                            System.out.println("------------------------------------------------------");
                            System.out.println("Presione Enter para continuar...");

                            valorMenu.nextLine(); // Captura el salto de línea restante
                            valorMenu.nextLine(); // Espera a que el usuario presione Enter

                        case(3):
                            System.out.println("------------------¿Qué es un dato tipo Long?--------------------");
                            System.out.println("------------------------------------------------------");
                            System.out.println("El dato Short se puede utilizar para valores entre -32.768 y 32.767.");
                            System.out.println("Esto hace un total de 65.536 valores diferentes para poder usar, con un peso de 16 bits");
                            System.out.println("Ejemplo:");
                            System.out.println("Short año = 2019;");
                            System.out.println("------------------------------------------------------");
                            System.out.println("Presione Enter para continuar...");

                            valorMenu.nextLine(); // Captura el salto de línea restante
                            valorMenu.nextLine(); // Espera a que el usuario presione Enter

                    }
                    break;

                    }while (numeroMenuPrimitivo == 8);


                case (2):
                    break;


            }
        }while (numeroValor <= 10) ;

    }
}
