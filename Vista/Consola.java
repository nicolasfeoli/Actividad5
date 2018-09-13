package Vista;

import java.util.*;

/**
 * 
 */
public class Consola {

    /**
     * Default constructor
     */
    public Consola() {

        public void menu(){

            System.out.println("Bienvenido al Sistema de codificacion/decodificacion");

            while(true) {

                //Menu
                System.out.println();
                System.out.println("Porfavor seleccione una operacion: ");
                System.out.println("1. Asignar alfabeto");
                System.out.println("2. Codificar");
                System.out.println("3. Decodificar");
                System.out.println("4. Salir");
                Scanner operacion_in = new Scanner(System.in);
                String operacion = operacion_in.nextLine();

                //Operaciones
                if ("1".compareTo(operacion) == 0) { //Asigna alfabeto
                    System.out.println("Porfavor ingrese la ruta del nuevo alfabeto: ");
                    Scanner ruta_in = new Scanner(System.in);
                    String ruta = ruta_in.nextLine();
                    //Operaciones para asignar nuevo diccionario


                } else if ("2".compareTo(operacion) == 0) { //Codificar un texto
                    codificar();
                    /* se agrega funciones para codificar*/
                } else if ("3".compareTo(operacion) == 0) { //Decodificar un texto
                    decodificar();
                    /* se agrega funciones para decodificar*/
                } else if ("4".compareTo(operacion) == 0) { //Se sale de la aplicacion
                    break;
                } else{ //Operacion Invalida
                    System.out.println("Operacion Invalida");
                }

            }

        }

        puplic void codificar(){
            while(true) {

                //Menu
                System.out.println();
                System.out.println("Porfavor seleccione un tipo de codificacion: ");
                System.out.println("1. Sustitución Vigenére");
                System.out.println("2. Transposición");
                System.out.println("3. Código Telefónico");
                System.out.println("4. Salir");
                Scanner tipo_in = new Scanner(System.in);
                String tipo = tipo_in.nextLine();

                //Operaciones
                if ("1".compareTo(operacion) == 0) { //Sustitución Vigenére
                    System.out.println("Porfavor ingrese el texto: ");
                    Scanner texto_in = new Scanner(System.in);
                    String texto = texto_in.nextLine();
                    //Operaciones para codificar

                } else if ("2".compareTo(operacion) == 0) { //Transposición
                    System.out.println("Porfavor ingrese el texto: ");
                    Scanner texto_in = new Scanner(System.in);
                    String texto = texto_in.nextLine();
                    /* se agrega funciones para codificar*/
                } else if ("3".compareTo(operacion) == 0) { //Código Telefónico
                    System.out.println("Porfavor ingrese el texto: ");
                    Scanner texto_in = new Scanner(System.in);
                    String texto = texto_in.nextLine();
                    //Operaciones para codificar
                    /* se agrega funciones para codificar*/
                } else if ("4".compareTo(operacion) == 0) { //Se sale de las opciones de codificar
                    break;
                } else{ //Tipo Invalido
                    System.out.println("Tipo Invalido");
                }
        }

        public void decodificar(){
                while(true) {

                    //Menu
                    System.out.println();
                    System.out.println("Porfavor seleccione un tipo de decodificacion: ");
                    System.out.println("1. Sustitución Vigenére");
                    System.out.println("2. Transposición");
                    System.out.println("3. Código Telefónico");
                    System.out.println("4. Salir");
                    Scanner tipo_in = new Scanner(System.in);
                    String tipo = tipo_in.nextLine();

                    //Operaciones
                    if ("1".compareTo(operacion) == 0) { //Sustitución Vigenére
                        System.out.println("Porfavor ingrese el texto: ");
                        Scanner texto_in = new Scanner(System.in);
                        String texto = texto_in.nextLine();
                        //Operaciones para decodificar

                    } else if ("2".compareTo(operacion) == 0) { //Transposición
                        System.out.println("Porfavor ingrese el texto: ");
                        Scanner texto_in = new Scanner(System.in);
                        String texto = texto_in.nextLine();
                        /* se agrega funciones para decodificar*/
                    } else if ("3".compareTo(operacion) == 0) { //Código Telefónico
                        System.out.println("Porfavor ingrese el texto: ");
                        Scanner texto_in = new Scanner(System.in);
                        String texto = texto_in.nextLine();
                        //Operaciones para decodificar
                        /* se agrega funciones para decodificar*/
                    } else if ("4".compareTo(operacion) == 0) { //Se sale de las opciones de codificar
                        break;
                    } else{ //Tipo Invalido
                        System.out.println("Tipo Invalido");
                    }
            }

    }


}