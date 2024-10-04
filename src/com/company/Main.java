package com.company;

import java.util.Scanner;

public class Main {

    public static final int valorBase = 100;

    public static void main(String[] args) {



        byte numeroMenuPrimitivo;
        byte numeroValor;
        byte numeroMenuCondicionales;
        byte numeroEjemploCondicionales;
        byte numeroEjemploTernaria;
        int numeroEjemploWhile;
        int opcionSwitch;
        int opciondowhile;
        int opcionFor;



        Scanner valorMenu = new Scanner(System.in);

        do {
            //Menu Principal
            System.out.println("------------------Menu Taller--------------------");
            System.out.println("1. Datos primitivos.");
            System.out.println("2. String.");
            System.out.println("3. Constante.");
            System.out.println("4. Tipo de Operadores.");
            System.out.println("5. Condicional IF, ELSE, IF ELSE.");
            System.out.println("6. Condicional Switch.");
            System.out.println("7. Condicional Ternaria.");
            System.out.println("8. Bucle Do WHILE.");
            System.out.println("9. Bucle WHILE.");
            System.out.println("10. Bucle FOR.");
            System.out.println("11. Salir");
            System.out.println("-------------------------------------------------");
            System.out.println("Ingresa un numero para ver el contenido: ");
            while (!valorMenu.hasNextInt()){
                System.out.println("Por favor, ingrese un valor valido:");
                valorMenu.next();//Limpiar entrada incorrecta
                System.out.println("Ingresa un numero para ver el contenido: ");
            }

            //Solicitar entrada al usuario
            numeroValor = valorMenu.nextByte();

            //Menu datos primitivos
            switch (numeroValor) {

                case 1:


                    do {


                        do {

                            System.out.println("------------------Datos primitivos--------------------");
                            System.out.println("------------------------------------------------------");
                            System.out.println("1. ¿Qué es un dato tipo Byte?");
                            System.out.println("2. ¿Qué es un dato tipo Short?");
                            System.out.println("3. ¿Qué es un dato tipo Int?");
                            System.out.println("4. ¿Qué es un dato tipo Long?");
                            System.out.println("5. ¿Qué es un dato tipo Float?");
                            System.out.println("6. ¿Qué es un dato tipo Double?");
                            System.out.println("7. ¿Qué es un dato tipo Char?");
                            System.out.println("8. ¿Qué es un dato tipo Boolean?");
                            System.out.println("9. <------ Volver al menu principal");

                            System.out.println("------------------------------------------------------");
                            System.out.println("Ingresa el valor que quieras consultar: ");

                            //Se solicita la entrada al usuario
                            Scanner numeroValorDatosPrimitivo = new Scanner(System.in);
                            numeroMenuPrimitivo = numeroValorDatosPrimitivo.nextByte();

                            //Explicacion Datos primitivos mediante Switch
                            switch (numeroMenuPrimitivo) {
                                case 1:
                                    System.out.println("------------------¿Qué es un dato tipo Byte?--------------------");
                                    System.out.println("------------------------------------------------------");
                                    System.out.println("El dato Byte es para utilizado para datos pequeños y optimizacion de memoria en arrays grandes");
                                    System.out.println("Su rango es de -128 a 127");
                                    System.out.println("Ejemplo:");
                                    System.out.println("byte edad = 13;");
                                    System.out.println("------------------------------------------------------");
                                    System.out.println("Presione Enter para continuar...");

                                    valorMenu.nextLine(); // Captura el salto de línea restante
                                    valorMenu.nextLine(); // Espera a que el usuario presione Enter
                                    break;


                                case 2:
                                    System.out.println("------------------¿Qué es un dato tipo Short?--------------------");
                                    System.out.println("------------------------------------------------------");
                                    System.out.println("El dato Short es útil para datos numericos mas grandes que 'Byte' pero aun pequeños");
                                    System.out.println("Llegando a un rango de -32,768 a 32,767");
                                    System.out.println("Ejemplo:");
                                    System.out.println("Short año = 2024;");
                                    System.out.println("------------------------------------------------------");
                                    System.out.println("Presione Enter para continuar...");

                                    valorMenu.nextLine(); // Captura el salto de línea restante
                                    valorMenu.nextLine(); // Espera a que el usuario presione Enter
                                    break;


                                case 3:
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
                                    break;


                                case 4:
                                    System.out.println("------------------¿Qué es un dato tipo Long?--------------------");
                                    System.out.println("------------------------------------------------------");
                                    System.out.println("Utilizado para valores enteros muy grandes.");
                                    System.out.println("-2^63 a 2^63 -1");
                                    System.out.println("Ejemplo:");
                                    System.out.println("Long distancia = 15000000000L;");
                                    System.out.println("------------------------------------------------------");
                                    System.out.println("Presione Enter para continuar...");

                                    valorMenu.nextLine(); // Captura el salto de línea restante
                                    valorMenu.nextLine(); // Espera a que el usuario presione Enter
                                    break;

                                case 5:
                                    System.out.println("------------------¿Qué es un dato tipo Float?--------------------");
                                    System.out.println("------------------------------------------------------");
                                    System.out.println("Utilizados para numeros en coma flotante de precision simple");
                                    System.out.println("Este tipo de dato tiene un rango de 1.4e-45 a 3.4e38 en valor decimal ya que utiliza 32 bits en formato de coma flotante bajo el estandar IEEE 754.");
                                    System.out.println("Ejemplo:");
                                    System.out.println("Float precio = 19,99f;");
                                    System.out.println("------------------------------------------------------");
                                    System.out.println("Presione Enter para continuar...");

                                    valorMenu.nextLine(); // Captura el salto de línea restante
                                    valorMenu.nextLine(); // Espera a que el usuario presione Enter
                                    break;

                                case 6:
                                    System.out.println("------------------¿Qué es un dato tipo Double?--------------------");
                                    System.out.println("------------------------------------------------------");
                                    System.out.println("Utilizados para numeros en coma flotante de doble precision");
                                    System.out.println("Este tipo de dato tiene un rango de 4.9e-324 a 1.8e308 en valor decimal, ya que utiliza 64 bits en formato de coma flotante bajo el estandar IEEE 754");
                                    System.out.println("Ejemplo:");
                                    System.out.println("Double pi = 3.141592653589793");
                                    System.out.println("------------------------------------------------------");
                                    System.out.println("Presione Enter para continuar...");

                                    valorMenu.nextLine(); // Captura el salto de línea restante
                                    valorMenu.nextLine(); // Espera a que el usuario presione Enter
                                    break;


                                case 7:
                                    System.out.println("------------------¿Qué es un dato tipo Char?--------------------");
                                    System.out.println("------------------------------------------------------");
                                    System.out.println("Utilizados para almacenar un solo caracter Unicode");
                                    System.out.println("Su rango es de 0 a 65.535 (caracteres Unicode)");
                                    System.out.println("Ejemplo:");
                                    System.out.println("Char inicial = 'A' ");
                                    System.out.println("------------------------------------------------------");
                                    System.out.println("Presione Enter para continuar...");

                                    valorMenu.nextLine(); // Captura el salto de línea restante
                                    valorMenu.nextLine(); // Espera a que el usuario presione Enter
                                    break;


                                case 8:
                                    System.out.println("------------------¿Qué es un dato tipo Boolean?--------------------");
                                    System.out.println("------------------------------------------------------");
                                    System.out.println("Utilizados para almacenar valores de verdad 'true' o 'false' ");
                                    System.out.println("Ejemplo:");
                                    System.out.println("Boolean esMayorDeEdad = true");
                                    System.out.println("------------------------------------------------------");
                                    System.out.println("Presione Enter para continuar...");

                                    valorMenu.nextLine(); // Captura el salto de línea restante
                                    valorMenu.nextLine(); // Espera a que el usuario presione Enter
                                    break;
                                //Condicion por si el usuario agrega un valor incorrecto de seleccion
                                default:

                                    if (numeroMenuPrimitivo >= 10) {

                                        System.out.println("El numero ingresado no es permitido, vuelva a intentarlo:");

                                    }

                            }

                            break;


                        } while (numeroMenuPrimitivo == 8);

                        // } while (numeroMenuPrimitivo >= 10);
                    } while (numeroMenuPrimitivo >= 10);


                case 2:

                    System.out.println("----------String-----------");
                    System.out.println("En Java, los String son un objeto el cual nos permite almacenar muchos caracteres");
                    System.out.println("Ejemplo: String mensaje = ´hola mundo´;");
                    System.out.println("------------------------------------------------------");
                    System.out.println("Presione Enter para continuar...");

                    valorMenu.nextLine(); // Captura el salto de línea restante
                    valorMenu.nextLine(); // Espera a que el usuario presione Enter

                    break;


                //Explicacion Constantes
                case 3:
                    System.out.println("------------------¿Qué son las Constantes?--------------------");
                    System.out.println("------------------------------------------------------");
                    System.out.println("En Java, una constante es un valor que no cambia durante la ejecucion del programa.");
                    System.out.println("Las constantes se utilizan para representar valores fijos y de lectura unica, lo que");
                    System.out.println("ayuda a que el codigo sea mas legible y menos propenso a errores.");
                    System.out.println("Las Constantes en Java se declaran utilizando la palabra clave 'final' ");
                    System.out.println("Ejemplo:");
                    System.out.println("public static final int valorBase = 100");


                    break;


                case 4:

                    do {
                        System.out.println("------------------Tipo de Operadores--------------------");
                        System.out.println("------------------------------------------------------");
                        System.out.println("1. Aritméticos");
                        System.out.println("2. Relacionales");
                        System.out.println("3. Logicos");
                        System.out.println("4. Asignación");
                        System.out.println("5. Incremento / Decremento");

                        Scanner numeroValorDatostipooperador = new Scanner(System.in);
                        int opcion = numeroValorDatostipooperador.nextInt();

                        //Explicacion tipo de operadores aritmeticos mediante Switch
                        switch (opcion) {
                            case 1:
                                System.out.println("------------------Aritmetico--------------------");
                                System.out.println("------------------------------------------------------");
                                System.out.println("suman, restan dividen y multiplican dos cifras u operandos");
                                System.out.println("------------------------------------------------------");
                                System.out.println("Presione Enter para continuar...");

                                valorMenu.nextLine(); // Captura el salto de línea restante
                                valorMenu.nextLine(); // Espera a que el usuario presione Enter
                                break;

                            case 2:
                                System.out.println("------------------Relacionales--------------------");
                                System.out.println("------------------------------------------------------");
                                System.out.println("== Boolean es igual--- comprueba que si los valores de dos operandos son iguales");
                                System.out.println("!= Boolean no es igual -- comprueba que los valores de dos operandos no sean igual");
                                System.out.println(" > Boolean mayor comprueba si el primer valor es mayor que el segundo");
                                System.out.println("< Boolean menor comprueba si el primer valor esmenor que el segundo");
                                System.out.println("Presione Enter para continuar...");

                                valorMenu.nextLine(); // Captura el salto de línea restante
                                valorMenu.nextLine(); // Espera a que el usuario presione Enter
                                break;

                            case 3:
                                System.out.println("------------------Logicos--------------------");
                                System.out.println("------------------------------------------------------");
                                System.out.println("---&& ");
                                System.out.println("------------------------------------------------------");
                                System.out.println("Presione Enter para continuar...");

                                valorMenu.nextLine(); // Captura el salto de línea restante
                                valorMenu.nextLine(); // Espera a que el usuario presione Enter
                                break;

                            case 4:
                                System.out.println("------------------Asignacion--------------------");
                                System.out.println("------------------------------------------------------");
                                System.out.println("= ejemplo int a=5; le asigna el valor del operando derecho al operando izquierdo");
                                System.out.println("+= ejemplo int a=5;a+=3; suma el operando derecho al operador izquierdo y asigna el resultado al operando izquierdo");
                                System.out.println("-= ejemplo int a=5;a-=3; resta el operando derecho del operando izquierdo y asigna el resultado al operando izquierdo");
                                System.out.println("*= ejemplo int a=5;a*=3; multiplica el operando derecho por operador izquierdo y asigna el resultado al operando izquierdo");
                                System.out.println("/= ejemplo int a=5;a/=3; divide el operando derecho al operador izquierdo y asigna el resultado al operando izquierdo");
                                System.out.println("+= ejemplo int a=5;a+=3; suma el operando derecho al operador izquierdo y asigna el resultado al operando izquierdo");

                                System.out.println("Presione Enter para continuar...");

                                valorMenu.nextLine(); // Captura el salto de línea restante
                                valorMenu.nextLine(); // Espera a que el usuario presione Enter
                                break;

                            case 5:
                                System.out.println("------------------Incremento / Decrimento--------------------");
                                System.out.println("------------------------------------------------------");
                                System.out.println("++ ejemplo int a=5; a++;  incrementa el valor del operando en 1 ");
                                System.out.println("-- ejemplo int a=5; a--; Decrementa el varlor del operando en 1 ");
                                System.out.println("Presione Enter para continuar...");

                                valorMenu.nextLine(); // Captura el salto de línea restante
                                valorMenu.nextLine(); // Espera a que el usuario presione Enter
                                break;
                        }
                        while (numeroValor <= 5) ;
                        break;

                    } while (numeroValor <= 5);

                    System.out.println("El valor base de la casa es de: $" + valorBase);

                    System.out.println("------------------------------------------------------");
                    System.out.println("Presione Enter para continuar...");
                    valorMenu.nextLine(); // Captura el salto de línea restante
                    valorMenu.nextLine(); // Espera a que el usuario presione Enter
                    break;


                //Menu If, else, if else


                case 5:

                    //do {
                    System.out.println("------------------IF, ELSE, IF ELSE--------------------");
                    System.out.println("------------------------------------------------------");
                    System.out.println("1. Variable if");
                    System.out.println("2. Variable else");
                    System.out.println("3. Variable if else");
                    System.out.println("4. <------ Volver al menu principal");

                    //Se solicita entrada del usuario

                    Scanner numeroValorCondicionales = new Scanner(System.in);
                    numeroMenuCondicionales = numeroValorCondicionales.nextByte();


                    //Explicacion Condicionales

                    switch (numeroMenuCondicionales) {

                        case 1:


                            System.out.println("------------------IF--------------------");
                            System.out.println("------------------------------------------------------");
                            System.out.println("En el condicional IF se tiene una condición central que arroja como resultado verdadero o falso.");
                            System.out.println("------------------------------------------------------");
                            System.out.println("Ejemplo:");
                            System.out.println("byte numeroEjemploCondicionales;");
                            System.out.println();
                            System.out.println("System.out.println(\"Ingresa la edad: \");");
                            System.out.println("Scanner ejemploIf = new Scanner(System.in);");
                            System.out.println("numeroEjemploCondicionales = ejemploIf.nextByte();");
                            System.out.println();
                            System.out.println("If (numeroEjemploCondicionales >=18){");
                            System.out.println("System.out.println(\"Eres mayor de edad, puedes continuar :3\");");
                            System.out.println("}");
                            System.out.println("If (numeroEjemploCondicionales <=17){");
                            System.out.println("System.out.println(\"Eres menor de edad, pa' afuera!!!\");");
                            System.out.println("}");
                            System.out.println("---------------------------------------------------------------");


                            System.out.println("-------------------------Ejemplo real-----------------------------");
                            System.out.println("Ingresa la edad: ");
                            Scanner ejemploIf = new Scanner(System.in);
                            numeroEjemploCondicionales = ejemploIf.nextByte();

                            if (numeroEjemploCondicionales >= 18) {
                                System.out.println("Eres mayor de edad, puedes continuar :3");
                            }

                            if (numeroEjemploCondicionales <= 17) {
                                System.out.println("Eres menor de edad, pa' afuera!!!");

                            }

                            System.out.println("------------------------------------------------------");
                            System.out.println("Presione Enter para continuar...");
                            valorMenu.nextLine(); // Captura el salto de línea restante
                            valorMenu.nextLine(); // Espera a que el usuario presione Enter
                            break;

                        case 2:
                            System.out.println("------------------ELSE--------------------");
                            System.out.println("------------------------------------------------------");
                            System.out.println("Si queremos que nuestros programas ejecuten otro conjunto de instrucciones cuando la condición es falsa,");
                            System.out.println("entonces podemos usar una cláusula \"else\".");
                            System.out.println("------------------------------------------------------");
                            System.out.println("Ejemplo:");
                            System.out.println();
                            System.out.println("byte numeroEjemploCondicionales;");
                            System.out.println("System.out.println(\"Ingresa la edad: \");");
                            System.out.println("Scanner ejemploElse = new Scanner(System.in);");
                            System.out.println("numeroEjemploCondicionales = ejemploElse.nextByte();");
                            System.out.println();
                            System.out.println("if (numeroEjemploCondicionales >= 18) {");
                            System.out.println("System.out.println(\"Eres mayor de edad, puedes continuar :3\");");
                            System.out.println(" }else{");
                            System.out.println("System.out.println(\"Eres menor de edad, pa' afuera!!!\");");
                            System.out.println("}");
                            System.out.println("------------------------------------------------------");
                            System.out.println("-------------------------Ejemplo real-----------------------------");
                            System.out.println("Ingresa la edad: ");
                            Scanner ejemploElse = new Scanner(System.in);
                            numeroEjemploCondicionales = ejemploElse.nextByte();

                            if (numeroEjemploCondicionales >= 18) {
                                System.out.println("Eres mayor de edad, puedes continuar :3");
                            } else {
                                System.out.println("Eres menor de edad, pa' afuera!!!");
                            }

                            System.out.println("------------------------------------------------------");
                            System.out.println("Presione Enter para continuar...");
                            valorMenu.nextLine(); // Captura el salto de línea restante
                            valorMenu.nextLine(); // Espera a que el usuario presione Enter
                            break;

                        case 3:
                            System.out.println("------------------IF ELSE--------------------");
                            System.out.println("------------------------------------------------------");
                            System.out.println("La estructura if-else se utiliza en Java para tomar decisiones sobre un valor preexistente. ");
                            System.out.println("Es decir, si una condición basada en ese valor preexistente se cumple");
                            System.out.println("(si esa condición es verdadera), el programa tomará un camino.");
                            System.out.println("Si no (si esa condición es falsa), el programa tomará otro.");
                            System.out.println("------------------------------------------------------");
                            System.out.println("Ejemplo:");
                            System.out.println();
                            System.out.println("byte numeroEjemploCondicionales;");
                            System.out.println("System.out.println(\"Ingresa la edad:\");");
                            System.out.println("Scanner ejemploIfElse = new Scanner(System.in);");
                            System.out.println("numeroEjemploCondicionales = ejemploIfElse.nextByte();");
                            System.out.println();
                            System.out.println("if (numeroEjemploCondicionales <=17 ){");
                            System.out.println("System.out.println(\"Eres menor de edad, no puedes continuar\");");
                            System.out.println("}   else if (numeroEjemploCondicionales >=18 && numeroEjemploCondicionales <60){");
                            System.out.println("System.out.println(\"Eres adulto, puedes continuar\");");
                            System.out.println("}");
                            System.out.println("------------------------------------------------------");
                            System.out.println("-------------------------Ejemplo real-----------------------------");
                            System.out.println("Ingresa la edad:");
                            Scanner ejemploIfElse = new Scanner(System.in);
                            numeroEjemploCondicionales = ejemploIfElse.nextByte();

                            if (numeroEjemploCondicionales <= 17) {
                                System.out.println("Eres menor de edad, no puedes continuar");
                            } else if (numeroEjemploCondicionales >= 18 && numeroEjemploCondicionales < 60) {
                                System.out.println("Eres adulto, puedes continuar");
                            }

                            System.out.println("------------------------------------------------------");
                            System.out.println("Presione Enter para continuar...");
                            valorMenu.nextLine(); // Captura el salto de línea restante
                            valorMenu.nextLine(); // Espera a que el usuario presione Enter
                            break;

                        //Condicion por si el usuario agrega un valor incorrecto de seleccion
                        default:

                            if (numeroMenuCondicionales >= 5) {

                                System.out.println("El numero ingresado no es permitido, vuelva a intentarlo:");
                            }

                    }


                    //} while (numeroMenuCondicionales >=5);

                case 6:


                    do {

                        System.out.println("-----------condicionales switch----------------");
                        System.out.println("------------------------------------------------------");
                        System.out.println("1. explicacion ");
                        System.out.println("2. programa");

                        Scanner scannerMenu = new Scanner(System.in);
                        opcionSwitch = scannerMenu.nextInt();

                        switch (opcionSwitch) {


                            case 1:

                                System.out.println("es una estructura de control que ofrece una alternativa al condicional IF-ELSE para tomar decisiones basadas en múltiples casos.");


                                System.out.println("Presione Enter para continuar...");

                                scannerMenu.nextLine(); // Captura el salto de línea restante
                                scannerMenu.nextLine(); // Espera a que el usuario presione Enter
                                break;

                            case 2:
                                System.out.println("Digite su Calificacion");
                                int calificacion = scannerMenu.nextInt();

                                switch (calificacion) {
                                    case 1, 2: {
                                        System.out.println("Su calificación es: F");
                                        break;
                                    }
                                    case 3, 4: {
                                        System.out.println("Su calificación es: D");
                                        break;
                                    }
                                    case 6, 5: {
                                        System.out.println("Su calificación es: C");
                                        break;
                                    }
                                    case 8, 7: {
                                        System.out.println("Su calificación es: B");
                                        break;
                                    }
                                    case 10, 9: {
                                        System.out.println("Su calificación es: A");
                                        break;
                                    }

                                    default: {
                                        System.out.println("Número no válido, por favor verifique");
                                    }
                                }
                                scannerMenu.nextLine(); // Captura el salto de línea restante
                                scannerMenu.nextLine(); // Espera a que el usuario presione Enter
                                break;


                            default:
                                System.out.println("ingrese una opcion valida");
                                break;

                        }
                        break;

                    }
                    while (opcionSwitch >= 3);

                case 7:

                    System.out.println("------------------ Condicional Ternaria --------------------");
                    System.out.println("------------------------------------------------------");
                    System.out.println("Es una caracteristica que nos permite definir expresiones de manera concisa.");
                    System.out.println("Se trata de una manera condensada de declaracion if else que tambien devuelven un valor");
                    System.out.println("------------------------------------------------------------");
                    System.out.println("Ejemplo:");
                    System.out.println("byte numeroEjemploTernaria;");
                    System.out.println();
                    System.out.println("System.out.println(\"Ingresa la edad:\");");
                    System.out.println("Scanner ejemploTernaria = new Scanner(System.in);");
                    System.out.println("numeroEjemploTernaria = ejemploTernaria.nextByte();");
                    System.out.println("String valorEdad = (numeroEjemploTernaria <=17) ? \"Menor de edad\" : \"Mayor de edad\";");
                    System.out.println("System.out.println(\"La persona es:\" +valorEdad);");
                    System.out.println("------------------------------------------------------------");
                    System.out.println();
                    System.out.println("-------------------------Ejemplo real-----------------------------");
                    System.out.println("Ingresa la edad:");

                    Scanner ejemploTernaria = new Scanner(System.in);
                    numeroEjemploTernaria = ejemploTernaria.nextByte();

                    String valorEdad = (numeroEjemploTernaria <= 17) ? "Menor de edad" : "Mayor de edad";

                    System.out.println("La persona es: " + valorEdad);
                    System.out.println("------------------------------------------------------------");
                    System.out.println("Presione Enter para continuar...");
                    valorMenu.nextLine(); // Captura el salto de línea restante
                    valorMenu.nextLine(); // Espera a que el usuario presione Enter
                    break;

                case 8:


                    do {

                        System.out.println("-----------Bucle Dowhile----------------");
                        System.out.println("------------------------------------------------------");
                        System.out.println("1. explicacion ");
                        System.out.println("2. programa");

                        Scanner scannerMenu = new Scanner(System.in);
                        opciondowhile = scannerMenu.nextInt();

                        switch (opciondowhile) {

                            case 1:

                                System.out.println(" Los condicionales Switch, son una estructura de control condicional,  ");
                                System.out.println("que permite definir múltiples casos que puede llegar a cumplir una variable cualquiera,");
                                System.out.println("y qué acción tomar en cualquiera de estas situaciones");

                            case 2: {
                                Scanner scanner = new Scanner(System.in);
                                int numero;

                                // Se inicia el bucle
                                do {
                                    System.out.print("Introduce un número (0 para salir): ");
                                    numero = scanner.nextInt();

                                    if (numero != 0) {
                                        System.out.println("Has introducido: " + numero);
                                    }
                                } while (numero != 0); // La condición se evalúa al final

                                System.out.println("¡Hasta luego!");
                                scanner.close();
                                break;
                            }

                        }

                    } while (opciondowhile >= 3);

                case 9:

                    System.out.println("------------------ Bucle While --------------------");
                    System.out.println("------------------------------------------------------");
                    System.out.println("Con el bucle While se puede ejecutar indicaciones hasta que se produzca una condicion de terminacion");
                    System.out.println("------------------------------------------------------------");
                    System.out.println("Ejemplo:");
                    System.out.println();
                    System.out.println("int numeroEjemploWhile;");
                    System.out.println();
                    System.out.println("do {");
                    System.out.println("System.out.println(\"Ingresa un numero permitido del 0 al 100 para iniciar el contador:\");");
                    System.out.println("Scanner ejemploWhile = new Scanner(System.in);");
                    System.out.println("numeroEjemploWhile = ejemploWhile.nextInt();");
                    System.out.println();
                    System.out.println("} while (numeroEjemploWhile >=101);");
                    System.out.println("while (numeroEjemploWhile <= 100) {");
                    System.out.println("System.out.println(\"El valor actual es:\" + numeroEjemploWhile);");
                    System.out.println("numeroEjemploWhile++;");
                    System.out.println("}");
                    System.out.println("------------------------------------------------------------");
                    System.out.println();
                    //Ejemplo real:
                    System.out.println("-------------------------Ejemplo real-----------------------------");
                    do {
                        System.out.println("Ingresa un numero permitido del 0 al 100 para iniciar el contador:");
                        Scanner ejemploWhile = new Scanner(System.in);
                        numeroEjemploWhile = ejemploWhile.nextInt();

                    } while (numeroEjemploWhile >= 101);

                    while (numeroEjemploWhile <= 100) {
                        System.out.println("El valor actual es:" + numeroEjemploWhile);
                        numeroEjemploWhile++;
                    }
                    System.out.println("------------------------------------------------------------");
                    System.out.println("Presione Enter para continuar...");
                    valorMenu.nextLine(); // Captura el salto de línea restante
                    valorMenu.nextLine(); // Espera a que el usuario presione Enter
                    break;


                case 10:

                    do {

                        System.out.println("-----------Bucle for----------------");
                        System.out.println("------------------------------------------------------");
                        System.out.println("1. explicacion ");
                        System.out.println("2. programa");

                        Scanner scannerMenu = new Scanner(System.in);
                        opcionFor = scannerMenu.nextInt();

                        switch (opcionFor) {

                            case 1:

                                System.out.println(" El bucle for en Java son estructuras lógicas que te permiten realizar  ");
                                System.out.println(" una y otra vez una acción, siempre y cuando se cumpla una condición booleana.,");

                            case 2:
                                Scanner scanner = new Scanner(System.in);

                                // Se inicia el bucle


                                for (int i = 1; i <= 10; i++) {
                                    System.out.println("Número: " + i);
                                }


                                System.out.println("¡Hasta luego!");
                                scanner.close();
                                break;


                        }
                    } while (opcionFor >= 3);


                    //Condicion por si el usuario agrega un valor incorrecto de seleccion en el menu principal
                    if (numeroValor >= 12) {
                        System.out.println("El numero ingresado no es permitido");
                    }


                    //Condicion de bucle para que el usuario vuelva a escribir un valor valido en el menu principal
            }
        }while (numeroValor >= 12);


    }
}
