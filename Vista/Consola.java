package Vista;

import java.util.*;
import Controller.*;
import Model.*;

/**
 * 
 */
public class Consola {

    /**
     * Default constructor
     */
    public Consola() {

        private Controlador controlador;

        public void menu(){

            System.out.println("Bienvenido al Sistema de codificacion/decodificacion");

            while(true) {
                //Asignacion del Controlador
                controlador = new Controller();

                //Menu
                System.out.println();
                System.out.println("Porfavor seleccione una operacion: ");
                System.out.println("1. Asignar alfabeto");
                System.out.println("2. Selleccionar tipo de salida");
                System.out.println("3. Codificar");
                System.out.println("4. Decodificar");
                System.out.println("5. Salir");
                Scanner operacion_in = new Scanner(System.in);
                String operacion = operacion_in.nextLine();

                //Operaciones
                if ("1".compareTo(operacion) == 0) { //Asigna alfabeto
                    //Empezamos a construir el alfabeto
                    System.out.println("Porfavor ingrese el nombre del nuevo alfabeto: ");
                    Scanner nombre_in = new Scanner(System.in);
                    String nombre = nombre_in.nextLine();

                    //Id del alfabeto
                    System.out.println("Porfavor ingrese el id del nuevo alfabeto: ");
                    Scanner id_in = new Scanner(System.in);
                    String id = id_in.nextLine();

                    //Operaciones para asignar nuevo alfabeto
                    System.out.println("Porfavor ingrese el nuevo alfabeto: ");
                    Scanner alfabeto_in = new Scanner(System.in);
                    String alfabeto = alfabeto_in.nextLine();
                    controlador.cargarAlfabetos(alfabeto);


                } else if ("2".compareTo(operacion) == 0) {//Selecciona tipo de salida
                    Escritor escritorActual = salida();

                } else if ("3".compareTo(operacion) == 0) { //Codificar un texto
                    codificar();
                    /* se agrega funciones para codificar*/

                } else if ("4".compareTo(operacion) == 0) { //Decodificar un texto
                    decodificar();
                    /* se agrega funciones para decodificar*/

                } else if ("5".compareTo(operacion) == 0) { //Se sale de la aplicacion
                    break;

                } else{ //Operacion Invalida
                    System.out.println("Operacion Invalida");
                }

            }

        }

        puplic void codificar() {
            while (true) {

                //Menu
                System.out.println();
                System.out.println("Porfavor seleccione un tipo de codificacion: ");
                System.out.println("1. Sustitución Vigenére");
                System.out.println("2. Transposición");
                System.out.println("3. Código Telefónico");
                System.out.println("4. Volver");
                Scanner tipo_in = new Scanner(System.in);
                String tipo = tipo_in.nextLine();

                //Operaciones
                if ("1".compareTo(operacion) == 0) { //Sustitución Vigenére
                    System.out.println("Porfavor ingrese el texto: ");
                    Scanner texto_in = new Scanner(System.in);
                    String texto = texto_in.nextLine();
                    //Menu de otra salida
                    //Operaciones para codificar
                    System.out.println("Se codifico exitosamente");

                } else if ("2".compareTo(operacion) == 0) { //Transposición
                    System.out.println("Porfavor ingrese el texto: ");
                    Scanner texto_in = new Scanner(System.in);
                    String texto = texto_in.nextLine();
                    /* se agrega funciones para codificar*/
                    System.out.println("Se codifico exitosamente");

                } else if ("3".compareTo(operacion) == 0) { //Código Telefónico
                    System.out.println("Porfavor ingrese el texto: ");
                    Scanner texto_in = new Scanner(System.in);
                    String texto = texto_in.nextLine();
                    //Operaciones para codificar
                    /* se agrega funciones para codificar*/
                    System.out.println("Se codifico exitosamente");

                } else if ("4".compareTo(operacion) == 0) { //Se sale de las opciones de codificar
                    break;

                } else { //Tipo Invalido
                    System.out.println("Tipo Invalido");
                }
            }
        }

        public void decodificar () {
            while (true) {

                //Menu
                System.out.println();
                System.out.println("Porfavor seleccione un tipo de decodificacion: ");
                System.out.println("1. Sustitución Vigenére");
                System.out.println("2. Transposición");
                System.out.println("3. Código Telefónico");
                System.out.println("4. Volver");
                Scanner tipo_in = new Scanner(System.in);
                String tipo = tipo_in.nextLine();

                //Operaciones
                if ("1".compareTo(operacion) == 0) { //Sustitución Vigenére
                    System.out.println("Porfavor ingrese el texto: ");
                    Scanner texto_in = new Scanner(System.in);
                    String texto = texto_in.nextLine();
                    //Operaciones para decodificar
                    System.out.println("Se decodifico exitosamente");

                } else if ("2".compareTo(operacion) == 0) { //Transposición
                    System.out.println("Porfavor ingrese el texto: ");
                    Scanner texto_in = new Scanner(System.in);
                    String texto = texto_in.nextLine();
                    /* se agrega funciones para decodificar*/
                    System.out.println("Se decodifico exitosamente");

                } else if ("3".compareTo(operacion) == 0) { //Código Telefónico
                    System.out.println("Porfavor ingrese el texto: ");
                    Scanner texto_in = new Scanner(System.in);
                    String texto = texto_in.nextLine();
                    //Operaciones para decodificar
                    /* se agrega funciones para decodificar*/
                    System.out.println("Se decodifico exitosamente");

                } else if ("4".compareTo(operacion) == 0) { //Se sale de las opciones de codificar
                    break;

                } else { //Tipo Invalido
                    System.out.println("Tipo Invalido");
                }
            }

        }

        public Escritor salida(){
            while (true) {

                //Menu
                System.out.println();
                System.out.println("Porfavor seleccione un tipo de salida: ");
                System.out.println("1. Texto Plano (.txt)");
                System.out.println("2. PDF");
                System.out.println("3. XML");
                Scanner tipo_in = new Scanner(System.in);
                String tipo = tipo_in.nextLine();


                //Operaciones
                if ("1".compareTo(operacion) == 0) { //Texto Plano
                    EscritorTxt result = new EscritorTxt();
                    System.out.println("Selecciono Texto Plano");
                    return result;

                } else if ("2".compareTo(operacion) == 0) { //PDF
                    EscritorPDF result = new EscritorPDF();
                    System.out.println("Selecciono PDF");
                    return result;

                } else if ("3".compareTo(operacion) == 0) { //XML
                    EscritorXML result = new EscritorXML();
                    System.out.println("Selecciono XML");
                    return result;

                } else { //Tipo Invalido
                    System.out.println("Tipo Invalido");
                }
            }
        }
    }

}